/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arq.bean;

import arq.pojos.Usuarios;
import arq.servicios.UsuariosFacadeLocal;
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
public class UsuarioBean {
    @EJB
    private UsuariosFacadeLocal usuariosFacade;

    private int idUSusarios;
    private String nombre;
    private String password;
    private String rol;
    
    public UsuarioBean() {
    }

    public List<Usuarios> getUsuario(){
        return usuariosFacade.findAll();
    }
    
    public String crear(){
        Usuarios c = new Usuarios();
        c.setIdUsuarios(idUSusarios);
        c.setNombre(nombre);
        c.setPassword(password);
        c.setRol(rol);
        
        usuariosFacade.create(c);
        
        return "usuarios";
    }
    
    
    
    public int getIdUSusarios() {
        return idUSusarios;
    }

    public void setIdUSusarios(int idUSusarios) {
        this.idUSusarios = idUSusarios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }   
}
