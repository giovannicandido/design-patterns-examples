package org.example.templatemethod.report;

import org.example.templatemethod.Email;
import org.example.templatemethod.Funcionario;

public class ReportNovosContratados extends ReportFinanceiro {
    @Override
    protected Email criarEmail(Funcionario funcionario) {
        var body = """
                
                Olá %s, Bem vindo a empresa XPTO,
                Seu report financeiro é uma projeção para os proximos 4 meses,
                Aqui está o seu salario %f.2
                """.formatted(funcionario.name(), getSalario(funcionario));

        var subject = "bem vindo a empresa XPTO";
        var email = funcionario.email();
        return new Email(subject, body, email);
    }

}
