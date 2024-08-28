package org.example.templatemethod;

import org.example.templatemethod.report.ReportFinanceiro;
import org.example.templatemethod.report.ReportMensal;
import org.example.templatemethod.report.ReportNovosContratados;

public class Main {
    public static void main(String[] args) {
        ReportFinanceiro report = new ReportNovosContratados();
        report.criarReport(1L);

        ReportFinanceiro mensal = new ReportMensal();

        mensal.criarReport(1L);

    }
}
