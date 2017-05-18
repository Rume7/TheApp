package com.codehacks.users.sessions;

import com.codehacks.users.entity.Adminstaff;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class AdminstaffFacade extends AbstractFacade<Adminstaff> {

    @PersistenceContext(unitName = "com.codehacks_TheApp_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AdminstaffFacade() {
        super(Adminstaff.class);
    }
    
}
