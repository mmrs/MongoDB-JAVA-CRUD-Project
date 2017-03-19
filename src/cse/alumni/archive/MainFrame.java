/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cse.alumni.archive;

import com.mongodb.BasicDBList;
import com.mongodb.BasicDBObject;
import com.mongodb.Cursor;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import javax.swing.JOptionPane;
import org.bson.BSONObject;

/**
 *
 * @author Siyam
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    DB db;
    MongoClient mongoClient;
    DBCollection users;
    DBObject dBObject;

    public MainFrame() {

        initComponents();
        mongoClient = new MongoClient("localhost", 27017);
        db = mongoClient.getDB("CSEAlumniArchive");
        users = db.getCollection("users");
        System.out.println("db connection ok");
        this.setTitle("CSE Alumni Archive");
        textFieldsUnEditable();
        buttonDelete.setVisible(false);
        buttonUpdate.setVisible(false);
        textFieldSearch.setToolTipText("search by registration/contact no");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        textFieldName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        textFieldRegNo = new javax.swing.JTextField();
        textFieldContact = new javax.swing.JTextField();
        textFieldPassingYear = new javax.swing.JTextField();
        textFieldCurrentWrokPlace = new javax.swing.JTextField();
        buttonUpdate = new javax.swing.JButton();
        buttonDelete = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textAreaContribution = new javax.swing.JTextArea();
        buttonAdd = new javax.swing.JButton();
        textFieldSearch = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        buttonAllStudents = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Name ");

        textFieldName.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        textFieldName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNameActionPerformed(evt);
            }
        });

        jLabel3.setText("Reg No");

        jLabel4.setText("Contact");

        jLabel5.setText("Passing Year");

        jLabel6.setText("Currently Working");

        textFieldRegNo.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        textFieldRegNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldRegNoActionPerformed(evt);
            }
        });

        textFieldContact.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N

        textFieldPassingYear.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N

        textFieldCurrentWrokPlace.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N

        buttonUpdate.setText("UPDATE");
        buttonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUpdateActionPerformed(evt);
            }
        });

        buttonDelete.setText("DELETE");
        buttonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteActionPerformed(evt);
            }
        });

        jLabel8.setText("Contribution(s)");

        textAreaContribution.setColumns(20);
        textAreaContribution.setFont(new java.awt.Font("Ubuntu", 1, 13)); // NOI18N
        textAreaContribution.setRows(5);
        jScrollPane1.setViewportView(textAreaContribution);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(buttonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(textFieldName)
                    .addComponent(textFieldRegNo)
                    .addComponent(textFieldContact)
                    .addComponent(textFieldPassingYear)
                    .addComponent(textFieldCurrentWrokPlace, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap(150, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textFieldRegNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(textFieldContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(textFieldPassingYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(textFieldCurrentWrokPlace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonUpdate)
                    .addComponent(buttonDelete))
                .addContainerGap())
        );

        buttonAdd.setText("ADD NEW");
        buttonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddActionPerformed(evt);
            }
        });

        textFieldSearch.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        textFieldSearch.setName(""); // NOI18N
        textFieldSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldSearchActionPerformed(evt);
            }
        });

        jLabel1.setText("Search");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText(":: SUST CSE ALUMNI ARCHIVE ::");

        buttonAllStudents.setText("ALL STUDENTS");
        buttonAllStudents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAllStudentsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(buttonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonAllStudents)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(buttonAdd)
                    .addComponent(buttonAllStudents))
                .addGap(39, 39, 39)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldSearchActionPerformed
        // TODO add your handling code here:
        try {
            String regNo = textFieldSearch.getText().trim();

            DBObject clause1 = new BasicDBObject("regNo", regNo);
            DBObject clause2 = new BasicDBObject("contact", regNo);
            BasicDBList or = new BasicDBList();
            or.add(clause1);
            or.add(clause2);
            DBObject query = new BasicDBObject("$or", or);

            dBObject = users.findOne(query);

            String[] ses = new String[6];
            ses[0] = dBObject.get("name").toString();
            ses[1] = dBObject.get("regNo").toString();
            ses[2] = dBObject.get("contact").toString();
            ses[3] = dBObject.get("passingYear").toString();
            ses[4] = dBObject.get("currentWorkPlace").toString();
            ses[5] = dBObject.get("contribution").toString();
            setTextFieldData(ses);
            textFieldsUnEditable();
            buttonDelete.setVisible(true);
            buttonUpdate.setVisible(true);
            buttonUpdate.setText("UPDATE");
        } catch (NullPointerException exception) {
            JOptionPane.showMessageDialog(this, "Student Not Found", "ERROR!", JOptionPane.ERROR_MESSAGE);
        } catch (NumberFormatException exception) {
            JOptionPane.showMessageDialog(this, "Give Valid Student Registration No", "ERROR!", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_textFieldSearchActionPerformed

    private void buttonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddActionPerformed
        // TODO add your handling code here:
        textFieldsEditable();
        textFieldRegNo.setEditable(true);
        String[] ses = new String[6];
        setTextFieldData(ses);
        buttonUpdate.setText("SAVE");
        buttonDelete.setVisible(false);
        buttonUpdate.setVisible(true);
    }//GEN-LAST:event_buttonAddActionPerformed

    private void textFieldNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNameActionPerformed

    private void buttonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUpdateActionPerformed
        // TODO add your handling code here:
        if (buttonUpdate.getText().equals("SAVE")) {

            if (validateUserInput()) {

                String regNo = textFieldRegNo.getText().trim();
                dBObject = new BasicDBObject();
                BasicDBObject whereQuery = new BasicDBObject();
                whereQuery.put("regNo", regNo);
                dBObject = users.findOne(whereQuery);
                if (dBObject != null) {
                    JOptionPane.showMessageDialog(this, "User Already exists by this regitration number. You can update the information.", "ERROR!", JOptionPane.ERROR_MESSAGE);
                    return;
                } else {
                    BasicDBObject doc = new BasicDBObject("name", textFieldName.getText().toUpperCase()).
                            append("regNo", textFieldRegNo.getText()).
                            append("contact", textFieldContact.getText()).
                            append("passingYear", Integer.parseInt(textFieldPassingYear.getText())).
                            append("currentWorkPlace", textFieldCurrentWrokPlace.getText()).
                            append("contribution", textAreaContribution.getText());

                    users.insert(doc);
                    System.out.println("Document inserted successfully");
                    String[] ses = new String[6];
                    setTextFieldData(ses);
                }

            }
        } else if (buttonUpdate.getText().equals("UPDATE")) {
            textFieldsEditable();
            buttonUpdate.setText("COMMIT");
            buttonDelete.setVisible(false);
        } else if (buttonUpdate.getText().equals("COMMIT")) {

            if (validateUserInput()) {
                
                dBObject.put("name", textFieldName.getText());
                dBObject.put("contact", textFieldContact.getText());
                dBObject.put("passingYear", Integer.parseInt(textFieldPassingYear.getText()));
                dBObject.put("currentWorkPlace", textFieldCurrentWrokPlace.getText());
                dBObject.put("contribution", textAreaContribution.getText());
                users.save(dBObject);
                textFieldsUnEditable();
                textFieldSearch.setText(textFieldRegNo.getText());
                buttonUpdate.setVisible(false);
            }
        }


    }//GEN-LAST:event_buttonUpdateActionPerformed

    private void buttonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteActionPerformed

        if (JOptionPane.showConfirmDialog(this, "Confirm Delete Operation?") == JOptionPane.OK_OPTION) {
            try {
                users.remove(dBObject);
                String[] ses = new String[6];
                setTextFieldData(ses);
                buttonDelete.setVisible(false);
                buttonUpdate.setVisible(false);

            } catch (Exception e) {
                System.out.println(e);
            }
        }


    }//GEN-LAST:event_buttonDeleteActionPerformed

    private void textFieldRegNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldRegNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldRegNoActionPerformed

    private void buttonAllStudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAllStudentsActionPerformed
        // TODO add your handling code here:
        AllStudents allStudents = new AllStudents();
          allStudents.setVisible(true);
        allStudents.setResizable(false);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dim.getWidth() - allStudents.getWidth()) / 2);
        int y = 100;
        allStudents.setLocation(x, y);
        
    }//GEN-LAST:event_buttonAllStudentsActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdd;
    private javax.swing.JButton buttonAllStudents;
    private javax.swing.JButton buttonDelete;
    private javax.swing.JButton buttonUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea textAreaContribution;
    private javax.swing.JTextField textFieldContact;
    private javax.swing.JTextField textFieldCurrentWrokPlace;
    private javax.swing.JTextField textFieldName;
    private javax.swing.JTextField textFieldPassingYear;
    private javax.swing.JTextField textFieldRegNo;
    private javax.swing.JTextField textFieldSearch;
    // End of variables declaration//GEN-END:variables

    void setTextFieldData(String[] array) {

        textFieldName.setText(array[0]);
        textFieldRegNo.setText(array[1]);
        textFieldContact.setText(array[2]);
        textFieldPassingYear.setText(array[3]);
        textFieldCurrentWrokPlace.setText(array[4]);
        textAreaContribution.setText(array[5]);
    }

    private boolean validateUserInput() {
        if (textFieldName.getText().isEmpty() || textFieldRegNo.getText().isEmpty() || textFieldContact.getText().isEmpty()
                || textFieldPassingYear.getText().isEmpty() || textFieldCurrentWrokPlace.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Invalid Input");
            return false;
        }

        return true;
    }

    void textFieldsEditable() {

        textFieldName.setEditable(true);
        textFieldContact.setEditable(true);
        textFieldPassingYear.setEditable(true);
        textFieldCurrentWrokPlace.setEditable(true);
        textAreaContribution.setEditable(true);

    }

    void textFieldsUnEditable() {

        textFieldName.setEditable(false);
        textFieldRegNo.setEditable(false);
        textFieldContact.setEditable(false);
        textFieldPassingYear.setEditable(false);
        textFieldCurrentWrokPlace.setEditable(false);
        textAreaContribution.setEditable(false);

    }

}
