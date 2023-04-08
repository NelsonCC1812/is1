package gui;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.plaf.basic.BasicSliderUI.TrackListener;

import model.Model;
import model.enums.Journey;
import model.enums.Location;
import model.enums.Vehicle;
import model.reservation.Reservation;
import model.reservation.Ticket;
import model.reservation.Travel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author nelso
 */
public class ConsultScheduleFrame extends javax.swing.JFrame {

        private Model model;
        private List<JFrame> ctx;

        /**
         * Creates new form CreateReserve
         */
        public ConsultScheduleFrame(Model model, List<JFrame> ctx) {
                this.model = model;
                this.ctx = ctx;
                initComponents();
        }

        public ConsultScheduleFrame() {
                initComponents();
        }

        /**
         * This method is called from within the constructor to initialize the form.
         * WARNING: Do NOT modify this code. The content of this method is always
         * regenerated by the Form Editor.
         */
        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated
        // Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jLabel2 = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();
                jLabel1 = new javax.swing.JLabel();
                jLabel4 = new javax.swing.JLabel();
                jSeparator1 = new javax.swing.JSeparator();
                jLabel5 = new javax.swing.JLabel();
                jLabel6 = new javax.swing.JLabel();
                cbxfrom = new javax.swing.JComboBox<>();
                cbxto = new javax.swing.JComboBox<>();
                jLabel7 = new javax.swing.JLabel();
                jLabel8 = new javax.swing.JLabel();
                cbxfromDate = new javax.swing.JComboBox<>();
                cbxtoDate = new javax.swing.JComboBox<>();
                btnconfirn = new javax.swing.JButton();
                btncancel = new javax.swing.JButton();
                jLabel9 = new javax.swing.JLabel();
                txtfpassengersNumber = new javax.swing.JTextField();
                chxoneWayOnly = new javax.swing.JCheckBox();
                jLabel10 = new javax.swing.JLabel();
                cbxvehicle = new javax.swing.JComboBox<>();

                jLabel2.setText("jLabel2");

                jLabel3.setText("jLabel3");

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jLabel4.setText("Consultar horarios");

                jLabel5.setText("origen:");

                jLabel6.setText("destino");

                cbxfrom.setModel(new javax.swing.DefaultComboBoxModel<>(
                                (Location[]) model.locations().toArray(new Location[model.locations().size()])));

                cbxto.setModel(new javax.swing.DefaultComboBoxModel<>(
                                (Location[]) model.locations().toArray(new Location[model.locations().size()])));

                jLabel7.setText("fecha ida:");

                jLabel8.setText("fecha vuelta:");

                cbxfromDate.setModel(
                                new javax.swing.DefaultComboBoxModel<>(
                                                (LocalDateTime[]) model.travelsDateFrom()
                                                                .toArray(new LocalDateTime[model.travelsDateFrom()
                                                                                .size()])));

                cbxtoDate.setModel(
                                new javax.swing.DefaultComboBoxModel<>(
                                                (LocalDateTime[]) model.travelsDateFrom().toArray(
                                                                new LocalDateTime[model.travelsDateFrom().size()])));

                btnconfirn.setText("Confirmar");
                btnconfirn.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnconfirnActionPerformed(evt);
                        }
                });

                btncancel.setText("Cancelar");
                btncancel.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btncancelActionPerformed(evt);
                        }
                });

                jLabel9.setText("numero de pasajeros:");

                txtfpassengersNumber.setText("1");
                txtfpassengersNumber.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                txtfpassengersNumberActionPerformed(evt);
                        }
                });

                chxoneWayOnly.setText("solo ida");
                chxoneWayOnly.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                chxoneWayOnlyActionPerformed(evt);
                        }
                });

                jLabel10.setText("vehículo:");

                cbxvehicle.setModel(
                                new javax.swing.DefaultComboBoxModel<>((Vehicle[]) model.vehicles()
                                                .toArray(new Vehicle[model.vehicles().size()])));

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addComponent(jLabel4)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addGroup(layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                                                .addComponent(jLabel1,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                93,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                                                                                .addComponent(jSeparator1)))
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addGroup(layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addGroup(layout
                                                                                                                                .createParallelGroup(
                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                                false)
                                                                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                                                                .addComponent(jLabel5)
                                                                                                                                                .addPreferredGap(
                                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                                .addComponent(cbxfrom,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                194,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                                                                .addComponent(jLabel7)
                                                                                                                                                .addPreferredGap(
                                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                                .addComponent(cbxfromDate,
                                                                                                                                                                0,
                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                Short.MAX_VALUE)))
                                                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                                                .addComponent(jLabel9)
                                                                                                                                .addPreferredGap(
                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                .addComponent(txtfpassengersNumber,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                71,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                .addComponent(chxoneWayOnly,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                85,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addGap(18, 18, 18)
                                                                                                .addGroup(layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                                                .addComponent(jLabel6)
                                                                                                                                .addPreferredGap(
                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                .addComponent(cbxto,
                                                                                                                                                0,
                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                Short.MAX_VALUE))
                                                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                                                .addGroup(layout.createParallelGroup(
                                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                                                false)
                                                                                                                                                .addComponent(jLabel10,
                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                Short.MAX_VALUE)
                                                                                                                                                .addComponent(jLabel8,
                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                Short.MAX_VALUE))
                                                                                                                                .addPreferredGap(
                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                .addGroup(layout.createParallelGroup(
                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                .addComponent(cbxtoDate,
                                                                                                                                                                0,
                                                                                                                                                                149,
                                                                                                                                                                Short.MAX_VALUE)
                                                                                                                                                .addComponent(cbxvehicle,
                                                                                                                                                                0,
                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                Short.MAX_VALUE)))
                                                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                                layout
                                                                                                                                                .createSequentialGroup()
                                                                                                                                                .addGap(0, 0, Short.MAX_VALUE)
                                                                                                                                                .addComponent(btncancel,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                97,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                .addPreferredGap(
                                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                                                                .addComponent(btnconfirn,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                99,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                                                .addContainerGap()));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                false)
                                                                                .addComponent(jLabel4)
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addComponent(jLabel1)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                Short.MAX_VALUE)
                                                                                                .addComponent(jSeparator1,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                10,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(layout.createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                .addComponent(jLabel5)
                                                                                                .addComponent(jLabel6)
                                                                                                .addComponent(cbxto,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addComponent(cbxfrom,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(layout.createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                .addComponent(jLabel7)
                                                                                                .addComponent(cbxfromDate,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(layout.createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                .addComponent(jLabel8)
                                                                                                .addComponent(cbxtoDate,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel9)
                                                                                .addComponent(txtfpassengersNumber,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jLabel10)
                                                                                .addComponent(cbxvehicle,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(13, 13, 13)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(btncancel)
                                                                                .addComponent(chxoneWayOnly)
                                                                                .addComponent(btnconfirn,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE))
                                                                .addContainerGap()));

                // *=> Action Listeners

                btncancel.addActionListener(e -> {
                        this.ctx.get(0).setVisible(true);
                        this.dispose();
                });

                btnconfirn.addActionListener(e -> {

                        LocalDateTime dateFrom = (LocalDateTime) cbxfromDate.getSelectedItem();
                        LocalDateTime dateTo = (LocalDateTime) cbxtoDate.getSelectedItem();

                        Location from = (Location) cbxfrom.getSelectedItem();
                        Location to = (Location) cbxto.getSelectedItem();

                        if (from.equals(to)) {
                                return; // Ida y vuelta no pueden ser iguales
                        }

                        if (dateFrom.isAfter(dateTo)) {
                                return;
                        }

                        HashSet<Ticket> tickets = new HashSet<>();

                        for (int i = 0; i < Integer.parseInt(this.txtfpassengersNumber.getText()); i++) {

                                Travel departure = new Travel(dateFrom, 120, model.findJourneyByFromAndTo(from, to),
                                                null);

                                Travel comeback = new Travel(dateTo, 120, model.findJourneyByFromAndTo(from, to), null);
                                ;

                                tickets.add(new Ticket(null, null, departure,
                                                !chxoneWayOnly.isEnabled() ? comeback : null));

                        }

                        this.ctx.add(this);
                        this.setVisible(false);
                        JFrame frame = !chxoneWayOnly.isEnabled() ? new AddTicketsFrame(model, ctx, tickets)
                                        : new AddTicketsOneWayOnlyFrame(model, ctx, tickets);
                        frame.setVisible(true);
                });

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void btnconfirnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnconfirnActionPerformed

        }// GEN-LAST:event_btnconfirnActionPerformed

        private void btncancelActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btncancelActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_btncancelActionPerformed

        private void txtfpassengersNumberActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtfpassengersNumberActionPerformed
        }// GEN-LAST:event_txtfpassengersNumberActionPerformed

        private void chxoneWayOnlyActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_chxoneWayOnlyActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_chxoneWayOnlyActionPerformed

        /**
         * @param args the command line arguments
         */
        public static void main(String args[]) {
                /* Set the Nimbus look and feel */
                // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
                // (optional) ">
                /*
                 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
                 * look and feel.
                 * For details see
                 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
                 */
                try {
                        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
                                        .getInstalledLookAndFeels()) {
                                if ("Nimbus".equals(info.getName())) {
                                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                                        break;
                                }
                        }
                } catch (ClassNotFoundException ex) {
                        java.util.logging.Logger.getLogger(ConsultScheduleFrame.class.getName()).log(
                                        java.util.logging.Level.SEVERE,
                                        null, ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(ConsultScheduleFrame.class.getName()).log(
                                        java.util.logging.Level.SEVERE,
                                        null, ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(ConsultScheduleFrame.class.getName()).log(
                                        java.util.logging.Level.SEVERE,
                                        null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(ConsultScheduleFrame.class.getName()).log(
                                        java.util.logging.Level.SEVERE,
                                        null, ex);
                }
                // </editor-fold>
                // </editor-fold>
                // </editor-fold>
                // </editor-fold>
                // </editor-fold>
                // </editor-fold>
                // </editor-fold>
                // </editor-fold>

                /* Create and display the form */
                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                new ConsultScheduleFrame().setVisible(true);
                        }
                });
        }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton btncancel;
        private javax.swing.JButton btnconfirn;
        private javax.swing.JComboBox<Location> cbxfrom;
        private javax.swing.JComboBox<LocalDateTime> cbxfromDate;
        private javax.swing.JComboBox<Location> cbxto;
        private javax.swing.JComboBox<LocalDateTime> cbxtoDate;
        private javax.swing.JComboBox<Vehicle> cbxvehicle;
        private javax.swing.JCheckBox chxoneWayOnly;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel10;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JLabel jLabel7;
        private javax.swing.JLabel jLabel8;
        private javax.swing.JLabel jLabel9;
        private javax.swing.JSeparator jSeparator1;
        private javax.swing.JTextField txtfpassengersNumber;
        // End of variables declaration//GEN-END:variables
}
