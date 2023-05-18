package clases;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Persona> personas = new ArrayList();

        Persona persona1 = new Persona();
        persona1.inicializador();
        Documento documento1 = new Documento();
        documento1.inicializador();
        persona1.documento = documento1;
        personas.add(persona1);


        Persona persona2 = new Persona();
        persona2.inicializador();
        Documento documento2 = new Documento();
        documento2.inicializador();
        persona2.documento = documento2;
        personas.add(persona2);

        System.out.println("Se ingresaron " + personas.size() + " personas:");
        for (int i = 0; i < personas.size() ; i++) {
            System.out.println("Se agrego a " + personas.get(i).getNombre()+" "+personas.get(i).getApellido() + " y es " + personas.get(i).esMayorDeEdad());
            System.out.println("El tipo de documento es " + personas.get(i).documento.getTipoDeDocumento() + " y su numero es " + personas.get(i).documento.getNumeroDeDocumento());
        }
    }
}
