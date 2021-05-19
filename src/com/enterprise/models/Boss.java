package com.enterprise.models;

public class Boss implements Employee {

    public String getTasks() {
        return "Gestiono las custiones relativas a mis empleados de sección";
    }

    @Override
    public String getReport() {
        return null;
    }
}
