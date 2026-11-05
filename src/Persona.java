package src;
public class Persona {
    private String name;
    private String genero;
    private int edad;

    public Persona() {

    }

    public Persona(String name, int edad, String genero) {
        this.name = name;
        this.genero = genero;
        this.edad = edad;
    }

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}    

