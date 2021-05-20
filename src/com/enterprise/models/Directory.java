package com.enterprise.models;

public class Directory implements Employee {

    // Creación de campo tipo ReportCreation (interface)
    private ReportCreation newReport;
    private String email;
    private String companyName;

    // Creación del constructor que inyecta la dependencia (ReportCreation)
    public Directory(ReportCreation newReport) {
        this.newReport = newReport;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
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
