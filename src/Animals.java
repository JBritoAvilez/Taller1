/**
 *
 * @author Jonathan Emilio Brito Avilez
 */
public class Animals {
    /**
     * Creación de los atributos de la clase Animal los cuales son:
     * Nombre
     * Especie
     * Raza
     */
    public String name;
    public String species;
    public String race;

    /**
     * Creación del constructor de la clase en el cual se le asignaran valores
     * a los atributos
     */
    public Animals() {
        this.name = "Ares";
        this.species = "Perro";
        this.race = "Beagle";
    }

    /**
     * Creación de los métodos get y set para los atributos
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

}
