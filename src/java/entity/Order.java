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
public class Order {
    private int id;
    private String customer;
    private String phone;
    private String email;
    private String add;
    private int amount;

    public Order() {
    }

    public Order(int id, String customer, String phone, String email, String add, int amount) {
        this.id = id;
        this.customer = customer;
        this.phone = phone;
        this.email = email;
        this.add = add;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    

    public int getid() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    

}
