package instrutor;

import java.util.regex.Pattern;

public class Instrutor {
    private String cpf;
    private String nome;
    private String especialidade;
    private String email;
    private String telefone;

    public Instrutor(String cpf, String nome, String especialidade, String email, String telefone) {
        validarCampos(cpf, nome, especialidade, email, telefone);
        this.cpf = cpf.trim();
        this.nome = nome.trim();
        this.especialidade = especialidade.trim();
        this.email = email.trim();
        this.telefone = telefone.trim();
    }

    private void validarCampos(String cpf, String nome, String especialidade, String email, String telefone) {
        if (cpf == null || cpf.trim().isEmpty()) throw new IllegalArgumentException("CPF obrigatório!");
        if (nome == null || nome.trim().isEmpty()) throw new IllegalArgumentException("Nome obrigatório!");
        if (especialidade == null || especialidade.trim().isEmpty()) throw new IllegalArgumentException("Especialidade obrigatória!");
        if (email == null || email.trim().isEmpty()) throw new IllegalArgumentException("Email obrigatório!");
        if (telefone == null || telefone.trim().isEmpty()) throw new IllegalArgumentException("Telefone obrigatório!");
        if (!Pattern.matches("^[\\w.-]+@[\\w.-]+\\.\\w{2,}$", email)) throw new IllegalArgumentException("Email inválido!");
    }


    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getEspecialidade() { return especialidade; }
    public void setEspecialidade(String especialidade) { this.especialidade = especialidade; }
    public String getEmail() { return email; }
    public void setEmail(String email) {
        if (!Pattern.matches("^[\\w.-]+@[\\w.-]+\\.\\w{2,}$", email))
            throw new IllegalArgumentException("Email inválido!");
        this.email = email;
    }
    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }

    @Override
    public String toString() {
        return String.format(
                "CPF: %s | Nome: %s | Especialidade: %s | Email: %s | Telefone: %s",
                cpf, nome, especialidade, email, telefone
        );
    }
}