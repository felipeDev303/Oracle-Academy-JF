package arrays;

public class Array_2D_Objetos {
    public static void main(String[] args){
        //Declaración e inicialización de array bidimensional
        String[][] beer={
                {"Tamango","Cortacorriente","Pantera","Supersonic"},
                {"Jester","Cosmonauta","Resinosa","Hopyjuz"},
                {"Granizo","Gran Ipa","Bomba 6","Orquídea"}
        };

        // Recorrer array bidimensional usando for-each
        for(String[] beerType:beer){
            // Imprimir el primer elemento de cada array (Marca de cerveza)
            System.out.println("Marca de cerveza artesanal: " + beerType[0]);
            System.out.println("Tipos disponibles:");
            for(int i=1;i < beerType.length;i++){
                System.out.println("- " + beerType[i]);
            }
            System.out.println(); //Separar las cervezas con un espacio en blanco
        }
    }
}
