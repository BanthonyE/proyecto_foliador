/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles;
import VO.ArchivosVO;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import paneles.CuadroImagen;
import paneles.MiVisorPDF;
/**
 *
 * @author RojeruSan
 */
public class PNL_Importacion extends javax.swing.JPanel {

    /**
     * Creates new form Visual
     */
    //Contador de paginas
    private int numImg;

    //Contiene el archivo PDF en bytes de imagenes
    private ArrayList<ArchivosVO> ListaComponente;
    MiVisorPDF pn = new MiVisorPDF();
    ArchivosVO pl = new ArchivosVO();

    //Para mostrar el total de paginas
    private int paginas = -1;
    private int totalp = -1;

    //Guardamos la ruta del PDF--------------------------------------
    private String ruta_archivo = "";
    //---------------------------------------------------------------

    //Mantiene el zoom en la pagina que asignamos
    int zoom = 0;

    public PNL_Importacion() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        p = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        btnabrir = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        sc = new javax.swing.JScrollPane();
        img = new mivisorpdf.CuadroImagen();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(38, 86, 186));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/salir.png"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new java.awt.GridBagConstraints());

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/anterior.png"))); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new java.awt.GridBagConstraints());

        p.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        p.setForeground(new java.awt.Color(255, 255, 255));
        p.setText("Pag.");
        jPanel1.add(p, new java.awt.GridBagConstraints());

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/siguiente.png"))); // NOI18N
        jButton3.setBorderPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new java.awt.GridBagConstraints());

        btnabrir.setBackground(new java.awt.Color(255, 255, 255));
        btnabrir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnabrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/pdf.png"))); // NOI18N
        btnabrir.setText("Abrir archivo PDF");
        btnabrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnabrirActionPerformed(evt);
            }
        });
        jPanel1.add(btnabrir, new java.awt.GridBagConstraints());

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/mas.png"))); // NOI18N
        jButton4.setBorderPainted(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new java.awt.GridBagConstraints());

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/menos.png"))); // NOI18N
        jButton5.setBorderPainted(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new java.awt.GridBagConstraints());

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/ampliar.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new java.awt.GridBagConstraints());

        img.setPreferredSize(new java.awt.Dimension(210, 297));

        javax.swing.GroupLayout imgLayout = new javax.swing.GroupLayout(img);
        img.setLayout(imgLayout);
        imgLayout.setHorizontalGroup(
            imgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 669, Short.MAX_VALUE)
        );
        imgLayout.setVerticalGroup(
            imgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 665, Short.MAX_VALUE)
        );

        sc.setViewportView(img);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(sc, javax.swing.GroupLayout.DEFAULT_SIZE, 671, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sc, javax.swing.GroupLayout.DEFAULT_SIZE, 667, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        //Salir
        System.exit(0);
    }//GEN-LAST:event_jButton7ActionPerformed

   //Metodo abrir documento PDF
    public void abrir_pdf(String url) {
        //Es considerado pagina 1
        this.numImg = 0;
        //Lee la pagina 1
        this.ListaComponente = pn.leerPDF(url);
        //Guardamos todas las paginas en el ArrayList
        for (int i = 0; i < ListaComponente.size(); i++) {
            pl = ListaComponente.get(i);;
            this.img.setImagen(pl.getArchivos());
        }
        //Pagina 1 lo muestra en la pantalla
        paginas = 1;
        p.setText(String.valueOf("Pag. " + paginas));
        totalp = ListaComponente.size();
        //Titulo del pdf
        //this.setTitle("Visor PDFJava; Total Paginas: " + String.valueOf(totalp));
        //tp.setText(String.valueOf(totalp));
        //Mostramos la primera pagina
        ArchivosVO pi = new ArchivosVO();
        pi = ListaComponente.get(0);
        this.img.setImagen(pi.getArchivos());
    }

    //Metodo para adaptar el zoom a la pantalla
    public void adaptar_vista() {
        //System.out.print(zoom);
        if (zoom > 0) {
            for (int i = 0; i <= zoom; i++) {
                this.img.aumentar();
            }
        }
        if (zoom < 0) {
            String z = String.valueOf(zoom);
            z = z.replace("-", "");
            int zz = Integer.parseInt(z);
            for (int j = 0; j <= zz; j++) {
                this.img.disminuir();
            }
        }

    }
    
    
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //Metodo usado para retroceder pagina
        //El if para comprobar que haya paginas
        if (ruta_archivo.trim().length() != 0) {
            //if para que comprueba si la pagina es 1 entonces se ira a la ultima pagina
            this.numImg -= 1;
            if (paginas == 1) {
                paginas = totalp;
                p.setText(String.valueOf("Pag. " + paginas));
            } else {
                paginas = paginas - 1;
                p.setText(String.valueOf("Pag. " + paginas));
            }
            //Aplicamos la pagina respectiva para mostrarlo
            if (this.numImg < 0) {
                this.numImg = (this.ListaComponente.size() - 1);
            }
            ArchivosVO pi = new ArchivosVO();
            for (int i = 0; i < ListaComponente.size(); i++) {
                pi = ListaComponente.get(numImg);
                break;
            }
            //Con este metodo mostramos la imagen
            this.img.setImagen(pi.getArchivos());
            //Este metodo adapta el zoom a la pantalla
            adaptar_vista();

        } else {
            JOptionPane.showMessageDialog(null, "Abrir un documento PDF primero");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //Este metodo pasa la pagina hacia adelante
        //Verifica que haya paginas
        if (ruta_archivo.trim().length() != 0) {
            //Este if comprueba si la pagina esta en el ultimo
            //O si esta en el primero pasara a la siguiente pagina
            this.numImg += 1;
            if (paginas == totalp) {
                paginas = 1;
                p.setText(String.valueOf("Pag. " + paginas));
            } else {
                paginas = paginas + 1;
                p.setText(String.valueOf("Pag. " + paginas));
            }
            //Aplica los cambios de la pagina que corresponde
            if (this.numImg >= this.ListaComponente.size()) {
                this.numImg = 0;
            }
            ArchivosVO pi = new ArchivosVO();
            for (int i = 0; i < ListaComponente.size(); i++) {
                pi = ListaComponente.get(numImg);
                break;
            }
            //Muestra la pagina que corresponde
            this.img.setImagen(pi.getArchivos());
            //adapta la pagina a la pantalla
            adaptar_vista();
        } else {
            JOptionPane.showMessageDialog(null, "Abrir un documento PDF primero");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnabrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnabrirActionPerformed
        //Metodo para buscar y abrir el PDF
        JFileChooser j = new JFileChooser(ruta_archivo);
        FileNameExtensionFilter fi = new FileNameExtensionFilter("pdf", "pdf");
        j.setFileFilter(fi);
        int se = j.showOpenDialog(this);
        if (se == 0) {
            ruta_archivo = j.getSelectedFile().getAbsolutePath();
            //----------------
            //Usamos el metodo abrir pdf para mostrarlo
            abrir_pdf(ruta_archivo);
            this.img.disminuir();
            this.img.disminuir();

        } else {
            //JOptionPane.showMessageDialog(null, "No selecciono");
        }
    }//GEN-LAST:event_btnabrirActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        //Este metodo comprueba que haya paginas
        if (ruta_archivo.trim().length() != 0) {
            //Aplica el zoom
            this.img.aumentar();
            zoom = zoom + 1;
        } else {
            JOptionPane.showMessageDialog(null, "Abrir un documento PDF primero");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        //Este metodo comrpueba que haya paginas
        if (ruta_archivo.trim().length() != 0) {
            //Disminuir el zoom
            this.img.disminuir();
            zoom = zoom - 1;

        } else {
            JOptionPane.showMessageDialog(null, "Abrir un documento PDF primero");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        //Maximizar ventana
        //this.setExtendedState(MAXIMIZED_BOTH);
    }//GEN-LAST:event_jButton6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnabrir;
    private mivisorpdf.CuadroImagen img;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel p;
    private javax.swing.JScrollPane sc;
    // End of variables declaration//GEN-END:variables

    
}
