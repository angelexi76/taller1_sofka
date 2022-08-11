//Este ejecutable maneja las clases propuestas por sofka del taller 1 las cuales son cuenta bancaria,frutas,y persona y nos piden hacerlas en ingles
package Manager1;
//importacion de las clases
import ClasesSofka.BankAccount;
import ClasesSofka.Person;



import java.util.ArrayList;

        
        
public class Taller1 {
//metodo ejecutable  main  
  public static void main(String[] args) {

//crea la instancia de la clase Cuenta Bancaria   
BankAccount Bank1 = new BankAccount();

//llamado al metodo estado de cuenta de la clase Cuenta Bancaria
    Bank1.accountStatus();
    System.out.println("");
    
 
       
//instancia de arratList

    ArrayList<String> color = new ArrayList<>();
// agrego elementos alarrayList
      color.add("purple");
      color.add("Red");
      color.add("yellow");

      
//recorro el Array List con un for
//uso de size porque es un arrayList y no length como en un array
    for (int i = 0; i < color.size(); i++) {
        System.out.println("Color:\n");
        System.out.println("-->"+color.get(i));   
      }
    
    
//instancia objeto persona
    Person Person1 = new Person();
       Person1.setName("Ángela");
       Person1.setLastName1("Sánchez");
       Person1.setLastName2("Barbosa");
       Person1.setHeight((float) 1.60);

    System.out.println("Person:"+ Person1.getName()+Person1.getLastName1()+Person1.getLastName2());
      
}

   

    
  

   
   
    
    
}


    
