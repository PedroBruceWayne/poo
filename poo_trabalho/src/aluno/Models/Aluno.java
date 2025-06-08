package aluno.Models;

import aluno.Interfaces.Cadastro;

public class Aluno extends Pessoa implements Cadastro {
    private boolean matriculado;

    public Aluno(String cpf, String nome, String email, String telefone, String dataNascimento, boolean matriculado) {
        super(cpf, nome, email, telefone, dataNascimento);
        this.matriculado = matriculado;
    }

    public void exibirInformacoes() {
        System.out.println("Aluno: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("E-mail: " + email);
        System.out.println("Telefone: " + telefone);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("Status da matrícula: " + (matriculado ? "Ativo" : "Inativo"));
    }

    public void confirmarCadastro() {
        System.out.println("Cadastro confirmado com sucesso!");
    }
}
