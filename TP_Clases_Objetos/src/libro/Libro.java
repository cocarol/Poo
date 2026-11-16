package libro;

import java.util.Scanner;

public class Libro{
	public String titulo;
	public String autor; 
   public Libro(){
       Scanner sc = new Scanner(System.in);
       System.out.println("Ingrese el título: ");
       titulo = sc.nextLine();         
       System.out.println("Ingrese el autor: ");
       autor =  sc.nextLine();     
       //sc.close(); 
   }
   public Libro(String titulo, String autor){
       this.titulo = titulo;
       this.autor = autor;
   } 
   public String getTitulo() {
   	return titulo;
   }
   public void setTitulo(String titulo) {
   	this.titulo = titulo;
   }  
   public String getAutor() {
   	return autor;
   }
   public void setAutor(String autor) {
   	this.autor = autor;
   }
}
