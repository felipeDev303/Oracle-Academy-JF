package arrays;

public class Array_2D_Objetos {
    public static void main(String[] args){
        //Declaración e inicialización de array bidimensional
        String[][] flower={
                {"Rosas","Blancas","Rojas","Rosadas"},
                {"Girasoles","Blancas","Rojas","Amarillas"},
                {"Tulipanes","Blancas","Violeta","Amarillas"}
        };

        for(String[]fila:flower){
            System.out.println();
            for(String columna:fila){
                System.out.println(columna + " ");
            }
        }
    }
}
