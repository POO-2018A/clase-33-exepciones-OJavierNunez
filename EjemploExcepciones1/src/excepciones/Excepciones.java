package excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        
        try{
        System.out.println("\t*********Bienvenido Usuario*********");
        System.out.print("\n¿Señala cuántos items tendrá tu arreglo?: ");
        int tamaño = entrada.nextInt();
        
        int arreglo[] = new int[tamaño];
        System.out.print("\n Ahora......\n");
        
        for(int i=0; i<tamaño; i++){
        
            System.out.print("Ingresa el item #"+(i)+": ");
            arreglo[i] = entrada.nextInt();
        
        }
        System.out.print("\nQué item quieres ver [?][?][?][?] ");
        int verItem = entrada.nextInt();
    
        System.out.print("Item en la posición ''"+(verItem)+"'' es: "+arreglo[verItem] );
        
        System.out.println("\nRESPUESTAS: ");
        for(int i=0; i<tamaño; i++){
        
        System.out.print("Item''"+(i)+"'' = "+arreglo[i]+"\n");
        }
        
        }catch(InputMismatchException exe1){ 
            System.out.println("Excepción: Ingresa un numero entero!!!");
            
        }catch(ArrayIndexOutOfBoundsException exe2){
        
            String mensaje =exe2.getMessage();
            System.out.println("Excepción: El arreglo no tiene "+mensaje+ " items.....");
        
        }catch(Exception exe3){
        
            String mensaje =exe3.getMessage();
            System.out.println("Excepción: Cometiste el error de/en/por: "+mensaje+ ".");
        
        }finally{
        
                System.out.println("Comprobación exitosa de Exepciones.... ");
        
        }
  
    }
    
}
