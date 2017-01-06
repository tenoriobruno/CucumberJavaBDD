package feature.salary;
 
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
 
import java.util.List;
 
import com.hascode.tutorial.cucumber.salary.Employee;
import com.hascode.tutorial.cucumber.salary.SalaryManager;
 
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
 
public class SalarySteps { 
	SalaryManager manager;
	
	@Dado("^o sistema de gestão de salários é inicializado com os seguintes dados$")
	//public void o_sistema_de_gestão_de_salários_é_inicializado_com_os_seguintes_dados(DataTable arg1)
	public void o_sistema_de_gestão_de_salários_é_inicializado_com_os_seguintes_dados(final List<Employee> employees) throws Throwable {
		manager = new SalaryManager(employees);
	}

	@Quando("^o chefe chefe aumenta o salário do empregado com id '(\\d+)' para (\\d+)%$")
	public void o_chefe_chefe_aument_o_salário_do_empregado_com_id_para(final int id, final int increaseInPercent) throws Throwable {
		manager.increaseSalary(id, increaseInPercent);
	}

	@Então("^o pagamento do o empregado com id '(\\d+)' deve mostrar o salário de (\\d+)$")
	public void o_pagamento_do_o_empregado_com_id_deve_mostrar_o_salário_de(final int id, final float salary) throws Throwable {
		Employee nominee = manager.getPayroll(id);
		//System.out.println("salario"+nominee.getSalary());
		assertThat(nominee.getSalary(), equalTo(salary));
	}

}