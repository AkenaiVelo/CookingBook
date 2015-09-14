
package com.cookbook.ENGINE;

import com.cookbook.DTO.PersonDTO;
import com.cookbook.POJO.Persons;
import java.util.List;

public class EnginePersons extends Persons{

    public EnginePersons() {
    }
    public EnginePersons(Persons p)
    {
        super(p);
    }
    
    public EnginePersons(PersonDTO p)
    {
        super(p);
    }

    public EnginePersons(int person_id, String firstname, String Surname, List<EngineAddress> adresy) {
        super( firstname, Surname, adresy);
    }
@Override
    public int hashCode() {
        int hash = 0;
        hash += (this.getPersonId() != null ? this.getPersonId().hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Persons)) {
            return false;
        }
        Persons other = (Persons) object;
        if ((this.getPersonId() == null && other.getPersonId() != null) || (this.getPersonId() != null && !this.getPersonId().equals(other.getPersonId()))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return super.toString();
    }
   
    
}
