
package com.cookbook.ENGINE;

import com.cookbook.POJO.Persons;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="PERSON")
public class EnginePersons extends Persons{

    public EnginePersons() {
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
        return " personId=" + this.getPersonId() + " Firstname="+this.getFirstname()+" surname="+this.getSurname();
    }
   
    
}