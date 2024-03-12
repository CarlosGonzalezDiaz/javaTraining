package buscaaqui;

import org.springframework.stereotype.Component;

@Component
public class InformeFinancieroTrim3Impl implements InformeFinaciero{
    @Override
    public String getInformeFinanciero() {
        return "Presentacion favorable del trimestre 3";
    }
}
