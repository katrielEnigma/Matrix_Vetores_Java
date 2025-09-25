import java.util.Random;

public class DiagonalPrincipal {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] matriz = new int[4][4];
        
        // Preenchendo a matriz com números aleatórios
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = random.nextInt(10); // Números entre 0 e 9
            }
        }
        
        // Exibindo a diagonal principal
        System.out.println("Diagonal principal:");
        for (int i = 0; i < 4; i++) {
            System.out.println(matriz[i][i]); // Elementos da diagonal
        }
    }
}
