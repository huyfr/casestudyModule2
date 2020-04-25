package display;

import constant.Alert;
import constant.Regex;
import controller.Controller;
import javax.swing.JOptionPane;

public class Home extends javax.swing.JFrame {

    Controller controller = new Controller();

    public Home() {
        initComponents();
        controller.init();
    }

    public Home(String key) {
        initComponents();
        controller.init();
        inputTextField.setText(key);
        resultTextArea.append(controller.search(inputTextField.getText()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inputTextField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultTextArea = new javax.swing.JTextArea();
        editButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        tempWordLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dictionary");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        inputTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        inputTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        inputTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inputTextFieldMouseClicked(evt);
            }
        });
        inputTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputTextFieldActionPerformed(evt);
            }
        });

        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        resultTextArea.setEditable(false);
        resultTextArea.setColumns(20);
        resultTextArea.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        resultTextArea.setRows(5);
        jScrollPane1.setViewportView(resultTextArea);

        editButton.setText("Edit");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        tempWordLabel.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(inputTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 574, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(searchButton, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(addButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(editButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(deleteButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tempWordLabel))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(inputTextField)
                    .addComponent(searchButton, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tempWordLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        resultTextArea.setText(Regex.BLANK);
        if (!inputTextField.getText().equals(Regex.BLANK)) {
            if (controller.search(inputTextField.getText()) != null) {
                resultTextArea.append(controller.search(inputTextField.getText()));
            } else {
                resultTextArea.append((inputTextField.getText()));
            }
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        AddForm addForm = new AddForm();
        addForm.setWord(inputTextField.getText());
        this.setVisible(false);
        addForm.setVisible(true);
    }//GEN-LAST:event_addButtonActionPerformed

    private void inputTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputTextFieldActionPerformed
        resultTextArea.setText(Regex.BLANK);
        if (!inputTextField.getText().equals(Regex.BLANK)) {
            if (controller.search(inputTextField.getText()) != null) {
                resultTextArea.append(controller.search(inputTextField.getText()));
            } else {
                resultTextArea.append((inputTextField.getText()));
            }
        }
    }//GEN-LAST:event_inputTextFieldActionPerformed

    private void inputTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inputTextFieldMouseClicked
        inputTextField.setText(Regex.BLANK);
    }//GEN-LAST:event_inputTextFieldMouseClicked

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        String temporary = inputTextField.getText();
        Home home = new Home(temporary);
        this.setVisible(false);
        home.setVisible(true);
        if (temporary.equals(Regex.BLANK)) {
            JOptionPane.showMessageDialog(rootPane, Alert.ALERT_001);
        } else {
            int choose = JOptionPane.showConfirmDialog(null, Alert.ALERT_007);
            switch (choose) {
                case 0:
                    home.controller.delete(temporary);
                    JOptionPane.showMessageDialog(rootPane, Alert.ALERT_002);
                    home.setVisible(false);
                    new Home().setVisible(true);
                    break;
                case 1:
                    home.setVisible(false);
                    new Home(temporary).setVisible(true);
                    break;
                case 2:
                    home.setVisible(false);
                    new Home(temporary).setVisible(true);
                    break;
                default:
                    break;
            }
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        EditForm editForm = new EditForm();
        editForm.setContent(inputTextField.getText(), resultTextArea.getText());
        editForm.setWord(inputTextField.getText());
        this.setVisible(false);
        editForm.setVisible(true);
    }//GEN-LAST:event_editButtonActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Home().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editButton;
    private javax.swing.JTextField inputTextField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea resultTextArea;
    private javax.swing.JButton searchButton;
    private javax.swing.JLabel tempWordLabel;
    // End of variables declaration//GEN-END:variables
}
