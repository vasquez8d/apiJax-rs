package dao.impl;

import dao.local.restDaoLocal;
import model.TblClienteEntity;
import model.TblRestaurantEntity;
import postModel.restaurantPostModel;
import util.conexion;
import javax.persistence.Query;
import java.util.List;

/**
 * Created by FU74573647-EXT on 19/07/2017.
 */
public class restDaoImpl implements restDaoLocal {

    conexion context = new conexion();

    @Override
    public TblRestaurantEntity getRestaurant(int id) {

        List<TblRestaurantEntity> objListRestaurantEntity = null;
        TblRestaurantEntity objRestaurantEntity = new TblRestaurantEntity();

        try{
            context.abrir();

            Query query =  context.em.createQuery("SELECT r FROM TblRestaurantEntity r WHERE r.restId = :param1");

            query.setParameter("param1", id);

            objListRestaurantEntity = query.getResultList();

            if(objListRestaurantEntity.size() > 0){
                objRestaurantEntity = objListRestaurantEntity.get(0);
            }


        }catch (Exception ex)
        {
            ex.printStackTrace();
        }finally {
            context.cerrar();
        }

       return  objRestaurantEntity;
    }

    @Override
    public String postRegRestaurant(restaurantPostModel model) {
        String resultado = "";

        try{
            context.abrir();
            TblRestaurantEntity objRestaurantEntity = new TblRestaurantEntity();
            objRestaurantEntity.setRestName(model.getRestName());
            objRestaurantEntity.setRestDesc(model.getRestDesc());
            objRestaurantEntity.setRestEmail(model.getRestEmail());
            objRestaurantEntity.setRestTelef(model.getRestTelef());
            objRestaurantEntity.setRestEstado("1");

            TblClienteEntity objClienteEntity = new TblClienteEntity();
            objClienteEntity.setClieId( Integer.parseInt(model.getClieId()));

            objRestaurantEntity.setTblClienteByClieId(objClienteEntity);

            context.em.getTransaction().begin();
            context.em.merge(objRestaurantEntity);
            context.em.getTransaction().commit();

            resultado = "ok";

        }catch (Exception ex){
            ex.printStackTrace();
            resultado  = "error";
        }finally {
            context.cerrar();
        }

        return  resultado;
    }

    @Override
    public TblClienteEntity getClient(int id) {

        List<TblClienteEntity> objListClienteEntities = null;
        TblClienteEntity objClienteEntities = new TblClienteEntity();

        try{
            context.abrir();

            Query query =  context.em.createQuery("SELECT r FROM TblClienteEntity r WHERE r.clieId = :param1");

            query.setParameter("param1", id);

            objListClienteEntities = query.getResultList();

            if(objListClienteEntities.size() > 0){
                objClienteEntities = objListClienteEntities.get(0);
            }

        }catch (Exception ex)
        {
            ex.printStackTrace();
        }finally {
            context.cerrar();
        }

        return  objClienteEntities;
    }
}
