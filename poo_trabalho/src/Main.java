import aluno.View.CadastroAluno;
import funcionario.CadastroFuncionario;
import instrutor.CadastroInstrutor;
import plano.SelecaoPlano;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CadastroInstrutor cadastroInstrutor = new CadastroInstrutor();
        CadastroFuncionario cadastroFuncionario = new CadastroFuncionario();
        SelecaoPlano cadastroPlano = new SelecaoPlano();
        CadastroAluno cadastroAluno = new CadastroAluno();

        while (true) {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Sistema de Instrutores");
            System.out.println("2. Sistema de Funcionarios");
            System.out.println("3. Sistema de Plano");
            System.out.println("4. Sistema de Aluno");
            System.out.println("5. Sair");

            System.out.print("Escolha uma opção: ");
            String opcao = scanner.nextLine();

            switch (opcao) {
                case "1" -> cadastroInstrutor.execute(scanner);
                case "2" -> cadastroFuncionario.execute(scanner);
                case "3" -> cadastroPlano.execute(scanner);
                case "4" -> cadastroAluno.execute(scanner);
                case "5" -> {
                    System.out.println("Encerrando sistema...");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Opção inválida!");
                }
            }
        }
    }