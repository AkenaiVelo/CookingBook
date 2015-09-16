package com.cookbook.ENGINE;

import com.cookbook.POJO.Address;

public class EngineAddress extends Address {

    public EngineAddress() {
    }
    
public EngineAddress(EngineAddress a){
    
    super((Address)a);
    
}  
    
    public EngineAddress(String city, String zipcode, EnginePersons person) {
        super(city, zipcode, person);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (this.getAddressId() != null ? this.getAddressId().hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Address)) {
            return false;
        }
        Address other = (Address) object;
        if ((this.getAddressId() == null && other.getAddressId() != null) || (this.getAddressId() != null && !this.getAddressId().equals(other.getAddressId()))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return " addressId=" + this.getAddressId() + " City=" + this.getCity() + " Zip-Code=" + this.getZipcode();
    }

}
