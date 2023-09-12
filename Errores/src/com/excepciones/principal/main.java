package com.excepciones.principal;

public class main {

    public static void main(String[] args) {

        // Manejo de excepciones
            /*int a = 10, b = 0;
            float c = 2.2f;
            System.out.println("Iniciando...");
            System.out.println(c);
            System.out.println("Ejecutando codigo...");
            System.out.println(a / b);
            System.out.println("terminando...");*/
            int numero1 [] = {4,8,16,32,64,128,256,512};
            int numero2 [] = {2,0,4,4,0,8};
       try{
           for(int i = 0; i < numero1.length; i++){
               System.out.println(numero1[i] + " / " + numero2[i] + " = "
               + numero1[i]/numero2[i]);
           }
        }
       catch (ArithmeticException e) {
           System.out.println("Epa... No se puede dividir entre cero");
           //Esto me trata de explicar el error
           //System.out.println(e.getCause());
           //System.out.println(e.getMessage());
           //System.out.println(e.getClass());
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error arreglo fuera de indice");
        }
        catch (Exception e){
            System.out.println("Intente mas tarde, no hay conexion");
        }
        finally {
            System.out.println("Finalizando el programa, vuelva pronto");
        }
    }
}
