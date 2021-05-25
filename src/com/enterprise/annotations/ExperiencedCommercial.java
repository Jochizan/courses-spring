package com.enterprise.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * En conclusión existen 3 maneras claras de inyectar dependencias
 * Estos son:
 *  - Por Constructor
 *  - Por un métodos Setter / "Cualquier nombre"
 *  - Por Atributos o Campos
 */

@Component
@Scope("prototype") // -> Nos ayuda a usar el diseño prototype para Spring
public class ExperiencedCommercial implements Employee {

    @Autowired // -> Así tambien se puede inyectar dependencias
    @Qualifier("fourQuarterFinancialReport") // -> Para indicarle a Spring de que clase que implemente
    // ... la función de CreationFinancialReport debe usar
    private CreationFinancialReport newReport;

    public ExperiencedCommercial() {}

/*
    @Autowired // -> Solo es necesario si tienes más de un constructor
    public ExperiencedCommercial(CreationFinancialReport newReport) {
        this.newReport = newReport;
    }
*/

/*
    @Autowired // -> Siempre si se quiere inyectar una dependencia
    public void setNewReport(CreationFinancialReport newReport) { // -> El nombre de la función puede ser cualquiera
        this.newReport = newReport;
    }
*/

    @Override
    public String getTasks() {
        return "Vender, vender y vender más!!!";
    }

    @Override
    public String getReport() {
//        return "Informe generado por el comercial";
        return newReport.getFinancialReport();
    }

}
