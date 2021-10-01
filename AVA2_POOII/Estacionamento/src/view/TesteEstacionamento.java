package view;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import model.bean.Carro;
import model.dao.CarroDAO;

public class TesteEstacionamento extends javax.swing.JFrame {
    

    public TesteEstacionamento() {
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel) tCarros.getModel();
        tCarros.setRowSorter(new TableRowSorter(modelo));
        
    }
    
    public void readEstacionamento(){
        DefaultTableModel modelo = (DefaultTableModel) tCarros.getModel();
        modelo.setNumRows(0);
        CarroDAO cdao = new CarroDAO();
        for(Carro c: cdao.read()){
            modelo.addRow(new Object[]{
                c.getId(),
                c.getMarca(),
                c.getPlaca(),
                c.getCor(),
                c.getHoraEntrada(),
                c.getHoraSaida()            
            });
        
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        labelMarca = new javax.swing.JLabel();
        labelPlaca = new javax.swing.JLabel();
        labelCor = new javax.swing.JLabel();
        labelHoraEntrada = new javax.swing.JLabel();
        labelHoraSaida = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        txtPlaca = new javax.swing.JTextField();
        txtCor = new javax.swing.JTextField();
        txtHoraEntrada = new javax.swing.JTextField();
        txtHoraSaida = new javax.swing.JTextField();
        butonIncluir = new javax.swing.JButton();
        butonExcluir = new javax.swing.JButton();
        butonAlterar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tCarros = new javax.swing.JTable();

        jLabel5.setText("jLabel5");

        jTextField5.setText("jTextField5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelMarca.setText("Marca");

        labelPlaca.setText("Placa");

        labelCor.setText("Cor");

        labelHoraEntrada.setText("Hora Entrada");

        labelHoraSaida.setText("Hora Saida");

        txtPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlacaActionPerformed(evt);
            }
        });

        butonIncluir.setText("Incluir");
        butonIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butonIncluirActionPerformed(evt);
            }
        });

        butonExcluir.setText("Excluir");
        butonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butonExcluirActionPerformed(evt);
            }
        });

        butonAlterar.setText("Alterar");
        butonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butonAlterarActionPerformed(evt);
            }
        });

        jButton1.setText("Gerar relatorio");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tCarros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Marca", "Placa", "Cor", "HoraEntrada", "HoraSaida"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tCarros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tCarrosMouseClicked(evt);
            }
        });
        tCarros.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tCarrosKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tCarrosKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tCarros);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(labelMarca)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(labelPlaca)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtPlaca))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(labelCor)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtCor))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(labelHoraEntrada)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtHoraEntrada))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(labelHoraSaida)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtHoraSaida)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(butonIncluir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(butonAlterar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(butonExcluir))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 651, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelMarca)
                            .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelPlaca)
                            .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelCor)
                            .addComponent(txtCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelHoraEntrada)
                            .addComponent(txtHoraEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelHoraSaida)
                            .addComponent(txtHoraSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(butonIncluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(butonAlterar)
                            .addComponent(butonExcluir))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addGap(0, 84, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPlacaActionPerformed

    private void butonIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butonIncluirActionPerformed
        
        Carro c = new Carro();
        CarroDAO dao = new CarroDAO();
        c.setMarca(txtMarca.getText());
        c.setPlaca(txtPlaca.getText());
        c.setCor(txtCor.getText());
        c.setHoraEntrada(txtHoraEntrada.getText());
        c.setHoraSaida(txtHoraSaida.getText());
        dao.create(c);
        
        txtMarca.setText("");
        txtPlaca.setText("");
        txtCor.setText("");
        txtHoraEntrada.setText("");
        txtHoraSaida.setText("");
        
        
        readEstacionamento();
        
    }//GEN-LAST:event_butonIncluirActionPerformed

    private void butonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butonExcluirActionPerformed
 
        if(tCarros.getSelectedRow() != -1){
        Carro c = new Carro();
        CarroDAO dao = new CarroDAO();
        
        c.setId((int)tCarros.getValueAt(tCarros.getSelectedRow(), 0));

        dao.delete(c);
        
        txtMarca.setText("");
        txtPlaca.setText("");
        txtCor.setText("");
        txtHoraEntrada.setText("");
        txtHoraSaida.setText("");
        
        
        readEstacionamento();
        }else {
            JOptionPane.showMessageDialog(null, "Selecione um produto para excluir!");
        }
        
    }//GEN-LAST:event_butonExcluirActionPerformed

    private void butonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butonAlterarActionPerformed
   
        if(tCarros.getSelectedRow() != -1){
        Carro c = new Carro();
        CarroDAO dao = new CarroDAO();
        c.setMarca(txtMarca.getText());
        c.setPlaca(txtPlaca.getText());
        c.setCor(txtCor.getText());
        c.setHoraEntrada(txtHoraEntrada.getText());
        c.setHoraSaida(txtHoraSaida.getText());
        c.setId((int)tCarros.getValueAt(tCarros.getSelectedRow(), 0));
        dao.update(c);
        
        txtMarca.setText("");
        txtPlaca.setText("");
        txtCor.setText("");
        txtHoraEntrada.setText("");
        txtHoraSaida.setText("");
        
        
        readEstacionamento(); 
        } 
        
    }//GEN-LAST:event_butonAlterarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        readEstacionamento();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tCarrosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tCarrosKeyReleased

    }//GEN-LAST:event_tCarrosKeyReleased

    private void tCarrosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tCarrosKeyPressed
        if(tCarros.getSelectedRow() != -1){
        txtMarca.setText(tCarros.getValueAt(tCarros.getSelectedRow(), 1).toString());
        txtPlaca.setText(tCarros.getValueAt(tCarros.getSelectedRow(), 2).toString());
        txtCor.setText(tCarros.getValueAt(tCarros.getSelectedRow(), 3).toString());
        txtHoraEntrada.setText(tCarros.getValueAt(tCarros.getSelectedRow(), 4).toString());
        txtHoraSaida.setText(tCarros.getValueAt(tCarros.getSelectedRow(), 5).toString());
        }
    }//GEN-LAST:event_tCarrosKeyPressed

    private void tCarrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tCarrosMouseClicked
        if(tCarros.getSelectedRow() != -1){
        txtMarca.setText(tCarros.getValueAt(tCarros.getSelectedRow(), 1).toString());
        txtPlaca.setText(tCarros.getValueAt(tCarros.getSelectedRow(), 2).toString());
        txtCor.setText(tCarros.getValueAt(tCarros.getSelectedRow(), 3).toString());
        txtHoraEntrada.setText(tCarros.getValueAt(tCarros.getSelectedRow(), 4).toString());
        txtHoraSaida.setText(tCarros.getValueAt(tCarros.getSelectedRow(), 5).toString());
        }
    }//GEN-LAST:event_tCarrosMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TesteEstacionamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TesteEstacionamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TesteEstacionamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TesteEstacionamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TesteEstacionamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butonAlterar;
    private javax.swing.JButton butonExcluir;
    private javax.swing.JButton butonIncluir;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JLabel labelCor;
    private javax.swing.JLabel labelHoraEntrada;
    private javax.swing.JLabel labelHoraSaida;
    private javax.swing.JLabel labelMarca;
    private javax.swing.JLabel labelPlaca;
    private javax.swing.JTable tCarros;
    private javax.swing.JTextField txtCor;
    private javax.swing.JTextField txtHoraEntrada;
    private javax.swing.JTextField txtHoraSaida;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtPlaca;
    // End of variables declaration//GEN-END:variables
}
