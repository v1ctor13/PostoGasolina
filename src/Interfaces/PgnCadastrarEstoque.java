package Interfaces;

import Classes.Msg;
import Classes.PostoGasolina;
import java.time.LocalDateTime;

public class PgnCadastrarEstoque extends javax.swing.JInternalFrame {
    
    private final PostoGasolina pg;
    
    public PgnCadastrarEstoque(PostoGasolina posto) {
        initComponents();
        this.pg = posto;
        txtLitrosCadastrados.setEditable(false);
        txtLitrosCadastrados.setText(Double.toString(pg.getLitrosGasolina()));
    }
    
    public void adicionarLitrosCadastrados(double value){
        try{
            pg.setLitrosGasolina(pg.getLitrosGasolina() + value);
            pg.adicionarHistorico("\n\nData: " + LocalDateTime.now() + "\nEstoque Cadastrado\nLitros: " + value + "\nVendedor: " + pg.getUsuarioLogado().getNome());
            msg("Cadastro de estoque realizado com sucesso.");
        }catch(Exception exception){
            msg("Erro: " + exception);
        }
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtLitros = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        nada = new javax.swing.JLabel();
        txtLitrosCadastrados = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Cadastrar Estoque");

        jLabel1.setText("Quantidade (Litros):");

        txtLitros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLitrosActionPerformed(evt);
            }
        });

        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        nada.setText("Litros cadastrados:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtLitros)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jButton1)
                        .addGap(0, 68, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(nada)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLitrosCadastrados)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLitros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nada)
                    .addComponent(txtLitrosCadastrados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(86, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtLitrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLitrosActionPerformed
        jButton1ActionPerformed(evt);
    }//GEN-LAST:event_txtLitrosActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        double litros;
        try{
            litros = Double.parseDouble(txtLitros.getText());
            adicionarLitrosCadastrados(litros);
            txtLitrosCadastrados.setText(Double.toString(pg.getLitrosGasolina()));
        }catch(NumberFormatException e){
            msg("erro: " + e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel nada;
    private javax.swing.JTextField txtLitros;
    private javax.swing.JTextField txtLitrosCadastrados;
    // End of variables declaration//GEN-END:variables

    public void msg(String msg){
        Msg e = new Msg();
        e.msg(msg);
    }
}
