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
@Table(name = "Partido")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Partido.findAll", query = "SELECT p FROM Partido p"),
    @NamedQuery(name = "Partido.findByIdPartido", query = "SELECT p FROM Partido p WHERE p.idPartido = :idPartido"),
    @NamedQuery(name = "Partido.findByEquipo1", query = "SELECT p FROM Partido p WHERE p.equipo1 = :equipo1"),
    @NamedQuery(name = "Partido.findByEquipo2", query = "SELECT p FROM Partido p WHERE p.equipo2 = :equipo2"),
    @NamedQuery(name = "Partido.findByMarcador", query = "SELECT p FROM Partido p WHERE p.marcador = :marcador")})
public class Partido implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idPartido")
    private Integer idPartido;
    @Column(name = "equipo1")
    private Integer equipo1;
    @Column(name = "equipo2")
    private Integer equipo2;
    @Size(max = 255)
    @Column(name = "marcador")
    private String marcador;

    public Partido() {
    }

    public Partido(Integer idPartido) {
        this.idPartido = idPartido;
    }

    public Integer getIdPartido() {
        return idPartido;
    }

    public void setIdPartido(Integer idPartido) {
        this.idPartido = idPartido;
    }

    public Integer getEquipo1() {
        return equipo1;
    }

    public void setEquipo1(Integer equipo1) {
        this.equipo1 = equipo1;
    }

    public Integer getEquipo2() {
        return equipo2;
    }

    public void setEquipo2(Integer equipo2) {
        this.equipo2 = equipo2;
    }

    public String getMarcador() {
        return marcador;
    }

    public void setMarcador(String marcador) {
        this.marcador = marcador;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPartido != null ? idPartido.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Partido)) {
            return false;
        }
        Partido other = (Partido) object;
        if ((this.idPartido == null && other.idPartido != null) || (this.idPartido != null && !this.idPartido.equals(other.idPartido))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "arq.pojos.Partido[ idPartido=" + idPartido + " ]";
    }
    
}
