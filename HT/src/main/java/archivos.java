
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *C:\Users\maris\OneDrive\Escritorio\HT\HT\src\main\java
 * @author maris
 */
public class archivos {
    public void crear_archivo(){
        Random rand = new Random();
        int w =0;
        try (PrintWriter salida = new PrintWriter("C:/Users/maris/OneDrive/Escritorio/HT/HT/src/main/java/numeros.txt")){
            while(w<3000){
                int n = rand.nextInt(300);
                salida.print(n + " ");
                w++;
            }
        }
        catch(FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

}
