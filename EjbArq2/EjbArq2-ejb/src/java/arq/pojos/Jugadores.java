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
@Table(name = "Jugadores")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Jugadores.findAll", query = "SELECT j FROM Jugadores j"),
    @NamedQuery(name = "Jugadores.findByIdJugadores", query = "SELECT j FROM Jugadores j WHERE j.idJugadores = :idJugadores"),
    @NamedQuery(name = "Jugadores.findByNombreJugador", query = "SELECT j FROM Jugadores j WHERE j.nombreJugador = :nombreJugador"),
    @NamedQuery(name = "Jugadores.findByIdEquipo", query = "SELECT j FROM Jugadores j WHERE j.idEquipo = :idEquipo")})
public class Jugadores implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idJugadores")
    private Integer idJugadores;
    @Size(max = 255)
    @Column(name = "nombreJugador")
    private String nombreJugador;
    @Column(name = "idEquipo")
    private Integer idEquipo;

    public Jugadores() {
    }

    public Jugadores(Integer idJugadores) {
        this.idJugadores = idJugadores;
    }

    public Integer getIdJugadores() {
        return idJugadores;
    }

    public void setIdJugadores(Integer idJugadores) {
        this.idJugadores = idJugadores;
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public Integer getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(Integer idEquipo) {
        this.idEquipo = idEquipo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idJugadores != null ? idJugadores.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Jugadores)) {
            return false;
        }
        Jugadores other = (Jugadores) object;
        if ((this.idJugadores == null && other.idJugadores != null) || (this.idJugadores != null && !this.idJugadores.equals(other.idJugadores))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "arq.pojos.Jugadores[ idJugadores=" + idJugadores + " ]";
    }
    
}
