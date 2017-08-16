package service;

import dao.impl.restDaoImpl;
import model.TblClienteEntity;
import model.TblRestaurantEntity;
import postModel.restaurantPostModel;

/**
 * Created by FU74573647-EXT on 19/07/2017.
 */
public class restService extends restDaoImpl {

    @Override
    public TblRestaurantEntity getRestaurant(int id) {
        return super.getRestaurant(id);
    }

    @Override
    public String postRegRestaurant(restaurantPostModel model) {
        return super.postRegRestaurant(model);
    }

    @Override
    public TblClienteEntity getClient(int id) {
        return super.getClient(id);
    }
}
