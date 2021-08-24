package Interfaces;

import Classes.PostoGasolina;
import Classes.Msg;
import java.time.LocalDateTime;

public class PgnVendas extends javax.swing.JInternalFrame {
    
    private final PostoGasolina pg;
    
    public PgnVendas(PostoGasolina posto) {
        initComponents();
        txtTotal.setEditable(false);
        txtTotal.setLineWrap(true);
        this.pg = posto;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        txtPreco = new javax.swing.JTextField();
        txtQuantidade = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnVender = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnCalcularTotal = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtTotal = new javax.swing.JTextArea();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Vender Gasolina");

        jLabel1.setText("Preço do Litro (R$):");

        txtPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecoActionPerformed(evt);
            }
        });

        txtQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantidadeActionPerformed(evt);
            }
        });

        jLabel2.setText("Quantidade (Litros):");

        btnVender.setText("Vender");
        btnVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVenderActionPerformed(evt);
            }
        });

        jLabel3.setText("TOTAL:");

        btnCalcularTotal.setText("Calcular Total");
        btnCalcularTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularTotalActionPerformed(evt);
            }
        });

        txtTotal.setColumns(5);
        txtTotal.setRows(3);
        txtTotal.setTabSize(3);
        jScrollPane2.setViewportView(txtTotal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPreco)
                    .addComponent(txtQuantidade)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel3)
                        .addGap(29, 29, 29))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCalcularTotal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnVender, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 74, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnCalcularTotal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVender)
                .addGap(65, 65, 65))
        );

        setBounds(0, 0, 256, 314);
    }// </editor-fold>//GEN-END:initComponents

    private void txtPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecoActionPerformed
        btnCalcularTotalActionPerformed(evt);
    }//GEN-LAST:event_txtPrecoActionPerformed

    private void txtQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantidadeActionPerformed
        btnCalcularTotalActionPerformed(evt);
    }//GEN-LAST:event_txtQuantidadeActionPerformed

    private void btnCalcularTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularTotalActionPerformed
        try{
            double preco = Double.parseDouble(txtPreco.getText());
            double litros = Double.parseDouble(txtQuantidade.getText());
            double total = preco * litros;
            txtTotal.setText("R$ " + String.format("%.3f", total));
        }catch(NumberFormatException e){
            txtTotal.setText("formato inválido");
        }    
    }//GEN-LAST:event_btnCalcularTotalActionPerformed

    private void btnVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVenderActionPerformed
        try {
            double preco = Double.parseDouble(txtPreco.getText());
            double litros = Double.parseDouble(txtQuantidade.getText());
            double total = preco * litros;
            
            retirarEstoque(litros);
            
            
        } catch (NumberFormatException exception) {
            msg("Erro: " + exception);
        }
    }//GEN-LAST:event_btnVenderActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcularTotal;
    private javax.swing.JButton btnVender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JTextArea txtTotal;
    // End of variables declaration//GEN-END:variables

    public void msg(String msg){
        Msg e = new Msg();
        e.msg(msg);
    }
    
    public void retirarEstoque(double valor){
        if(valor <= pg.getLitrosGasolina()){
            double preco = Double.parseDouble(txtPreco.getText());
            double litros = Double.parseDouble(txtQuantidade.getText());
            double total = preco * litros;
            
            pg.setLitrosGasolina(pg.getLitrosGasolina() - valor);
            adicionarCaixa(total);
            pg.adicionarHistorico("\n\nData: " + LocalDateTime.now() + "\nVenda Realizada:\nLitros - " + litros + "\nPreço: " + preco + "\ntotal: " + total + "\nVendedor: " + pg.getUsuarioLogado().getNome());
            msg("Venda realizada.");
        }else{
            msg("Não há gasolina suficiente no estoque");
        }
    }
    
    public void adicionarCaixa(double valor){
        pg.setCaixa(pg.getCaixa() + valor);
    }
}

