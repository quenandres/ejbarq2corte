/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arq.servicios;

import arq.pojos.Ganadores;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author quenan
 */
@Local
public interface GanadoresFacadeLocal {

    void create(Ganadores ganadores);

    void edit(Ganadores ganadores);

    void remove(Ganadores ganadores);

    Ganadores find(Object id);

    List<Ganadores> findAll();

    List<Ganadores> findRange(int[] range);

    int count();
    
}
