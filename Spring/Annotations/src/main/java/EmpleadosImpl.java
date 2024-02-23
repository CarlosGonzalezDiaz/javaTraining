import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class EmpleadosImpl implements Empleados{
    @Autowired
    @Qualifier("informeFinancieroTrim2Impl")
    private InformeFinaciero nuevoInforme;


    public void setNuevoInforme(InformeFinaciero nuevoInforme) {
        this.nuevoInforme = nuevoInforme;
    }

    public EmpleadosImpl(InformeFinaciero nuevoInforme) {
        this.nuevoInforme = nuevoInforme;
    }

    @Override
    public String getTareas() {
        return "Vender, vender y vender mas";
    }

    @Override
    public String getInformes() {
        //return "Esto es un informe generado por el comerciar";

        return nuevoInforme.getInformeFinanciero();
    }
}
