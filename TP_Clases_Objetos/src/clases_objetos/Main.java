package clases_objetos;
import auto.Auto;
import cuentaBncaria.CuentaBncaria;
import libro.Libro;
import persona.Persona;
import rectangulo.Rectangulo;

public class Main {	
	public static void main(String[] args) {      
	     /*
	        Adorno adorno1 = new Adorno();
	        System.out.println("El tipo es: " + adorno1.tipo);
	        System.out.println("El material es: " + adorno1.material);	      
	        Adorno adorno2 = new Adorno();
	        System.out.println("El tipo es: " + adorno2.tipo);
	        System.out.println("El meterial es: " + adorno2.material);        */
	       Persona persona1 = new Persona();
	       System.out.println("El nombre es: " + persona1.getNombre());
	       System.out.println("El apellido es: " + persona1.getApellido());
		   Libro libro1 = new Libro();
	       System.out.println("El titulo del libro es: " + libro1.getTitulo());
	       System.out.println("El autor es: " + libro1.getAutor());
		   Auto auto1 = new Auto();
	       System.out.println("La marca del auto es: " + auto1.getMarca());
	       System.out.println("El modelo es: " + auto1.getModelo());
	       System.out.println("El color es: " + auto1.getColor());
		   CuentaBncaria cuentabncaria1 = new CuentaBncaria();
	       System.out.println("Tu saldo es: " + cuentabncaria1.getSaldo());
		   Rectangulo rectangulo1 = new Rectangulo();
	       System.out.println("La base es: " + rectangulo1.getBase());
	       System.out.println("La altura es: " + rectangulo1.getAltura());
	}
}