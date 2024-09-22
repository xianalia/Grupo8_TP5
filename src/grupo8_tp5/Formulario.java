package grupo8_tp5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Set;
import javax.swing.JOptionPane;

public class Formulario extends javax.swing.JFrame {


    private Directorio directorio;

    public Formulario() {
       
        directorio = new Directorio();
       
     
        
        initComponents();
 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdPane = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtfDni = new javax.swing.JTextField();
        jtfApellido = new javax.swing.JTextField();
        jtfDireccion = new javax.swing.JTextField();
        jtfCiudad = new javax.swing.JTextField();
        jtfTelefono = new javax.swing.JTextField();
        jtfNombre = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jbNuevo = new javax.swing.JButton();
        jbBorrar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jbGuardar2 = new javax.swing.JButton();
        imagen = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();
        jMenu = new javax.swing.JMenuBar();
        JMBuscar = new javax.swing.JMenu();
        jmApellido = new javax.swing.JMenuItem();
        jmCiudad = new javax.swing.JMenuItem();
        jmTelefono = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(242, 241, 224));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 64, 245));
        jLabel1.setText("Formulario de Contacto");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Dni:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nombre:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 116, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Apellido:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 156, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Direccion:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 203, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Ciudad:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 253, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Telefono:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 343, -1, -1));

        jtfDni.setBackground(new java.awt.Color(255, 249, 243));
        jtfDni.setForeground(new java.awt.Color(51, 51, 255));
        jtfDni.setEnabled(false);
        jtfDni.setOpaque(true);
        jPanel1.add(jtfDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 252, -1));

        jtfApellido.setBackground(new java.awt.Color(255, 249, 243));
        jtfApellido.setForeground(new java.awt.Color(51, 51, 255));
        jtfApellido.setEnabled(false);
        jtfApellido.setOpaque(true);
        jtfApellido.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtfApellidoFocusGained(evt);
            }
        });
        jPanel1.add(jtfApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 156, 252, -1));

        jtfDireccion.setBackground(new java.awt.Color(255, 249, 243));
        jtfDireccion.setForeground(new java.awt.Color(51, 51, 255));
        jtfDireccion.setEnabled(false);
        jtfDireccion.setOpaque(true);
        jtfDireccion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtfDireccionFocusGained(evt);
            }
        });
        jPanel1.add(jtfDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 203, 252, -1));

        jtfCiudad.setBackground(new java.awt.Color(255, 249, 243));
        jtfCiudad.setForeground(new java.awt.Color(51, 51, 255));
        jtfCiudad.setEnabled(false);
        jtfCiudad.setOpaque(true);
        jtfCiudad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtfCiudadFocusGained(evt);
            }
        });
        jPanel1.add(jtfCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 252, -1));

        jtfTelefono.setBackground(new java.awt.Color(255, 249, 243));
        jtfTelefono.setForeground(new java.awt.Color(51, 51, 255));
        jtfTelefono.setEnabled(false);
        jtfTelefono.setOpaque(true);
        jtfTelefono.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtfTelefonoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfTelefonoFocusLost(evt);
            }
        });
        jtfTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfTelefonoActionPerformed(evt);
            }
        });
        jPanel1.add(jtfTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 343, 252, -1));

        jtfNombre.setBackground(new java.awt.Color(255, 249, 243));
        jtfNombre.setForeground(new java.awt.Color(51, 51, 255));
        jtfNombre.setEnabled(false);
        jtfNombre.setOpaque(true);
        jtfNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtfNombreFocusGained(evt);
            }
        });
        jPanel1.add(jtfNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 252, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 306, 370, 20));

        jbNuevo.setText("Nuevo");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });
        jPanel1.add(jbNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 395, -1, -1));

        jbBorrar.setText("Borrar");
        jbBorrar.setEnabled(false);
        jbBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBorrarActionPerformed(evt);
            }
        });
        jPanel1.add(jbBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 395, -1, -1));

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });
        jPanel1.add(jbSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 395, -1, -1));

        jbGuardar.setText("Guardar");
        jbGuardar.setEnabled(false);
        jPanel1.add(jbGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 395, -1, -1));

        jbGuardar2.setText("Guardar");
        jPanel1.add(jbGuardar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 395, -1, -1));

        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/grupo8_tp5/imagenes/contacto2.png"))); // NOI18N
        jPanel1.add(imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, -40, 330, 500));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/grupo8_tp5/imagenes/imagenFondo.jpeg"))); // NOI18N
        bg.setText("jLabel8");
        bg.setMaximumSize(new java.awt.Dimension(236, 236));
        bg.setMinimumSize(new java.awt.Dimension(236, 236));
        bg.setOpaque(true);
        bg.setPreferredSize(new java.awt.Dimension(700, 500));
        jPanel1.add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 500));

        jdPane.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jdPaneLayout = new javax.swing.GroupLayout(jdPane);
        jdPane.setLayout(jdPaneLayout);
        jdPaneLayout.setHorizontalGroup(
            jdPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 742, Short.MAX_VALUE)
            .addGroup(jdPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jdPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jdPaneLayout.setVerticalGroup(
            jdPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 512, Short.MAX_VALUE)
            .addGroup(jdPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jdPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(1, Short.MAX_VALUE)))
        );

        JMBuscar.setText("Buscar");

        jmApellido.setText("Por Apellido");
        jmApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmApellidoActionPerformed(evt);
            }
        });
        JMBuscar.add(jmApellido);

        jmCiudad.setText("Por Ciudad");
        jmCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmCiudadActionPerformed(evt);
            }
        });
        JMBuscar.add(jmCiudad);

        jmTelefono.setText("Por Telefono");
        jmTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmTelefonoActionPerformed(evt);
            }
        });
        JMBuscar.add(jmTelefono);

        jMenu.add(JMBuscar);

        setJMenuBar(jMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jdPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jdPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    
    
    
    
    private void jmApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmApellidoActionPerformed
        
     
          ViewBuscarPorApellido bpa = new ViewBuscarPorApellido();
          bpa.setVisible(true);
          jdPane.add(bpa);
          jdPane.moveToFront(bpa);
                  
    }//GEN-LAST:event_jmApellidoActionPerformed
    
    
    private void jmCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmCiudadActionPerformed
     
          ViewBuscarPorCiudad bpc = new ViewBuscarPorCiudad();
          bpc.setVisible(true);
          jdPane.add(bpc);
          jdPane.moveToFront(bpc);
    }//GEN-LAST:event_jmCiudadActionPerformed
    
    
    private void jmTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmTelefonoActionPerformed

          ViewBuscarPorTelefono1 bpt = new ViewBuscarPorTelefono1();
          bpt.setVisible(true);
          jdPane.add(bpt);
          jdPane.moveToFront(bpt);
    }//GEN-LAST:event_jmTelefonoActionPerformed

    private void jtfTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfTelefonoActionPerformed

    private void jtfTelefonoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfTelefonoFocusLost
         String val = "[0-9]*";
        if (!jtfTelefono.getText().matches(val)) {
            JOptionPane.showMessageDialog(this, "debe ingresar solo numeros");
            jtfTelefono.setText("");
             jtfTelefono.requestFocus();      
    }//GEN-LAST:event_jtfTelefonoFocusLost
    
    }
    private void jtfNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfNombreFocusGained
        String val = "[0-9]*";
        if (!jtfDni.getText().matches(val)) {
            JOptionPane.showMessageDialog(this, "debe ingresar solo numeros");
            jtfDni.setText("");
             jtfDni.requestFocus();
    }//GEN-LAST:event_jtfNombreFocusGained
    }
    private void jtfApellidoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfApellidoFocusGained
         if (jtfNombre.getText().length() == 0) {

            JOptionPane.showMessageDialog(this, "este campo no puede estar vacio");
            jtfNombre.setText("");
            jtfNombre.requestFocus();
    }//GEN-LAST:event_jtfApellidoFocusGained
    }
    private void jtfDireccionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfDireccionFocusGained
 if (jtfApellido.getText().length() == 0) {
 JOptionPane.showMessageDialog(this, "este campo no puede estar vacio");
              jtfApellido.setText("");
            jtfApellido.requestFocus();    }//GEN-LAST:event_jtfDireccionFocusGained
    
    }
    private void jtfCiudadFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfCiudadFocusGained
          if (jtfDireccion.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "este campo no puede estar vacio");
               jtfDireccion.setText("");
                 jtfDireccion.requestFocus();
    }//GEN-LAST:event_jtfCiudadFocusGained
    }
    private void jtfTelefonoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfTelefonoFocusGained
         if (jtfCiudad.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "este campo no puede estar vacio");
            jtfCiudad.setText("");
            jtfCiudad.requestFocus();
    }//GEN-LAST:event_jtfTelefonoFocusGained
    }
    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        jbGuardar.setEnabled(true);
        jbBorrar.setEnabled(true);
        jtfDni.setEnabled(true);
        jtfNombre.setEnabled(true);
        jtfApellido.setEnabled(true);
        jtfCiudad.setEnabled(true);
        jtfDireccion.setEnabled(true);
        jtfTelefono.setEnabled(true);
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
         int confirmacion = JOptionPane.showConfirmDialog(null, "¿Estás seguro de que quieres salir?", "Confirmación de salida", JOptionPane.YES_NO_OPTION);
                
                if (confirmacion == JOptionPane.YES_OPTION) {
                    System.exit(0); 
                }
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBorrarActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_jbBorrarActionPerformed

    
    
    private void limpiarCampos() {
        jtfDni.setText("");
        jtfNombre.setText("");
        jtfApellido.setText("");
        jtfCiudad.setText("");
        jtfDireccion.setText("");
        jtfTelefono.setText("");
    }

    private void agregarContacto() {

        try {
            String dni = jtfDni.getText();
            String nombre = jtfNombre.getText();
            String apellido = jtfApellido.getText();
            String ciudad = jtfCiudad.getText();
            String direccion = jtfDireccion.getText();
            Long telefono = Long.parseLong(jtfTelefono.getText());

            Contactos contacto = new Contactos(dni, nombre, apellido, ciudad, direccion);
            directorio.agregarContacto(telefono, contacto);
            JOptionPane.showMessageDialog(null, "Contacto agregado: " + contacto);
            limpiarCampos();

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Error: El contacto no ha sido agregado, revisa que todos los campos esten completos");
        }
    }

    private void buscarContacto() {
        Long telefono = Long.parseLong(jtfTelefono.getText());
        Contactos contacto = directorio.buscarContacto(telefono);

        if (contacto != null) {
            JOptionPane.showMessageDialog(null, "Contacto encontrado: " + contacto);
        } else {
            JOptionPane.showMessageDialog(null, "Contacto no encontrado");
        }
        limpiarCampos();
    }

    private void buscarTelefonoApellido() {
        String apellido = jtfApellido.getText();
        Set<Long> telefono = directorio.buscarTelefonoApellido(apellido);

        if (!telefono.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Teléfonos encontrados para el apellido " + apellido + ": " + telefono);
        } else {
            JOptionPane.showMessageDialog(null, "No se encontraron teléfonos para el apellido " + apellido);
        }
        limpiarCampos();
    }

    private void buscarContactosCiudad() {
        String ciudad = jtfCiudad.getText();
        ArrayList<Contactos> contactos = directorio.buscarContactosCiudad(ciudad);

        if (!contactos.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Contactos encontrados en la ciudad " + ciudad);
            for (Contactos c : contactos) {
                JOptionPane.showMessageDialog(null, c);
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se encontraron contactos en la ciudad " + ciudad + ".\n");
        }
        limpiarCampos();
    }

    private void borrarContacto() {
        Long telefono = Long.parseLong(jtfTelefono.getText());
        directorio.borrarContacto(telefono);
        JOptionPane.showMessageDialog(null, "Contacto con teléfono " + telefono + " ha sido eliminado.");
        limpiarCampos();
    }

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu JMBuscar;
    private javax.swing.JLabel bg;
    private javax.swing.JLabel imagen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenuBar jMenu;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbBorrar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbGuardar2;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbSalir;
    private javax.swing.JDesktopPane jdPane;
    private javax.swing.JMenuItem jmApellido;
    private javax.swing.JMenuItem jmCiudad;
    private javax.swing.JMenuItem jmTelefono;
    private javax.swing.JTextField jtfApellido;
    private javax.swing.JTextField jtfCiudad;
    private javax.swing.JTextField jtfDireccion;
    private javax.swing.JTextField jtfDni;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JTextField jtfTelefono;
    // End of variables declaration//GEN-END:variables

    
}
