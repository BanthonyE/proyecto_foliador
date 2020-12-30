/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JTextField;



import java.util.Iterator;
import static javafx.scene.transform.Transform.scale;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import static javax.swing.Spring.scale;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.apache.pdfbox.exceptions.COSVisitorException;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDDocumentCatalog;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDResources;
import org.apache.pdfbox.pdmodel.edit.PDPageContentStream;
import org.apache.pdfbox.pdmodel.graphics.xobject.PDPixelMap;
import org.apache.pdfbox.pdmodel.graphics.xobject.PDXObjectImage;
import org.icepdf.ri.common.ComponentKeyBinding;
import org.icepdf.ri.common.SwingController;
import org.icepdf.ri.common.SwingViewBuilder;
import static paneles.PNL_Importacion.rutaPdf;
import principal.Principal;
/**
 *
 * @author RojeruSan
 */
public class PNL_Personalizacion extends javax.swing.JPanel {

    private List<JTextField> lista_nombre_seccion, lista_rango_inferior_seccion, lista_rango_superior_seccion;
    public static String rutaPdf;
    public String ruta_archivo;

    SwingController control = null;
    SwingViewBuilder factry = null;
    JPanel veiwerCompntpnl = null;      
    
    public int x_sello = 550, y_sello = 755;

    public PNL_Personalizacion() {
        initComponents();        
        lista_nombre_seccion = new ArrayList<>();
        lista_rango_inferior_seccion = new ArrayList<>();
        lista_rango_superior_seccion = new ArrayList<>();
        rutaPdf = PNL_Importacion.rutaPdf;
        btn_generar_secciones.setEnabled(false);
    }

      
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        btnOption01 = new rsbuttom.RSButtonMetro();
        btnOption02 = new rsbuttom.RSButtonMetro();
        btnOption05 = new rsbuttom.RSButtonMetro();
        btnOption06 = new rsbuttom.RSButtonMetro();
        btnOption04 = new rsbuttom.RSButtonMetro();
        btnOption03 = new rsbuttom.RSButtonMetro();
        cbPosicion = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        txtnum_secciones = new javax.swing.JTextField();
        btnSeccion = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel6 = new javax.swing.JPanel();
        Panel_nom_seccion = new javax.swing.JPanel();
        Panel_rango_inferior_seccion = new javax.swing.JPanel();
        Panel_rango_superior_seccion = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        sc = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        btn_generar_secciones = new javax.swing.JButton();
        btnGuardarCambios = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(128, 128, 131));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/img/chat.png"))); // NOI18N
        jLabel7.setText("Personalización");

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("Establecer Icono"));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnOption01.setText("1");

        btnOption02.setText("2");

        btnOption05.setText("5");

        btnOption06.setText("6");

        btnOption04.setText("4");

        btnOption03.setText("3");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnOption01, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOption04, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnOption02, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOption05, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnOption03, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOption06, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOption01, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOption02, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOption03, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 264, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOption04, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOption05, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOption06, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        cbPosicion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Posicion 1", "Posicion 2", "Posicion 3", "Posicion 4", "Posicion 5", "Posicion 6" }));
        cbPosicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPosicionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(cbPosicion, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(cbPosicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(30, 30, 30))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Establecer secciones"));

        btnSeccion.setText("Crear Secciones");
        btnSeccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeccionActionPerformed(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Panel_nom_seccion.setBackground(new java.awt.Color(255, 255, 255));
        Panel_nom_seccion.setLayout(new java.awt.GridLayout(25, 0));
        jPanel6.add(Panel_nom_seccion);

        Panel_rango_inferior_seccion.setBackground(new java.awt.Color(255, 255, 255));
        Panel_rango_inferior_seccion.setLayout(new java.awt.GridLayout(25, 0));
        jPanel6.add(Panel_rango_inferior_seccion);

        Panel_rango_superior_seccion.setBackground(new java.awt.Color(255, 255, 255));
        Panel_rango_superior_seccion.setLayout(new java.awt.GridLayout(25, 0));
        jPanel6.add(Panel_rango_superior_seccion);

        jScrollPane2.setViewportView(jPanel6);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(txtnum_secciones, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(btnSeccion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnum_secciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSeccion))
                .addGap(8, 8, 8)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Visualizar PDF"));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sc, javax.swing.GroupLayout.DEFAULT_SIZE, 927, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sc, javax.swing.GroupLayout.DEFAULT_SIZE, 703, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));

        btn_generar_secciones.setText("Generar PDF");
        btn_generar_secciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_generar_seccionesActionPerformed(evt);
            }
        });

        btnGuardarCambios.setText("Guardar Cambios");
        btnGuardarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCambiosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(btnGuardarCambios, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_generar_secciones, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_generar_secciones, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                    .addComponent(btnGuardarCambios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel11.setBackground(new java.awt.Color(51, 153, 255));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 103, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(63, 63, 63))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_generar_seccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_generar_seccionesActionPerformed
                  
        String pdfFilePath = rutaPdf;

        PDDocument document = null;
        try {
            document = PDDocument.load(pdfFilePath);
        } catch (IOException ex) {
            Logger.getLogger(PNL_Personalizacion.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            addImageToPage(document, lista_nombre_seccion, lista_rango_inferior_seccion, lista_rango_superior_seccion);
        } catch (IOException ex) {
            Logger.getLogger(PNL_Personalizacion.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            document.save("src/Recursos/pdfGenerado/pdf-generado.pdf");
        } catch (IOException ex) {
            Logger.getLogger(PNL_Personalizacion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (COSVisitorException ex) {
            Logger.getLogger(PNL_Personalizacion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
            control=new SwingController();
            factry=new SwingViewBuilder(control);
            veiwerCompntpnl=factry.buildViewerPanel();
            ComponentKeyBinding.install(control, veiwerCompntpnl);
            control.getDocumentViewController().setAnnotationCallback(
                new org.icepdf.ri.common.MyAnnotationCallback(
                control.getDocumentViewController()));
                control.openDocument("src/Recursos/pdfGenerado/pdf-generado.pdf");
            sc.setViewportView(veiwerCompntpnl); 

        
    }//GEN-LAST:event_btn_generar_seccionesActionPerformed

    private void btnSeccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeccionActionPerformed
        int numSecciones = 0;

        Panel_nom_seccion.removeAll();
        Panel_rango_superior_seccion.removeAll();
        Panel_rango_inferior_seccion.removeAll();

        lista_nombre_seccion.clear();
        lista_rango_inferior_seccion.clear();
        lista_rango_superior_seccion.clear();

        numSecciones = Integer.parseInt(txtnum_secciones.getText());

        for (int i = 0; i <= numSecciones; i++) {

            if(i == 0){
                Label lbl_nomb_seccion = new Label("Nombre de la Sección");
                Label lbl_rango_inferior_seccion = new Label("De");
                Label lbl_rango_superior_seccion = new Label("Hasta");

                Panel_nom_seccion.add(lbl_nomb_seccion);
                Panel_nom_seccion.updateUI();

                Panel_rango_inferior_seccion.add(lbl_rango_inferior_seccion);
                Panel_rango_inferior_seccion.updateUI();

                Panel_rango_superior_seccion.add(lbl_rango_superior_seccion);
                Panel_rango_superior_seccion.updateUI();

            }else{
                JTextField nombre_seccion = new JTextField("",10);
                JTextField rango_inferior_seccion = new JTextField("",5);
                JTextField rango_superior_seccion = new JTextField("",5);

                Panel_nom_seccion.add(nombre_seccion);
                lista_nombre_seccion.add(nombre_seccion);
                Panel_nom_seccion.updateUI();

                Panel_rango_inferior_seccion.add(rango_inferior_seccion);
                lista_rango_inferior_seccion.add(rango_inferior_seccion);
                Panel_rango_inferior_seccion.updateUI();

                Panel_rango_superior_seccion.add(rango_superior_seccion);
                lista_rango_superior_seccion.add(rango_superior_seccion);
                Panel_rango_superior_seccion.updateUI();
            }
        }
        //
    }//GEN-LAST:event_btnSeccionActionPerformed

    private void btnGuardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCambiosActionPerformed
        
        String seccion= txtnum_secciones.getText();
        if(seccion.compareTo("")!=0){
            btn_generar_secciones.setEnabled(true);
            JOptionPane.showMessageDialog(this,"Datos guardados"); 
        }
        else{
           JOptionPane.showMessageDialog(this,"Falta ingresar datos en seccion");
        }
        sc.setViewportView(null);
    }//GEN-LAST:event_btnGuardarCambiosActionPerformed

    private void cbPosicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPosicionActionPerformed
        // Elegir posición del icono del PDF
        int opcion=cbPosicion.getSelectedIndex();
        switch(opcion){
            case 0:
                btnOption01.setEnabled(true);
                btnOption01.setColorNormal(Color.darkGray);
                btnOption01.setColorHover(Color.red);
                btnOption02.setEnabled(false);
                btnOption02.setColorNormal(new Color(0,139,139));
                btnOption02.setColorHover(Color.getColor("0,0,0"));
                btnOption03.setEnabled(false);
                btnOption03.setColorHover(Color.getColor("0,0,0"));
                btnOption03.setColorNormal(new Color(0,139,139));
                btnOption04.setEnabled(false);
                btnOption04.setColorNormal(new Color(0,139,139));
                btnOption04.setColorHover(Color.getColor("0,0,0"));
                btnOption05.setColorNormal(new Color(0,139,139));
                btnOption05.setEnabled(false);
                btnOption05.setColorHover(Color.getColor("0,0,0"));
                btnOption06.setEnabled(false);
                btnOption06.setColorNormal(new Color(0,139,139));
                btnOption06.setColorHover(Color.getColor("0,0,0"));
                x_sello = 5;
                y_sello = 755;                
                break;
            case 1:
                btnOption02.setEnabled(true);
                btnOption02.setColorNormal(Color.darkGray);
                btnOption02.setColorHover(Color.red);
                btnOption01.setEnabled(false);
                btnOption01.setColorNormal(new Color(0,139,139));
                btnOption01.setColorHover(Color.getColor("0,0,0"));
                btnOption03.setEnabled(false);
                btnOption03.setColorNormal(new Color(0,139,139));
                btnOption03.setColorHover(Color.getColor("0,0,0"));
                btnOption04.setEnabled(false);
                btnOption04.setColorNormal(new Color(0,139,139));
                btnOption04.setColorHover(Color.getColor("0,0,0"));
                btnOption05.setEnabled(false);
                btnOption05.setColorNormal(new Color(0,139,139));
                btnOption05.setColorHover(Color.getColor("0,0,0"));
                btnOption06.setEnabled(false);
                btnOption06.setColorNormal(new Color(0,139,139));
                btnOption06.setColorHover(Color.getColor("0,0,0"));
                x_sello = 250;
                y_sello = 755;                 
                break;
            case 2:
                btnOption03.setEnabled(true);
                btnOption03.setColorNormal(Color.darkGray);
                btnOption03.setColorHover(Color.red);
                btnOption01.setEnabled(false);
                btnOption01.setColorHover(Color.getColor("0,0,0"));
                btnOption01.setColorNormal(new Color(0,139,139));
                btnOption02.setEnabled(false);
                btnOption02.setColorHover(Color.getColor("0,0,0"));
                btnOption02.setColorNormal(new Color(0,139,139));
                btnOption04.setEnabled(false);
                btnOption04.setColorHover(Color.getColor("0,0,0"));
                btnOption04.setColorNormal(new Color(0,139,139));
                btnOption05.setEnabled(false);
                btnOption05.setColorHover(Color.getColor("0,0,0"));
                btnOption05.setColorNormal(new Color(0,139,139));
                btnOption06.setEnabled(false);
                btnOption06.setColorHover(Color.getColor("0,0,0"));
                btnOption06.setColorNormal(new Color(0,139,139));
                x_sello = 530;
                y_sello = 755;                 
                break;
            case 3:
                btnOption04.setEnabled(true);
                btnOption04.setColorNormal(Color.darkGray);
                btnOption04.setColorHover(Color.red);
                btnOption01.setEnabled(false);
                btnOption01.setColorHover(Color.getColor("0,0,0"));
                btnOption01.setColorNormal(new Color(0,139,139));
                btnOption03.setEnabled(false);
                btnOption03.setColorHover(Color.getColor("0,0,0"));
                btnOption03.setColorNormal(new Color(0,139,139));
                btnOption02.setEnabled(false);
                btnOption02.setColorHover(Color.getColor("0,0,0"));
                btnOption02.setColorNormal(new Color(0,139,139));
                btnOption05.setEnabled(false);
                btnOption05.setColorHover(Color.getColor("0,0,0"));
                btnOption05.setColorNormal(new Color(0,139,139));
                btnOption06.setEnabled(false);
                btnOption06.setColorHover(Color.getColor("0,0,0"));
                btnOption06.setColorNormal(new Color(0,139,139));
                x_sello = 5;
                y_sello = 5;                 
                break;
            case 4:
                btnOption05.setEnabled(true);
                btnOption05.setColorNormal(Color.darkGray);
                btnOption05.setColorHover(Color.red);
                btnOption01.setEnabled(false);
                btnOption01.setColorHover(Color.getColor("0,0,0"));
                btnOption01.setColorNormal(new Color(0,139,139));
                btnOption03.setEnabled(false);
                btnOption03.setColorHover(Color.getColor("0,0,0"));
                btnOption03.setColorNormal(new Color(0,139,139));
                btnOption04.setEnabled(false);
                btnOption04.setColorHover(Color.getColor("0,0,0"));
                btnOption04.setColorNormal(new Color(0,139,139));
                btnOption02.setEnabled(false);
                btnOption02.setColorHover(Color.getColor("0,0,0"));
                btnOption02.setColorNormal(new Color(0,139,139));
                btnOption06.setEnabled(false);
                btnOption06.setColorHover(Color.getColor("0,0,0"));
                btnOption06.setColorNormal(new Color(0,139,139));
                x_sello = 250;
                y_sello = 5;                
                break;
            case 5:
                btnOption06.setEnabled(true);
                btnOption06.setColorNormal(Color.darkGray);
                btnOption06.setColorHover(Color.red);
                btnOption01.setEnabled(false);
                btnOption01.setColorHover(Color.getColor("0,0,0"));
                btnOption01.setColorNormal(new Color(0,139,139));
                btnOption03.setEnabled(false);
                btnOption03.setColorNormal(new Color(0,139,139));
                btnOption03.setColorHover(Color.getColor("0,0,0"));
                btnOption04.setEnabled(false);
                btnOption04.setColorNormal(new Color(0,139,139));
                btnOption04.setColorHover(Color.getColor("0,0,0"));
                btnOption02.setEnabled(false);
                btnOption02.setColorNormal(new Color(0,139,139));
                btnOption02.setColorHover(Color.getColor("0,0,0"));
                btnOption05.setEnabled(false);
                btnOption05.setColorNormal(new Color(0,139,139));
                btnOption05.setColorHover(Color.getColor("0,0,0"));
                x_sello = 530;
                y_sello = 5;                
                break; 
        }
        
    }//GEN-LAST:event_cbPosicionActionPerformed

    public void addImageToPage(PDDocument document, List<JTextField> lista_nombre_seccion, List<JTextField> lista_rango_inferior_seccion, List<JTextField> lista_rango_superior_seccion) throws IOException { 
        int cantidad_secciones = lista_nombre_seccion.size();
        BufferedImage image = null, tmp_image = null, image2 = null;
        PDXObjectImage ximage = null;
        PDPageContentStream contentStream = null;
        PDPage page = null;
        Graphics g = null;
        
        int pdfpage=0;
        
        for (int i = 0; i < cantidad_secciones; i++) {
            String nomb_seccion = lista_nombre_seccion.get(i).getText();
            int inicio_pagina = Integer.parseInt(lista_rango_inferior_seccion.get(i).getText());
            int final_pagina = Integer.parseInt(lista_rango_superior_seccion.get(i).getText()); 
                        
            int cont=1;            
            int cantidad_paginas = final_pagina - inicio_pagina + 1;   
                               
            for (int j = inicio_pagina; j <= final_pagina; j++) {                                   
                try {
                    image = ImageIO.read(new File( "src/Recursos/sellos/sello.jpeg"));              
                    g = image.getGraphics(); 
                    Font myFont = new Font ("Courier New", 1, 55);
                    g.setFont(myFont); 
                    g.setColor(Color.BLACK);
                    g.drawString(nomb_seccion, 70, 130); 
                    g.drawString(""+cont, 90, 270); 
                    g.drawString(""+cantidad_paginas, 230, 270); 
                    g.dispose(); 
                    cont++;    

                    tmp_image = image;
                    image2 = new BufferedImage(tmp_image.getWidth(), tmp_image.getHeight(), BufferedImage.TYPE_4BYTE_ABGR);   
                    image2.createGraphics().drawRenderedImage(tmp_image, null); 

                    ximage = new PDPixelMap(document, image2); 
                    if (pdfpage+1 != j) {
                        int diferencia = inicio_pagina - pdfpage - 1;
                        pdfpage = pdfpage + diferencia;
                    }
                    page = (PDPage)document.getDocumentCatalog().getAllPages().get(pdfpage); 

                    contentStream = new PDPageContentStream(document, page, true, true); 
                    contentStream.drawXObject(ximage, x_sello, y_sello, ximage.getWidth()*0.15f, ximage.getHeight()*0.15f); 
                    contentStream.close(); 

                    pdfpage++;
                } catch (IOException ex) {
                    Logger.getLogger(PNL_Personalizacion.class.getName()).log(Level.SEVERE, null, ex);
                }                
            }                       
        }            
    }       

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel_nom_seccion;
    private javax.swing.JPanel Panel_rango_inferior_seccion;
    private javax.swing.JPanel Panel_rango_superior_seccion;
    private javax.swing.JButton btnGuardarCambios;
    private rsbuttom.RSButtonMetro btnOption01;
    private rsbuttom.RSButtonMetro btnOption02;
    private rsbuttom.RSButtonMetro btnOption03;
    private rsbuttom.RSButtonMetro btnOption04;
    private rsbuttom.RSButtonMetro btnOption05;
    private rsbuttom.RSButtonMetro btnOption06;
    private javax.swing.JButton btnSeccion;
    private javax.swing.JButton btn_generar_secciones;
    private javax.swing.JComboBox<String> cbPosicion;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane sc;
    private javax.swing.JTextField txtnum_secciones;
    // End of variables declaration//GEN-END:variables
}
