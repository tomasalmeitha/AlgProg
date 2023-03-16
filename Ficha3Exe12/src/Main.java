import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n1, n2, n3;

        System.out.print("Insira um número inteiro: ");
        n1 = input.nextInt();


        while (n1 > 0) {
            System.out.print("Insira um número inteiro: ");
            n1 = input.nextInt();
            n1 = n2;
            System.out.println(n2);
        }

        if (n3 < n2) {
            System.out.println("A sequência está em ordem crescente");
        }
        input.close();
    }
}