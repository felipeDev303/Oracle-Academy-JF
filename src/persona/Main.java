package pkg15072024_v2;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    System.out.println("Ingrese un numero:");
    Scanner entrada = new Scanner(System.in);
    int edad = entrada.nextInt();
    
    // TODO code application logic here
    //Crear Objetos (instanciar)
    Persona nuevoPersona = new Persona("Pedro", 178, edad, "M", "Chilena", "Catolica", "Programador", "1-9", 80);
    System.out.println(nuevoPersona);
   
    Persona nuevoPersona3 = new Persona("Juan", 170, 20);  

    Persona nuevoPersona2 = new Persona(); 
    nuevoPersona2.setNombre("RB");
    nuevoPersona2.setAltura(178);
    
    System.out.println(nuevoPersona2);
    int resultadoCaminar = nuevoPersona2.caminar(10);
    System.out.println("El profe esta caminando:" + resultadoCaminar);
        
    nuevoPersona2.comer();
    nuevoPersona2.dormir();
    System.out.println(nuevoPersona2.getNombre());
    
  }
  
}
