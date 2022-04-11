/**
 *
 * @author Jonathan Emilio Brito Avilez
 */
public class Bankaccount {
    /**
     * Creación de los atributos de la clase CuentaBancaria los cuales son:
     * Número de cuenta
     * Tipo de cuenta
     * Activación
     */
    private int accountNumber;
    public String accountType;
    protected boolean activated;

    /**
     * Creación del constructor de la clase en el cual se le asignaran valores
     * a los atributos
     */
    public Bankaccount(){
      this.accountNumber = 253247852;
      this.accountType = "Ahorro";
      this.activated = true;
    }

    /**
     * Creación del get y set para el atributo boolean de activación
     */
    public boolean isActivated() {
        return activated;
    }

    public void setActivated(boolean activated) {
        this.activated = activated;
    }

    /**
     * Creación del método condición el cual con el condicional if nos mandara un mensaje
     * mostrándonos si la cuenta se encuentra activada o no
     */
    public void condition(){
        if(activated == true){
            System.out.println("Su cuenta de "+accountType+" se encuentra activada");
        }else{
            System.out.println("Su cuenta de "+accountType+" se encuentra desactivada");
        }

    }
}
