package views.viewsGestion;

import controller.ControllerGestionEmpleado;


public class GestionEmpleado extends javax.swing.JPanel {

    private ControllerGestionEmpleado controller;

    public GestionEmpleado(views.Dashboard dashboard, views.ViewEmpleado viewEmpleado, String dato) {
        initComponents();
        this.controller = new ControllerGestionEmpleado(dashboard, viewEmpleado, this, dato);
        this.setSize(1180, 720);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnRegresar = new components.ButtonCustom();
        panelRound1 = new components.PanelRound();
        apellidoEmpleado = new components.TextField();
        nombreEmpleado = new components.TextField();
        telefonoEmpleado = new components.TextField();
        tittuloSecundario = new javax.swing.JLabel();
        btnGuardarEmpleado = new components.ButtonCustom();
        CorreoEmpleado = new components.TextField();
        passwordField1 = new components.PasswordField();
        esAdmin = new components.JCheckBoxCustom();
        usuarioEmpleado = new components.TextField();
        mensajeGuardado = new javax.swing.JLabel();
        tituloPrincipal = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/arrow_back_black.png"))); // NOI18N
        btnRegresar.setBorderColor(new java.awt.Color(255, 255, 255));
        btnRegresar.setColorClick(new java.awt.Color(230, 230, 230));
        btnRegresar.setColorOver(new java.awt.Color(240, 240, 240));
        btnRegresar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnRegresar.setPreferredSize(new java.awt.Dimension(40, 40));
        btnRegresar.setRadius(15);
        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 50, -1));

        panelRound1.setBackground(new java.awt.Color(240, 240, 240));
        panelRound1.setRoundBottomLeft(15);
        panelRound1.setRoundBottomRight(15);
        panelRound1.setRoundTopLeft(15);
        panelRound1.setRoundTopRight(15);

        apellidoEmpleado.setBackground(new java.awt.Color(240, 240, 240));
        apellidoEmpleado.setForeground(new java.awt.Color(80, 80, 80));
        apellidoEmpleado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        apellidoEmpleado.setLabelText("Apellido");

        nombreEmpleado.setBackground(new java.awt.Color(240, 240, 240));
        nombreEmpleado.setForeground(new java.awt.Color(80, 80, 80));
        nombreEmpleado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nombreEmpleado.setLabelText("Nombre");

        telefonoEmpleado.setBackground(new java.awt.Color(240, 240, 240));
        telefonoEmpleado.setForeground(new java.awt.Color(80, 80, 80));
        telefonoEmpleado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        telefonoEmpleado.setLabelText("Telefono");

        tittuloSecundario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tittuloSecundario.setText("Datos del Empleado");

        btnGuardarEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarEmpleado.setBorderColor(new java.awt.Color(240, 240, 240));
        btnGuardarEmpleado.setColor(new java.awt.Color(0, 105, 255));
        btnGuardarEmpleado.setColorClick(new java.awt.Color(0, 95, 230));
        btnGuardarEmpleado.setColorOver(new java.awt.Color(0, 84, 204));
        btnGuardarEmpleado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnGuardarEmpleado.setLabel("Guardar");
        btnGuardarEmpleado.setPreferredSize(new java.awt.Dimension(86, 40));
        btnGuardarEmpleado.setRadius(15);
        btnGuardarEmpleado.setRolloverEnabled(true);

        CorreoEmpleado.setBackground(new java.awt.Color(240, 240, 240));
        CorreoEmpleado.setForeground(new java.awt.Color(80, 80, 80));
        CorreoEmpleado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CorreoEmpleado.setLabelText("Correo");

        passwordField1.setBackground(new java.awt.Color(240, 240, 240));
        passwordField1.setForeground(new java.awt.Color(80, 80, 80));
        passwordField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        passwordField1.setLabelText("Contraseña");
        passwordField1.setShowAndHide(true);

        esAdmin.setForeground(new java.awt.Color(0, 0, 0));
        esAdmin.setText("Admin");
        esAdmin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        usuarioEmpleado.setBackground(new java.awt.Color(240, 240, 240));
        usuarioEmpleado.setForeground(new java.awt.Color(80, 80, 80));
        usuarioEmpleado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        usuarioEmpleado.setLabelText("Usuario");

        mensajeGuardado.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        mensajeGuardado.setForeground(new java.awt.Color(40, 180, 99));
        mensajeGuardado.setText("Empleado guardado");

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addComponent(CorreoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(105, Short.MAX_VALUE))
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mensajeGuardado)
                            .addComponent(usuarioEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(passwordField1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tittuloSecundario)
                                        .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(nombreEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                                            .addComponent(apellidoEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(telefonoEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(panelRound1Layout.createSequentialGroup()
                                        .addComponent(esAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                                        .addComponent(btnGuardarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(tittuloSecundario)
                .addGap(18, 18, 18)
                .addComponent(nombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(apellidoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(telefonoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CorreoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(usuarioEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(passwordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(esAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(mensajeGuardado)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel1.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, 500, 560));

        tituloPrincipal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tituloPrincipal.setText("Nuevo Empleado");
        jPanel1.add(tituloPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1123, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 667, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public components.TextField CorreoEmpleado;
    public components.TextField apellidoEmpleado;
    public components.ButtonCustom btnGuardarEmpleado;
    public components.ButtonCustom btnRegresar;
    public components.JCheckBoxCustom esAdmin;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JLabel mensajeGuardado;
    public components.TextField nombreEmpleado;
    private components.PanelRound panelRound1;
    public components.PasswordField passwordField1;
    public components.TextField telefonoEmpleado;
    private javax.swing.JLabel tittuloSecundario;
    public javax.swing.JLabel tituloPrincipal;
    public components.TextField usuarioEmpleado;
    // End of variables declaration//GEN-END:variables
}
