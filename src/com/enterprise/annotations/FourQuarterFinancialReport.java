package com.enterprise.annotations;

import org.springframework.stereotype.Component;

@Component
public class FourQuarterFinancialReport implements CreationFinancialReport {

    @Override
    public String getFinancialReport() {
        return "Presentación de informe de fin de año";
    }
}
