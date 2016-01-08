public class Executar {
	
	public static void main (String[] args){
	
		Funcionario func1 = new Funcionario();
		Data data = new Data();
		Empresa empresa1 = new Empresa(10);
		PessoaFisica pf1 = new PessoaFisica("Antonia", "12345678910");
		
		
		data.dia = 06;
		data.mes = 01;
		data.ano = 2016;
		
		func1.setNome("Maria");
		func1.setSalario(900.0);
		func1.recebeAumento(100.0);
		func1.setDataDeEntrada(data);
		
		empresa1.setNome("Empresa1");
		empresa1.adiciona(func1);
		empresa1.mostraEmpregados();
		
		System.out.println("\n\n" + pf1.toString());
		
		
	}
	
}