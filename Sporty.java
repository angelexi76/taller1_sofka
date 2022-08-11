/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MisClases;

/**
 *
 * @author angela Sánchez
 */
public class Sporty {
      
    
    private  int id;
    public   String name;
    private  String surname;
    protected  String identityCard;
 
    
//constructor protected
    protected Sporty(String identityCard) {
     this.identityCard = identityCard;
    }
//constructores

    public Sporty() {
    }

    public Sporty(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
       
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
//encapsulacion protected
    protected String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    
    

   
   
    
}

  