/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author trinh
 */
public class Product {
   private int id;
   private String name;
   private String catalog_name;
   private float price;
   private String title;
   private String description;
   private String image;
   private int Amount;

    public Product() {
    }
   
   
    public Product(int id, String name, String catalog_name, float price, String title, String description, String image,int Amount) {
        this.id = id;
        this.name = name;
        this.catalog_name = catalog_name;
        this.price = price;
        this.title = title;
        this.description = description;
        this.image = image;
        this.Amount=Amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCatalog_name() {
        return catalog_name;
    }

    public void setCatalog_name(String catalog_name) {
        this.catalog_name = catalog_name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
    public int getAmount() {
        return Amount;
    }

    public void setAmount(int Amount) {
        this.Amount = Amount;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", name=" + name + ", catalog_name=" + catalog_name + ", price=" + price + ", title=" + title + ", description=" + description + ", image=" + image + '}';
    }
   
}
