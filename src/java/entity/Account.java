/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author DELL VOSTRO
 */
public class Account {
    private int id_ac;
    private String email;
    private String name;
    private String password;

    public Account(int id_ac, String email, String name, String password) {
        this.id_ac = id_ac;
        this.email = email;
        this.name = name;
        this.password = password;
    }

    public int getId_ac() {
        return id_ac;
    }

    public void setId_ac(int id_ac) {
        this.id_ac = id_ac;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Account{" + "id_ac=" + id_ac + ", email=" + email + ", name=" + name + ", password=" + password + '}';
    }


    
}
