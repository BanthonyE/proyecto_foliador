/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import static paneles.PNL_Personalizacion.lista_nombre_seccion;
import static paneles.PNL_Personalizacion.lista_rango_inferior_seccion;
import static paneles.PNL_Personalizacion.lista_rango_superior_seccion;
import static paneles.PNL_Personalizacion.seccion;
/**
 *
 * @author RojeruSan
 */
public class PNL_Visualizacion extends javax.swing.JPanel {

    /**
     * Creates new form pnlHome
     */
    public static List<JTextField> lista_nombre_seccion;
    public static List<JTextField>  lista_rango_inferior_seccion;
    public static List<JTextField>   lista_rango_superior_seccion;
    public static String seccion;
     Workbook wb;
     int contAccion=0;
     JFileChooser selecArchivo = new JFileChooser();
     File archivo;

    
    public PNL_Visualizacion() {
        initComponents();
        btn_ExportarExcel.setEnabled(false);
        seccion=PNL_Personalizacion.seccion;
        lista_nombre_seccion=PNL_Personalizacion.lista_nombre_seccion;
        lista_rango_inferior_seccion=PNL_Personalizacion.lista_rango_inferior_seccion;
        lista_rango_superior_seccion=PNL_Personalizacion.lista_rango_superior_seccion;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btn_Mostrar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaSecciones = new javax.swing.JTable();
        btn_ExportarExcel = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(38, 86, 186));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Reporte de la foliación - secciones");

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(128, 128, 131));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/img/feeedback.png"))); // NOI18N
        jLabel7.setText("Visualización");

        btn_Mostrar.setText("Mostrar Secciones");
        btn_Mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MostrarActionPerformed(evt);
            }
        });

        tablaSecciones.setFont(new java.awt.Font("Thonburi", 1, 18)); // NOI18N
        tablaSecciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Secciones", "Desde", "Hasta"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaSecciones.setCellSelectionEnabled(true);
        tablaSecciones.setRowHeight(25);
        tablaSecciones.getTableHeader().setResizingAllowed(false);
        tablaSecciones.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tablaSecciones);
        if (tablaSecciones.getColumnModel().getColumnCount() > 0) {
            tablaSecciones.getColumnModel().getColumn(1).setResizable(false);
            tablaSecciones.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE)
                .addGap(78, 78, 78))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
        );

        btn_ExportarExcel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/xlsx.png"))); // NOI18N
        btn_ExportarExcel.setText("Exportar Excel");
        btn_ExportarExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ExportarExcelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(btn_Mostrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(55, 55, 55)
                .addComponent(btn_ExportarExcel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(158, 158, 158))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(27, 27, 27)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Mostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_ExportarExcel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );
    }// </editor-fold>//GEN-END:initComponents
   
    
    public void AgregarFiltro(){
        selecArchivo.setFileFilter(new FileNameExtensionFilter("Excel (*.xls)",".xls"));
        selecArchivo.setFileFilter(new FileNameExtensionFilter("Excel (*.xlsx)",".xlsx"));
    }
    
    private void btn_ExportarExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ExportarExcelActionPerformed
        contAccion++;
        if(contAccion==1)AgregarFiltro();
       
       if(evt.getSource() == btn_ExportarExcel){
            if(selecArchivo.showDialog(null, "Exportar")==JFileChooser.APPROVE_OPTION){
                archivo=selecArchivo.getSelectedFile();
                if(archivo.getName().endsWith("xls") || archivo.getName().endsWith("xlsx")){
                    JOptionPane.showMessageDialog(null,exportarExcel(archivo, tablaSecciones) + "\n Formato ."+ archivo.getName().substring(archivo.getName().lastIndexOf(".")+1));
                }else{
                    JOptionPane.showMessageDialog(null, "Elija un formato valido.");
                }
            }
        } 
    }//GEN-LAST:event_btn_ExportarExcelActionPerformed

    
   public String exportarExcel(File archivo,JTable tablaD){
       String respuesta="No se realizo con exito la exportación.";
        int numFila=tablaD.getRowCount(), numColumna=tablaD.getColumnCount();
        if(archivo.getName().endsWith("xls")){
            wb = new HSSFWorkbook();   
        }
        else{
            wb = new XSSFWorkbook();
        }
        org.apache.poi.ss.usermodel.Sheet hoja = wb.createSheet("SECCIONES");
        
        try {
            for (int i = -1; i < numFila; i++) {
                Row fila = hoja.createRow(i+1);
                for (int j = 0; j < numColumna; j++) {
                    Cell celda = fila.createCell(j);
                    if(i==-1){
                        celda.setCellValue(String.valueOf(tablaD.getColumnName(j)));
                    }else{
                        celda.setCellValue(String.valueOf(tablaD.getValueAt(i, j)));
                    }
                    wb.write(new FileOutputStream(archivo));
                    wb.close();
                }
            }
            respuesta="Exportación exitosa.";
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return respuesta;

    }
    
    
    
    private void btn_MostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MostrarActionPerformed
       mostrarSecciones();
       btn_ExportarExcel.setEnabled(true);
    }//GEN-LAST:event_btn_MostrarActionPerformed

     public void mostrarSecciones(){
        String matrix [][]= new String [Integer.parseInt(seccion)][3];
        
        for (int i = 0; i < Integer.parseInt(seccion); i++) {
            matrix[i][0] = lista_nombre_seccion.get(i).getText();
            matrix[i][1] =lista_rango_inferior_seccion.get(i).getText();
            matrix[i][2]= lista_rango_superior_seccion.get(i).getText();
            
        }
        String [][] prueba = {{"2","4","4"},{"6","6","9"},{"8","10","12"}};
        
        
        tablaSecciones.setModel(new javax.swing.table.DefaultTableModel(
                matrix,
                new String []{
                    "Secciones","Desde","Hasta"
                }
        ));
        
    }
 /*   
    public static void crearExcel(){
        
        Workbook book= new HSSFWorkbook();
        Sheet sheet = (Sheet) book.createSheet("Hola Excel");
        try {
            FileOutputStream fileout = new FileOutputStream("PRUEBA.xls");
            book.write(fileout);
            fileout.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PNL_Visualizacion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PNL_Visualizacion.class.getName()).log(Level.SEVERE, null, ex);
        }

        
    }
*/
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btn_ExportarExcel;
    private javax.swing.JButton btn_Mostrar;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaSecciones;
    // End of variables declaration//GEN-END:variables
}
