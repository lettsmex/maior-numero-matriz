import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número de linhas:");
        int linhas = sc.nextInt();

        System.out.println("Digite o número de colunas:");
        int colunas = sc.nextInt();


        int [][] matriz = new int[linhas][colunas];


        System.out.println("Digite os números desejados na matriz: ");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {

                System.out.printf("Digite o valor correspondente a coluna [%d] e linha [%d]: ", i+ 1, j + 1);
                matriz [i] [j] = sc.nextInt();
            }
        }

        int maiorNumero = matriz [0][0];
        for (int [] linha : matriz) {
            for (int numero : linha) {
                if (numero > maiorNumero) {
                    maiorNumero = numero;
                }
            }
        }

        System.out.println("O maior número da matriz é o: " + maiorNumero);

        sc.close();
    }
}
