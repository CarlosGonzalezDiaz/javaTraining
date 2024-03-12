package buscaaqui;

import org.springframework.stereotype.Component;

@Component
public class InformeFinancieroImpl implements InformeFinaciero{
    @Override
    public String getInformeFinanciero() {
        return "Presentacion del informe financiero del trimestre 1";
    }
}
