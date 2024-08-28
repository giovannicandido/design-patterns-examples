package org.example.templatemethod.report;

import org.example.templatemethod.Email;
import org.example.templatemethod.Funcionario;

public class ReportMensal extends ReportFinanceiro {
    @Override
    protected Email criarEmail(Funcionario funcionario) {
        return new Email("relatorio mensal", "relatorio vazio te enganamos, seu salario atrasou de novo.", funcionario.email());
    }
}
