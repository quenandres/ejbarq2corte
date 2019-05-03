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
@Table(name = "Equipos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Equipos.findAll", query = "SELECT e FROM Equipos e"),
    @NamedQuery(name = "Equipos.findByIdEquipos", query = "SELECT e FROM Equipos e WHERE e.idEquipos = :idEquipos"),
    @NamedQuery(name = "Equipos.findByNombreEquipo", query = "SELECT e FROM Equipos e WHERE e.nombreEquipo = :nombreEquipo"),
    @NamedQuery(name = "Equipos.findByIdDeporte", query = "SELECT e FROM Equipos e WHERE e.idDeporte = :idDeporte")})
public class Equipos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idEquipos")
    private Integer idEquipos;
    @Size(max = 255)
    @Column(name = "nombreEquipo")
    private String nombreEquipo;
    @Column(name = "idDeporte")
    private Integer idDeporte;

    public Equipos() {
    }

    public Equipos(Integer idEquipos) {
        this.idEquipos = idEquipos;
    }

    public Integer getIdEquipos() {
        return idEquipos;
    }

    public void setIdEquipos(Integer idEquipos) {
        this.idEquipos = idEquipos;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public Integer getIdDeporte() {
        return idDeporte;
    }

    public void setIdDeporte(Integer idDeporte) {
        this.idDeporte = idDeporte;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEquipos != null ? idEquipos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Equipos)) {
            return false;
        }
        Equipos other = (Equipos) object;
        if ((this.idEquipos == null && other.idEquipos != null) || (this.idEquipos != null && !this.idEquipos.equals(other.idEquipos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "arq.pojos.Equipos[ idEquipos=" + idEquipos + " ]";
    }

    public void setIdDeporte(Deporte deporte) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
