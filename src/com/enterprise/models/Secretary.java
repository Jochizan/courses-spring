package com.enterprise.models;

public class Secretary implements Employee {

    @Override
    public String getTasks() {
        return "Gestionar la agenda de los Jefes";
    }

    @Override
    public String getReport() {
        return null;
    }
}
