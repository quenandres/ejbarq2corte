/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arq.servicios;

import arq.pojos.Torneo;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author quenan
 */
@Stateless
public class TorneoFacade extends AbstractFacade<Torneo> implements TorneoFacadeLocal {
    @PersistenceContext(unitName = "EjbArq2-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TorneoFacade() {
        super(Torneo.class);
    }
    
}
