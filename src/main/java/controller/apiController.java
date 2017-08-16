package controller;

import model.TblRestaurantEntity;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import postModel.restaurantPostModel;
import service.restService;

import java.net.Inet4Address;
import java.net.UnknownHostException;

/**
 * Created by FU74573647-EXT on 19/07/2017.
 */
@Path("/restaurant")
public class apiController {

    private restService service = new restService();

    @Path("/getRestaurant/{id}")
    @GET
    @Produces("application/json")
    public JsonObject getRestaurant(@PathParam("id") int id) throws UnknownHostException {

        TblRestaurantEntity objRestaurantEntity = new TblRestaurantEntity();
        objRestaurantEntity = service.getRestaurant(id);

        JsonObjectBuilder builder = Json.createObjectBuilder();
        String host = Inet4Address.getLocalHost().getHostName();

        String clieURL = "http://localhost:8080/apiVasquez/api/client/getClient/" + objRestaurantEntity.getTblClienteByClieId().getClieId();

         builder.add( "restId", objRestaurantEntity.getRestId() ).
                 add( "restName", objRestaurantEntity.getRestName() ).
                 add( "restDesc", objRestaurantEntity.getRestDesc() ).
                 add( "restTelef", objRestaurantEntity.getRestTelef() ).
                 add( "restEmail", objRestaurantEntity.getRestEmail() ).
                 add( "clieURL", clieURL );

        return builder.build();
    }

    @Path("/postRegRestaurant")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public JsonObject postRegRestaurant(restaurantPostModel model){

        JsonObjectBuilder builder = Json.createObjectBuilder();
        builder.add("result",service.postRegRestaurant(model));
        return  builder.build();
    }
}
