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
public class ProductController {
    @Autowired
    private ProductRepository repository;
    @GetMapping("/addproduct")
    public String addproduct(Model model){
        model.addAttribute("product",new Product());
        return "addproduct";
    }
    @PostMapping("/addproduct")
    public String addproduct(Model model ,@ModelAttribute Product product){
   
       repository.save(product);
        model.addAttribute("product",new Product());

        return "addproduct";
    }
    
      
       @GetMapping("/add_p_storeowner")
    public String add(Model model){
        model.addAttribute("product",new Product());
        Iterable <Product  > productit =repository.findAll();
        ArrayList <Product> product2=new ArrayList<Product>();
    
        for(Product product1:productit){
            product2.add(product1);
          }
        model.addAttribute("products",product2);
        return"add_p_storeowner";
    }
        
    @PostMapping("/add_p_storeowner")
    public String add(Model model ,@ModelAttribute Product product){
        Iterable <Product  > productit =repository.findAll();
        ArrayList <Product> product2=new ArrayList<Product>();
    
        for(Product product1:productit){
            product2.add(product1);
          }
            model.addAttribute("products",product2);
        for(int i=0;i<product2.size();i++){
            if((product2.get(i).getId()==product.getId())){
                 product2.get(i).setAdd_by_owner(true);
                 product2.get(i).setPrice(product.getPrice());
                  repository.save(product2.get(i));
                return "add_p_storeowner";
                
            }
        }
        
        return "add_p_storeowner";
              
        
    }  
    
    
       @GetMapping("/productinfo")
    public String productinfo(Model model){
        Iterable <Product> productit =repository.findAll();
        ArrayList <Product> product2=new ArrayList<Product>();
    
        for(Product product1:productit){
            product2.add(product1);
          }
        model.addAttribute("productinfo",product2);
        return"productinfo";
    }
        
    @PostMapping("/productinfo")
    public String productinfo(Model model ,@ModelAttribute Product product){
        Iterable <Product  > productit =repository.findAll();
        ArrayList <Product> product2=new ArrayList<Product>();
    
        for(Product product1:productit){
            product2.add(product1);
          }
            model.addAttribute("productinfo",product2);

       
             
        return "productinfo";
              
        
    }
    
      @GetMapping("/buy_product")
    public String buy(Model model){
     model.addAttribute("product",new Product());
        Iterable <Product  > productit =repository.findAll();
        ArrayList <Product> product2=new ArrayList<Product>();
    
        for(Product product1:productit){
            product2.add(product1);
          }
        model.addAttribute("products",product2);
        return"buy_product";
    }
        
    @PostMapping("/buy_product")
    public String buy(Model model ,@ModelAttribute Product product){
        Iterable <Product  > productit =repository.findAll();
        ArrayList <Product> product2=new ArrayList<Product>();
    
        for(Product product1:productit){
            product2.add(product1);
          }
            model.addAttribute("products",product2);
        for(int i=0;i<product2.size();i++){
            if((product2.get(i).getName().equals(product.getName()) )&&(product2.get(i).getQuantity()>=product.getQuantity())
                     ){
                
                 product2.get(i).setQuantity(product2.get(i).getQuantity()-product.getQuantity());
                 product2.get(i).setNum_of_buy(product2.get(i).getNum_of_buy()+1);
                 product2.get(i).setNum_of_view(product2.get(i).getNum_of_view()+1);
                  repository.save(product2.get(i));
                return "buy_success";
                
            }
        }
        
        
        return "try_again";
              
        
    } 
    /////////////////////////////////////////////////////////////
      
       @GetMapping("/sumofproducts")
    public String sum(Model model){
        //model.addAttribute("product",new Product());
        Iterable <Product  > productit =repository.findAll();
        ArrayList <Product> product2=new ArrayList<Product>();
        int sum;
        for(Product product1:productit){
            product2.add(product1);
          }
        sum=product2.size();
        
        model.addAttribute("sumofproducts",sum);
        return"sumofproducts";
    }
        
    @PostMapping("/sumofproducts")
    public String sum(Model model ,@ModelAttribute Product product){
        Iterable <Product  > productit =repository.findAll();
        ArrayList <Product> product2=new ArrayList<Product>();
    
        for(Product product1:productit){
            product2.add(product1);
          }
        int   sum=product2.size();
        
            model.addAttribute("sumofproducts",sum);
 
        return "sumofproducts";
              
        
    }  
        /////////////////////////////////////////////////////////////
      
       @GetMapping("/maxproduct")
    public String max(Model model){
            int   max=0;
         String n="";
         
        Iterable <Product  > productit =repository.findAll();
        ArrayList <Product> product2=new ArrayList<Product>();
    
        for(Product product1:productit){
            product2.add(product1);
          }
        for(int i=0;i<product2.size();i++){
            if(product2.get(i).getNum_of_buy()>=max){
                max=product2.get(i).getNum_of_buy();
                n=product2.get(i).getName();
            }
        }
       
            model.addAttribute("maxproduct",n);
 
        return "maxproduct";
              
        
    }
        
    @PostMapping("/maxproduct")
    public String max(Model model ,@ModelAttribute Product product){
         int   max=0;
         String n="";
         
        Iterable <Product  > productit =repository.findAll();
        ArrayList <Product> product2=new ArrayList<Product>();
    
        for(Product product1:productit){
            product2.add(product1);
          }
        for(int i=0;i<product2.size();i++){
            if(product2.get(i).getNum_of_buy()>=max){
                max=product2.get(i).getNum_of_buy();
                n=product2.get(i).getName();
            }
        }
       
            model.addAttribute("maxproduct",n);
 
        return "maxproduct";
              
        
    }  
  /////////////////////////////////////////////////////////////
      
       @GetMapping("/minproduct")
    public String min(Model model){
            int   min=0;
         String n="";
         
        Iterable <Product  > productit =repository.findAll();
        ArrayList <Product> product2=new ArrayList<Product>();
    
        for(Product product1:productit){
            product2.add(product1);
          }
        for(int i=0;i<product2.size();i++){
            if(product2.get(i).getNum_of_buy()<=min){
                min=product2.get(i).getNum_of_buy();
                n=product2.get(i).getName();
            }
        }
       
            model.addAttribute("minproduct",n);
 
        return "minproduct";
              
        
    }
        
    @PostMapping("/minproduct")
    public String min(Model model ,@ModelAttribute Product product){
         
         String n="";
         
        Iterable <Product  > productit =repository.findAll();
        ArrayList <Product> product2=new ArrayList<Product>();
    
        for(Product product1:productit){
            product2.add(product1);
          }
        int   min=product2.get(0).getNum_of_buy();
        for(int i=0;i<product2.size();i++){
            if(product2.get(i).getNum_of_buy()<=min){
                min=product2.get(i).getNum_of_buy();
                n=product2.get(i).getName();
            }
        }
       
            model.addAttribute("minproduct",n);
 
        return "minproduct";
              
        
    }
      ///////////////////////////////////////////////////////////////////
    @GetMapping("/newstatistic")
    public String newstatistic (Model model){
        model.addAttribute("newstatistic");
        return "newstatistic";
    }

   
    @PostMapping("/newstatistic")
    public String newstatistic1(Model model){
        model.addAttribute("newstatistic");
        return "newstatistic";
    }
    /////////////////////////////////////////////////
     @GetMapping("/delete_product")
    public String delete(Model model){
        model.addAttribute("product",new Product());
        Iterable <Product  > productit =repository.findAll();
        ArrayList <Product> product2=new ArrayList<Product>();
    
        for(Product product1:productit){
            product2.add(product1);
          }
            model.addAttribute("products",product2);

 
 
        return"delete_product";
    }
        
    @PostMapping("/delete_product")
    public String delete(Model model ,@ModelAttribute Product product){
        Iterable <Product  > productit =repository.findAll();
        ArrayList <Product> product2=new ArrayList<Product>();
    
        for(Product product1:productit){
            product2.add(product1);
          }
            model.addAttribute("products",product2);
        for(int i=0;i<product2.size();i++){
            if((product2.get(i).getId()==product.getId())){
                 
                  repository.delete(product2.get(i));
                  
                return "delete_product";
                
            }
        }
        
        return "delete_product";
              
        
    }
        //////////////////////////////////////////////////////
    
       @GetMapping("/edit_product")
    public String edit(Model model){
        model.addAttribute("product",new Product());
        Iterable <Product  > productit =repository.findAll();
        ArrayList <Product> product2=new ArrayList<Product>();
    
        for(Product product1:productit){
            product2.add(product1);
          }
        model.addAttribute("products",product2);
        return"edit_product";
    }
        
    @PostMapping("/edit_product")
    public String edit(Model model ,@ModelAttribute Product product){
        Iterable <Product  > productit =repository.findAll();
        ArrayList <Product> product2=new ArrayList<Product>();
    
        for(Product product1:productit){
            product2.add(product1);
          }
            model.addAttribute("products",product2);
        for(int i=0;i<product2.size();i++){
            if((product2.get(i).getId()==product.getId())){
                 product2.get(i).setName(product.getName());
                 product2.get(i).setCategory(product.getCategory());
                 product2.get(i).setPrice(product.getPrice());
                 product2.get(i).setQuantity(product.getQuantity());
                 product2.get(i).setNum_of_buy(0);
                 product2.get(i).setNum_of_view(0);
                 repository.save(product2.get(i));
                  
                return "edit_product";
                
            }
        }
        
        return "edit_product";
              
        
    }
    
  
    @PostMapping("/buyit")
    public void o(Model model,@ModelAttribute(value="p") Product product){
    	
    	 Iterable <Product  > productit =repository.findAll();
         ArrayList <Product> product2=new ArrayList<Product>();
     
         for(Product product1:productit){
             product2.add(product1);
           }
            
         for(int i=0;i<product2.size();i++){
             if((product2.get(i).getId()==product.getId())){
                  int n=product2.get(i).getNum_of_buy();
                  product2.get(i).setNum_of_buy(n+1);
                  product2.get(i).setNum_of_view(n+1);
                  System.out.println(product2.get(i).getName());
                   repository.save(product2.get(i));}
             
             
         }
    }
    
    
    @PostMapping("/pstat")
    public  String stat(Model model){
  
    	 Iterable <Product  > productit =repository.findAll();
         ArrayList <Product> product2=new ArrayList<Product>();
     
         for(Product product1:productit){
             product2.add(product1);
           }
         

         
         model.addAttribute("stat",product2);
             
             return "stat";
         
        
    }
    
    
    
    
}
    
        
    
    

