package org.example.templatemethod.report;

import org.example.templatemethod.Email;
import org.example.templatemethod.Funcionario;

import java.math.BigDecimal;

public abstract class ReportFinanceiro {

    // logica principal
    public String criarReport(Long idFuncionario) {
        Funcionario funcionario = getFuncionario(idFuncionario);
        // verifica permissão
        BigDecimal salario = getSalario(funcionario);

        Email email = criarEmail(funcionario);
        enviarEmail(email);

        return "Report finalizado com sucesso";

    }

    // template method
    protected abstract Email criarEmail(Funcionario funcionario);

    private void enviarEmail(Email email) {
        System.out.println("Email enviado");
    }

    protected Funcionario getFuncionario(Long idFuncionario) {
        return new Funcionario(1L, "Fulano", "fulano@xpto.com");
    }

    protected BigDecimal getSalario(Funcionario funcionario) {
        return BigDecimal.valueOf(1200, 2);
    }


}
