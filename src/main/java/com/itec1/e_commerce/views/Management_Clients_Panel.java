/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.itec1.e_commerce.views;

import com.itec1.e_commerce.controllers.ClientPanelController;
import com.itec1.e_commerce.entities.Client;
import com.itec1.e_commerce.views.resources.ClientsTableListener;
import com.itec1.e_commerce.views.resources.FieldDataValidator;
import com.itec1.e_commerce.views.resources.JTextFieldListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author sjcex
 */
public final class Management_Clients_Panel extends javax.swing.JPanel implements InterfaceCrudPanel {

    private final ClientPanelController controller;
    private final FieldDataValidator validator;
    private List<Client> clients;

    private int click = 0;

    /**
     * Creates new form Management_Client_Panel
     */
    public Management_Clients_Panel() {
        initComponents();
        this.controller = new ClientPanelController(this);
        jtf_cuitFilter.getDocument().addDocumentListener(new JTextFieldListener(clients, controller, this));
        tableClient.getSelectionModel().addListSelectionListener(new ClientsTableListener(this));
        this.clients = controller.updateTable("");
        this.validator = new FieldDataValidator();
        validator.onlyNumbers(jtf_cuit);
        validator.onlyNumbers(jtf_phone);
        validator.onlyLetters(jtf_name);
        validator.onlyLetters(jtf_lastname);
        changeConditionAllButtons(false);
        changeConditionAllFields(false);
        changeConditionButton(jbn_save, true);
        changeConditionButton(jbn_restore, true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_datos1 = new javax.swing.JPanel();
        jbl_name = new javax.swing.JLabel();
        jtf_name = new javax.swing.JTextField();
        jbl_lastname = new javax.swing.JLabel();
        jtf_lastname = new javax.swing.JTextField();
        jbl_cuit = new javax.swing.JLabel();
        jtf_cuit = new javax.swing.JTextField();
        jbn_update = new javax.swing.JButton();
        jbn_delete = new javax.swing.JButton();
        jbl_email = new javax.swing.JLabel();
        jbl_address = new javax.swing.JLabel();
        jbl_phone = new javax.swing.JLabel();
        jtf_address = new javax.swing.JTextField();
        jtf_email = new javax.swing.JTextField();
        jtf_phone = new javax.swing.JTextField();
        jbn_save = new javax.swing.JButton();
        jbn_restore = new javax.swing.JButton();
        jlbl_info = new javax.swing.JLabel();
        jPanel_crud = new javax.swing.JPanel();
        jScrollPaneTabla = new javax.swing.JScrollPane();
        tableClient = new javax.swing.JTable();
        seeClients = new javax.swing.JButton();
        jbl_filter = new javax.swing.JLabel();
        jtf_cuitFilter = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));

        jPanel_datos1.setBackground(new java.awt.Color(0, 51, 255));

        jbl_name.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbl_name.setForeground(new java.awt.Color(255, 255, 255));
        jbl_name.setText("NOMBRE");

        jtf_name.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jbl_lastname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbl_lastname.setForeground(new java.awt.Color(255, 255, 255));
        jbl_lastname.setText("APELLIDO");

        jtf_lastname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jbl_cuit.setBackground(new java.awt.Color(255, 255, 255));
        jbl_cuit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbl_cuit.setForeground(new java.awt.Color(255, 255, 255));
        jbl_cuit.setText("C.U.I.T.");

        jtf_cuit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jbn_update.setText("MODIFICAR");
        jbn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbn_updateActionPerformed(evt);
            }
        });

        jbn_delete.setText("ELIMINAR");
        jbn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbn_deleteActionPerformed(evt);
            }
        });

        jbl_email.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbl_email.setForeground(new java.awt.Color(255, 255, 255));
        jbl_email.setText("E-MAIL");

        jbl_address.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbl_address.setForeground(new java.awt.Color(255, 255, 255));
        jbl_address.setText("DIRECCIÓN");

        jbl_phone.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbl_phone.setForeground(new java.awt.Color(255, 255, 255));
        jbl_phone.setText("TELÉFONO");

        jtf_address.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jtf_email.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jtf_phone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jbn_save.setText("GUARDAR");
        jbn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbn_saveActionPerformed(evt);
            }
        });

        jbn_restore.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-sincronizar-32.png"))); // NOI18N
        jbn_restore.setText("RECUPERAR");
        jbn_restore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbn_restoreActionPerformed(evt);
            }
        });

        jlbl_info.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel_datos1Layout = new javax.swing.GroupLayout(jPanel_datos1);
        jPanel_datos1.setLayout(jPanel_datos1Layout);
        jPanel_datos1Layout.setHorizontalGroup(
            jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_datos1Layout.createSequentialGroup()
                .addGroup(jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_datos1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_datos1Layout.createSequentialGroup()
                                .addGroup(jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jbl_lastname, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jbl_name, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(68, 68, 68)
                                .addGroup(jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtf_name, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtf_lastname, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel_datos1Layout.createSequentialGroup()
                                .addComponent(jbl_cuit, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)
                                .addComponent(jtf_cuit, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel_datos1Layout.createSequentialGroup()
                                .addComponent(jbl_address, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(68, 68, 68)
                                .addComponent(jtf_address, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel_datos1Layout.createSequentialGroup()
                                .addComponent(jbl_email, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(68, 68, 68)
                                .addComponent(jtf_email, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel_datos1Layout.createSequentialGroup()
                                .addComponent(jbl_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(68, 68, 68)
                                .addComponent(jtf_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel_datos1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jbn_restore)
                        .addGap(83, 83, 83)
                        .addComponent(jbn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(jbn_update, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(jbn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_datos1Layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jlbl_info, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(297, Short.MAX_VALUE))
        );
        jPanel_datos1Layout.setVerticalGroup(
            jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_datos1Layout.createSequentialGroup()
                .addGroup(jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel_datos1Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jtf_cuit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_datos1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtf_name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbl_name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbl_lastname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtf_lastname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbl_cuit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbl_address, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_address, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtf_email, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbl_email, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbl_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jlbl_info, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_datos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbn_restore, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbn_update, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(124, Short.MAX_VALUE))
        );

        jPanel_crud.setBackground(new java.awt.Color(0, 51, 255));

        jScrollPaneTabla.setMaximumSize(new java.awt.Dimension(950, 750));
        jScrollPaneTabla.setMinimumSize(new java.awt.Dimension(950, 750));
        jScrollPaneTabla.setPreferredSize(new java.awt.Dimension(950, 750));

        tableClient.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jScrollPaneTabla.setViewportView(tableClient);

        seeClients.setText("VER CLIENTES");
        seeClients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seeClientsActionPerformed(evt);
            }
        });

        jbl_filter.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbl_filter.setForeground(new java.awt.Color(255, 255, 255));
        jbl_filter.setText("Filtrar por cuit:");

        jtf_cuitFilter.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtf_cuitFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_cuitFilterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_crudLayout = new javax.swing.GroupLayout(jPanel_crud);
        jPanel_crud.setLayout(jPanel_crudLayout);
        jPanel_crudLayout.setHorizontalGroup(
            jPanel_crudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_crudLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel_crudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel_crudLayout.createSequentialGroup()
                        .addComponent(jbl_filter, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtf_cuitFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(seeClients))
                    .addComponent(jScrollPaneTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 725, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(277, Short.MAX_VALUE))
        );
        jPanel_crudLayout.setVerticalGroup(
            jPanel_crudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_crudLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPaneTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel_crudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_crudLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(seeClients, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_crudLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel_crudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbl_filter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtf_cuitFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_crud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel_datos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel_crud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_datos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbn_updateActionPerformed
        if (click == 0) {
            changeConditionAllFields(true);
            changeConditionField(jtf_cuit, false);
            changeConditionAllButtons(false);
            changeConditionButton(jbn_update, true);
            jlbl_info.setText("Modifique los campos que requiera. y vuelva a pulsar");
            click++;
        } else {
            if (jtf_cuit.getText().length() != 11) {
                jlbl_info.setText("ERROR.Ingrese un CUIT válido");
            } else if (verifyEmptyFields()) {
                jlbl_info.setText("Error: no pueden haber datos vacios");
            } else {
                Client newClient = controller.findByCuit(jtf_cuit.getText());
                newClient.setName(jtf_name.getText());
                newClient.setLastname(jtf_lastname.getText());
                newClient.setAddress(jtf_address.getText());
                newClient.setEmail(jtf_email.getText());
                newClient.setPhone(jtf_phone.getText());
                jlbl_info.setText(controller.update(newClient.getId(), newClient));
            }
            changeConditionAllButtons(false);
            changeConditionAllFields(false);
            changeConditionButton(jbn_save, true);
            changeConditionButton(jbn_restore, true);
            click = 0;
            cleanAllFields();
            clients = controller.updateTable("");
        }
    }//GEN-LAST:event_jbn_updateActionPerformed

    private void jbn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbn_deleteActionPerformed
        Client newClient = controller.findByCuit(jtf_cuit.getText());
        jlbl_info.setText(controller.disable(newClient.getId()));
        cleanAllFields();
        changeConditionAllButtons(false);
        changeConditionButton(jbn_save, true);
        changeConditionButton(jbn_restore, true);
        clients = controller.updateTable("");
    }//GEN-LAST:event_jbn_deleteActionPerformed

    private void jbn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbn_saveActionPerformed
        if (click == 0) {
            changeConditionAllFields(true);
            jlbl_info.setText("Complete los campos y vuelva a presionar Guardar");
            changeConditionAllButtons(false);
            changeConditionButton(jbn_save, true);
            click++;
        } else {
            if (jtf_cuit.getText().length() != 11) {
                jlbl_info.setText("ERROR.Ingrese un CUIT válido");
            } else if (verifyEmptyFields()) {
                jlbl_info.setText("Error: no pueden haber datos vacios");
            } else {
                Client newClient = new Client();
                newClient.setName(jtf_name.getText());
                newClient.setLastname(jtf_lastname.getText());
                newClient.setCuit(jtf_cuit.getText());
                newClient.setAddress(jtf_address.getText());
                newClient.setEmail(jtf_email.getText());
                newClient.setPhone(jtf_phone.getText());
                jlbl_info.setText(controller.create(newClient));
            }
            click = 0;
            cleanAllFields();
            changeConditionButton(jbn_restore, true);
            changeConditionAllFields(false);
            clients = controller.updateTable("");
        }

    }//GEN-LAST:event_jbn_saveActionPerformed

    private void jbn_restoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbn_restoreActionPerformed
        if (click == 0) {
            changeConditionButton(jbn_save, false);
            changeConditionField(jtf_cuit, true);
            jlbl_info.setText("Ingrese el CUIT a restaurar y vuelva a presionar");
            click++;
        } else {
            if (jtf_cuit.getText().length() != 11) {
                jlbl_info.setText("ERROR.Ingrese un CUIT válido");
            } else {
                Client newClient = controller.findByCuit(jtf_cuit.getText());
                jlbl_info.setText(controller.enable(newClient.getId()));
            }
            click = 0;
            cleanAllFields();
            changeConditionButton(jbn_save, true);
            changeConditionAllFields(false);
            clients = controller.updateTable("");
        }

    }//GEN-LAST:event_jbn_restoreActionPerformed

    private void seeClientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seeClientsActionPerformed
        clients = controller.updateTable(jtf_cuitFilter.getText());
        changeConditionAllButtons(false);
        changeConditionButton(jbn_save, true);
        changeConditionButton(jbn_restore, true);
        cleanAllFields();
        click = 0;
    }//GEN-LAST:event_seeClientsActionPerformed

    private void jtf_cuitFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_cuitFilterActionPerformed
        clients = controller.updateTable(jtf_cuitFilter.getText());
    }//GEN-LAST:event_jtf_cuitFilterActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel_crud;
    private javax.swing.JPanel jPanel_datos1;
    private javax.swing.JScrollPane jScrollPaneTabla;
    private javax.swing.JLabel jbl_address;
    private javax.swing.JLabel jbl_cuit;
    private javax.swing.JLabel jbl_email;
    private javax.swing.JLabel jbl_filter;
    private javax.swing.JLabel jbl_lastname;
    private javax.swing.JLabel jbl_name;
    private javax.swing.JLabel jbl_phone;
    private javax.swing.JButton jbn_delete;
    private javax.swing.JButton jbn_restore;
    private javax.swing.JButton jbn_save;
    private javax.swing.JButton jbn_update;
    private javax.swing.JLabel jlbl_info;
    private javax.swing.JTextField jtf_address;
    private javax.swing.JTextField jtf_cuit;
    private javax.swing.JTextField jtf_cuitFilter;
    private javax.swing.JTextField jtf_email;
    private javax.swing.JTextField jtf_lastname;
    private javax.swing.JTextField jtf_name;
    private javax.swing.JTextField jtf_phone;
    private javax.swing.JButton seeClients;
    private javax.swing.JTable tableClient;
    // End of variables declaration//GEN-END:variables

    @Override
    public javax.swing.JTable getTable() {
        return this.tableClient;
    }

    @Override
    public void selectFromTable() {
        int field = tableClient.getSelectedRow();
        if (field >= 0) {
            Client selected = clients.get(field);
            jtf_name.setText(selected.getName());
            jtf_lastname.setText(selected.getLastname());
            jtf_cuit.setText(selected.getCuit());
            jtf_address.setText(selected.getAddress());
            jtf_email.setText(selected.getEmail());
            jtf_phone.setText(selected.getPhone());
            changeConditionAllButtons(true);
            jlbl_info.setText("");
            changeConditionButton(jbn_save, false);
            changeConditionButton(jbn_restore, false);
        }
        click = 0;
    }

    @Override
    public void changeConditionAllFields(boolean state) {
        changeConditionField(jtf_name, state);
        changeConditionField(jtf_lastname, state);
        changeConditionField(jtf_cuit, state);
        changeConditionField(jtf_address, state);
        changeConditionField(jtf_email, state);
        changeConditionField(jtf_phone, state);
    }

    @Override
    public void changeConditionField(JTextField textField, boolean state) {
        validator.enableField(state, textField);
    }

    @Override
    public void changeConditionAllButtons(boolean state) {
        changeConditionButton(jbn_save, state);
        changeConditionButton(jbn_restore, state);
        changeConditionButton(jbn_update, state);
        changeConditionButton(jbn_delete, state);
    }

    @Override
    public void changeConditionButton(JButton button, boolean state) {
        validator.enableButton(state, button, null, null, null, null);
    }

    @Override
    public void cleanAllFields() {
        cleanField(jtf_name);
        cleanField(jtf_lastname);
        cleanField(jtf_cuit);
        cleanField(jtf_address);
        cleanField(jtf_email);
        cleanField(jtf_phone);
    }

    @Override
    public void cleanField(JTextField textField) {
        validator.cleanField(textField);
    }

    @Override
    public boolean verifyEmptyFields() {
        List<JTextField> fields = new ArrayList<>();
        fields.add(jtf_name);
        fields.add(jtf_lastname);
        fields.add(jtf_cuit);
        fields.add(jtf_address);
        fields.add(jtf_email);
        fields.add(jtf_phone);

        for (JTextField field : fields) {
            if (field.getText().length() == 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String getStringFilter() {
        return jtf_cuitFilter.getText();
    }

}
