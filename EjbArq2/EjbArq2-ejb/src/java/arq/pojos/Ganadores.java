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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author quenan
 */
@Entity
@Table(name = "Ganadores")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ganadores.findAll", query = "SELECT g FROM Ganadores g"),
    @NamedQuery(name = "Ganadores.findByIdGanadores", query = "SELECT g FROM Ganadores g WHERE g.idGanadores = :idGanadores"),
    @NamedQuery(name = "Ganadores.findByIdApuesta", query = "SELECT g FROM Ganadores g WHERE g.idApuesta = :idApuesta"),
    @NamedQuery(name = "Ganadores.findByIdPartido", query = "SELECT g FROM Ganadores g WHERE g.idPartido = :idPartido")})
public class Ganadores implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idGanadores")
    private Integer idGanadores;
    @Column(name = "id_Apuesta")
    private Integer idApuesta;
    @Column(name = "id_Partido")
    private Integer idPartido;

    public Ganadores() {
    }

    public Ganadores(Integer idGanadores) {
        this.idGanadores = idGanadores;
    }

    public Integer getIdGanadores() {
        return idGanadores;
    }

    public void setIdGanadores(Integer idGanadores) {
        this.idGanadores = idGanadores;
    }

    public Integer getIdApuesta() {
        return idApuesta;
    }

    public void setIdApuesta(Integer idApuesta) {
        this.idApuesta = idApuesta;
    }

    public Integer getIdPartido() {
        return idPartido;
    }

    public void setIdPartido(Integer idPartido) {
        this.idPartido = idPartido;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idGanadores != null ? idGanadores.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ganadores)) {
            return false;
        }
        Ganadores other = (Ganadores) object;
        if ((this.idGanadores == null && other.idGanadores != null) || (this.idGanadores != null && !this.idGanadores.equals(other.idGanadores))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "arq.pojos.Ganadores[ idGanadores=" + idGanadores + " ]";
    }
    
}
