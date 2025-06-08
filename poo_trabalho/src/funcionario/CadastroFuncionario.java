package funcionario;

import java.util.ArrayList;
import java.util.Scanner;


public class CadastroFuncionario {
    private static final ArrayList<Funcionario> funcionarios = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public void execute(Scanner scanner){
        int opcao;
        do {
            System.out.println("=== MENU DE FUNCIONÁRIOS ===");
            System.out.println("1. Cadastrar Funcionário");
            System.out.println("2. Listar Funcionários");
            System.out.println("3. Atualizar Funcionário");
            System.out.println("4. Remover Funcionário");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = CadastroFuncionario.scanner.nextInt();
            CadastroFuncionario.scanner.nextLine();

            switch (opcao) {
                case 1 -> cadastrarFuncionario();
                case 2 -> listarFuncionarios();
                case 3 -> atualizarFuncionario();
                case 4 -> removerFuncionario();
                case 5 -> System.out.println("Saindo do sistema de Funcionarios...");
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 5);
    }

    private static void cadastrarFuncionario() {
        System.out.println("\n=== Cadastro de Funcionário ===");
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Função: ");
        String funcao = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
        System.out.print("Data de Admissão: ");
        String dataAdmissao = scanner.nextLine();

        Funcionario funcionario = new Funcionario(cpf, nome, funcao, email, telefone, dataAdmissao);
        funcionarios.add(funcionario);
        System.out.println("Funcionário cadastrado com sucesso!");
    }

    private static void listarFuncionarios() {
        System.out.println("\n=== Lista de Funcionários ===");
        if (funcionarios.isEmpty()) {
            System.out.println("Nenhum funcionário cadastrado.");
        } else {
            for (Funcionario funcionario : funcionarios) {
                System.out.println("CPF: " + funcionario.getCpf());
                System.out.println("Nome: " + funcionario.getNome());
                System.out.println("Função: " + funcionario.getFuncao());
                System.out.println("Email: " + funcionario.getEmail());
                System.out.println("Telefone: " + funcionario.getTelefone());
                System.out.println("Data de Admissão: " + funcionario.getDataAdmissao());
                System.out.println("-----------------------");
            }
        }
    }

    private static void atualizarFuncionario() {
        System.out.println("\n=== Atualizar Funcionário ===");
        System.out.print("Digite o CPF do funcionário: ");
        String cpf = scanner.nextLine();

        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getCpf().equals(cpf)) {
                System.out.print("Novo nome: ");
                funcionario.setNome(scanner.nextLine());
                System.out.print("Nova função: ");
                funcionario.setFuncao(scanner.nextLine());
                System.out.print("Novo email: ");
                funcionario.setEmail(scanner.nextLine());
                System.out.print("Novo telefone: ");
                funcionario.setTelefone(scanner.nextLine());
                System.out.println("Funcionário atualizado com sucesso!");
                return;
            }
        }
        System.out.println("Funcionário não encontrado.");
    }

    private static void removerFuncionario() {
        System.out.println("\n=== Remover Funcionário ===");
        System.out.print("Digite o CPF do funcionário: ");
        String cpf = scanner.nextLine();

        funcionarios.removeIf(funcionario -> funcionario.getCpf().equals(cpf));
        System.out.println("Funcionário removido com sucesso!");
    }
}
