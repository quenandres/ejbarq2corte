/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arq.servicios;

import arq.pojos.Jugadores;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author quenan
 */
@Local
public interface JugadoresFacadeLocal {

    void create(Jugadores jugadores);

    void edit(Jugadores jugadores);

    void remove(Jugadores jugadores);

    Jugadores find(Object id);

    List<Jugadores> findAll();

    List<Jugadores> findRange(int[] range);

    int count();
    
}
