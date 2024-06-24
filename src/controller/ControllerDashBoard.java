package controller;

import dialog.DialogCerrarSesion;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import main.Main;
import style.MyColor;
import views.Dashboard;
import views.ViewEmpleado;
import views.ViewInsumo;
import views.ViewPaciente;
import views.ViewConsulta;
import views.ViewEstadistica;
import views.ViewControl;
        
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ControllerDashBoard implements ActionListener {

    private ViewPaciente viewPaciente;
    private ViewInsumo viewInsumo;
    private ViewEmpleado viewEmpleado;
    private ViewConsulta viewConsulta;
    private ViewEstadistica viewEstadistica;
    private ViewControl viewControl;
    
    private String nombre;

    private Main main;
    private Dashboard dashboard;

    public ControllerDashBoard(Main main, Dashboard dashboard, boolean admin, String[] datosUsuario) {
        this.main = main;
        this.dashboard = dashboard;
        this.nombre = datosUsuario[1] + " " + datosUsuario[2];
        this.viewPaciente = new ViewPaciente(dashboard);
        this.viewInsumo = new ViewInsumo(dashboard);
        this.viewEmpleado = new ViewEmpleado(dashboard);
        this.viewConsulta = new ViewConsulta(dashboard);
        this.viewEstadistica = new ViewEstadistica(dashboard);
        this.viewControl = new ViewControl(dashboard);
        

        dashboard.btnEmpleado.setVisible(admin);
        dashboard.btnControl.setVisible(admin);
        dashboard.NombreEmpleado.setText(nombre);
        
        // selecciona el boton de la view  que se muestra al iniciar la app
        dashboard.btnConsulta.setColor(new MyColor().getBTNSELECTCOLOR());

        this.dashboard.btnCerrarSesion.addActionListener(this);
        this.dashboard.btnConsulta.addActionListener(this);
        this.dashboard.btnEmpleado.addActionListener(this);
        this.dashboard.btnInsumo.addActionListener(this);
        this.dashboard.btnPaciente.addActionListener(this);
        this.dashboard.btnEstadistica.addActionListener(this);
        this.dashboard.btnControl.addActionListener(this);

        iniciadorVentana(viewConsulta);
        tagAdmin(admin);
    }

    public void iniciadorVentana(JPanel view) {
        dashboard.Content.removeAll();
        dashboard.Content.add(view, BorderLayout.CENTER);
        dashboard.Content.revalidate();
        dashboard.Content.repaint();
    }

//    public ViewPaciente getViewPaciente() {
//        return viewPaciente;
//    }
//
//    public ViewEmpleado getViewEmpleado() {
//        return viewEmpleado;
//    }
//
//    public ViewInsumo getViewInsumo() {
//        return viewInsumo;
//    }
//
//    public GestionConsulta getViewConsulta() {
//        return viewGestionConsulta;
//    }
//
    private void cerraSesion() {
        dialog.DialogCerrarSesion dialog = new DialogCerrarSesion(main);
        dialog.setVisible(true);
    }
    
    private void activarViewEstadistica() {
        dashboard.btnPaciente.setColor(new MyColor().getBTNBGDASHBOAR());
        dashboard.btnInsumo.setColor(new MyColor().getBTNBGDASHBOAR());
        dashboard.btnConsulta.setColor(new MyColor().getBTNBGDASHBOAR());
        dashboard.btnEmpleado.setColor(new MyColor().getBTNBGDASHBOAR());
        dashboard.btnEstadistica.setColor(new MyColor().getBTNSELECTCOLOR());
        dashboard.btnControl.setColor(new MyColor().getBTNBGDASHBOAR());
        iniciadorVentana(viewEstadistica);
    }
    
    private void activarViewControl() {
        dashboard.btnPaciente.setColor(new MyColor().getBTNBGDASHBOAR());
        dashboard.btnInsumo.setColor(new MyColor().getBTNBGDASHBOAR());
        dashboard.btnConsulta.setColor(new MyColor().getBTNBGDASHBOAR());
        dashboard.btnEmpleado.setColor(new MyColor().getBTNBGDASHBOAR());
        dashboard.btnEstadistica.setColor(new MyColor().getBTNBGDASHBOAR());
        dashboard.btnControl.setColor(new MyColor().getBTNSELECTCOLOR());
        iniciadorVentana(viewControl);
    }

    private void activarViewInsumo() {
        dashboard.btnPaciente.setColor(new MyColor().getBTNBGDASHBOAR());
        dashboard.btnInsumo.setColor(new MyColor().getBTNSELECTCOLOR());
        dashboard.btnConsulta.setColor(new MyColor().getBTNBGDASHBOAR());
        dashboard.btnEmpleado.setColor(new MyColor().getBTNBGDASHBOAR());
        dashboard.btnEstadistica.setColor(new MyColor().getBTNBGDASHBOAR());
        dashboard.btnControl.setColor(new MyColor().getBTNBGDASHBOAR());
        iniciadorVentana(viewInsumo);
    }

    private void activarViewPaciente() {
        dashboard.btnInsumo.setColor(new MyColor().getBTNBGDASHBOAR());
        dashboard.btnPaciente.setColor(new MyColor().getBTNSELECTCOLOR());
        dashboard.btnConsulta.setColor(new MyColor().getBTNBGDASHBOAR());
        dashboard.btnEmpleado.setColor(new MyColor().getBTNBGDASHBOAR());
        dashboard.btnEstadistica.setColor(new MyColor().getBTNBGDASHBOAR());
        dashboard.btnControl.setColor(new MyColor().getBTNBGDASHBOAR());
        iniciadorVentana(viewPaciente);
    }

    private void activarViewEmpleado() {
        dashboard.btnPaciente.setColor(new MyColor().getBTNBGDASHBOAR());
        dashboard.btnInsumo.setColor(new MyColor().getBTNBGDASHBOAR());
        dashboard.btnConsulta.setColor(new MyColor().getBTNBGDASHBOAR());
        dashboard.btnEmpleado.setColor(new MyColor().getBTNSELECTCOLOR());
        dashboard.btnEstadistica.setColor(new MyColor().getBTNBGDASHBOAR());
        dashboard.btnControl.setColor(new MyColor().getBTNBGDASHBOAR());
        iniciadorVentana(viewEmpleado);
    }

    private void activarViewConsulta() {
//        this.viewConsulta = new ViewConsulta(dashboard, viewGestionConsulta);
        dashboard.btnPaciente.setColor(new MyColor().getBTNBGDASHBOAR());
        dashboard.btnInsumo.setColor(new MyColor().getBTNBGDASHBOAR());
        dashboard.btnConsulta.setColor(new MyColor().getBTNSELECTCOLOR());
        dashboard.btnEmpleado.setColor(new MyColor().getBTNBGDASHBOAR());
        dashboard.btnEstadistica.setColor(new MyColor().getBTNBGDASHBOAR());
        dashboard.btnControl.setColor(new MyColor().getBTNBGDASHBOAR());
        iniciadorVentana(viewConsulta);
    }
    
    public void horaTurno(){
        String hora;
        try { 
            dashboard.wifiActivo.setVisible(false);
            URL url = new URL("http://worldtimeapi.org/api/timezone/America/Caracas");
            URLConnection conn = url.openConnection();
            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line;
            StringBuilder result = new StringBuilder();
            while ((line = br.readLine()) != null) {
                result.append(line);
            }
            br.close();

            String datetime = result.toString().split("\"datetime\":\"")[1].split("\"")[0];
            hora = datetime.substring(11, 19); // 
        } catch (Exception e) {
            // Si hay un error (como una UnknownHostException), obtenemos la hora del sistema local
            dashboard.wifiActivo.setVisible(true);
            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
            hora = now.format(formatter);
        }

        int horaDelDia = Integer.parseInt(hora.split(":")[0]);
        if (horaDelDia >= 6 && horaDelDia < 12) {
            dashboard.containerTurno.setBackground(new MyColor().getAZUL());
            dashboard.titleTurno.setText("Mañana");
        } else if (horaDelDia >= 12 && horaDelDia < 18) {
            dashboard.containerTurno.setBackground(new MyColor().getVERDE());
            dashboard.titleTurno.setText("Tarde");
        } else {
            dashboard.containerTurno.setBackground(new MyColor().getREDPRIMARIO());
            dashboard.titleTurno.setText("Noche");
        }
    }
    
    private void tagAdmin(boolean esAdmin){
        if(esAdmin){
            dashboard.tag.setBackground(new MyColor().getVERDE());
            dashboard.estatus.setText("Admin");
        } else {
            dashboard.tag.setBackground(new MyColor().getAZUL());
            dashboard.estatus.setText("Usuario");
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == dashboard.btnInsumo) {
            activarViewInsumo();
        } else if (e.getSource() == dashboard.btnCerrarSesion) {
            cerraSesion();
        } else if (e.getSource() == dashboard.btnPaciente) {
            activarViewPaciente();
        } else if (e.getSource() == dashboard.btnEmpleado) {
            activarViewEmpleado();
        } else if (e.getSource() == dashboard.btnConsulta) {
            activarViewConsulta();
        } else if (e.getSource() == dashboard.btnEstadistica) {
            activarViewEstadistica();
        } else if (e.getSource() == dashboard.btnControl) {
            activarViewControl();
        }

    }

}
