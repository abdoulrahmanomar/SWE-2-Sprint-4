/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projectt.Controller;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    String Name;
    double price;
    double min_price;
    double max_price;
    String Category;
    int quantity;
    String brand ;
    String description ;
    boolean add_by_owner;
    @GeneratedValue(strategy = GenerationType.AUTO)
    int num_of_view;
    int num_of_buy;

    public Product(Integer id, int ProductID,double min,double max, String Name,int quantity,String brand,String description, double price, String Category, boolean add_by_owner, int num_of_view, int num_of_buy) {
        this.id = id;
        this.Name = Name;
        this.price = price;
        this.Category = Category;
        this.quantity = quantity;
        this.brand = brand;
        this.max_price = max;
        this.min_price = min;
        this.description = description;
        this.add_by_owner = add_by_owner;
        this.num_of_view = num_of_view;
        this.num_of_buy = num_of_buy;
    }

    public int getNum_of_buy() {
        return num_of_buy;
    }

    public void setNum_of_buy(int num_of_buy) {
        this.num_of_buy = num_of_buy;
    }

    public Product() {
        id = null;
        Name = null;
        price = 0;
        Category = null;
        description = null;
        brand = null;
        min_price = 0.0;
        max_price = 0.0;
        quantity = 0;
        add_by_owner = false;
        num_of_view = 0;
        num_of_buy = 0;

    }

    public int getNum_of_view() {
        return num_of_view;
    }

    public void setNum_of_view(int num_of_view) {
        this.num_of_view = num_of_view;
    }

    public boolean getAdd_by_owner() {
        return add_by_owner;
    }

    public void setAdd_by_owner(boolean add_by_owner) {
        this.add_by_owner = add_by_owner;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
    public int getQuantity(){
        return quantity;
    }
    
        
    public void setQuantity(int quantity) {
        this.quantity = quantity ;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getBrand() {
        return brand;
    }
    public void setMax(double max) {
        this.max_price = max;
    }
    public double getMax() {
        return max_price;
    }
        public void setMin(double min) {
        this.min_price = min;
    }
    public double getMin() {
        return min_price;
    }
    
}
