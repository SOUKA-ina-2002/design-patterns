package main.java.com.Soukaina.org.design.patterns.Strategy;
public interface Flys {
	
    String fly();
    
 }
 
 // Class used if the Animal can fly
 
 class ItFlys implements Flys{
 
    public String fly() {
         
        return "Flying High";
        
    }
     
 }
 
 //Class used if the Animal can't fly
 
 class CantFly implements Flys{
 
     public String fly() {
         
         return "I can't fly";
         
     }
     
 }
