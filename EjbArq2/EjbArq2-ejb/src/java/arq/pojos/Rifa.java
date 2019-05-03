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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author quenan
 */
@Entity
@Table(name = "Rifa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Rifa.findAll", query = "SELECT r FROM Rifa r"),
    @NamedQuery(name = "Rifa.findByIdRifa", query = "SELECT r FROM Rifa r WHERE r.idRifa = :idRifa"),
    @NamedQuery(name = "Rifa.findByFormaGanar", query = "SELECT r FROM Rifa r WHERE r.formaGanar = :formaGanar"),
    @NamedQuery(name = "Rifa.findByMaxParticipantes", query = "SELECT r FROM Rifa r WHERE r.maxParticipantes = :maxParticipantes"),
    @NamedQuery(name = "Rifa.findByPremios", query = "SELECT r FROM Rifa r WHERE r.premios = :premios")})
public class Rifa implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idRifa")
    private Integer idRifa;
    @Size(max = 255)
    @Column(name = "forma_ganar")
    private String formaGanar;
    @Column(name = "maxParticipantes")
    private Integer maxParticipantes;
    @Size(max = 255)
    @Column(name = "premios")
    private String premios;

    public Rifa() {
    }

    public Rifa(Integer idRifa) {
        this.idRifa = idRifa;
    }

    public Integer getIdRifa() {
        return idRifa;
    }

    public void setIdRifa(Integer idRifa) {
        this.idRifa = idRifa;
    }

    public String getFormaGanar() {
        return formaGanar;
    }

    public void setFormaGanar(String formaGanar) {
        this.formaGanar = formaGanar;
    }

    public Integer getMaxParticipantes() {
        return maxParticipantes;
    }

    public void setMaxParticipantes(Integer maxParticipantes) {
        this.maxParticipantes = maxParticipantes;
    }

    public String getPremios() {
        return premios;
    }

    public void setPremios(String premios) {
        this.premios = premios;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRifa != null ? idRifa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rifa)) {
            return false;
        }
        Rifa other = (Rifa) object;
        if ((this.idRifa == null && other.idRifa != null) || (this.idRifa != null && !this.idRifa.equals(other.idRifa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "arq.pojos.Rifa[ idRifa=" + idRifa + " ]";
    }
    
}
