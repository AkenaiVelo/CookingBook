package com.cookbook.DTO;

import com.cookbook.ENGINE.EngineAccount;

public class AccountDTO {
   
    private String login;
    private String password;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public AccountDTO(EngineAccount account)
    {
        
    }
    
}