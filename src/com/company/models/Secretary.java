package com.company.models;

public class Secretary implements Employee {

    @Override
    public String getTasks() {
        return "Gestionar la agenda de los Jefes";
    }
}
