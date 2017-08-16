package controller;

import model.TblClienteEntity;
import service.restService;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 * Created by FU74573647-EXT on 19/07/2017.
 */
@Path("/client")
public class clieController {

    private restService service = new restService();

    @Path("/getClient/{id}")
    @GET
    @Produces("application/json")
    public JsonObject getClient(@PathParam("id") int id){

        JsonObjectBuilder builder = Json.createObjectBuilder();

        TblClienteEntity objClienteEntity = new TblClienteEntity();
        objClienteEntity = service.getClient(id);

        builder.add( "clieId", objClienteEntity.getClieId() ).
                add( "clieName", objClienteEntity.getClieName() ).
                add( "clieDni", objClienteEntity.getClieDni() ).
                add( "clieTelef", objClienteEntity.getClieTelef() ).
                add( "clieEmail", objClienteEntity.getClieEmail() ).
                add( "clieEstado", objClienteEntity.getClieEstado() );

        return builder.build();
    }

}
