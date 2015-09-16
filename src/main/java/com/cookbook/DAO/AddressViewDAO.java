package com.cookbook.DAO;

import com.cookbook.ENGINE.EngineAddress;
import com.cookbook.ENGINE.EnginePersons;
import com.cookbook.POJO.Persons;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class AddressViewDAO {

    @PersistenceContext
    private EntityManager em;

    public AddressViewDAO() {
    }

    public List<EngineAddress> CRITERIA_getAddressOfPerson(int person_id) {
        
        Persons p = em.find(Persons.class, person_id);
        
       return p.getAddressList();
       
    }
    
       public List<EngineAddress> HQL_getAddressOfPerson(int person_id) {
        
        List<EngineAddress> addressesOfPerson;
        
        Query query = em.createQuery("SELECT p FROM Address a WHERE p.personId='" + Integer.toString(person_id) + "'"); 
        addressesOfPerson = query.getResultList(); //You are accessing  as list<WeatherModel>
        
        return addressesOfPerson;
        
       
       
    }

   

 
}
