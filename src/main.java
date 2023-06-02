
import Controladores.EmpleadosController;
import Modelos.EmpleadosModel;
import Vistas.frmConsulta;
import Vistas.frmEmpleados;
import Vistas.frmPrincipal;


public class main {

 
    public static void main(String[] args) {
        frmPrincipal VistaPrincipal = new frmPrincipal();
        EmpleadosModel ModeloEmpleados = new EmpleadosModel();
        frmEmpleados VistaEmpleados = new frmEmpleados(VistaPrincipal,true);
        frmConsulta VistaConsultas = new frmConsulta(VistaPrincipal,true);
        
        EmpleadosController ControladorEmpleados = new EmpleadosController(VistaEmpleados,VistaPrincipal,ModeloEmpleados, VistaConsultas);
        
    }
    
}
