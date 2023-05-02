package Lista_2;

import java.util.Scanner;

public class Atividade_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int deno, div;

        System.out.println("Digite o denominador");
        deno = sc.nextInt();
        System.out.println("Digite o Divisor");
        div = sc.nextInt();

        if (deno % div == 0) {
            System.out.println("O numero " + deno + " numero e divisivel por " + div);
        } else {
            System.out.println("Divisão Indeterminada");
        }
        sc.close();
    }
}
