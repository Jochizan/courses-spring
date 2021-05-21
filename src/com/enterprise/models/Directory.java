package com.enterprise.models;

public class Directory implements Employee {

    // Creación de campo tipo ReportCreation (interface)
    private final ReportCreation newReport;
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

    // Método init. Ejecutar tareas antes de que el bean este disponible

    public void initMethod() {
        System.out.println("Dentro del método init. Aquí van las tareas a ejecutar" + " antes de que el bean este listo");
    }

    // método destroy. Ejecutar tareas después de que el bean haya sido utilizado

    public void finalMethod() {
        System.out.println("Dentro del método destroy. Aquí van las tareas a ejecutar" + " después de que utilizar el bean");
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
