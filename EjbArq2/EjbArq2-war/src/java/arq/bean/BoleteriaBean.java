/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arq.bean;

import arq.pojos.Boleteria;
import arq.pojos.Rifa;
import arq.servicios.BoleteriaFacadeLocal;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author quenan
 */
@ManagedBean
@RequestScoped
public class BoleteriaBean {
    
    @EJB
    private BoleteriaFacadeLocal boleteriaFacade;

    private int idBoleteria;
    private int maxBoletas;
    private String precioBoleta;
    private String tipoBoleta;
    
    public BoleteriaBean() {
    }
    
    public List<Boleteria> getBoleteria(){
        return boleteriaFacade.findAll();
    }
    
    public String crear(){
        Boleteria b = new Boleteria();
        b.setIdBoleteria(idBoleteria);
        b.setMaxBoletas(maxBoletas);
        b.setPrecioBoleta(precioBoleta);
        b.setTipoBoleta(tipoBoleta);
        
        boleteriaFacade.create(b);
        
        return "boleteria";
    }

    public int getIdBoleteria() {
        return idBoleteria;
    }

    public void setIdBoleteria(int idBoleteria) {
        this.idBoleteria = idBoleteria;
    }

    public int getMaxBoletas() {
        return maxBoletas;
    }

    public void setMaxBoletas(int maxBoletas) {
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
    
    
    
    
}
