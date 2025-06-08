package aluno.View;

import aluno.Models.Aluno;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class CadastroAluno {
    private static ArrayList<Aluno> alunos = new ArrayList<>();

    public void execute(Scanner sc) {

        System.out.println("== Cadastrar Novo Aluno ==");

        System.out.print("CPF do aluno: ");
        String cpf = sc.nextLine();

        if (!validarCPF(cpf) || cpfExiste(cpf)) {
            System.out.println("CPF inválido ou já cadastrado, tente novamente!");
            return;
        }

        System.out.print("Nome completo do aluno: ");
        String nome = sc.nextLine();

        System.out.print("E-mail do aluno: ");
        String email = sc.nextLine();
        if (!validarEmail(email)) {
            System.out.println("E-mail inválido.");
            return;
        }

        System.out.print("Telefone para contato: ");
        String telefone = sc.nextLine();

        System.out.print("Data de Nascimento (dd/mm/aaaa): ");
        String dataNascimento = sc.nextLine();

        System.out.print("Status de matrícula (true para ativo / false para inativo): ");
        boolean matriculado = Boolean.parseBoolean(sc.nextLine());

        System.out.print("Deseja confirmar cadastro? (S/N): ");
        String confirmacao = sc.nextLine();
        if (confirmacao.equalsIgnoreCase("S")) {
            Aluno novoAluno = new Aluno(cpf, nome, email, telefone, dataNascimento, matriculado);
            alunos.add(novoAluno);
            novoAluno.confirmarCadastro();
            novoAluno.exibirInformacoes();
        } else {
            System.out.println("Cadastro cancelado.");
        }
    }

    private static boolean validarCPF(String cpf) {
        return cpf.matches("\\d{11}");
    }

    private static boolean validarEmail(String email) {
        return Pattern.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$", email);
    }

    private static boolean cpfExiste(String cpf) {
        return alunos.stream().anyMatch(a -> a.getCpf().equals(cpf));
    }
}
