package plano;

import java.util.Scanner;

public class SelecaoPlano {

    public void execute(Scanner scanner) {


        System.out.println("=== Cadastro de Plano para Cliente ===");

        // Seleção do tipo de plano
        System.out.println("Selecione o tipo de plano:");
        System.out.println("1 - Básico");
        System.out.println("2 - Plus");
        System.out.println("3 - Premium");
        System.out.print("Opção: ");
        int tipoPlano = scanner.nextInt();

        String nomePlano = "";
        double mensal = 0, trimestral = 0, anual = 0;

        switch (tipoPlano) {
            case 1:
                nomePlano = "Básico";
                mensal = 79.90;
                trimestral = 219.90;   // 3 x 73,30
                anual = 799.90;        // Desconto
                break;
            case 2:
                nomePlano = "Plus";
                mensal = 99.90;
                trimestral = 279.90;   // 3 x 93,30
                anual = 999.90;
                break;
            case 3:
                nomePlano = "Premium";
                mensal = 129.90;
                trimestral = 369.90;   // 3 x 123,30
                anual = 1199.90;
                break;
            default:
                System.out.println("Opção inválida. Encerrando.");
                return;
        }

        // Seleção da duração do plano
        System.out.println("Selecione a duração do plano:");
        System.out.println("1 - Mensal");
        System.out.println("2 - Trimestral");
        System.out.println("3 - Anual");
        System.out.print("Opção: ");
        int duracao = scanner.nextInt();

        String tipoDuracao = "";
        double valorFinal = 0;

        switch (duracao) {
            case 1:
                tipoDuracao = "Mensal";
                valorFinal = mensal;
                break;
            case 2:
                tipoDuracao = "Trimestral";
                valorFinal = trimestral;
                break;
            case 3:
                tipoDuracao = "Anual";
                valorFinal = anual;
                break;
            default:
                System.out.println("Opção de duração inválida. Encerrando.");
                return;
        }

        // Exibindo resumo da escolha
        System.out.println("\n--- Plano Selecionado ---");
        System.out.println("Plano: " + nomePlano);
        System.out.println("Duração: " + tipoDuracao);
        System.out.printf("Valor: R$ %.2f\n", valorFinal);
    }
}
