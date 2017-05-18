package com.codehacks.users.sessions;

import com.codehacks.users.entity.Supportstaff;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class SupportstaffFacade extends AbstractFacade<Supportstaff> {

    @PersistenceContext(unitName = "com.codehacks_TheApp_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SupportstaffFacade() {
        super(Supportstaff.class);
    }
    
}
