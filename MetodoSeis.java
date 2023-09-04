package plantrabajo;

public class MetodoSeis {

	
	public MetodoSeis() {
		int[] objeto1 = { 6 , 10 , 45 , 83 };
		int[] objeto2 = { 3 , 34 , 46 , 13 };
		int[] valor = maximo(objeto1 , objeto2);
		System.out.print(valor);
	}
	
	public int[] maximo(int[] arreglo1, int[] arreglo2) {
		 int[] suma = new int [arreglo1.length];
		
		for (int i = 0; i < arreglo1.length; i++) {
			suma[i]= arreglo1[i]+ arreglo2[i];
		}
		
		return suma;
		
	}
	
}
