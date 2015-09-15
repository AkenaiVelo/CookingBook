/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cookbook.DTO;

import com.cookbook.ENGINE.EnginePersons;

/**
 *
 * @author byakuya
 */
public class AddressDTO {

    private Integer addressId;
    private String city;
    private String zipcode;
    private EnginePersons personId;

    public AddressDTO(EnginePersons e) { // ????? <<<< tak ma byc czy EngineAddress

    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public EnginePersons getPersonId() {
        return personId;
    }

    public void setPersonId(EnginePersons personId) {
        this.personId = personId;
    }

}
