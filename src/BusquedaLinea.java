package src;

import java.util.List;

public class BusquedaLinea {
    private List<Persona> personas;

    public BusquedaLinea(List<Persona> personas) {
        this.personas = personas;
    }

    //Caso 1
    // Busqueda una persona
    // Retorne la persona si lo encontro
    // Retorne null si no lo encontro
    public Persona findByName(String name) {
        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i).getName().equals(name)) {
                return personas.get(i);
            }
        }
        return null;
    }

    //Caso 2
    // Busque la pos de una persona
    // Retorne la pos persona si lo encuentro
    // Retorne -1 si no lo encuentra
    public int findByIndex(String name) {
        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }
}
