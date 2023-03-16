import java.util.Scanner;


class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n1, n2;

        System.out.print("Insira um número inteiro: ");
        n1 = input.nextInt();

        System.out.print("Insira outro número inteiro: ");
        n2 = input.nextInt();

        while ( n1 != n2) {
            if (n1 < n2) {
                n1++;
                if (n1 % 5 == 0) {
                    System.out.println(n1);
                }
            }
            if (n1 > n2){
                n1--;
                if (n1 % 5 ==0){
                    System.out.println(n1);
                }
            }
        }
            input.close();
    }
}