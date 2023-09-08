package clases;

import java.util.Scanner;

public class Documento {

    private String tipoDeDocumento;
    private String numeroDeDocumento;

    public void inicializador(){

        Scanner teclado = new Scanner(System.in);

        System.out.println("1- Documento Nacional de Identidad (DNI)\n" +
                    "2- Libreta Cívica - (LC)\n" +
                    "3- Libreta de Enrolamiento (LE)\n" +
                    "4- Pasaporte (PA)\n" +
                    "5- Cédula de Identidad (CI)\n"+
                    "Ingrese su tipo de documento, elija un numero:");
        this.setTipoDeDocumento(teclado.nextInt());

        System.out.println("Ingrese su numero de documento: ");
        numeroDeDocumento = teclado.next();
    }

    public String getNumeroDeDocumento() {
        return numeroDeDocumento;
    }

    public void setNumeroDeDocumento(String numeroDeDocumento) {
        this.numeroDeDocumento = numeroDeDocumento;
    }

    public String getTipoDeDocumento() {
        return tipoDeDocumento;
    }

    public void setTipoDeDocumento(int tipoDeDocumento) {
        switch (tipoDeDocumento){
            case 1:
                this.tipoDeDocumento = "DNI";
                break;
            case 2:
                this.tipoDeDocumento = "LC";
                break;
            case 3:
                this.tipoDeDocumento = "LE";
                break;
            case 4:
                this.tipoDeDocumento = "PA";
                break;
            case 5:
                this.tipoDeDocumento = "CI";
                break;
            default:
                System.out.println("No es una opción valida :(");
        }
    }
}
