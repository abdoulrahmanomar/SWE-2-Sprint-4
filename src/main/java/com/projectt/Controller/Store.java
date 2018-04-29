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
public class Store {
      @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private String name;
    private String type;
    private String address;
    private String description;
    private Boolean checked_by_admin;

    
      public Store() {
          id=0;
          name=null;
          type=null;
          description = null;
          address=null;
          checked_by_admin=false;
          
    }
    public Store(Integer id, String name, String type, String address,String description,Boolean checked_by_admin) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.address = address;
        this.description = description ;
        this.checked_by_admin=checked_by_admin;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getChecked_by_admin() {
        return checked_by_admin;
    }

    public void setChecked_by_admin(Boolean checked_by_admin) {
        this.checked_by_admin = checked_by_admin;
    }

 

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public void setDescription(String des) {
        this.description =des;
    }
    public String getDescription() {
        return description;
    }
    
}
