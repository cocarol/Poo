package persona;

import java.util.Scanner;

public class Persona{
	public String nombre;
	public String apellido;
	public Integer edad; 
   public Persona(){
       Scanner sc = new Scanner(System.in);
       System.out.println("Ingrese su nombre: ");
       nombre = sc.nextLine();         
       System.out.println("Ingrese su apellido: ");
       apellido =  sc.nextLine();     
       //sc.close();   
   }
   public Persona(String nombre, String apellido){
       this.nombre = nombre;
       this.apellido = apellido;
   } 
   public String getNombre() {
   	return nombre;
   }
   public void setNombre(String nombre) {
   	this.nombre = nombre;
   }  
   public String getApellido() {
   	return apellido;
   }
   public void setApellido(String apellido) {
   	this.apellido = apellido;
   }
}
