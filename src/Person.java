import java.util.Date;
/**
 *
 * @author Jonathan Emilio Brito Avilez
 */
public class Person {
    /**
     * Creación de los atributos de la clase Persona los cuales son:
     * Nombre
     * Identificación
     * Primer y segundo apellido
     * Fecha de nacimiento
     * Altura y peso
     */
    public String names;
    private int Id;
    public String lastName1,lastName2;
    public Date dateBirth;
    public float height,weight;

    /**
     * Creación del constructor de la clase en el cual se le asignaran valores
     * a los atributos
     */
    public Person(){
    this.Id = 124253;
    this.names = "Juan Andres";
    this.lastName1 = "Perez";
    this.lastName2 = "Garces";
    this.dateBirth = new Date(98, 5,3,10,5,6);
    this.height = (float) 1.72;
    this.weight = (float) 82.2;
}

    /**
     * Creación de los métodos get y set para los atributos
     */
    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getLastName1() {
        return lastName1;
    }

    public void setLastName1(String lastName1) {
        this.lastName1 = lastName1;
    }

    public String getLastName2() {
        return lastName2;
    }

    public void setLastName2(String lastName2) {
        this.lastName2 = lastName2;
    }

    public Date getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    /**
     * Creación del método IMC el cual calcula él indice de masa corporal
     * de la persona este hace el proceso de multiplicar el peso por el resultado
     * de la division de la altura entre el número dos
     * @returnimc
     */
    public float IMC(){
    float imc;
    imc=weight *(height/2);
    return imc;
    }


}
