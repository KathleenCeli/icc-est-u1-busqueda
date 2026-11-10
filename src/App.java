package src;

import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<Persona> personas = List.of(
            new Persona("Juan", 25, "M"), 
            new Persona("María", 30, "F"), 
            new Persona("Pedro", 20, "M"),
            new Persona("Ana", 28, "F"));
            
    //1. Busque una persona con nombre "Maria"
    //Retorne la persona si lo encontró
    Persona personaEncontrada = new BusquedaLinea(personas).findByName("María");
    System.out.println("Resultado de la busqueda de María: " + personaEncontrada);

    //2. busque una persona con nombre "Diego"
    //retorne la persona si lo encontró
    Persona personabuscada = new BusquedaLinea(personas).findByName("Diego");
    System.out.println("Resultado de la búsqueda de Diego: " + personabuscada);
    //Busque una persona con nombre "Ana"
    //Imprima la posicion de la persona si lo encontró
     BusquedaLinea busquedapos = new BusquedaLinea(personas);
    int posicionAna = busquedapos.findByIndex("Ana");
    System.out.println("Posición de Ana: " + posicionAna);
        
    }
    
}
