/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */Este archivo ejecutable maneja las clases que nos pidieron que propusieramos:los cuales son Coach,Team,Sporty
package Manager2;
 //importacion de las clases
import MisClases.Coach;
import MisClases.Team;
import MisClases.Sporty;
/**
 *
 * @author angelaSanchez
 */
public class Tournament {
    
//metodo ejecutable   
    public static void main(String[] args) {
        
//  instancio el objeto equipo
      
    Team Team1 = new Team();
    Team1.setId(01);
    Team1.setName("Dodgers");
    Team1.setSport("baseball");
    System.out.println("el Equipo:" +""+ Team1.getName()+" "+"jugara:"+ Team1.getSport());
    
    
    
//instanciacion object Coach
    Coach Coach1 =new Coach();
    Coach1.setName("Clayton McCullough");
    Coach1.setIdentityCard("12345");
    System.out.println(" Su Coach es:"+Coach1.getName());
    
    
    
//instancia object deportista
    Sporty Sporty1 =  new Sporty();
    Sporty1.setId(01);
    Sporty1.setName("Spencer");
    Sporty1.setSurname("Torkelson");
    Sporty1.setIdentityCard("741741");
    
     System.out.println("El Nombre del Jugador es:"+Sporty1.getName()+" "+Sporty1.getSurname());
    }
    
}

 
