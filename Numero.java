package ejercicod;

import javax.swing.JOptionPane;


public class Numero {

	public static void main(String[] args) {
	       int numero =Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));; 
	       MayorQueDiez(numero);
	    }

	    public static void MayorQueDiez(int numero) {
	        if (numero > 10) {
	            System.out.println("El número " + numero + " es mayor que 10.");
	        } else {
	            System.out.println("El número " + numero + " no es mayor que 10.");
	        }
	    }
	}