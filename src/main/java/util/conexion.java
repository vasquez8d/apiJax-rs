package util;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by FU74573647-EXT on 19/07/2017.
 */
public class conexion {

    public EntityManager em;
    public EntityManagerFactory emf;

    public void abrir(){
        emf = Persistence.createEntityManagerFactory("apiPersistence");
        em = emf.createEntityManager();
    }

    public void cerrar(){
        em.close();
        emf.close();
    }
}
