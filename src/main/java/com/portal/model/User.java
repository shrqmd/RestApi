package com.portal.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "VCNRDB")
public class User
{
    @Id
    private  String userName;
    private  String password;
    private  String email;
    private String  rpassword;
    private String isAdmin;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRpassword() {
        return rpassword;
    }

    public void setRpassword(String rpassword) {
        this.rpassword = rpassword;
    }

    public String getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(String isAdmin) {
        this.isAdmin = isAdmin;
    }
}
