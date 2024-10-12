package arrays;

public class Array_2D {
    public static void main (String[]args){
        // Declaración de la matriz bidimensional
        int [][] matrix=new int[4][5];

        // 1° dimensión (0,1,2,3)
        // 2° dimensión (0,1,2,3,4)

        matrix[0][0]=15;
        matrix[0][1]=21;
        matrix[0][2]=19;
        matrix[0][3]=13;
        matrix[0][4]=3;

        matrix[1][0]=18;
        matrix[1][1]=12;
        matrix[1][2]=14;
        matrix[1][3]=1;
        matrix[1][4]=4;

        matrix[2][0]=41;
        matrix[2][1]=32;
        matrix[2][2]=23;
        matrix[2][3]=55;
        matrix[2][4]=78;

        matrix[3][0]=43;
        matrix[3][1]=11;
        matrix[3][2]=17;
        matrix[3][3]=33;
        matrix[3][4]=65;

        // Salida de un array bidimensional
        //System.out.println("Valor almacenado en la posición 3,2: "+ matrix[3][2]);

        // Recorrido de todo el array
        for(int i=0;i<4;i++){

            System.out.println();

            for(int j=0;j<5;j++){

                System.out.print(matrix[i][j]+ " ");
            }
        }
    }
}
