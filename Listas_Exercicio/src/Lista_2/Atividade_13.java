package Lista_2;

import java.util.Scanner;

public class Atividade_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double hCobre = 2.00;
        double hAluminio = 4.00;
        double desconto;

        System.out.println("Quantas hastes de cobre voce ira comprar");
        int cCobre = sc.nextInt();
        System.out.println("Quantas hastes de Aluminio voce ira comprar");
        int cAluminio = sc.nextInt();

        int quantidadeTotal = cCobre + cAluminio;

        if (quantidadeTotal < 5) {
            double valorTotal = (hCobre * cCobre) + (hAluminio * cAluminio);
            System.out.printf("O total a pagar sera %f", valorTotal);
        } else if (quantidadeTotal >= 5 || quantidadeTotal <= 15) {
            double valorTotal = (hCobre * cCobre) + (hAluminio * cAluminio);
            desconto = valorTotal * 0.10;
            double valorTotalcDesconto = valorTotal + desconto;
            System.out.printf("O total a pagar sera %.2f e teve um desconto de %.2f", valorTotalcDesconto, desconto);
        } else if (quantidadeTotal >= 16 || quantidadeTotal <= 20) {
            double valorTotal = (hCobre * cCobre) + (hAluminio * cAluminio);
            desconto = valorTotal * 0.15;
            double valorTotalcDesconto = valorTotal + desconto;
            System.out.printf("O total a pagar sera %.2f e teve um desconto de %.2f", valorTotalcDesconto, desconto);
        } else if (quantidadeTotal > 20) {
            double valorTotal = (hCobre * cCobre) + (hAluminio * cAluminio);
            desconto = valorTotal * 0.20;
            double valorTotalcDesconto = valorTotal - desconto;
            System.out.printf("O total a pagar sera %.2f e teve um desconto de %.2f", valorTotalcDesconto, desconto);
        }
    }
}