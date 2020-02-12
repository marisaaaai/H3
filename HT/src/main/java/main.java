/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.File;
import java.util.Scanner;
/**
 *
 * @author maris
 */
public class main {
    public static void main (String[]args){
     //Se instancia la clase que creara el archivo
        archivos arch = new archivos();
        Scanner scan = new Scanner(System.in);
        arch.crear_archivo();//se crea el archivo
        String archivo = "numeros.txt";//una vez cread el archivo se guarda en una variable
        File fichero = new File (archivo);//se instancia el indicador de archivo que se usarÃ¡
        Scanner s;//se instancia el scanner
        String linea="";//se crea la variable en donde se guardara lo que dice el archivo
        try{//si existe el archivo
            s= new Scanner(fichero);//que se escanee el archivo
            while(s.hasNextLine()){//mientras que haya una siguiente linea en el archivo que guarde en la variable linea loque encuentre el scaner
                linea += s.nextLine();
            }
        }
        catch(Exception ex){//si no existe el archivo mostrar mensaje de error
            System.out.println("Mensaje de error: "+ ex.getMessage());
        }
        //System.out.println(linea);muestra que la linea si guardo lo que se encontraba en el archivo
        String [] numerosArray = linea.split("\\s");
        int [] numeros = new int [3000];
        for(int i=0;i<3000;i++){
            String numero = numerosArray[i];
            int entero = Integer.parseInt(numero);
            numeros[i]=entero;
        }
        System.out.println("Sorts:\n 1 Selection Sort \n 2. Merge Sort \n 3. Quick Sort \n 4. Radix Sort \n 5. Bubble Sort ");
        int op = scan.nextInt();
        Sorts sorts = new Sorts();
        switch(op){
            case 1:
                sorts.selectionSort(numeros, 10);
                sorts.toString(numeros,10);
                break;
            case 2:
               sorts.mergeSort(numeros,0,10);
               sorts.toString(numeros,10);
               break;
            case 3:
                sorts.quickSort(numeros,0,9);
                sorts.toString(numeros,10);
                break;
        }
    }    
}
