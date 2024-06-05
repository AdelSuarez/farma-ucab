
package views.viewsPaciente;

public class NuevoPaciente extends javax.swing.JPanel {
    private views.Dashboard dashboard;
    public NuevoPaciente(views.Dashboard dashboard) {
        this.dashboard = dashboard;
        initComponents();
        this.setSize(1180,720);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        buttonCustom1 = new components.ButtonCustom();
        panelRound1 = new components.PanelRound();
        textField1 = new components.TextField();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Nuevo Paciente");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, -1, -1));

        buttonCustom1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/arrow_back_black.png"))); // NOI18N
        buttonCustom1.setBorderColor(new java.awt.Color(255, 255, 255));
        buttonCustom1.setColorClick(new java.awt.Color(230, 230, 230));
        buttonCustom1.setColorOver(new java.awt.Color(240, 240, 240));
        buttonCustom1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        buttonCustom1.setPreferredSize(new java.awt.Dimension(40, 40));
        buttonCustom1.setRadius(15);
        buttonCustom1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCustom1ActionPerformed(evt);
            }
        });
        jPanel1.add(buttonCustom1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 50, -1));

        panelRound1.setBackground(new java.awt.Color(240, 240, 240));
        panelRound1.setRoundBottomLeft(15);
        panelRound1.setRoundBottomRight(15);
        panelRound1.setRoundTopLeft(15);
        panelRound1.setRoundTopRight(15);

        textField1.setText("textField1");

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(723, Short.MAX_VALUE))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(453, Short.MAX_VALUE))
        );

        jPanel1.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 1010, 560));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCustom1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCustom1ActionPerformed
        // TODO add your handling code here:
        dashboard.initView(dashboard.getViewPaciente());
        this.repaint();
    }//GEN-LAST:event_buttonCustom1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private components.ButtonCustom buttonCustom1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private components.PanelRound panelRound1;
    private components.TextField textField1;
    // End of variables declaration//GEN-END:variables
}