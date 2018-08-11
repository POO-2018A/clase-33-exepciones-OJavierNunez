
package excepciones2;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Excepciones2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        
        try{
        System.out.println("\t********** Bienvenido Usuario **********");
        System.out.println("\n÷ ÷ ÷ ÷ ÷ ÷ Calculadora de División ÷ ÷ ÷ ÷ ÷ ÷\n\n");
        
        System.out.print("Ingresa el numerador:\n");
        int num = entrada.nextInt();
        System.out.print("Ingresa el denominaor:\n");
        int den = entrada.nextInt();
        
        
        int div = cociente(num, den);
        
        System.out.println("\n La división de: "+num+"/"+den+ " da como resultado "+div);
        }catch(ArithmeticException ex1){
        
            String mensaje = ex1.getMessage();
            System.out.println("Excepción: Tú tratas de "+mensaje);
        
        }catch(InputMismatchException ex2){
        
            String mensaje = ex2.getMessage();
            System.out.println("Excepción: No es un número entero....");
        }catch(Exception ex3){
        
            String mensaje =ex3.getMessage();
            System.out.println("Excepción: Cometes el error de/en/por: "+mensaje+ "....");
        
        }finally{
        
                System.out.println("Comprobación exitosa de Exepciones!!!");
        
        }
        
    }
    private static int cociente(int numerador, int denominador) {
        
        int resultado = (numerador/denominador);
    
        return resultado;
    }
    
}
