package com.cookbook.DAO;

import com.cookbook.ENGINE.EnginePersons;
import java.util.List;
import javax.persistence.*;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class PersonViewDAO {
    @PersistenceContext private EntityManager em;

    public PersonViewDAO() {
    }
    
    @Transactional
    public EnginePersons getPersonById(int id)
    {
        EnginePersons result = em.find(EnginePersons.class, id);
        return result;
    }
     public void AddPerson(EnginePersons person)
     {
         em.persist(person);
     }
     
     public List<EnginePersons> findAll() {
        List<EnginePersons> all;
        Query query = em.createQuery("from EnginePersons e"); //You will get Weayher object
        all = query.getResultList(); //You are accessing  as list<WeatherModel>
        return all;
    }
}