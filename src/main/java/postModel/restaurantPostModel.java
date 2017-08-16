package postModel;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by FU74573647-EXT on 19/07/2017.
 */
@Entity
public class restaurantPostModel {

    @Id
    private String restId;
    private String restName;
    private String restDesc;
    private String restTelef;
    private String restEmail;
    private String clieURL;
    private String clieId;

    public String getRestId() {
        return restId;
    }

    public void setRestId(String restId) {
        this.restId = restId;
    }

    public String getRestName() {
        return restName;
    }

    public void setRestName(String restName) {
        this.restName = restName;
    }

    public String getRestDesc() {
        return restDesc;
    }

    public void setRestDesc(String restDesc) {
        this.restDesc = restDesc;
    }

    public String getRestTelef() {
        return restTelef;
    }

    public void setRestTelef(String restTelef) {
        this.restTelef = restTelef;
    }

    public String getRestEmail() {
        return restEmail;
    }

    public void setRestEmail(String restEmail) {
        this.restEmail = restEmail;
    }

    public String getClieURL() {
        return clieURL;
    }

    public void setClieURL(String clieURL) {
        this.clieURL = clieURL;
    }

    public String getClieId() {
        return clieId;
    }

    public void setClieId(String clieId) {
        this.clieId = clieId;
    }
}