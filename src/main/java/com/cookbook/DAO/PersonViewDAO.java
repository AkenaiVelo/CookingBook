package com.cookbook.DAO;

import com.cookbook.ENGINE.EnginePersons;
import com.cookbook.POJO.Persons;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class PersonViewDAO {

    @PersistenceContext
    private EntityManager em;

    public PersonViewDAO() {
    }

    
    public EnginePersons getPersonById(int id) {
        Persons p=em.find(Persons.class, id);
        EnginePersons result = new EnginePersons(p);
        return result;
    }

    public boolean AddPerson(EnginePersons person) {
        try {
            em.persist(person);
        } catch (PersistenceException p) {
            //log4j.error(blablabla+p);
            return false;
        }
        return true;
    }

    public List<EnginePersons> findAll() {
        List<Persons> all;
        List<EnginePersons> all2 = new ArrayList<>();
        Query query = em.createQuery("SELECT p FROM Persons p"); //You will get Weayher object
        all = query.getResultList(); //You are accessing  as list<WeatherModel>
        for (Persons p : all) {
            all2.add(new EnginePersons(p));
        }
        return all2;
    }
    

}
