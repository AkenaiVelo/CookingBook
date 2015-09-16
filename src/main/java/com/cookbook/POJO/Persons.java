package com.cookbook.POJO;

import com.cookbook.DTO.PersonDTO;
import com.cookbook.ENGINE.EngineAddress;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Velo
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Table(name = "HIBER.PERSONS")
public class Persons implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PERSON_ID")
    private Integer personId;
    @Column(name = "FIRSTNAME")
    private String firstname;
    @Column(name = "SURNAME")
    private String surname;
    @OneToMany(mappedBy = "personId", fetch = FetchType.LAZY, targetEntity = Address.class)  //zobacz czy działa z EAGER
    private List<EngineAddress> addressList;

    public Persons() {
    }

    public Persons(Persons p) {
        personId = p.personId;
        firstname = p.firstname;
        surname = p.surname;
        addressList = deepCopy(p.addressList);
    }

    private ArrayList<EngineAddress> deepCopy(List<EngineAddress> intab){
        ArrayList<EngineAddress> outtab = new ArrayList<>();
        for(EngineAddress a:intab){
            EngineAddress temp = new EngineAddress(a);
            outtab.add(temp);
        }
        
        
        return outtab;
    }
    
    public Persons(PersonDTO p) {
        personId = p.getPersonId();
        firstname = p.getFirstname();
        surname = p.getSurname();
        addressList = null;
    }

    public Persons(String firstname, String surname, List<EngineAddress> addressList) {
        this.firstname = firstname;
        this.surname = surname;
        this.addressList = addressList;
    }

    public Persons(Integer personId) {
        this.personId = personId;
    }

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public List<EngineAddress> getAddressList() {
        return addressList;
    }

    public void setAddressList(List<EngineAddress> addressList) {
        this.addressList = addressList;
    }

    @Override
    public String toString() {
        return " personId=" + this.getPersonId() + " Firstname=" + this.getFirstname() + " surname=" + this.getSurname();
    }

}
