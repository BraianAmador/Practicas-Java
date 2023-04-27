package arreglos;

import java.util.Arrays;
import java.util.Scanner;

public class Alumnos {
    public static void main(String[] args) {
        // la clase scanner para capturar valores del teclado
        Scanner teclado = new Scanner(System.in);

        // declaracion de Variables, sin inicializarlos porque no sabemos el tamano
        double[] notas;
        String[] alumnos;
        int cantidadAlumnos;

        // mostramos por pantalla
        System.out.println("Notas de Educacion IT");
        // mostramos un salto de linea para diferenciar el titulo
        System.out.print("\n");


        // pregunta a usuario
        System.out.print("Ingrese la cantidad de notas que cargara: ");

        // capturamos lo que el usuario ingresa y lo asignamos como tamaño del
        // vector, recuerden Int para capturar es un entero y saber cantidad de alumnos
        cantidadAlumnos = teclado.nextInt();

        // con ese tamano inicamos los vectores con la variable @cant_alumnos
        notas = new double[cantidadAlumnos];
        alumnos = new String[cantidadAlumnos];

        // usamos un for para preguntar cada uno de los nombres y las notas
        for (int i = 0; i < cantidadAlumnos; i++) {
            // preguntamos los nombres y notas
            System.out.print("Ingrese el nombre del alumno [" + (i + 1) + "]: ");
            alumnos[i] = teclado.next();

            // capturamos las notas colocando el nombre que nos facilitaron anteriormente
            System.out.print("Ingrese la nota del alumno [" + alumnos[i] + "]: ");
            notas[i] = teclado.nextDouble();

        }

        System.out.println("----------------------------------");

        // mostramos las notas, en este metodo uso el .length y no la variable cantidad
        // solo a modo de ejemplo
        System.out.println("NOTAS PARCIALES DE LOS ALUMNOS: ");
        for (int i = 0; i < alumnos.length; i++) {
            // mostramos las notas como las ingresaron
            System.out.println(alumnos[i] + " obtuvo " + notas[i] + " pts");

        }
        System.out.println("----------------------------------");

        // calculos generales de las notas, uso otro for porque a veces hacemos estos
        // calculos en otro momento

        // el promedio y la suma inicializamos en cero y las notas las inicializamos en
        // la primera posicion del vector
        // como vimos en clase
        double promedio, suma = 0, nota_mayor = notas[0], nota_menor = notas[0];
        int posicion_notaMayor = 0, posicion_notaMenor = 0;

        for (int i = 0; i < cantidadAlumnos; i++) {
            // sumamos cada una de las notas
            suma += notas[i];
            // aprovechemos el uso del continue
            // si es la primera iteracion del vector no necesitamos comparar
            // recuerden que las notas se inicializan con el valor de la primera nota
            // por lo que en la primera iteracion seria comparar dos numeros iguales

            if (i == 0) {
                continue;
            }

            // hago la comparacion de la nota actual es menor a la nota de la iteracion
            // si es verdad esa condicion mi nueva nota es la nota mayor
            if (nota_mayor < notas[i]) {
                nota_mayor = notas[i];
                posicion_notaMayor = i;
            }

            // hago la comparacion de la nota actual es mayor a la nota de la iteracion
            // si es verdad esa condicion mi nueva nota es la nota menor
            if (nota_menor > notas[i]) {
                nota_menor = notas[i];
                posicion_notaMenor = i;

            }

        }
        promedio = (suma / cantidadAlumnos);
        System.out.println("El promedio de notas es: " + promedio);
        System.out.println("El alumno con la mejor nota es " + alumnos[posicion_notaMayor] + " que obtuvo "
                + nota_mayor + " pts");
        System.out.println("El alumno con la nota menor es " + alumnos[posicion_notaMenor] + " que obtuvo "
                + nota_menor + " pts");

        // Arreglos antes de ordenar
        System.out.println("Notas antes de ordenar:");
        System.out.println(Arrays.toString(alumnos));
        System.out.println(Arrays.toString(alumnos));

        // bonus ordenamiento burbuja
        for (int i = 0; i < notas.length; i++) {

            for (int j = 0; j < notas.length; j++) {
                if (notas[i] < notas[j]) {
                    // movemos las notas
                    // para ello necesitamos de un auxiliar que guarde momentaneamente uno de los
                    // valores
                    double notaAuxiliar = notas[i];
                    notas[i] = notas[j];
                    notas[j] = notaAuxiliar;

                    // aprovechamos para mover los nombres cuando se de la condicion
                    String nombreAuxiliar = alumnos[i];
                    alumnos[i] = alumnos[j];
                    alumnos[j] = nombreAuxiliar;
                }

            }
        }

        // Arreglos despues de ordenar
        System.out.println("Notas despues de ordenar:");
        System.out.println(Arrays.toString(notas));
        System.out.println(Arrays.toString(alumnos));

        // cerramos el flujo con la consola
        teclado.close();

    }
}
