/**
 *
 * @author Jonathan Emilio Brito Avilez
 */
public class Desk {
    /**
     * Creación de los atributos de la clase Escritorio los cuales son:
     * Material de la mesa
     * Forma de la mesa
     * Longitud de la mesa
     * Ancho de la mesa
     * Altura de la mesa
     * Soporte de la mesa
     */
    private String tablematerial;
    public String tableShape;
    protected float tableLength,tableWhidth,tableHeight;
    public int tableStand;

    /**
     * Creación del constructor de la clase en el cual se le asignaran valores
     * a los atributos
     */
    public Desk(){
        this.tablematerial = "madera";
        this.tableShape ="circular";
        this.tableLength = (float)4.5;
        this.tableWhidth = 2;
        this.tableHeight = (float) 2.5;
        this.tableStand = 4;
    }

    /**
     * Creación del método información en el cual nos muestra en un mensaje toda
     * la información referente al escritorio
     */
    public void informations(){
        System.out.println("\nEl material de la mesa es: "+tablematerial+
                            "\n La forma de la mesa es: "+tableShape+
                            "\n Lo largo de la mesa es de: "+tableLength+"M"+
                            "\n Lo ancho de la mesa es de: "+tableWhidth+"M"+
                            "\n La altura de la mesa es de: "+tableHeight+"M"+
                            "\n La mesa cuenta con "+tableStand+" patas para su base");
        }
}
