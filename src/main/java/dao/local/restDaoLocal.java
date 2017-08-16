package dao.local;

import model.TblClienteEntity;
import model.TblRestaurantEntity;
import postModel.restaurantPostModel;

/**
 * Created by FU74573647-EXT on 19/07/2017.
 */
public interface restDaoLocal {
    public abstract TblRestaurantEntity getRestaurant(int id);

    public abstract String postRegRestaurant(restaurantPostModel model);

    public abstract  TblClienteEntity getClient(int id);
}
