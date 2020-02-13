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
        //se muestra un menu para poder sellecionar el tipo de sort que se quiere crear
        System.out.println("Sorts:\n 1 Selection Sort \n 2. Merge Sort \n 3. Quick Sort \n 4. Radix Sort \n 5. Bubble Sort ");
        int op = scan.nextInt();//ingresa el valor deseado
        System.out.println();
        Sorts sorts = new Sorts();//se instancia la clase sorts
        switch(op){//Por cada opcion que el pueda ingresa
            case 1://Codigo proveido por Rajat Mishra https://www.geeksforgeeks.org/selection-sort/
                sorts.selectionSort(numeros, 10);//se usa selection sort
                System.out.println();
                sorts.toString(numeros,10);//se imprime el array arreglado
                break;
            case 2://codigo proveido por Rajat Mishra https://www.geeksforgeeks.org/merge-sort/
               sorts.mergeSort(numeros,0,10);//se usamerge sort
               System.out.println();
               sorts.toString(numeros,10);//se imorime el arreglo
               break;
            case 3://codigo proveido por Rajat Mishra https://www.geeksforgeeks.org/quick-sort/
                sorts.quickSort(numeros,0,9);//se usa quicksort
                System.out.println();
                sorts.toString(numeros,10);//se imprime el arreglo
                break;
            case 4://codigo proveido de Devesh Agrawal https://www.geeksforgeeks.org/radix-sort/ 
                sorts.radixSort(numeros,10);//se usa radix sort
                System.out.println();
                sorts.toString(numeros,10);//se imprime el arreglo
                break;
            case 5:
                sorts.bubbleSort(numeros,10);//se usa bubble sort
                System.out.println();
                sorts.toString(numeros,10);//se imprime el arreglo
                break;
        }
    }    
}
