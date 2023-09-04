package ejercicod;
import java.util.Random;
public class Numerorandom {
    public static void main(String[] args) {
        int numeroAleatorio = generarNumeroAleatorio();
        System.out.println("Número aleatorio generado: " + numeroAleatorio);
    }

    public static int generarNumeroAleatorio() {
        Random rand = new Random();
        int numeroAleatorio = rand.nextInt(100) + 1; 
        return numeroAleatorio;
    }
}