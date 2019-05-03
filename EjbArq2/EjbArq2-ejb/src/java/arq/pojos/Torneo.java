/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arq.pojos;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author quenan
 */
@Entity
@Table(name = "Torneo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Torneo.findAll", query = "SELECT t FROM Torneo t"),
    @NamedQuery(name = "Torneo.findByIdTorneo", query = "SELECT t FROM Torneo t WHERE t.idTorneo = :idTorneo"),
    @NamedQuery(name = "Torneo.findByNombreTorneo", query = "SELECT t FROM Torneo t WHERE t.nombreTorneo = :nombreTorneo"),
    @NamedQuery(name = "Torneo.findByFechaInicio", query = "SELECT t FROM Torneo t WHERE t.fechaInicio = :fechaInicio"),
    @NamedQuery(name = "Torneo.findByFechaFin", query = "SELECT t FROM Torneo t WHERE t.fechaFin = :fechaFin"),
    @NamedQuery(name = "Torneo.findByPartidosTorneo", query = "SELECT t FROM Torneo t WHERE t.partidosTorneo = :partidosTorneo")})
public class Torneo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idTorneo")
    private Integer idTorneo;
    @Size(max = 255)
    @Column(name = "nombreTorneo")
    private String nombreTorneo;
    @Lob
    @Size(max = 65535)
    @Column(name = "idEquipo")
    private String idEquipo;
    @Column(name = "fechaInicio")
    @Temporal(TemporalType.DATE)
    private Date fechaInicio;
    @Column(name = "fechaFin")
    @Temporal(TemporalType.DATE)
    private Date fechaFin;
    @Size(max = 45)
    @Column(name = "partidosTorneo")
    private String partidosTorneo;

    public Torneo() {
    }

    public Torneo(Integer idTorneo) {
        this.idTorneo = idTorneo;
    }

    public Integer getIdTorneo() {
        return idTorneo;
    }

    public void setIdTorneo(Integer idTorneo) {
        this.idTorneo = idTorneo;
    }

    public String getNombreTorneo() {
        return nombreTorneo;
    }

    public void setNombreTorneo(String nombreTorneo) {
        this.nombreTorneo = nombreTorneo;
    }

    public String getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(String idEquipo) {
        this.idEquipo = idEquipo;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getPartidosTorneo() {
        return partidosTorneo;
    }

    public void setPartidosTorneo(String partidosTorneo) {
        this.partidosTorneo = partidosTorneo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTorneo != null ? idTorneo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Torneo)) {
            return false;
        }
        Torneo other = (Torneo) object;
        if ((this.idTorneo == null && other.idTorneo != null) || (this.idTorneo != null && !this.idTorneo.equals(other.idTorneo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "arq.pojos.Torneo[ idTorneo=" + idTorneo + " ]";
    }
    
}
