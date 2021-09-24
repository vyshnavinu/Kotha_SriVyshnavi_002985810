/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.Image;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import model.PersonalProfile;

/**
 *
 * @author srivyshnavi
 */
public class DisplayJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DisplayJPanel
     */
    
    PersonalProfile personal;
    
    public DisplayJPanel(PersonalProfile personal) {
        initComponents();
        this.personal = personal;
        
         viewPersonal();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelDisplay = new javax.swing.JLabel();
        labelName = new javax.swing.JLabel();
        labelGeoData = new javax.swing.JLabel();
        labelDOB = new javax.swing.JLabel();
        labelTelephone = new javax.swing.JLabel();
        labelFax = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        labelSSN = new javax.swing.JLabel();
        labelMedical = new javax.swing.JLabel();
        labelHealthPlan = new javax.swing.JLabel();
        labelBankAcc = new javax.swing.JLabel();
        labelCertificate = new javax.swing.JLabel();
        labelVehicle = new javax.swing.JLabel();
        labelDevice = new javax.swing.JLabel();
        labelLinkedIn = new javax.swing.JLabel();
        labelIP = new javax.swing.JLabel();
        labelBiometric = new javax.swing.JLabel();
        labelPhoto = new javax.swing.JLabel();
        labelUnique = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtGeoData = new javax.swing.JTextField();
        txtTelephone = new javax.swing.JTextField();
        txtFax = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtSSN = new javax.swing.JTextField();
        txtMedical = new javax.swing.JTextField();
        txtHealthPlan = new javax.swing.JTextField();
        txtBankAcc = new javax.swing.JTextField();
        txtCertificate = new javax.swing.JTextField();
        txtVehicle = new javax.swing.JTextField();
        txtDevice = new javax.swing.JTextField();
        txtLinkedIn = new javax.swing.JTextField();
        txtIP = new javax.swing.JTextField();
        txtBiometric = new javax.swing.JTextField();
        txtUnique = new javax.swing.JTextField();
        labelPhotoDisplay = new javax.swing.JLabel();
        txtDOB = new javax.swing.JTextField();

        labelDisplay.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        labelDisplay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelDisplay.setText("DISPLAY");

        labelName.setText("Name :");

        labelGeoData.setText("Geographic Data :");

        labelDOB.setText("Date of Birth :");

        labelTelephone.setText("Telephone Number :");

        labelFax.setText("FAX Number :");

        labelEmail.setText("Email Addresses :");

        labelSSN.setText("Social Security Number :");

        labelMedical.setText("Medical Record Number :");

        labelHealthPlan.setText("Health Plan Beneficiary Number:");

        labelBankAcc.setText("Bank Account Numbers:");

        labelCertificate.setText("Certificate/License Numbers :");

        labelVehicle.setText("Vehicle Identifiers and Serial Numbers :");

        labelDevice.setText("Device Identifiers and Serial Numbers :");

        labelLinkedIn.setText("LinkedIn :");

        labelIP.setText("IP Address :");

        labelBiometric.setText("Biometric Identifiers : ");

        labelPhoto.setText("Full face photos & comparable images:");

        labelUnique.setText("Unique Identifying Number :");

        txtCertificate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCertificateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labelName)
                                    .addComponent(labelGeoData)
                                    .addComponent(labelDOB)
                                    .addComponent(labelTelephone)
                                    .addComponent(labelFax)
                                    .addComponent(labelEmail)
                                    .addComponent(labelSSN)
                                    .addComponent(labelMedical))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                                    .addComponent(txtGeoData)
                                    .addComponent(txtTelephone)
                                    .addComponent(txtFax)
                                    .addComponent(txtEmail)
                                    .addComponent(txtSSN)
                                    .addComponent(txtMedical)
                                    .addComponent(txtDOB, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(labelDevice)
                                            .addComponent(labelBankAcc)
                                            .addComponent(labelCertificate)
                                            .addComponent(labelLinkedIn)
                                            .addComponent(labelIP)
                                            .addComponent(labelBiometric, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(labelUnique)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addComponent(labelVehicle))))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(labelHealthPlan)
                                .addGap(18, 18, 18)
                                .addComponent(txtHealthPlan, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                                .addComponent(labelPhoto)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtVehicle)
                                .addComponent(txtBankAcc, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                                .addComponent(txtCertificate, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE))
                            .addComponent(txtDevice, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLinkedIn, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtIP, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                                    .addComponent(txtBiometric)
                                    .addComponent(txtUnique, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(labelPhotoDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 75, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(labelDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(labelDisplay)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelBankAcc)
                    .addComponent(txtBankAcc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelGeoData)
                    .addComponent(txtGeoData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCertificate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCertificate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelDOB)
                            .addComponent(txtDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelTelephone)
                            .addComponent(txtTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelFax)
                            .addComponent(txtFax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelLinkedIn)
                            .addComponent(txtLinkedIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtVehicle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelVehicle))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDevice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelDevice))))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelIP))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSSN)
                    .addComponent(txtSSN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelBiometric)
                    .addComponent(txtBiometric, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMedical)
                    .addComponent(txtMedical, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelUnique)
                    .addComponent(txtUnique, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelHealthPlan)
                        .addComponent(txtHealthPlan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelPhoto))
                    .addComponent(labelPhotoDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(109, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtCertificateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCertificateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCertificateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel labelBankAcc;
    private javax.swing.JLabel labelBiometric;
    private javax.swing.JLabel labelCertificate;
    private javax.swing.JLabel labelDOB;
    private javax.swing.JLabel labelDevice;
    private javax.swing.JLabel labelDisplay;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelFax;
    private javax.swing.JLabel labelGeoData;
    private javax.swing.JLabel labelHealthPlan;
    private javax.swing.JLabel labelIP;
    private javax.swing.JLabel labelLinkedIn;
    private javax.swing.JLabel labelMedical;
    private javax.swing.JLabel labelName;
    private javax.swing.JLabel labelPhoto;
    private javax.swing.JLabel labelPhotoDisplay;
    private javax.swing.JLabel labelSSN;
    private javax.swing.JLabel labelTelephone;
    private javax.swing.JLabel labelUnique;
    private javax.swing.JLabel labelVehicle;
    private javax.swing.JTextField txtBankAcc;
    private javax.swing.JTextField txtBiometric;
    private javax.swing.JTextField txtCertificate;
    private javax.swing.JTextField txtDOB;
    private javax.swing.JTextField txtDevice;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFax;
    private javax.swing.JTextField txtGeoData;
    private javax.swing.JTextField txtHealthPlan;
    private javax.swing.JTextField txtIP;
    private javax.swing.JTextField txtLinkedIn;
    private javax.swing.JTextField txtMedical;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSSN;
    private javax.swing.JTextField txtTelephone;
    private javax.swing.JTextField txtUnique;
    private javax.swing.JTextField txtVehicle;
    // End of variables declaration//GEN-END:variables


    private void viewPersonal() {
        txtName.setText(personal.getName());
        txtGeoData.setText(personal.getGeographicData());
        //DateofBirth.setText(personal.getDob());
        DateFormat oDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String szDate = oDateFormat.format(personal.getDob());
        txtDOB.setText(szDate);
        txtTelephone.setText(personal.getPhNum());
        txtFax.setText(Integer.toString(personal.getFaxNum()));
        txtEmail.setText(personal.getEmail()); 
        txtSSN.setText(Integer.toString(personal.getSSN()));
        txtMedical.setText(Integer.toString(personal.getMedical()));
        txtHealthPlan.setText(Integer.toString(personal.getHealth()));
        txtBankAcc.setText(Integer.toString(personal.getBankAcc()));
        txtCertificate.setText(Integer.toString(personal.getCertNum()));
        txtVehicle.setText(Integer.toString(personal.getVehicleId()));
        txtDevice.setText(Integer.toString(personal.getDeviceId()));
        txtLinkedIn.setText(personal.getLinkedIn());
        txtIP.setText(personal.getIP());
        txtBiometric.setText(personal.getBiometric());
        txtUnique.setText(Integer.toString(personal.getUniqueID()));
        
        ImageIcon img = new ImageIcon(personal.getImageDisplay());
        //Image imFit = img.getImage();
        //Image imgFit = imFit.getScaledInstance(labelPhotoDisplay.getWidth(), labelPhotoDisplay.getHeight(), Image.SCALE_SMOOTH);
        labelPhotoDisplay.setIcon(img);
    }
}
