package com.enterprise.annotations;

public class FinancialReportPurchasingDepartment implements CreationFinancialReport {

    @Override
    public String getFinancialReport() {
        return "Informe financiero del Departamento de compras del año 2018";
    }
}
