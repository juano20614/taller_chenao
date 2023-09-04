package ejercicod;

public class Maximonum {

	  public static int encontrarMaximo(int[] arreglo) {
	       
	        int maximo = arreglo[0];
	       
	        for (int i = 1; i < arreglo.length; i++) {
	            if (arreglo[i] > maximo) {
	                maximo = arreglo[i];
	            }
	        }
	        
	       
	        return maximo;
	    }

	    public static void main(String[] args) {
	 
	        int[] arregloDeEnteros = {10, 5, 20, 8, 15};
	        int resultado = encontrarMaximo(arregloDeEnteros);

	        System.out.println("El valor máximo en el arreglo es: " + resultado);
	    }
	}