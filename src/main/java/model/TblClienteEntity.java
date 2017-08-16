package model;

import javax.persistence.*;

/**
 * Created by FU74573647-EXT on 19/07/2017.
 */
@Entity
@Table(name = "TBL_CLIENTE", schema = "SYSTEM")
public class TblClienteEntity {
    private long clieId;
    private String clieName;
    private String clieDni;
    private String clieTelef;
    private String clieEmail;
    private String clieEstado;

    @Id
    @Column(name = "CLIE_ID", nullable = false, precision = 0)
    public long getClieId() {
        return clieId;
    }

    public void setClieId(long clieId) {
        this.clieId = clieId;
    }

    @Basic
    @Column(name = "CLIE_NAME", nullable = true, length = 100)
    public String getClieName() {
        return clieName;
    }

    public void setClieName(String clieName) {
        this.clieName = clieName;
    }

    @Basic
    @Column(name = "CLIE_DNI", nullable = true, length = 20)
    public String getClieDni() {
        return clieDni;
    }

    public void setClieDni(String clieDni) {
        this.clieDni = clieDni;
    }

    @Basic
    @Column(name = "CLIE_TELEF", nullable = true, length = 20)
    public String getClieTelef() {
        return clieTelef;
    }

    public void setClieTelef(String clieTelef) {
        this.clieTelef = clieTelef;
    }

    @Basic
    @Column(name = "CLIE_EMAIL", nullable = true, length = 50)
    public String getClieEmail() {
        return clieEmail;
    }

    public void setClieEmail(String clieEmail) {
        this.clieEmail = clieEmail;
    }

    @Basic
    @Column(name = "CLIE_ESTADO", nullable = true, length = 1)
    public String getClieEstado() {
        return clieEstado;
    }

    public void setClieEstado(String clieEstado) {
        this.clieEstado = clieEstado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TblClienteEntity that = (TblClienteEntity) o;

        if (clieId != that.clieId) return false;
        if (clieName != null ? !clieName.equals(that.clieName) : that.clieName != null) return false;
        if (clieDni != null ? !clieDni.equals(that.clieDni) : that.clieDni != null) return false;
        if (clieTelef != null ? !clieTelef.equals(that.clieTelef) : that.clieTelef != null) return false;
        if (clieEmail != null ? !clieEmail.equals(that.clieEmail) : that.clieEmail != null) return false;
        if (clieEstado != null ? !clieEstado.equals(that.clieEstado) : that.clieEstado != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (clieId ^ (clieId >>> 32));
        result = 31 * result + (clieName != null ? clieName.hashCode() : 0);
        result = 31 * result + (clieDni != null ? clieDni.hashCode() : 0);
        result = 31 * result + (clieTelef != null ? clieTelef.hashCode() : 0);
        result = 31 * result + (clieEmail != null ? clieEmail.hashCode() : 0);
        result = 31 * result + (clieEstado != null ? clieEstado.hashCode() : 0);
        return result;
    }
}
