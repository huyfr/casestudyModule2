package display;

import constant.Alert;
import controller.*;
import constant.Regex;
import javax.swing.JOptionPane;
import object.Words;

public class EditForm extends javax.swing.JFrame {

    Controller controller = new Controller();

    Words words = new Words();

    public EditForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        pronounLabel = new javax.swing.JLabel();
        classifyLaby = new javax.swing.JLabel();
        wordLabel = new javax.swing.JLabel();
        meaningLabel = new javax.swing.JLabel();
        classifyTextField = new javax.swing.JTextField();
        wordTextField = new javax.swing.JTextField();
        pronounTextField = new javax.swing.JTextField();
        submitButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        meaningTextArea = new javax.swing.JTextArea();
        specializedLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        specializedTextArea = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        cancelButton = new javax.swing.JButton();
        tempKeyFromHome = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("jCheckBoxMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pronounLabel.setText("Phiên âm");

        classifyLaby.setText("Phân loại");

        wordLabel.setText("Từ");

        meaningLabel.setText("Ý nghĩa");

        classifyTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        wordTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        wordTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wordTextFieldActionPerformed(evt);
            }
        });

        pronounTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        meaningTextArea.setColumns(20);
        meaningTextArea.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        meaningTextArea.setRows(5);
        jScrollPane2.setViewportView(meaningTextArea);

        specializedLabel.setText("Nghĩa chuyên ngành");

        specializedTextArea.setColumns(20);
        specializedTextArea.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        specializedTextArea.setRows(5);
        jScrollPane1.setViewportView(specializedTextArea);

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 13)); // NOI18N

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        tempKeyFromHome.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(wordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(wordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pronounLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pronounTextField))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(classifyLaby, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(classifyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(meaningLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(specializedLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2)
                                    .addComponent(jScrollPane1))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(104, 104, 104)
                                .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(110, 110, 110))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(tempKeyFromHome)
                                .addGap(35, 35, 35))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(wordLabel)
                    .addComponent(wordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pronounTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pronounLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(classifyLaby, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(classifyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(meaningLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(specializedLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(tempKeyFromHome)))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void wordTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wordTextFieldActionPerformed

    }//GEN-LAST:event_wordTextFieldActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        String[] temporaryMeaningArray;
        String tempMeaning = "";
        String[] temporarySpecializedArray;
        int countForMeaning = 0;

        //word
        words.setWord(wordTextField.getText());

        //pronounce
        words.setPronunciation(pronounTextField.getText());

        //classify
        String temporaryClassify = classifyTextField.getText() + Regex.BLACK_SLASH_N;
        words.setClassify(temporaryClassify);

        //meaning
        temporaryMeaningArray = meaningTextArea.getText().split(Regex.NEW_LINE);
        for (String meaning : temporaryMeaningArray) {
            if (countForMeaning == 0) {
                tempMeaning += meaning;
            } else {
                tempMeaning += Regex.BLACK_SLASH_N + meaning;
            }
            countForMeaning++;
        }
        words.setMeaning(tempMeaning);

        //specialized
        temporarySpecializedArray = specializedTextArea.getText().split(Regex.NEW_LINE);
        words.setSpecialized(temporarySpecializedArray);

        if (wordTextField.getText().equals(Regex.BLANK)
                && pronounTextField.getText().equals(Regex.BLANK)
                && classifyTextField.getText().equals(Regex.BLANK)
                && meaningTextArea.getText().equals(Regex.BLANK)
                && specializedTextArea.getText().equals(Regex.BLANK)) {
            JOptionPane.showMessageDialog(rootPane, Alert.ALERT_005);
        } else {
            controller.edit(wordTextField.getText(), Regex.NEW_LINE + words.toString());
            JOptionPane.showMessageDialog(rootPane, Alert.ALERT_006);
            this.setVisible(false);
            new Home(wordTextField.getText()).setVisible(true);
        }
    }//GEN-LAST:event_submitButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        this.setVisible(false);
        new Home(tempKeyFromHome.getText()).setVisible(true);
    }//GEN-LAST:event_cancelButtonActionPerformed

    public void setWord(String key) {
        tempKeyFromHome.setVisible(false);
        tempKeyFromHome.setText(key);
    }

    public void setContent(String key, String value) {
        String[] splitStrings = value.split(Regex.NEW_LINE);
        String tempMeaning = "";
        String tempSpecialized = "";
        int countMeaning = 0;
        int countSpecialized = 0;

        //word
        wordTextField.setText(key);

        //pronoun
        pronounTextField.setText(splitStrings[1]);
        if (pronounTextField.getText().startsWith(Regex.FORWARD_SLASH)) {
            pronounTextField.setText(splitStrings[1].replace(Regex.FORWARD_SLASH, Regex.BLANK));
        } else {
            pronounTextField.setText(Regex.BLANK);
        }

        //classify
        classifyTextField.setText(splitStrings[2]);
        if (classifyTextField.getText().startsWith(Regex.ASTERISK)) {
            classifyTextField.setText(splitStrings[2].substring(3).replace(Regex.ASTERISK, Regex.BLANK));
        } else {
            classifyTextField.setText(Regex.BLANK);
        }

        //classify meanings and specialized meanings.
        for (int i = 3; i < splitStrings.length; i++) {
            if (splitStrings[i].startsWith(Regex.HYPHEN) || splitStrings[i].startsWith(Regex.ASTERISK) || splitStrings[i].startsWith(Regex.EQUAL)) {
                if (splitStrings[i - 1].startsWith(Regex.HYPHEN) || splitStrings[i - 1].startsWith(Regex.ASTERISK) || splitStrings[i - 1].startsWith(Regex.EQUAL)) {
                    if (countMeaning == 0) {
                        tempMeaning += splitStrings[i];
                    } else {
                        tempMeaning += Regex.NEW_LINE + splitStrings[i];
                    }
                    countMeaning++;
                } else {
                    tempSpecialized += Regex.NEW_LINE + splitStrings[i];
                }
            } else {
                if (countSpecialized == 0) {
                    tempSpecialized += splitStrings[i];
                } else {
                    tempSpecialized += Regex.NEW_LINE + splitStrings[i];
                }
                countSpecialized++;
            }
        }

        //meaning
        meaningTextArea.setText(tempMeaning);

        //specialized
        specializedTextArea.setText(tempSpecialized);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel classifyLaby;
    private javax.swing.JTextField classifyTextField;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel meaningLabel;
    private javax.swing.JTextArea meaningTextArea;
    private javax.swing.JLabel pronounLabel;
    private javax.swing.JTextField pronounTextField;
    private javax.swing.JLabel specializedLabel;
    private javax.swing.JTextArea specializedTextArea;
    private javax.swing.JButton submitButton;
    private javax.swing.JLabel tempKeyFromHome;
    private javax.swing.JLabel wordLabel;
    private javax.swing.JTextField wordTextField;
    // End of variables declaration//GEN-END:variables
}
