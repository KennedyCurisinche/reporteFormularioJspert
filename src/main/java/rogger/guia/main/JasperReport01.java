package rogger.guia.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanArrayDataSource;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.export.SimpleExporterInput;
import net.sf.jasperreports.export.SimpleOutputStreamExporterOutput;
import net.sf.jasperreports.export.SimplePdfExporterConfiguration;
import rogger.guia.entity.DetalleCompra;

public class JasperReport01 {

        public static void main(String[] args) {
                final String USERNAME = System.getProperty("user.name");

                ClassLoader classLoader =  JasperReport01.class.getClassLoader();
                File fileLogo = new File(classLoader.getResource("img/invoice_logo.png").getFile());
                File fileJaspert = new File(classLoader.getResource("jaspert/ReporteFactura.jasper").getFile());
                
                //System.out.println(file.toPath().toString());

                try {
                        InputStream logoStrem = new FileInputStream(fileLogo),//new File((".\\reporteJaspert\\img\\fantasia.png")),
                                logoFooter = new FileInputStream(fileLogo),//new File(".\\reporteJaspert\\img\\check.png")),
                                reporteProducto = new FileInputStream(fileJaspert);//new File(".\\reporteJaspert\\ReporteFactura.jasper"));

                        if (logoStrem != null && logoFooter != null && reporteProducto != null) {
                                List<DetalleCompra> detalleCompras = listarDetalles();

                                JasperReport report = (JasperReport) JRLoader.loadObject(reporteProducto);
                                JRBeanArrayDataSource ds = new JRBeanArrayDataSource(detalleCompras.toArray());

                                Map<String, Object> parametros = new HashMap();
                                parametros.put("ds", ds);
                                parametros.put("logoEmpresa", logoStrem);
                                parametros.put("imagenAlertanativa", logoFooter);

                                JasperPrint jasperPrintWindow = JasperFillManager.fillReport(report, parametros, ds);
                                //Para sitio web
                                //ServletOutStream out = new response.getOutputStream();
                                //JasperExportManager.exportReportToPdfStream(jasperPrintWindow, outputStream);

                                //Configuracion donde la exportacion es automatica
                                JRPdfExporter exp = new JRPdfExporter();

                                exp.setExporterInput(new SimpleExporterInput(jasperPrintWindow));
                                exp.setExporterOutput(new SimpleOutputStreamExporterOutput("C:\\Users\\" + USERNAME + "\\Downloads\\Reporte de venta de Producto.pdf"));

                                //Se configura para la exportacion en PDF
                                SimplePdfExporterConfiguration conf = new SimplePdfExporterConfiguration();

                                //Se obtiene la configuracion de PDF
                                exp.setConfiguration(conf);

                                //Se envia 
                                exp.exportReport();

                                //Nos da el apartado grafico para guardar donde se desee
                                //JasperViewer jasperViewer = new JasperViewer(jasperPrintWindow); 
                                //jasperViewer.setVisible(true);
                        } else {
                                JOptionPane.showMessageDialog(null, "No se logro el objetivo");
                        }

                } catch (Exception e) {
                        e.printStackTrace();
                }
        }

        private static List<DetalleCompra> listarDetalles() {
                List<DetalleCompra> listar = new ArrayList<>();
                listar.add(new DetalleCompra(0, "-", 0.00, 0, 0.00));
                listar.add(new DetalleCompra(1, "INCA KOLA 600ML", 3.00, 2, 6.00));
                listar.add(new DetalleCompra(2, "INCA KOLA 1L", 6.00, 3, 18.00));
                listar.add(new DetalleCompra(3, "CEREAL BAR AZUL 8GR", 0.70, 4, 2.80));
                listar.add(new DetalleCompra(4, "CHIFLES KARINTO 16GR", 1.50, 3, 4.50));
                return listar;
        }

}
