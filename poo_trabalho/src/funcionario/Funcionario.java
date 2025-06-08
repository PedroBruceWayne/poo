package funcionario;

public class Funcionario {
    private String cpf;
    private String nome;
    private String funcao;
    private String email;
    private String telefone;
    private String dataAdmissao;

    public Funcionario(String cpf, String nome, String funcao, String email, String telefone, String dataAdmissao) {
        this.cpf = cpf;
        this.nome = nome;
        this.funcao = funcao;
        this.email = email;
        this.telefone = telefone;
        this.dataAdmissao = dataAdmissao;
    }

    public String getCpf() { return cpf; }
    public String getNome() { return nome; }
    public String getFuncao() { return funcao; }
    public String getEmail() { return email; }
    public String getTelefone() { return telefone; }
    public String getDataAdmissao() { return dataAdmissao; }

    public void setNome(String nome) { this.nome = nome; }
    public void setFuncao(String funcao) { this.funcao = funcao; }
    public void setEmail(String email) { this.email = email; }
    public void setTelefone(String telefone) { this.telefone = telefone; }
}