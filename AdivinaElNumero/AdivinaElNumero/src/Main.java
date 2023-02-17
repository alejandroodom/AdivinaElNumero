import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner teclado = new Scanner(System.in);

        int numero = random.nextInt(100) + 1;

        int numeroIntroducido = 0;

        while (numeroIntroducido != numero) {
            System.out.print("¿En qué número entre 1 y 100 estoy pensando? \n");
            numeroIntroducido = teclado.nextInt();

            if (numeroIntroducido < numero) {
                System.out.println("Mayor");
            } else if (numeroIntroducido > numero) {
                System.out.println("Menor");
            } else {
                System.out.println("Bravo, lo ha encontrado");
            }
        }
    }
}