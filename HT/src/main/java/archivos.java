
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
        //se instancian los numeros random
        Random rand = new Random();
        int w =0;//se crea la variable de while
        //si el archivo no existe en la direccion indicada crear el archivo, al descargar hay que cambiar la direccion que se escribe aqui
        try (PrintWriter salida = new PrintWriter("C:/Users/maris/OneDrive/Escritorio/HT/HT/src/main/java/numeros.txt")){
            while(w<3000){//mientras w seamenor que 0 escribir 3000 numeros random que lleguen hasta 300
                int n = rand.nextInt(300);
                salida.print(n + " ");
                w++;
            }
        }
        //catch de si el archivo no se puede encontrar
        catch(FileNotFoundException e) {
            System.out.println(e.getMessage()+" puede que La direccion del archivo no es correcta, revisar codigo.");
        }
    }

}
