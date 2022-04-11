/**
 *
 * @author Jonathan Emilio Brito Avilez
 */
public class Cards {
    /**
     * Creación de los atributos de la clase Carro los cuales son:
     * Serial
     * Motor
     * marca
     * poder
     */
    private int serial;
    protected String motor;
    public String brand;
    public int power;

    //constructor
    public Cards() {
        this.serial = 12354687;
        this.motor = "V8";
        this.brand = "Mercedes-Benz";
        this.power = 216;
    }

    /**
     * Creación del método get y set del atributo marca
     */
    public String getBrand() {
        return brand;
    }

    public void setBrand(String marca) {
        this.brand = marca;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    /**
     * Creación del método información en el cual nos muestra en un mensaje toda
     * la información referente al carro
     */
    public void informations(){
        System.out.println("\nEl carro tiene las siguientes especificaciones: "+
                "\n Serial: "+serial+
                "\n Motor: "+motor+"M"+
                "\n Marca: "+brand+"M"+
                "\n Poder de arranque: "+power+"M");
    }
}
