/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.beans.*;
import java.io.Serializable;

/**
 *
 * @author Matt
 */
public class User implements Serializable {
    private String email;
    private String firstName;
    private String lastName;
    private String password;
    private String role;
    private Boolean isActive;
    
    public User(){
    }
    public User(String e, String f, String l, String p, String r, Boolean a){
        email = e;
        firstName = f;
        lastName = l;
        password = p;
        role = r;
        isActive = a;
    }
    
}
