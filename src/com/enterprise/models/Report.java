package com.enterprise.models;

public class Report implements ReportCreation {

    @Override
    public String getReport() {
        return "Esta es la presentación del informe";
    }
}
