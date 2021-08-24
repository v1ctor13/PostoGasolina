package Classes;

public class Funcionario {
    
    private String nome;
    private String login;
    private String senha;
    
    public Funcionario(String nome, String login, String senha) {
        this.nome  = nome;
        this.login = login;
        this.senha = senha;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public String getLogin(){
        return this.login;
    }
    
    public String getSenha(){
        return this.senha;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public void erro(String msg){
        Msg e = new Msg();
        e.msg(msg);
    }
}
