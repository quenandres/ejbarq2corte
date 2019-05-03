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
@Table(name = "Sorteo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sorteo.findAll", query = "SELECT s FROM Sorteo s"),
    @NamedQuery(name = "Sorteo.findByIdSorteo", query = "SELECT s FROM Sorteo s WHERE s.idSorteo = :idSorteo"),
    @NamedQuery(name = "Sorteo.findByIdApuesta", query = "SELECT s FROM Sorteo s WHERE s.idApuesta = :idApuesta"),
    @NamedQuery(name = "Sorteo.findByMarcador", query = "SELECT s FROM Sorteo s WHERE s.marcador = :marcador"),
    @NamedQuery(name = "Sorteo.findByNombreSorteo", query = "SELECT s FROM Sorteo s WHERE s.nombreSorteo = :nombreSorteo")})
public class Sorteo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idSorteo")
    private Integer idSorteo;
    @Size(max = 255)
    @Column(name = "id_Apuesta")
    private String idApuesta;
    @Size(max = 255)
    @Column(name = "marcador")
    private String marcador;
    @Size(max = 255)
    @Column(name = "nombreSorteo")
    private String nombreSorteo;

    public Sorteo() {
    }

    public Sorteo(Integer idSorteo) {
        this.idSorteo = idSorteo;
    }

    public Integer getIdSorteo() {
        return idSorteo;
    }

    public void setIdSorteo(Integer idSorteo) {
        this.idSorteo = idSorteo;
    }

    public String getIdApuesta() {
        return idApuesta;
    }

    public void setIdApuesta(String idApuesta) {
        this.idApuesta = idApuesta;
    }

    public String getMarcador() {
        return marcador;
    }

    public void setMarcador(String marcador) {
        this.marcador = marcador;
    }

    public String getNombreSorteo() {
        return nombreSorteo;
    }

    public void setNombreSorteo(String nombreSorteo) {
        this.nombreSorteo = nombreSorteo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSorteo != null ? idSorteo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sorteo)) {
            return false;
        }
        Sorteo other = (Sorteo) object;
        if ((this.idSorteo == null && other.idSorteo != null) || (this.idSorteo != null && !this.idSorteo.equals(other.idSorteo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "arq.pojos.Sorteo[ idSorteo=" + idSorteo + " ]";
    }
    
}
