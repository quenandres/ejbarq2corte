/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arq.servicios;

import arq.pojos.Sorteo;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author quenan
 */
@Local
public interface SorteoFacadeLocal {

    void create(Sorteo sorteo);

    void edit(Sorteo sorteo);

    void remove(Sorteo sorteo);

    Sorteo find(Object id);

    List<Sorteo> findAll();

    List<Sorteo> findRange(int[] range);

    int count();
    
}
