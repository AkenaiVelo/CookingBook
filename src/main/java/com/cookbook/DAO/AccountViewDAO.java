package com.cookbook.DAO;

import com.cookbook.ENGINE.EngineAccount;
import com.cookbook.POJO.Account;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.stereotype.Component;
/**
 *
 * @author MaQ - a nie zaden podrabianiec!
 */
@Component
public class AccountViewDAO {

    @PersistenceContext
    private EntityManager em;

    public AccountViewDAO() {
    }   
    
    public List<EngineAccount> findAllAccounts() {
        List<Account> all;
        List<EngineAccount> all2 = new ArrayList<>();
        Query query = em.createQuery("SELECT p FROM EngineAccount p"); 
        all2 = query.getResultList(); 
        return all2;
    }
}