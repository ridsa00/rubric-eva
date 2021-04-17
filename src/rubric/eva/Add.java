/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rubric.eva;

import java.util.ArrayList;
import java.util.List;
import java.util.jar.Attributes.Name;

/**
 *
 * @author ridsa
 */
public class Add {
    
     private static  Add instance;
    
    private List< Student>  regno;
        private List< Student>  name; 

    
    private Add(){
         regno= new ArrayList<Student>();
         name= new ArrayList<Student>();
         
    }
    
    public static  Add getInstance(){
        if(instance==null)
        {
            instance = new  Add();
        }
        
        return instance;
    }
    
    
   
    
    public void addName( Student n){
          regno.add( n);
    }
    
    private int searchName(String Name )
    {
       
        int index = -1;
        
         for(int i = 0 ; i<  name.size(); i++)
         {
             if(   name.get(i).getName().equals(  Name ))
             {
                 index = i;
                 break;
             }
         }
         
        return index;
    }
    
    
     public  Student getName(String Name)
    {
        int index = searchRegno( Name);
        return    name.get(index);
    }
    
    
      public void addRegNo( Student r){
          regno.add( r);
    }
      
      
    
    private int searchRegno(String  reg )
    {
       
        int index = -1;
        
         for(int i = 0 ; i< regno.size(); i++)
         {
             if(  regno.get(i).getName().equals( reg ))
             {
                 index = i;
                 break;
             }
         }
         
        return index;
    }
    
    
     public  Student getRegno(String Reg)
    {
        int index = searchRegno( Reg);
        return   regno.get(index);
    }
    
     
     public boolean updateName(String  name ,Student n){
       int index = searchRegno( name);
       
       if(index == -1)
           return false;
       else {
            regno.set(index, n);
           return true;
       }
    }
    
     
    public boolean deleteName(String  name){
       int index = searchName(name);
       
       if(index == -1)
           return false;
       else {
            regno.remove(index);
           return true;
       }
    }
    
}
