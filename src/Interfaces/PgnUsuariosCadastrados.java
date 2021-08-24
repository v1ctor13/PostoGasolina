package Interfaces;
import Classes.PostoGasolina;
import Classes.Funcionario;

public class PgnUsuariosCadastrados extends javax.swing.JInternalFrame {
    
    PostoGasolina pg;
    
    public PgnUsuariosCadastrados(PostoGasolina posto) {
        initComponents();
        this.pg = posto;
        
        txtUsuariosCadastrados.setEditable(false);
        for(Funcionario f : pg.getFuncionarios()){
            txtUsuariosCadastrados.append("Nome: " + f.getNome() + "\n" + "Login:  " + f.getLogin() + "\n\n");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtUsuariosCadastrados = new javax.swing.JTextArea();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Usuários Cadastrados");

        txtUsuariosCadastrados.setColumns(20);
        txtUsuariosCadastrados.setRows(5);
        jScrollPane1.setViewportView(txtUsuariosCadastrados);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtUsuariosCadastrados;
    // End of variables declaration//GEN-END:variables
}
