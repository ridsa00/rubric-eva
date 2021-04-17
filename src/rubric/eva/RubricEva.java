/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rubric.eva;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author ridsa
 */

 

public class RubricEva {

    private static RubricEva instance;

    /**
     * @param args the command line arguments
     */
    
   
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Mainform f = new Mainform();
        f.setVisible(true);
        
        ArrayList<String>name = new ArrayList<String>();
     //   static final List<String> CLO = new ArrayList<String>(){{   add("1"); add("2");}};

      //  list = new String[]{"va" , "va"};
      
       
    
    }
    
   public static ArrayList<CLO> clo= new ArrayList<CLO>();

    public static ArrayList<CLO> getClo() {
        return clo;
    }

    public static void setClo(ArrayList<CLO> clo) {
        RubricEva.clo = clo;
    }

     public static boolean method(CLO c)
     { 
        clo.add(c);
        return true;
     }

     

    
    public static RubricEva  getInstance(){
        if(instance==null)
        {
            instance = new  RubricEva();
        }
        
        return instance;
    }
   
   
}

    