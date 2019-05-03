/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arq.servicios;

import arq.pojos.Rifa;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author quenan
 */
@Local
public interface RifaFacadeLocal {

    void create(Rifa rifa);

    void edit(Rifa rifa);

    void remove(Rifa rifa);

    Rifa find(Object id);

    List<Rifa> findAll();

    List<Rifa> findRange(int[] range);

    int count();
    
}
