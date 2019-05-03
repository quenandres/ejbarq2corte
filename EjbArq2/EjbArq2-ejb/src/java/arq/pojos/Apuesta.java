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
@Table(name = "Apuesta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Apuesta.findAll", query = "SELECT a FROM Apuesta a"),
    @NamedQuery(name = "Apuesta.findByIdApuesta", query = "SELECT a FROM Apuesta a WHERE a.idApuesta = :idApuesta"),
    @NamedQuery(name = "Apuesta.findByActivo", query = "SELECT a FROM Apuesta a WHERE a.activo = :activo"),
    @NamedQuery(name = "Apuesta.findByIdDeporte", query = "SELECT a FROM Apuesta a WHERE a.idDeporte = :idDeporte"),
    @NamedQuery(name = "Apuesta.findByIdPartido", query = "SELECT a FROM Apuesta a WHERE a.idPartido = :idPartido"),
    @NamedQuery(name = "Apuesta.findByMarcador", query = "SELECT a FROM Apuesta a WHERE a.marcador = :marcador"),
    @NamedQuery(name = "Apuesta.findByNombreApuesta", query = "SELECT a FROM Apuesta a WHERE a.nombreApuesta = :nombreApuesta")})
public class Apuesta implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idApuesta")
    private Integer idApuesta;
    @Size(max = 255)
    @Column(name = "Activo")
    private String activo;
    @Column(name = "id_Deporte")
    private Integer idDeporte;
    @Column(name = "id_Partido")
    private Integer idPartido;
    @Size(max = 255)
    @Column(name = "marcador")
    private String marcador;
    @Size(max = 255)
    @Column(name = "nombreApuesta")
    private String nombreApuesta;

    public Apuesta() {
    }

    public Apuesta(Integer idApuesta) {
        this.idApuesta = idApuesta;
    }

    public Integer getIdApuesta() {
        return idApuesta;
    }

    public void setIdApuesta(Integer idApuesta) {
        this.idApuesta = idApuesta;
    }

    public String getActivo() {
        return activo;
    }

    public void setActivo(String activo) {
        this.activo = activo;
    }

    public Integer getIdDeporte() {
        return idDeporte;
    }

    public void setIdDeporte(Integer idDeporte) {
        this.idDeporte = idDeporte;
    }

    public Integer getIdPartido() {
        return idPartido;
    }

    public void setIdPartido(Integer idPartido) {
        this.idPartido = idPartido;
    }

    public String getMarcador() {
        return marcador;
    }

    public void setMarcador(String marcador) {
        this.marcador = marcador;
    }

    public String getNombreApuesta() {
        return nombreApuesta;
    }

    public void setNombreApuesta(String nombreApuesta) {
        this.nombreApuesta = nombreApuesta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idApuesta != null ? idApuesta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Apuesta)) {
            return false;
        }
        Apuesta other = (Apuesta) object;
        if ((this.idApuesta == null && other.idApuesta != null) || (this.idApuesta != null && !this.idApuesta.equals(other.idApuesta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "arq.pojos.Apuesta[ idApuesta=" + idApuesta + " ]";
    }
    
}
