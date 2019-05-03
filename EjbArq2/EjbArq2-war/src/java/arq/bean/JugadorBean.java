/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arq.bean;

import arq.pojos.Deporte;
import arq.pojos.Equipos;
import arq.pojos.Jugadores;
import arq.servicios.EquiposFacadeLocal;
import arq.servicios.JugadoresFacadeLocal;
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
public class JugadorBean {
    @EJB
    private EquiposFacadeLocal equiposFacade;
    @EJB
    private JugadoresFacadeLocal jugadoresFacade;

    /**
     * Creates a new instance of JugadorBean
     */
    
    private int idJugadores;
    private String nombreJugador;
    private Equipos equipos;
    
    public JugadorBean() {
        equipos = new Equipos();
    }
    
    public List<Jugadores> getJugadores(){
        return jugadoresFacade.findAll();
    }
    
    public String crear(){
        Jugadores c = new Jugadores();
        c.setIdJugadores(idJugadores);
        c.setNombreJugador(nombreJugador);
        
        jugadoresFacade.create(c);        
        return "jugador";
    }

    public EquiposFacadeLocal getEquiposFacade() {
        return equiposFacade;
    }

    public void setEquiposFacade(EquiposFacadeLocal equiposFacade) {
        this.equiposFacade = equiposFacade;
    }

    public int getIdJugadores() {
        return idJugadores;
    }

    public void setIdJugadores(int idJugadores) {
        this.idJugadores = idJugadores;
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public Equipos getEquipos() {
        return equipos;
    }

    public void setEquipos(Equipos equipos) {
        this.equipos = equipos;
    }
    
}
