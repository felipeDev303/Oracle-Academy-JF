package arrays;

public class Promedio {
    public static void main(String[] args){
        /*En una clase determinada, existen 5 pruebas que valen 100 puntos cada una.
        Escriba un programa que tome los 5 resultados de las pruebas para el usuario,
        guarde los resultados de las pruebas en un array y, luego, calcule el
        promedio de los estudiantes.*/
        double[]notas={7.0,6.0,5.0,6.0,4.0};
        double sumaNotas=0;
        for(int i=0;i<notas.length;i++){
            sumaNotas+=notas[i];
        }
        System.out.println("El promedio del alumno es: " + sumaNotas/notas.length);
    }
}
