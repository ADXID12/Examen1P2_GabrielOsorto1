
package PrincipalPackage;
import java.util.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
public class RegistroNacional extends javax.swing.JFrame {
    static Random ran= new Random();
    
    public RegistroNacional() {
        initComponents();
        this.setResizable(false);
        pn_Login.setVisible(true);
        pn_accesoEmpleado.setVisible(false);
        pn_accesoCivil.setVisible(false);
        
        Empleados nuevoEmpleado = new Empleados("Ingeniería", "Desarrollador", 5, "Juan", "Pérez", "password123", "Masculino", "Francisco Morazan", "012319943429", null);
        Civiles nuevoCivil = new Civiles("María", "Gómez", "contraseña123", "Femenino", "Cortes", "0210200013458", null);
        usuarios.add(nuevoEmpleado);
        usuarios.add(nuevoCivil);
    }
            static ArrayList usuarios= new ArrayList();



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondoLayout = new javax.swing.JPanel();
        pn_Login = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        RecibirNombreUser = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        RecibirContraseñaUser = new javax.swing.JTextField();
        IngresarBotonLogin = new javax.swing.JButton();
        pn_accesoEmpleado = new javax.swing.JTabbedPane();
        InformacionCiviles = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaCiviles = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaEventosCiviles = new javax.swing.JTable();
        BotonCerrarSesion = new javax.swing.JButton();
        ModificarCiviles = new javax.swing.JPanel();
        numeroID = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        NuevoNombre = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        CambiarSexo = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        CambiarDepto = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        pn_accesoCivil = new javax.swing.JTabbedPane();
        InfoPersonalCivil = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaInfoPersonalCivil = new javax.swing.JTable();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        TablaEventosCiviles1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fondoLayout.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pn_Login.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Login");

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre Completo");

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Contraseña");

        RecibirContraseñaUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecibirContraseñaUserActionPerformed(evt);
            }
        });

        IngresarBotonLogin.setBackground(new java.awt.Color(153, 153, 153));
        IngresarBotonLogin.setForeground(new java.awt.Color(0, 0, 0));
        IngresarBotonLogin.setText("Ingresar");
        IngresarBotonLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IngresarBotonLoginMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pn_LoginLayout = new javax.swing.GroupLayout(pn_Login);
        pn_Login.setLayout(pn_LoginLayout);
        pn_LoginLayout.setHorizontalGroup(
            pn_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_LoginLayout.createSequentialGroup()
                .addGroup(pn_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_LoginLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(pn_LoginLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(RecibirNombreUser, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pn_LoginLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addGroup(pn_LoginLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(RecibirContraseñaUser, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pn_LoginLayout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(jLabel1))
                    .addGroup(pn_LoginLayout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(IngresarBotonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        pn_LoginLayout.setVerticalGroup(
            pn_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_LoginLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(RecibirNombreUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(RecibirContraseñaUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(IngresarBotonLogin)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        fondoLayout.add(pn_Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 400));

        InformacionCiviles.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Bienvenido!");

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Informacion Civiles");

        TablaCiviles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "Nombre", "ID", "Fecha Nacimiento"
            }
        ));
        jScrollPane1.setViewportView(TablaCiviles);

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Tramites");

        TablaEventosCiviles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Nombre tramite", "Descripcion", "Fecha", "ID"
            }
        ));
        jScrollPane2.setViewportView(TablaEventosCiviles);

        BotonCerrarSesion.setText("Cerrar Sesion");
        BotonCerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonCerrarSesionMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout InformacionCivilesLayout = new javax.swing.GroupLayout(InformacionCiviles);
        InformacionCiviles.setLayout(InformacionCivilesLayout);
        InformacionCivilesLayout.setHorizontalGroup(
            InformacionCivilesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InformacionCivilesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(InformacionCivilesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4)
                    .addGroup(InformacionCivilesLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(InformacionCivilesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BotonCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(InformacionCivilesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        InformacionCivilesLayout.setVerticalGroup(
            InformacionCivilesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InformacionCivilesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(BotonCerrarSesion)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        pn_accesoEmpleado.addTab("Informacion Civiles", InformacionCiviles);

        ModificarCiviles.setBackground(new java.awt.Color(255, 255, 255));
        ModificarCiviles.setForeground(new java.awt.Color(255, 255, 255));

        numeroID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        numeroID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroIDActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Nombre");

        NuevoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoNombreActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Contraseña");

        jLabel9.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Sexo");

        CambiarSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        CambiarSexo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CambiarSexoMouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Departamento");

        CambiarDepto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel11.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Apellido");

        jTextField2.setText("jTextField2");

        jLabel12.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Fecha de Nacimiento");

        javax.swing.GroupLayout ModificarCivilesLayout = new javax.swing.GroupLayout(ModificarCiviles);
        ModificarCiviles.setLayout(ModificarCivilesLayout);
        ModificarCivilesLayout.setHorizontalGroup(
            ModificarCivilesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ModificarCivilesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ModificarCivilesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8)
                    .addComponent(NuevoNombre)
                    .addComponent(jLabel7)
                    .addComponent(jTextField1)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CambiarSexo, 0, 219, Short.MAX_VALUE)
                    .addComponent(numeroID, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10)
                    .addComponent(CambiarDepto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(ModificarCivilesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ModificarCivilesLayout.setVerticalGroup(
            ModificarCivilesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ModificarCivilesLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(numeroID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(ModificarCivilesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ModificarCivilesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NuevoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ModificarCivilesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CambiarSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CambiarDepto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pn_accesoEmpleado.addTab("Modificar Civiles", ModificarCiviles);

        fondoLayout.add(pn_accesoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pn_accesoCivil.setForeground(new java.awt.Color(255, 255, 255));

        InfoPersonalCivil.setBackground(new java.awt.Color(255, 255, 255));
        InfoPersonalCivil.setForeground(new java.awt.Color(255, 255, 255));

        jLabel13.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Bienvenido!!");

        jLabel14.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Informacion Personal");

        TablaInfoPersonalCivil.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "Nombre", "ID", "Fecha de Nacimiento"
            }
        ));
        jScrollPane3.setViewportView(TablaInfoPersonalCivil);

        jLabel15.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Tramites");

        TablaEventosCiviles1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Nombre tramite", "Descripcion", "Fecha", "ID"
            }
        ));
        jScrollPane4.setViewportView(TablaEventosCiviles1);

        javax.swing.GroupLayout InfoPersonalCivilLayout = new javax.swing.GroupLayout(InfoPersonalCivil);
        InfoPersonalCivil.setLayout(InfoPersonalCivilLayout);
        InfoPersonalCivilLayout.setHorizontalGroup(
            InfoPersonalCivilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InfoPersonalCivilLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(InfoPersonalCivilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE)
                    .addComponent(jLabel15)
                    .addComponent(jScrollPane4))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        InfoPersonalCivilLayout.setVerticalGroup(
            InfoPersonalCivilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InfoPersonalCivilLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        pn_accesoCivil.addTab("Informacion Personal", InfoPersonalCivil);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 546, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 349, Short.MAX_VALUE)
        );

        pn_accesoCivil.addTab("Gestion de Tramites", jPanel1);

        fondoLayout.add(pn_accesoCivil, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoLayout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoLayout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IngresarBotonLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IngresarBotonLoginMouseClicked
        String nombreUsuario = RecibirNombreUser.getText();
        String contraseña = RecibirContraseñaUser.getText();

        for (Object usuarioObj : usuarios) {
            Usuarios usuario = (Usuarios) usuarioObj;
            if (nombreUsuario.equalsIgnoreCase(usuario.getNombre())) {
                if (contraseña.equals(usuario.getContraseña())) {
                    if (usuario instanceof Empleados) {
                        pn_Login.setVisible(false);
                        pn_accesoEmpleado.setVisible(true);
                        pn_accesoCivil-setVisible(false);
                    } else if (usuario instanceof Civiles) {
                        pn_Login.setVisible(false);
                        pn_accesoEmpleado.setVisible(false);
                        pn_accesoCivil.setVisible(true);
                    }
                } else {
                    JOptionPane.showMessageDialog(rootPane, "contraseña incorrecta");
                }

                break;
            }
        }
    }//GEN-LAST:event_IngresarBotonLoginMouseClicked

    private void RecibirContraseñaUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecibirContraseñaUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RecibirContraseñaUserActionPerformed

    private void BotonCerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonCerrarSesionMouseClicked
        JOptionPane.showMessageDialog(rootPane, "Sesion Cerrada");
        pn_accesoEmpleado.setVisible(false);
        pn_accesoCivil.setVisible(false);
        pn_Login.setVisible(true);
    }//GEN-LAST:event_BotonCerrarSesionMouseClicked

    private void numeroIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numeroIDActionPerformed

    private void NuevoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NuevoNombreActionPerformed

    private void CambiarSexoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CambiarSexoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_CambiarSexoMouseClicked

    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroNacional.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroNacional().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCerrarSesion;
    private javax.swing.JComboBox<String> CambiarDepto;
    private javax.swing.JComboBox<String> CambiarSexo;
    private javax.swing.JPanel InfoPersonalCivil;
    private javax.swing.JPanel InformacionCiviles;
    private javax.swing.JButton IngresarBotonLogin;
    private javax.swing.JPanel ModificarCiviles;
    private javax.swing.JTextField NuevoNombre;
    private javax.swing.JTextField RecibirContraseñaUser;
    private javax.swing.JTextField RecibirNombreUser;
    private javax.swing.JTable TablaCiviles;
    private javax.swing.JTable TablaEventosCiviles;
    private javax.swing.JTable TablaEventosCiviles1;
    private javax.swing.JTable TablaInfoPersonalCivil;
    private javax.swing.JPanel fondoLayout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JComboBox<String> numeroID;
    private javax.swing.JPanel pn_Login;
    private javax.swing.JTabbedPane pn_accesoCivil;
    private javax.swing.JTabbedPane pn_accesoEmpleado;
    // End of variables declaration//GEN-END:variables
public static String NoIdentidad(String depa,Date fechaNacimiento) {
        String numeroIdentidad = "";
        int MunicipioRan = 0;
        if (depa.equalsIgnoreCase("Francisco Morazan")) {
            MunicipioRan = 1 + ran.nextInt(28);
            numeroIdentidad = "01" + String.valueOf(MunicipioRan);
        } else if (depa.equalsIgnoreCase("Cortes")) {
            MunicipioRan = 1 + ran.nextInt(12);
            numeroIdentidad = "02" + String.valueOf(MunicipioRan);
        } else if (depa.equalsIgnoreCase("Comayagua")) {
            MunicipioRan = 1 + ran.nextInt(21);
            numeroIdentidad = "03" + String.valueOf(MunicipioRan);
        }
        return numeroIdentidad;
    }
}
