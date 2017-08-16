package model;

import javax.persistence.*;

/**
 * Created by FU74573647-EXT on 19/07/2017.
 */
@Entity
@Table(name = "TBL_RESTAURANT", schema = "SYSTEM")
public class TblRestaurantEntity {
    private long restId;
    private String restName;
    private String restDesc;
    private String restTelef;
    private String restEmail;
    private String restEstado;
    private TblClienteEntity tblClienteByClieId;

    @Id
    @Column(name = "REST_ID", nullable = false, precision = 0)
    @GeneratedValue(generator = "seq_gen_rest")
    @SequenceGenerator(name = "seq_gen_rest",sequenceName = "SQ_TBL_RESTAURANT", allocationSize = 5)
    public long getRestId() {
        return restId;
    }

    public void setRestId(long restId) {
        this.restId = restId;
    }

    @Basic
    @Column(name = "REST_NAME", nullable = true, length = 100)
    public String getRestName() {
        return restName;
    }

    public void setRestName(String restName) {
        this.restName = restName;
    }

    @Basic
    @Column(name = "REST_DESC", nullable = true, length = 100)
    public String getRestDesc() {
        return restDesc;
    }

    public void setRestDesc(String restDesc) {
        this.restDesc = restDesc;
    }

    @Basic
    @Column(name = "REST_TELEF", nullable = true, length = 20)
    public String getRestTelef() {
        return restTelef;
    }

    public void setRestTelef(String restTelef) {
        this.restTelef = restTelef;
    }

    @Basic
    @Column(name = "REST_EMAIL", nullable = true, length = 50)
    public String getRestEmail() {
        return restEmail;
    }

    public void setRestEmail(String restEmail) {
        this.restEmail = restEmail;
    }

    @Basic
    @Column(name = "REST_ESTADO", nullable = true, length = 1)
    public String getRestEstado() {
        return restEstado;
    }

    public void setRestEstado(String restEstado) {
        this.restEstado = restEstado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TblRestaurantEntity that = (TblRestaurantEntity) o;

        if (restId != that.restId) return false;
        if (restName != null ? !restName.equals(that.restName) : that.restName != null) return false;
        if (restDesc != null ? !restDesc.equals(that.restDesc) : that.restDesc != null) return false;
        if (restTelef != null ? !restTelef.equals(that.restTelef) : that.restTelef != null) return false;
        if (restEmail != null ? !restEmail.equals(that.restEmail) : that.restEmail != null) return false;
        if (restEstado != null ? !restEstado.equals(that.restEstado) : that.restEstado != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (restId ^ (restId >>> 32));
        result = 31 * result + (restName != null ? restName.hashCode() : 0);
        result = 31 * result + (restDesc != null ? restDesc.hashCode() : 0);
        result = 31 * result + (restTelef != null ? restTelef.hashCode() : 0);
        result = 31 * result + (restEmail != null ? restEmail.hashCode() : 0);
        result = 31 * result + (restEstado != null ? restEstado.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "CLIE_ID", referencedColumnName = "CLIE_ID")
    public TblClienteEntity getTblClienteByClieId() {
        return tblClienteByClieId;
    }

    public void setTblClienteByClieId(TblClienteEntity tblClienteByClieId) {
        this.tblClienteByClieId = tblClienteByClieId;
    }
}
