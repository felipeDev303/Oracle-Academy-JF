public class Vehiculo {
    // La clase de vehiculo tiene dos campos
    private String hace;
    private int kilometroPorLitro;

    // Constructor
    public Vehiculo () {
    } // Fin constructor

    // Constructor con argumentos de Clase Vehiculo
    public Vehiculo (String m, int kpl) {
        hace = m;
        kilometroPorLitro = kpl;
    } // Fin constructor
    

    // Método setter
    public void setHace (String m) {
        hace = m;
    } // Fin método setHace

    public void setKilometroporlitro (int kpl) {
        kilometroPorLitro = kpl;
    } // Fin método setKilometrosPorLitro

    // Método getter
    public String getHace() {
        return hace;
    } // Fin método getHace

    public int getkilometroPorLitro() {
        return kilometroPorLitro;
    } // Fin método getkilometrosPorLitro
} // Fin clase Vehiculo

/*
public int Comparados <(Vehiculo v1, Vehiculo v2) {
    if (v1.getkilometroPorLitro()==v2.getkilometroPorLitro()) {
        return 0;
    } else {>
        if (v1.getkilometroPorLitro()>v2.getkilometroPorLitro()) {
            return 1;
        } else {
            return -1;
        }
    }
} // Fin Metodo Comparados


 */
// Sobrecarga de métodos
public class Puntos {
    private int x,y;

    public void mostrar(int a) {
        System.out.printIn(x:a);
    } // Fin Método Mostrar

    public void mostrar(){
        System.out.printIn(x: "Hola");
    } // Fin Método mostrar

} // Fin clase puntos
