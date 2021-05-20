package com.enterprise.models;

public class Secretary implements Employee {

    private ReportCreation newReport;
    private String email;
    private String companyName;


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

    public ReportCreation getNewReport() {
        return newReport;
    }

    public void setNewReport(ReportCreation newReport) {
        this.newReport = newReport;
    }

    @Override
    public String getTasks() {
        return "Gestionar la agenda de los Jefes";
    }

    @Override
    public String getReport() {
        return "Informe generado por el secretario: " + newReport.getReport();
    }
}
