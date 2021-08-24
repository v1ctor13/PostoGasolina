package Interfaces;

import Classes.PostoGasolina;
import Classes.Msg;
import java.time.LocalDateTime;

public class PgnMenuPrincipal extends javax.swing.JFrame {
    
    private final PostoGasolina pg;
            
    public PgnMenuPrincipal(PostoGasolina posto) {
        initComponents();
        boasVindas();
        this.pg = posto;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelPrincipal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        scrollVendas = new javax.swing.JMenu();
        btnVendas = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        btnCadastrarEstoque = new javax.swing.JMenuItem();
        btnCadastrarFuncionario = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        btnLogin = new javax.swing.JMenuItem();
        btnDeslogar = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        btnUsuariosCadastrados = new javax.swing.JMenuItem();
        btnConsultarEstoque = new javax.swing.JMenuItem();
        btnConsultarHistorico = new javax.swing.JMenuItem();
        btnConsultarCaixa = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        btnSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Posto de Gasolina");
        setLocation(new java.awt.Point(400, 200));

        painelPrincipal.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout painelPrincipalLayout = new javax.swing.GroupLayout(painelPrincipal);
        painelPrincipal.setLayout(painelPrincipalLayout);
        painelPrincipalLayout.setHorizontalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 582, Short.MAX_VALUE)
        );
        painelPrincipalLayout.setVerticalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 396, Short.MAX_VALUE)
        );

        scrollVendas.setText("Vendas");
        scrollVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scrollVendasActionPerformed(evt);
            }
        });

        btnVendas.setText("Vender gasolina");
        btnVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVendasActionPerformed(evt);
            }
        });
        scrollVendas.add(btnVendas);

        jMenuBar1.add(scrollVendas);

        jMenu2.setText("Cadastrar");

        btnCadastrarEstoque.setText("Cadastrar Estoque");
        btnCadastrarEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarEstoqueActionPerformed(evt);
            }
        });
        jMenu2.add(btnCadastrarEstoque);

        btnCadastrarFuncionario.setText("Cadastrar Funcionário");
        btnCadastrarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarFuncionarioActionPerformed(evt);
            }
        });
        jMenu2.add(btnCadastrarFuncionario);

        jMenuBar1.add(jMenu2);

        jMenu1.setText("Login");

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jMenu1.add(btnLogin);

        btnDeslogar.setText("Deslogar");
        btnDeslogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeslogarActionPerformed(evt);
            }
        });
        jMenu1.add(btnDeslogar);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Consultar");

        btnUsuariosCadastrados.setText("Usuários Cadastrados");
        btnUsuariosCadastrados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosCadastradosActionPerformed(evt);
            }
        });
        jMenu3.add(btnUsuariosCadastrados);

        btnConsultarEstoque.setText("Estoque");
        btnConsultarEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarEstoqueActionPerformed(evt);
            }
        });
        jMenu3.add(btnConsultarEstoque);

        btnConsultarHistorico.setText("Histórico");
        btnConsultarHistorico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarHistoricoActionPerformed(evt);
            }
        });
        jMenu3.add(btnConsultarHistorico);

        btnConsultarCaixa.setText("Caixa");
        btnConsultarCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarCaixaActionPerformed(evt);
            }
        });
        jMenu3.add(btnConsultarCaixa);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Sobre");

        btnSobre.setText("Sobre");
        btnSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSobreActionPerformed(evt);
            }
        });
        jMenu4.add(btnSobre);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipal)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void scrollVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scrollVendasActionPerformed
        
    }//GEN-LAST:event_scrollVendasActionPerformed

    private void btnVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVendasActionPerformed
        if(verificarUsuarioLogado() == 1){
            PgnVendas obj = new PgnVendas(pg);
            painelPrincipal.add(obj);
            obj.setVisible(true);
        }else{
            msg("Você precisa estar LOGADO para vender");
        }
        
    }//GEN-LAST:event_btnVendasActionPerformed

    private void btnCadastrarEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarEstoqueActionPerformed
        if(verificarUsuarioLogado() == 1){    
            PgnCadastrarEstoque obj = new PgnCadastrarEstoque(pg);
            painelPrincipal.add(obj);
            obj.setVisible(true);
        }else{
            msg("Você precisa estar LOGADO para cadastrar estoque");
        }
    }//GEN-LAST:event_btnCadastrarEstoqueActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        PgnLogin obj = new PgnLogin(pg);
        painelPrincipal.add(obj);
        obj.setVisible(true);
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnCadastrarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarFuncionarioActionPerformed
        if(verificarUsuarioLogado() == 1){
            PgnCadastroFuncionario obj = new PgnCadastroFuncionario(pg);
            painelPrincipal.add(obj);
            obj.setVisible(true);
        }else{
            msg("Você precisa estar LOGADO para cadastrar um funcionário");
        }
    }//GEN-LAST:event_btnCadastrarFuncionarioActionPerformed

    private void btnUsuariosCadastradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosCadastradosActionPerformed
        PgnUsuariosCadastrados obj = new PgnUsuariosCadastrados(pg);
        painelPrincipal.add(obj);
        obj.setVisible(true);
    }//GEN-LAST:event_btnUsuariosCadastradosActionPerformed

    private void btnConsultarCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarCaixaActionPerformed
        if(verificarUsuarioLogado() == 1){    
            PgnConsultarCaixa obj = new PgnConsultarCaixa(pg);
            painelPrincipal.add(obj);
            obj.setVisible(true);
        }else{
            msg("Você precisa estar LOGADO para consultar o caixa");
        }
    }//GEN-LAST:event_btnConsultarCaixaActionPerformed

    private void btnDeslogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeslogarActionPerformed
        if(verificarUsuarioLogado() == 1){
            pg.adicionarHistorico("\n\nData: " + LocalDateTime.now() + "\nUsuário Deslogado:" + pg.getUsuarioLogado().getNome());
            pg.setUsuarioLogado(null);
            msg("Você foi deslogado.");
        }else{
            msg("Ninguém está logado.");
        }
    }//GEN-LAST:event_btnDeslogarActionPerformed

    private void btnConsultarEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarEstoqueActionPerformed
        if(verificarUsuarioLogado() == 1){
            PgnConsultarEstoque obj = new PgnConsultarEstoque(pg);
            painelPrincipal.add(obj);
            obj.setVisible(true);
        }else{
            msg("Você precisa estar LOGADO para consultar o estoque");
        }
    }//GEN-LAST:event_btnConsultarEstoqueActionPerformed

    private void btnConsultarHistoricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarHistoricoActionPerformed
        if(verificarUsuarioLogado() == 1){
            PgnConsultarHistorico obj = new PgnConsultarHistorico(pg);
            painelPrincipal.add(obj);
            obj.setVisible(true);
        }else{
            msg("Você precisa estar LOGADO para consultar o histórico");
        }
    }//GEN-LAST:event_btnConsultarHistoricoActionPerformed

    private void btnSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSobreActionPerformed
        PgnSobre obj = new PgnSobre();
        painelPrincipal.add(obj);
        obj.setVisible(true);
    }//GEN-LAST:event_btnSobreActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnCadastrarEstoque;
    private javax.swing.JMenuItem btnCadastrarFuncionario;
    private javax.swing.JMenuItem btnConsultarCaixa;
    private javax.swing.JMenuItem btnConsultarEstoque;
    private javax.swing.JMenuItem btnConsultarHistorico;
    private javax.swing.JMenuItem btnDeslogar;
    private javax.swing.JMenuItem btnLogin;
    private javax.swing.JMenuItem btnSobre;
    private javax.swing.JMenuItem btnUsuariosCadastrados;
    private javax.swing.JMenuItem btnVendas;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JDesktopPane painelPrincipal;
    private javax.swing.JMenu scrollVendas;
    // End of variables declaration//GEN-END:variables

    public int verificarUsuarioLogado(){
        if(pg.getUsuarioLogado() == null){
            return 0;
        }else{
            return 1;
        }
    }
    
    public final void boasVindas(){
        PgnBoasVindas pbv = new PgnBoasVindas();
        painelPrincipal.add(pbv);
        pbv.setVisible(true);
    }
    
    public void msg(String msgString){
        Msg e = new Msg();
        e.msg(msgString);
    }
}
