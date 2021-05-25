package com.enterprise.annotations;

import org.springframework.stereotype.Component;

@Component
public class ThreeQuarterFinancialReport implements CreationFinancialReport {

    @Override
    public String getFinancialReport() {
        return "Presentación de informe favorable del tercer trimestre";
    }
}
