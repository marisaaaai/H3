/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maris
 */
public class Sorts {
    //Metodo de insrtion sort
    public void selectionSort(int data[], int na){
        int n = na;
        for (int i = 0; i<n-1;i++){
            int min = i;
            for(int j=i+1;j<n;j++){
                if (data[j]<data[min]){
                    min = j;
                }
            }
            int temp = data[min];
            data[min]=data[i];
            data[i]=temp;
        }
    }
    public void toString(int data[],int na){
        int n = na;
        for(int i=0;i<n;i++){
            System.out.println(data[i]+ " ");
        }
        System.out.println();
    }
    public void merge(int data[], int a, int m, int b){
        int n1= m-a+1;
        int n2 = b-m;
        int A[]= new int[n1];
        int B[]= new int[n2];
        for(int i = 0; i<n1;i++){
            A[i]=data[a+i];
        }
        for(int j =0;j<n2;j++){
            B[j]= data[m+1+j];
        }
        int i=0,j=0;
        int k =a;
        while(i< n1&& j<n2){
            if(A[i]<=B[j]){
                data[k]=A[i];
                i++;
            }
            else{
                data[k]=B[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            data[k]=A[i];
            i++;
            k++;
        }
        while(j<n2){
            data[k]=B[j];
            j++;
            k++;
        }
        
    }
    public void sort(int data[],int a,int b){
        if(a<b){
            int m=(a+b)/2;
            sort(data,a,m);
            sort(data,m+1,b);
            merge(data,a,m,b);
        }
    }
    
 
}


