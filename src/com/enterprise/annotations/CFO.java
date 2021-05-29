package com.enterprise.annotations;

import org.springframework.beans.factory.annotation.Value;

public class CFO implements Employee {

    private CreationFinancialReport newFinancialReport;

    @Value("${email}")
    private String email;

    @Value("${nameEnterprise}")
    private String nameCompany;

    public CFO(CreationFinancialReport newFinancialReport) {
        this.newFinancialReport = newFinancialReport;
    }

    public CreationFinancialReport getNewFinancialReport() {
        return newFinancialReport;
    }

    public void setNewFinancialReport(CreationFinancialReport newFinancialReport) {
        this.newFinancialReport = newFinancialReport;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public void setNameCompany(String nameCompany) {
        this.nameCompany = nameCompany;
    }

    @Override
    public String getTasks() {
        return "Gestión y dirección de las operaciones financieras de la empresa";
    }

    @Override
    public String getReport() {
        return newFinancialReport.getFinancialReport();
    }

}
