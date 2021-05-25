package com.enterprise.annotations;

import org.springframework.stereotype.Component;

@Component
public class OneQuarterFinancialReport implements CreationFinancialReport {

    @Override
    public String getFinancialReport() {
        return "Presentación del informe financiero del primer trimestre";
    }

}
