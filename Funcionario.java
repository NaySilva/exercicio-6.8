public class Funcionario{
	
	// 1ª questao
	private String nome;
	private String departamento;
	private double salario;
	private Data dataDeEntrada;
	private String rg;
	private static int identificador;
	
	public Funcionario(String nome){
		++identificador;
		this.nome = nome;
	}
	
	public Funcionario() {
		++identificador;
	}
	
	public int getIdentificador(){
		return identificador;
	}


	public double getSalario(){
		return this.salario;
	}
	
	public void setSalario(double salario){
		this.salario = salario;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public void setDataDeEntrada(Data dataDeEntrada){
		this.dataDeEntrada = dataDeEntrada;
	}
	
	public void mostra(){
		System.out.println("Nome: " + this.nome);
		System.out.println("Departamento: " + this.departamento);
		System.out.println("Salario: " + this.salario);
		System.out.println("Data de Entrada: " + this.dataDeEntrada.formatada());
		System.out.println("RG: " + this.rg);
		System.out.println("Ganho Anual: " + this.getGanhoAnual());
	}
	
	public void recebeAumento(double valor){
		this.salario += valor;
	}
	
	public double getGanhoAnual(){
		return this.salario * 12;
	}
	
}