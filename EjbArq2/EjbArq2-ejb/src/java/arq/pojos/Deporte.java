/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arq.pojos;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author quenan
 */
@Entity
@Table(name = "Deporte")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Deporte.findAll", query = "SELECT d FROM Deporte d"),
    @NamedQuery(name = "Deporte.findByIdDeporte", query = "SELECT d FROM Deporte d WHERE d.idDeporte = :idDeporte"),
    @NamedQuery(name = "Deporte.findByNombreDeporte", query = "SELECT d FROM Deporte d WHERE d.nombreDeporte = :nombreDeporte")})
public class Deporte implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idDeporte")
    private Integer idDeporte;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "nombreDeporte")
    private String nombreDeporte;

    public Deporte() {
    }

    public Deporte(Integer idDeporte) {
        this.idDeporte = idDeporte;
    }

    public Deporte(Integer idDeporte, String nombreDeporte) {
        this.idDeporte = idDeporte;
        this.nombreDeporte = nombreDeporte;
    }

    public Integer getIdDeporte() {
        return idDeporte;
    }

    public void setIdDeporte(Integer idDeporte) {
        this.idDeporte = idDeporte;
    }

    public String getNombreDeporte() {
        return nombreDeporte;
    }

    public void setNombreDeporte(String nombreDeporte) {
        this.nombreDeporte = nombreDeporte;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDeporte != null ? idDeporte.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Deporte)) {
            return false;
        }
        Deporte other = (Deporte) object;
        if ((this.idDeporte == null && other.idDeporte != null) || (this.idDeporte != null && !this.idDeporte.equals(other.idDeporte))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "arq.pojos.Deporte[ idDeporte=" + idDeporte + " ]";
    }
    
}
