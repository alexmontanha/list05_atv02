import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Entre com o número de linhas");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        imprimirLinhas(n);

        sc.close();
    }

    private static void imprimirLinhas(int n) {
        System.out.println(n);
    }
}
