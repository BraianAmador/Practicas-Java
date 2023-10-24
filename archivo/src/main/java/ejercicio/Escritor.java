package ejercicio;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Escritor {

    public static void main(String[] args) throws IOException {

        File file = new File("./archivo/archivo.txt");
        FileWriter fw = new FileWriter(file, true);
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribí el texto:");
        //Agrega un salto para agregar un texto abajo de lo escrito anteriormente
        //String texto = "\n" + teclado.nextLine();

        String texto = teclado.nextLine();
        System.out.println("Escribi el segundo texto:");
        String texto2 = teclado.nextLine();
        System.out.println("Escribi el tercer texto:");
        String texto3 = teclado.nextLine();
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(texto, 0, texto.length());
        //Baja a la siguiente linea
        bw.newLine();
        bw.write(texto2, 0, texto2.length());
        bw.newLine();
        bw.write(texto3, 0, texto3.length());
        bw.newLine();
        bw.close();


        //        for(int i = 0; i < texto.length(); i++) {
//            fw.write(texto.charAt(i));
//        }


        fw.close();
        System.out.println("ya termine de escribir");
    }
}
