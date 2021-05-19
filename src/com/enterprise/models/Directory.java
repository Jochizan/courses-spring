package com.enterprise.models;

public class Directory implements Employee {

    // Creación de campo tipo ReportCreation (interface)
    private ReportCreation newReport;

    // Creación del constructor que inyecta la dependencia (ReportCreation)
    public Directory(ReportCreation newReport) {
        this.newReport = newReport;
    }

    @Override
    public String getTasks() {
        return "Gestionar la plantilla de la empresa";
    }

    @Override
    public String getReport() {
        return "Informe creado por el director: " + newReport.getReport();
    }
}
