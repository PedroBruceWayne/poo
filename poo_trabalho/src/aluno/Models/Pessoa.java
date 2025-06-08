package aluno.Models;

public abstract class Pessoa {
    protected String cpf;
    protected String nome;
    protected String email;
    protected String telefone;
    protected String dataNascimento;

    public Pessoa(String cpf, String nome, String email, String telefone, String dataNascimento) {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
    }

    public abstract void exibirInformacoes();

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }
}
