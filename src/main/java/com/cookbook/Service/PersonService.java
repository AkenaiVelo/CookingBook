package com.cookbook.Service;

import org.springframework.stereotype.Service;
import com.cookbook.DAO.PersonViewDAO;
import com.cookbook.ENGINE.EnginePersons;
import com.cookbook.DTO.PersonDTO;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class PersonService {
    
    @Autowired
    private PersonViewDAO baza;
    
    public ArrayList<PersonDTO> usersList()
    {
        ArrayList<PersonDTO> result=new ArrayList<>();
        for(EnginePersons e : baza.findAll())
        {
            result.add(new PersonDTO(e));
        }
        return result;
    }
    
}
