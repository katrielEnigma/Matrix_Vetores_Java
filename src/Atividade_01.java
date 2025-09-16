import java.util.Scanner;

public class Atividade_01 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int[] vetor = new int [10];

        System.out.println("Digite 10 numeros inteiros.: ");
        for (int i = 0; i <10; i++){
            System.out.println("Numero.: " + (i+1));
            vetor[i] = leitor.nextInt();
        }

        int NumeroMaior = vetor[0];
        int NumeroMenor = vetor[0];

        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > NumeroMaior) {
                NumeroMaior = vetor[i];
            }
            if (vetor[i] < NumeroMenor) {
                NumeroMenor = vetor[i];
            }
        }


        System.out.println("\n--- Resultado ---");
        System.out.print("Os números digitados foram: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
        System.out.println("O maior valor digitado foi: " + NumeroMaior);
        System.out.println("O menor valor digitado foi: " + NumeroMenor);

    }
}
