/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MisClases;

/**
 *
 * @author angelaSanchezBarbosa
 */
public class Coach {
 
   private String name;
   private String identityCard;

    public Coach() {
    }
   
   

    public Coach(String name, String identityCard) {
        
        this.name = name;
        this.identityCard = identityCard;
    }

  

   

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

  

    

   
   
   
}

