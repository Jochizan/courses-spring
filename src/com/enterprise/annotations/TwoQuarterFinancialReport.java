package com.enterprise.annotations;

import org.springframework.stereotype.Component;

@Component
public class TwoQuarterFinancialReport implements CreationFinancialReport {

    @Override
    public String getFinancialReport() {
        return "Presentación de informe catastrófico del segundo trimestre";
    }
}
