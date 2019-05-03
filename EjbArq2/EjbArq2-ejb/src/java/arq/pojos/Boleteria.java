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
@Table(name = "Boleteria")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Boleteria.findAll", query = "SELECT b FROM Boleteria b"),
    @NamedQuery(name = "Boleteria.findByIdBoleteria", query = "SELECT b FROM Boleteria b WHERE b.idBoleteria = :idBoleteria"),
    @NamedQuery(name = "Boleteria.findByMaxBoletas", query = "SELECT b FROM Boleteria b WHERE b.maxBoletas = :maxBoletas"),
    @NamedQuery(name = "Boleteria.findByPrecioBoleta", query = "SELECT b FROM Boleteria b WHERE b.precioBoleta = :precioBoleta"),
    @NamedQuery(name = "Boleteria.findByTipoBoleta", query = "SELECT b FROM Boleteria b WHERE b.tipoBoleta = :tipoBoleta")})
public class Boleteria implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idBoleteria")
    private Integer idBoleteria;
    @Column(name = "maxBoletas")
    private Integer maxBoletas;
    @Size(max = 255)
    @Column(name = "precioBoleta")
    private String precioBoleta;
    @Size(max = 255)
    @Column(name = "tipoBoleta")
    private String tipoBoleta;

    public Boleteria() {
    }

    public Boleteria(Integer idBoleteria) {
        this.idBoleteria = idBoleteria;
    }

    public Integer getIdBoleteria() {
        return idBoleteria;
    }

    public void setIdBoleteria(Integer idBoleteria) {
        this.idBoleteria = idBoleteria;
    }

    public Integer getMaxBoletas() {
        return maxBoletas;
    }

    public void setMaxBoletas(Integer maxBoletas) {
        this.maxBoletas = maxBoletas;
    }

    public String getPrecioBoleta() {
        return precioBoleta;
    }

    public void setPrecioBoleta(String precioBoleta) {
        this.precioBoleta = precioBoleta;
    }

    public String getTipoBoleta() {
        return tipoBoleta;
    }

    public void setTipoBoleta(String tipoBoleta) {
        this.tipoBoleta = tipoBoleta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idBoleteria != null ? idBoleteria.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Boleteria)) {
            return false;
        }
        Boleteria other = (Boleteria) object;
        if ((this.idBoleteria == null && other.idBoleteria != null) || (this.idBoleteria != null && !this.idBoleteria.equals(other.idBoleteria))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "arq.pojos.Boleteria[ idBoleteria=" + idBoleteria + " ]";
    }
    
}
