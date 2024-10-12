package arrays;

public class Array_For_Each3 {
    public static void main (String[] args){
        int[] arr_random=new int[150];

        for(int i=0;i<arr_random.length;i++){

            arr_random[i]=(int)Math.round(Math.random()*100);
        }

        for(int numbers:arr_random){
            System.out.print(numbers + " ");
        }
    }
}
