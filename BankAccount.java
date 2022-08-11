
package ClasesSofka;
/**
 *
 * @author angela Sánchez Barbosa
 */
public class BankAccount {
//atributos
      private  int accountNumber;
      protected boolean activated=true;//si dejamos el true se cumple el if "BankAccount is actived"si lo quitamos mostrara el else false
      
      
//constructor
   //metodo protected
     
    protected BankAccount(boolean activated) {
     this.activated =activated ;
    }

    public BankAccount() {
    }
     
    
    
    public BankAccount(int accountNumber) {
        this.accountNumber = accountNumber;
    }
 
     
    
//metodo 
    public void accountStatus(){
        if(this.activated == true){
         System.out.println("BankAccount is actived");
        }else{
        System.out.println("inactive bank account");
        }
    }

    

   

     //encapsulacion protected
    protected boolean getActivated() {
        return activated;
    }

    public void setActivated(boolean activated) {
        this.activated = activated;
        
    }
 //encapsulamiento
    public int getAccountNumber() {
        return accountNumber;
    }
    
  

 

   
   
}
 

    