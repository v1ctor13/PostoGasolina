// Instituto Federal de Educação, Ciência e Tecnologia
// Linguagem de Programação II
// Atividade Final
// Profº: MSc. Flavio Barros
// Discentes: Victor Vinicius e Marcelo Jhones

package Classes;

import Interfaces.PgnMenuPrincipal;
import java.util.ArrayList;

public class PostoGasolina {
    
    private static PostoGasolina pg = new PostoGasolina();
    private ArrayList<Funcionario> funcionarios = new ArrayList<>();
    private ArrayList<String> historico = new ArrayList<>();
    private Funcionario UsuarioLogado;
    private double caixa;
    private double litrosGasolina;
    
    public PostoGasolina() {
        Funcionario admin = new Funcionario("admin", "admin", "admin");
        funcionarios.add(admin);
    }
    
    public static void main(String[] args){
        PgnMenuPrincipal pmp = new PgnMenuPrincipal(pg);
        pmp.setVisible(true);
    }
    
    public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }
    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }
    public void adicionarFuncionario(Funcionario f){
        this.funcionarios.add(f);
    }
    public Funcionario getUsuarioLogado() {
        return UsuarioLogado;
    }
    public void setUsuarioLogado(Funcionario UsuarioLogado) {
        this.UsuarioLogado = UsuarioLogado;
    }
    public double getLitrosGasolina() {
        return litrosGasolina;
    }
    public void setLitrosGasolina(double litrosGasolina) {
        this.litrosGasolina = litrosGasolina;
    }
    public ArrayList<String> getHistorico() {
        return historico;
    }
    public void setHistorico(ArrayList<String> historico) {
        this.historico = historico;
    }
    public void adicionarHistorico(String hist){
        this.getHistorico().add(hist);
    }
    public double getCaixa() {
        return caixa;
    }
    public void setCaixa(double caixa) {
        this.caixa = caixa;
    }
}
