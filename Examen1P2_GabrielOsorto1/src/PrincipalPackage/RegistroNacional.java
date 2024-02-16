
package PrincipalPackage;
import java.util.*;
import javax.swing.JOptionPane;
public class RegistroNacional extends javax.swing.JFrame {
    static Random ran= new Random();
    public RegistroNacional() {
        initComponents();
        pn_Login.setVisible(true);
        pn_accesoEmpleado.setVisible(false);
        
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
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaCiviles = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaEventosCiviles = new javax.swing.JTable();
        BotonCerrarSesion = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

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

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(78, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotonCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addComponent(BotonCerrarSesion)
                .addGap(15, 15, 15))
        );

        pn_accesoEmpleado.addTab("Informacion Civiles", jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 543, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 376, Short.MAX_VALUE)
        );

        pn_accesoEmpleado.addTab("Modificar Civiles", jPanel2);

        javax.swing.GroupLayout pn_LoginLayout = new javax.swing.GroupLayout(pn_Login);
        pn_Login.setLayout(pn_LoginLayout);
        pn_LoginLayout.setHorizontalGroup(
            pn_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_LoginLayout.createSequentialGroup()
                .addComponent(pn_accesoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pn_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_LoginLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pn_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(RecibirNombreUser, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RecibirContraseñaUser, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pn_LoginLayout.createSequentialGroup()
                                .addGap(167, 167, 167)
                                .addComponent(jLabel1))))
                    .addGroup(pn_LoginLayout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(IngresarBotonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pn_LoginLayout.setVerticalGroup(
            pn_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_LoginLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel1)
                .addGap(54, 54, 54)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RecibirNombreUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RecibirContraseñaUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(IngresarBotonLogin)
                .addGap(60, 60, 60))
            .addGroup(pn_LoginLayout.createSequentialGroup()
                .addComponent(pn_accesoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        fondoLayout.add(pn_Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 400));

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

    private void RecibirContraseñaUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecibirContraseñaUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RecibirContraseñaUserActionPerformed

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
} else if (usuario instanceof Civiles) {

}
        } else {
            JOptionPane.showMessageDialog(rootPane, "contraseña incorrecta");
        }
        
        break;
    }
}
    }//GEN-LAST:event_IngresarBotonLoginMouseClicked

    private void BotonCerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonCerrarSesionMouseClicked
       JOptionPane.showMessageDialog(rootPane, "Sesion Cerrada");
       pn_accesoEmpleado.setVisible(false);
       pn_Login.setVisible(true);
    }//GEN-LAST:event_BotonCerrarSesionMouseClicked

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
    private javax.swing.JButton IngresarBotonLogin;
    private javax.swing.JTextField RecibirContraseñaUser;
    private javax.swing.JTextField RecibirNombreUser;
    private javax.swing.JTable TablaCiviles;
    private javax.swing.JTable TablaEventosCiviles;
    private javax.swing.JPanel fondoLayout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel pn_Login;
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
