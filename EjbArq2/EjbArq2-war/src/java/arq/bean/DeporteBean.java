/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arq.bean;

import arq.pojos.Deporte;
import arq.servicios.DeporteFacadeLocal;
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
public class DeporteBean {
    @EJB
    private DeporteFacadeLocal deporteFacade;
    
    private int idDeporte;
    private String nombreDeporte;
    
    public DeporteBean() {
    }
    
    public List<Deporte> getDeporte(){
        return deporteFacade.findAll();
    }
    
    public String crear(){
        Deporte c = new Deporte();
        c.setIdDeporte(idDeporte);
        c.setNombreDeporte(nombreDeporte);
        
        deporteFacade.create(c);
        
        return "deporte";
    }

    public int getIdDeporte() {
        return idDeporte;
    }

    public void setIdDeporte(int idDeporte) {
        this.idDeporte = idDeporte;
    }

    public String getNombreDeporte() {
        return nombreDeporte;
    }

    public void setNombreDeporte(String nombreDeporte) {
        this.nombreDeporte = nombreDeporte;
    }
    
    
    
}
