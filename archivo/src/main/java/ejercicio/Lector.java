package ejercicio;

import java.io.*;
import java.net.URL;

public class Lector {

    public static void main(String[] args) throws IOException {

//        File file = new File("./archivo/archivo.txt");
//        FileReader fr = new FileReader(file);
//        char i[] = new char[100];
//        fr.read(i);
//        for(char j : i){
//            System.out.print(j);
//        }
// Se usa mas la opcion de while
//        int caracter;
//        while((caracter = fr.read()) != -1){
//            System.out.print((char)caracter);
//        }
//        fr.close();


//        File file = new File("./archivo/archivo.txt");
//        FileReader fr = new FileReader(file);
        //Lectura de pagina web
        URL url = new URL("https://www.educacionit.com/");
        BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
        boolean flag = false;
        String lineaLeida = "";
        while(!flag) {
            lineaLeida = br.readLine();
            if (lineaLeida != null) {
                System.out.println(lineaLeida);
            } else {
                flag = true;
            }
        }
            br.close();
            //fr.close();
        }
    }
