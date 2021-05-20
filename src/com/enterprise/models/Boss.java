package com.enterprise.models;

public class Boss implements Employee {

    private ReportCreation newReport;

    public Boss(ReportCreation newReport) {
        this.newReport = newReport;
    }
    
    public String getTasks() {
        return "Gestiono las custiones relativas a mis empleados de sección";
    }

    @Override
    public String getReport() {
        return "Informe presentado por el jefe con arreglos: " + newReport.getReport();
    }
}
