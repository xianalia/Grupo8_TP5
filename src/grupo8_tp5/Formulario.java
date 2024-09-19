
package grupo8_tp5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Set;
import javax.swing.Action;
import javax.swing.JOptionPane;

public class Formulario extends javax.swing.JFrame {
 private Directorio directorio;

   
    public Formulario() {
        directorio= new Directorio();
        initComponents();
        
    }
    
    
 
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        jbGuardar = new javax.swing.JButton();
        jbBorrar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(242, 241, 224));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 102, 255));
        jLabel1.setText("Formulario de Contacto");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("Dni:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setText("Nombre:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 116, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setText("Apellido:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 156, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setText("Direccion:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 203, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setText("Ciudad:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 253, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setText("Telefono:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 343, -1, -1));

        jtfDni.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfDniFocusLost(evt);
            }
        });
        jtfDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfDniActionPerformed(evt);
            }
        });
        jPanel1.add(jtfDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 252, -1));

        jtfApellido.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfApellidoFocusLost(evt);
            }
        });
        jPanel1.add(jtfApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 156, 252, -1));

        jtfDireccion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfDireccionFocusLost(evt);
            }
        });
        jPanel1.add(jtfDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 203, 252, -1));

        jtfCiudad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfCiudadFocusLost(evt);
            }
        });
        jPanel1.add(jtfCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 253, 252, -1));

        jtfTelefono.addFocusListener(new java.awt.event.FocusAdapter() {
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

        jtfNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfNombreFocusLost(evt);
            }
        });
        jPanel1.add(jtfNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 116, 252, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 306, 452, -1));

        jbNuevo.setText("Nuevo");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });
        jPanel1.add(jbNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 395, -1, -1));

        jbGuardar.setText("Guardar");
        jPanel1.add(jbGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 395, -1, -1));

        jbBorrar.setText("Borrar");
        jPanel1.add(jbBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 395, -1, -1));

        jbSalir.setText("Salir");
        jPanel1.add(jbSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 395, -1, -1));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/grupo8_tp5/clases/Tecnología Azul Claro Minimalista Sombreado de Pantalla Imagen para Descarga Gratuita - Pngtree.jpeg"))); // NOI18N
        bg.setText("jLabel8");
        bg.setMaximumSize(new java.awt.Dimension(236, 236));
        bg.setMinimumSize(new java.awt.Dimension(236, 236));
        bg.setOpaque(true);
        bg.setPreferredSize(new java.awt.Dimension(236, 236));
        jPanel1.add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 450));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfTelefonoActionPerformed

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
jbNuevo.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        agregarContacto();
   
    }
});
    }//GEN-LAST:event_jbNuevoActionPerformed
//solo numeros dni
    private void jtfDniFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfDniFocusLost
        String val="[0-9]*";
        if(!jtfDni.getText().matches(val)){
        JOptionPane.showMessageDialog(this,"debe ingresar solo numeros");
        jtfDni.requestFocus();
        }
    }//GEN-LAST:event_jtfDniFocusLost
// solo numeros telefono
    private void jtfTelefonoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfTelefonoFocusLost
        String val="[0-9]*";
        if(!jtfTelefono.getText().matches(val)){
        JOptionPane.showMessageDialog(this,"debe ingresar solo numeros");
        jtfTelefono.requestFocus();
        }
    }//GEN-LAST:event_jtfTelefonoFocusLost

    private void jtfNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfNombreFocusLost
    if(jtfNombre.getText().length()==0){
        
    JOptionPane.showMessageDialog(this, "este campo no puede estar vacio");
        jtfNombre.requestFocus();

}
    }//GEN-LAST:event_jtfNombreFocusLost

    private void jtfApellidoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfApellidoFocusLost
    if(jtfApellido.getText().length()==0){
        
    JOptionPane.showMessageDialog(this, "este campo no puede estar vacio");
        jtfApellido.requestFocus();    }//GEN-LAST:event_jtfApellidoFocusLost
    }
    
    private void jtfDireccionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfDireccionFocusLost
    if(jtfDireccion.getText().length()==0){
        
    JOptionPane.showMessageDialog(this, "este campo no puede estar vacio");
        jtfDireccion.requestFocus();    }//GEN-LAST:event_jtfDireccionFocusLost
    }
    
    private void jtfCiudadFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfCiudadFocusLost
    if(jtfCiudad.getText().length()==0){
        
    JOptionPane.showMessageDialog(this, "este campo no puede estar vacio");
        jtfCiudad.requestFocus();    }//GEN-LAST:event_jtfCiudadFocusLost

    private void jtfDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfDniActionPerformed
    
    }
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
     JOptionPane.showMessageDialog( null,"Contacto agregado: " + contacto);
        limpiarCampos();
        
         } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null,"Error: El contacto no ha sido agregado, revisa que todos los campos esten completos");
        }
      }
    
    private void buscarContacto() {
        Long telefono = Long.parseLong(jtfTelefono.getText());
        Contactos contacto = directorio.buscarContacto(telefono);

        if (contacto != null) {
            JOptionPane.showMessageDialog(null,"Contacto encontrado: " + contacto );
        } else {
              JOptionPane.showMessageDialog(null,"Contacto no encontrado");
        }
        limpiarCampos();
    }
    
     private void buscarTelefonoApellido() {
        String apellido = jtfApellido.getText();
        Set<Long> telefonos = directorio.buscarTelefonoApellido(apellido);

        if (!telefonos.isEmpty()) {
           JOptionPane.showMessageDialog(null,"Teléfonos encontrados para el apellido " + apellido + ": " + telefonos );
        } else {
            JOptionPane.showMessageDialog(null,"No se encontraron teléfonos para el apellido " + apellido );
        }
        limpiarCampos();
     }
     
     private void buscarContactosCiudad() {
        String ciudad = jtfCiudad.getText();
        ArrayList<Contactos> contactos = directorio.buscarContactosCiudad(ciudad);

        if (!contactos.isEmpty()) {
             JOptionPane.showMessageDialog(null,"Contactos encontrados en la ciudad " + ciudad );
            for (Contactos c : contactos) {
                 JOptionPane.showMessageDialog(null,c);
            }
        } else {
             JOptionPane.showMessageDialog(null,"No se encontraron contactos en la ciudad " + ciudad + ".\n");
        }
        limpiarCampos();
    }
     
      private void borrarContacto() {
        Long telefono = Long.parseLong(jtfTelefono.getText());
        directorio.borrarContacto(telefono);
       JOptionPane.showMessageDialog(null,"Contacto con teléfono " + telefono + " ha sido eliminado.");
        limpiarCampos();
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbBorrar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbSalir;
    private javax.swing.JTextField jtfApellido;
    private javax.swing.JTextField jtfCiudad;
    private javax.swing.JTextField jtfDireccion;
    private javax.swing.JTextField jtfDni;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JTextField jtfTelefono;
    // End of variables declaration//GEN-END:variables

    
     
}
