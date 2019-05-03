/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arq.bean;

import arq.pojos.Rifa;
import arq.servicios.RifaFacadeLocal;
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
public class RifaBean {
    @EJB
    private RifaFacadeLocal rifaFacade;
    
    private int idRifa;
    private String forma_ganar;
    private int maxParticipantes;
    private String premios;
            
            
    public RifaBean() {
        
    }
    
    public List<Rifa> getRifa(){
        return rifaFacade.findAll();
    }
    
    public String crear(){
        Rifa r = new Rifa();
        r.setIdRifa(idRifa);
        r.setFormaGanar(forma_ganar);
        r.setMaxParticipantes(maxParticipantes);
        r.setPremios(premios);
        
        rifaFacade.create(r);
        
        return "Rifa";
    }

    public int getIdRifa() {
        return idRifa;
    }

    public void setIdRifa(int idRifa) {
        this.idRifa = idRifa;
    }

    public String getForma_ganar() {
        return forma_ganar;
    }

    public void setForma_ganar(String forma_ganar) {
        this.forma_ganar = forma_ganar;
    }

    public int getMaxParticipantes() {
        return maxParticipantes;
    }

    public void setMaxParticipantes(int maxParticipantes) {
        this.maxParticipantes = maxParticipantes;
    }

    public String getPremios() {
        return premios;
    }

    public void setPremios(String premios) {
        this.premios = premios;
    }
}
