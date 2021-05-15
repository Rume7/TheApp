package com.codehacks.register.boundary;

import com.codehacks.register.entity.Registration;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * @author Rhume
 */
@Stateless
public class RegistrationFacade extends AbstractFacade<Registration> {

    @PersistenceContext(unitName = "ComplaintTracker_PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public RegistrationFacade() {
        super(Registration.class);
    }
}
