package rogger.guia.service;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanArrayDataSource;
import net.sf.jasperreports.view.JasperViewer;
import rogger.guia.entity.DetalleCompra;

public class ReporteJasper implements Runnable {

        private List<DetalleCompra> detalleCompras;

        public ReporteJasper(List<DetalleCompra> detalleCompras) {
                this.detalleCompras = detalleCompras;
        }

        @Override
        public void run() {
                generarReporte();
        }

        public void generarReporte() {
                try (  InputStream reporteProducto = getClass().getResourceAsStream("/jaspert/ReporteFactura.jasper");  
                        InputStream logoFooter = getClass().getResourceAsStream("/img/invoice_logo.png"); 
                        InputStream logoStrem = getClass().getResourceAsStream("/img/invoice_logo.png")) {

                        if (logoStrem != null && logoFooter != null && reporteProducto != null) {

                                JRBeanArrayDataSource ds = new JRBeanArrayDataSource(detalleCompras.toArray());

                                Map<String, Object> parametros = new HashMap();
                                parametros.put("ds", ds);
                                parametros.put("logoEmpresa", logoStrem);
                                parametros.put("imagenAlertanativa", logoFooter);

                                JasperPrint jasperPrintWindow = JasperFillManager.fillReport(reporteProducto, parametros, ds);
                                
                                JasperViewer jasperViewer = new JasperViewer(jasperPrintWindow);
                                jasperViewer.setVisible(true);
                        } else {
                                JOptionPane.showMessageDialog(null, "No se logro el objetivo");
                        }
                } catch (Exception e) {
                        e.printStackTrace();
                }
        }

}
