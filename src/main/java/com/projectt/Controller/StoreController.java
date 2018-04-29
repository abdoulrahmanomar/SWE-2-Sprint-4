/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projectt.Controller;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.ArrayList;


@Controller
public class StoreController {
     @Autowired
    private storeRepository repository;
  
      @GetMapping("/addstore")
    public String addstore(Model model){
        model.addAttribute("store",new Store());
        return "addstore";
    }
    @PostMapping("/addstore")
    public String addstore(Model model ,@ModelAttribute Store store){
     
       repository.save(store);
        model.addAttribute("store",new Store());

        return "addstore";
    }    
    
     @GetMapping("/confirmation")
    public String confirm(Model model){
        model.addAttribute("store",new Store());
         Iterable <Store  > storeit =repository.findAll();
        ArrayList <Store> store2=new ArrayList<Store>();
    
        for(Store store1:storeit){
            store2.add(store1);
          }
        model.addAttribute("stores", store2);
        
        return"confirmation";
    }
    
    
    
    @PostMapping("/confirmation")
    public String confirm(Model model ,@ModelAttribute Store store){
        Iterable <Store  > storeit =repository.findAll();
        ArrayList <Store> store2=new ArrayList<Store>();
    
        for(Store store1:storeit){
            store2.add(store1);
          }
        model.addAttribute("stores", store2);
        for(int i=0;i<store2.size();i++){
            if((store2.get(i).getId()==store.getId())){
                 store2.get(i).setChecked_by_admin(true);
                  repository.save(store2.get(i));
                return "confirmation";
                
            }
        }
        return "confirmation";
              
        
    }
}
