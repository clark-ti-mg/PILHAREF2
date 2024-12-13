import java.util.Scanner;

public class App {
    // Outras classes relacionadas à este código estão neste mesmo repositório
  
    static PilhaReferencia pilha = new PilhaReferencia();

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else {
            if (n == 1) {
                return 1;
            }
        }

        return (fibonacci(n - 1) + fibonacci(n - 2));
    }

    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe um número para ver a sequência de Icannobif:");
        int n = teclado.nextInt();

        for (int i = 1; i < n; i++) {
            pilha.push(new Termo(fibonacci(i)));
        }

        System.out.print("Sequência de Iccanobif: [");
        while (!pilha.isVazia()) {
            System.out.print(pilha.pop().valor);
            if (!pilha.isVazia()) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

    }
}
