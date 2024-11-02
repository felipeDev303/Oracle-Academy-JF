public class Ejercicios_Java {
    public static void main(String[] args) {
        // Sumar notas
        int nota1=40;
        int nota2=50;
        int nota3=60;

        int sumaNotas = nota1+nota2+nota3;

        System.out.println("La suma de las notas es " + sumaNotas);
// Vectores
        int[] notas = new int[3];
        notas[0]=40;
        notas[1]=50;
        notas[2]=60;
        sumaNotas = notas[0]+notas[1]+notas[2];

        System.out.println("La suma de las notas es " + sumaNotas);

        for(int i = 0; i < notas.length; i++){
            System.out.println("La Nota es: " + notas[i]);
        }
// Matriz
        int [][] matriz = new int[3][3];
        matriz[0][0] = 10;
        matriz[0][1] = 20;
        matriz[0][2] = 30;
        matriz[1][0] = 40;
        matriz[1][1] = 50;
        matriz[1][2] = 60;
        matriz[2][0] = 70;
        matriz[2][1] = 80;
        matriz[2][2] = 90;

        for(int i=0; i<matriz.length;i++){
            for (int j=0; j<matriz.length;j++){
                System.out.println("Numero" + matriz[i][j]);
            }
        }
    }
}