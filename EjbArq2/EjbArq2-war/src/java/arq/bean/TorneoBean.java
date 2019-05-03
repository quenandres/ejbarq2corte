/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arq.bean;

import arq.pojos.Torneo;
import arq.servicios.TorneoFacadeLocal;
import java.util.Date;
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
public class TorneoBean {
    @EJB
    private TorneoFacadeLocal torneoFacade;
    
    private int idTorneo;
    private String nombreTorneo;
    private String idEquipo;
    private Date fechaInicio;
    private Date fechaFin;
    private String partidosTorneo;
    
    /**
     * Creates a new instance of TorneoBean
     */
    public TorneoBean() {
    }
    
    public List<Torneo> getTorneo(){
        return torneoFacade.findAll();
    }
    
    public String crear(){
        Torneo t = new Torneo();
        t.setIdTorneo(idTorneo);
        t.setNombreTorneo(nombreTorneo);
        t.setFechaInicio(fechaInicio);
        t.setFechaFin(fechaFin);
        t.setPartidosTorneo(partidosTorneo);
        t.setIdEquipo(idEquipo);
        
        torneoFacade.create(t);
                
        return "Torneo";
    }

    public int getIdTorneo() {
        return idTorneo;
    }

    public void setIdTorneo(int idTorneo) {
        this.idTorneo = idTorneo;
    }

    public String getNombreTorneo() {
        return nombreTorneo;
    }

    public void setNombreTorneo(String nombreTorneo) {
        this.nombreTorneo = nombreTorneo;
    }

    public String getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(String idEquipo) {
        this.idEquipo = idEquipo;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getPartidosTorneo() {
        return partidosTorneo;
    }

    public void setPartidosTorneo(String partidosTorneo) {
        this.partidosTorneo = partidosTorneo;
    }
    
    
    
}
