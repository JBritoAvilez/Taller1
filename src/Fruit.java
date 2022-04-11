/**
 *
 * @author Jonathan Emilio Brito Avilez
 */
public class Fruit {
    /**
     * Creación de los atributos de la clase Fruta los cuales son:
     * Nombre
     * Pulpa
     * Promedio del peso
     * Color
     */
    public String name;
    public String pulp;
    private float averageWeigth;
    public String[] colors = {"roja","verde"};

    /**
     * Creación del constructor de la clase en el cual se le asignaran los valores
     * a cada atributo
     */
    public Fruit(){
        this.name = "Manzana";
        this.averageWeigth = (float) 200;
        this.pulp = "Suave";
    }

    /**
     * Creación de los métodos get y set para el atributo Colores
     */
    public String[] getColors() {
        return colors;
    }

    public void setColors(String[] colors) {
        this.colors = colors;
    }

    /**
     * Creación del método Información el cual va a recorrer el arreglo color y nos mostrara
     * los colores guardados en cada una de sus posiciones
     */
    public void information(){
        int total = colors.length;
        for (int i=0; i<total;i++){
            System.out.println("La "+name+" viene de color: "+colors[i]+
                               "\n cuenta con un peso de: "+averageWeigth+"g"+
                               "\n Y tiene una pulpa: "+pulp);
        }
    }
}
