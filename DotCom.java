package javaapplication1;
import java.util.*;  

public class DotCom {  
    private String name;  
    private ArrayList<String> locationCells ;  
      
    public void setLocationCells(ArrayList<String> loc){  
        locationCells = loc;  
    }  
      
    public void setName(String n){  
        name = n;  
    }  
  
      public String checkYourself(String userGuess){  
      int index = locationCells.indexOf(userGuess);  
      String result = "Errado";     
      if (index >= 0)  
      {  
          locationCells.remove(index);  
          result = "Correto";  
      }  
      if(locationCells.isEmpty())  
      {  
          result = "Eliminar";  
          System.out.println ("Você eliminou a " + name + "!");  
      }  
      return result;  
               
           
          
   }    
}  