package buscaaqui;

import org.springframework.stereotype.Component;

@Component
public class InformeFinancieroTrim2Impl implements InformeFinaciero{
    @Override
    public String getInformeFinanciero() {
        return "Presentacion de informe catastrofico del trimestre2";
    }
}
