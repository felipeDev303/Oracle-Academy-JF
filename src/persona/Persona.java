package pkg15072024_v2;

public class Persona {
  
  //Acá creamos las caracteristicas (atributos) de la clase
  private String nombre;
  private int altura;
  private int edad;
  private String genero;
  private String nacionalidad;
  private String religion;
  private String oficio;
  private String rut;
  private int peso;
  
  //Acá creamos las funcionalidades (metodos) de la clase
  public Persona(String nombre, int altura, int edad, String genero, String nacionalidad, String religion, String oficio, String rut, int peso) {
    this.nombre = nombre;
    this.altura = altura;
    this.edad = edad;
    this.genero = genero;
    this.nacionalidad = nacionalidad;
    this.religion = religion;
    this.oficio = oficio;
    this.rut = rut;
    this.peso = peso;
  }

  public Persona() {
  }

  public Persona(String nombre, int altura, int edad) {
    this.nombre = nombre;
    this.altura = altura;
    this.edad = edad;
  }
  
  @Override
  public String toString() {
    int edadSumada = edad + 20;
    return "Persona{" + "nombre=" + nombre + ", altura=" + altura + ", edad=" + edadSumada + ", genero=" + genero + ", nacionalidad=" + nacionalidad + ", religion=" + religion + ", oficio=" + oficio + ", rut=" + rut + ", peso=" + peso + '}';
  }
  
  public void comer(){
    System.out.println("El profe esta comiendo");
  }
  
  public void respirar(){}
  public void jugarPelota(){}
  public void opinar(){}
  public void pensar(){}
  public void hablar(){}
  
  public void dormir(){
    System.out.println("El profe esta roncando");
  }
  
  public int caminar(int km){
    int resultado = (int) (km * 0.9);
    return resultado;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getAltura() {
    return altura;
  }

  public void setAltura(int altura) {
    this.altura = altura;
  }
  
  
  
}
