/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arq.bean;

import arq.pojos.Deporte;
import arq.pojos.Equipos;
import arq.servicios.DeporteFacadeLocal;
import arq.servicios.EquiposFacadeLocal;
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
public class EquipoBean {
    
    @EJB
    private DeporteFacadeLocal deporteFacade;
    
    @EJB
    private EquiposFacadeLocal equiposFacade;

    private int idEquipos;
    private String nombreEquipo;
    private Deporte deporte;
    
    public EquipoBean() {
        deporte = new Deporte();
    }
    
    public List<Equipos> getEquipos(){
        return equiposFacade.findAll();
    }
    
    public String crear(){
        Equipos c = new Equipos();
        c.setIdEquipos(idEquipos);
        c.setNombreEquipo(nombreEquipo);
        //c.setIdDeporte(deporteFacade.find(deporte.getIdDeporte()));
        
        
        equiposFacade.create(c);
        
        return "equipo";
    }

    public DeporteFacadeLocal getDeporteFacade() {
        return deporteFacade;
    }

    public void setDeporteFacade(DeporteFacadeLocal deporteFacade) {
        this.deporteFacade = deporteFacade;
    }

    public int getIdEquipos() {
        return idEquipos;
    }

    public void setIdEquipos(int idEquipos) {
        this.idEquipos = idEquipos;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public Deporte getDeporte() {
        return deporte;
    }

    public void setDeporte(Deporte deporte) {
        this.deporte = deporte;
    }
    
}
