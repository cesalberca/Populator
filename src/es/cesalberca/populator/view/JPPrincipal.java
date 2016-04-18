/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.cesalberca.populator.view;

import es.cesalberca.populator.controller.FileExporter;
import es.cesalberca.populator.model.Generator;

/**
 *
 * @author dam
 */
public class JPPrincipal extends javax.swing.JPanel {
    
    public JPPrincipal() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jSlider1 = new javax.swing.JSlider();
        jlTitulo = new javax.swing.JLabel();
        jbGenerar = new javax.swing.JButton();
        jsRandom = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtInserts = new javax.swing.JTextArea();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setBackground(new java.awt.Color(0, 153, 255));

        jlTitulo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlTitulo.setForeground(new java.awt.Color(0, 255, 0));
        jlTitulo.setText("TRABAJADORES");

        jbGenerar.setText("GENERAR");
        jbGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGenerarActionPerformed(evt);
            }
        });

        jsRandom.setValue(1000);

        jtInserts.setColumns(20);
        jtInserts.setRows(5);
        jScrollPane1.setViewportView(jtInserts);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jsRandom, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 154, Short.MAX_VALUE)
                        .addComponent(jbGenerar)
                        .addGap(88, 88, 88))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jlTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jlTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jsRandom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbGenerar))
                .addGap(40, 40, 40))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    private void jbGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGenerarActionPerformed
        Generator gen = new Generator();
        FileExporter fex = new FileExporter("inserts.txt",  "t_empleados");
        fex.save(gen.generate((int)jsRandom.getValue()));
    }//GEN-LAST:event_jbGenerarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JButton jbGenerar;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JSpinner jsRandom;
    private javax.swing.JTextArea jtInserts;
    // End of variables declaration//GEN-END:variables

  public void inicializador(){
    
    
    jtInserts.setText(" ");
    jsRandom.setValue(0);
    }






}
