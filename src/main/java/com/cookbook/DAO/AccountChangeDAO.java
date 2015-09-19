
package com.cookbook.DAO;

import com.cookbook.ENGINE.EngineAccount;
import com.cookbook.Other.Loger;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;
import org.springframework.stereotype.Component;

@Component
public class AccountChangeDAO {

    @PersistenceContext
    private EntityManager em;

    public AccountChangeDAO()
    {
        
    }
     public boolean AddAccount(EngineAccount account) {
        
        try {
            System.out.println("Zapisuje "+account);
             em.getTransaction().begin();
            em.persist(account);
            em.getTransaction().commit();
        } catch (PersistenceException p) {
            System.out.println(p);
            Loger.logger.error("Błąd dodawania konta");
            return false;
        }
        return true;
    }
    
    public boolean ChangePassword(EngineAccount ea, String new_password)
    {
        if(ea.getPassword().equals(new_password))
        {
              try {
          ea.setPassword(new_password);
            em.persist(ea);
        } catch (PersistenceException p) {
           Loger.logger.error("Nie udalo sie zmienic hasla!");
            return false;
        }
        return true;
        }
        else return false;   // hasla sie nie zgadzaja
    }
}