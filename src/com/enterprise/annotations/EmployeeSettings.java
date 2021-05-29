package com.enterprise.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.enterprise.annotations")
@PropertySource("classpath:companyData.properties")
public class EmployeeSettings {

    // Definir el bean para el informe financiero dto compras
    @Bean
    public CreationFinancialReport financialReportPurchasingDepartment() { // Esta será el ID del bean
        return new FinancialReportPurchasingDepartment();
    }

    // Definir el bean para el directorio financiero e inyectar dependencias
    @Bean
    public Employee CFO() {
        return new CFO(financialReportPurchasingDepartment());
    }
}
