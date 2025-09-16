import java.util.Random;

public class Atividade_02 {
    public static void main(String[] args) {

        int[] quinzeNumerosAleatorios = new int[15];
        Random random = new Random();

        for (int i =0; i < quinzeNumerosAleatorios.length; i++){
            quinzeNumerosAleatorios[i] = random.nextInt(100) + 1;
        }

        System.out.println("Números gerados:");
        for (int i = 0; i < quinzeNumerosAleatorios.length; i++) {
            System.out.print(quinzeNumerosAleatorios[i] + " ");
        }


    }
}
