package arrays;

public class Arrays {
    public static void main (String [] args){
        // Declaración dinámica del array
        /*int [] arr = new int [5];
        arr[0]=32;
        arr[1]=5;
        arr[2]=2;
        arr[3]=7;
        arr[4]=10;*/

        // Declaración estática del array
        int [] arr ={32,5,2,7,10,8,1,3,6,112,-12};
        for(int i=0;i<arr.length;i++){
            System.out.println("Valor del índice " + i + " = " + arr[i]);
        }
    }
}
