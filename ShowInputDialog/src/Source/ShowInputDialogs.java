package Source;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showInputDialog;

public class ShowInputDialogs extends javax.swing.JFrame {

    Object[] val = {"Administrador", "Contador", "Gerente"};

    public ShowInputDialogs() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtValor = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cbInputDialog = new javax.swing.JComboBox<>();
        btnEjecutar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtValor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtValor.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Valor introducido:");

        cbInputDialog.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbInputDialog.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Message", "Component y Message", "Message e InitialSelectionValue", "Component, Message e InitialSelectionValue", "Component, Message, Title y messageType", "Component, Message, Title, messageType, Icon, selectionValues e initialSelectionValue 1", "Component, Message, Title, messageType, Icon, selectionValues e initialSelectionValue 2" }));

        btnEjecutar.setText("Ejecutar");
        btnEjecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEjecutarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(326, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbInputDialog, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEjecutar)
                        .addGap(34, 34, 34))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbInputDialog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEjecutar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEjecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEjecutarActionPerformed
        try {
            switch (cbInputDialog.getSelectedIndex()) {
            case 0:
                txtValor.setText(showInputDialog("Ingresa un número"));
                break;
            case 1:
                txtValor.setText(showInputDialog(this, "Ingresa un nombre:"));
                break;
            case 2:
                txtValor.setText(showInputDialog("Ingresa un número:", "Pedro"));
                break;
            case 3:
                txtValor.setText(showInputDialog(this, "Ingresa un número:", "Pedro"));
                break;
            case 4:
                txtValor.setText(showInputDialog(this, "Ingresa un valor", "VALORES", JOptionPane.INFORMATION_MESSAGE));
                break;
            case 5:
                txtValor.setText(showInputDialog(this, "Ingresa un cliente", "CLIENTE", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(ShowInputDialogs.class.getResource("clientes.png")), null, "Julieta").toString());
                break;
            case 6:
                txtValor.setText(showInputDialog(this, "Ingresa un cliente", "CLIENTE", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(ShowInputDialogs.class.getResource("clientes.png")), val, "Julieta").toString());
                break;
        }
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnEjecutarActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShowInputDialogs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShowInputDialogs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEjecutar;
    private javax.swing.JComboBox<String> cbInputDialog;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
