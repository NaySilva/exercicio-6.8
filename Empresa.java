
public class Empresa {
	private String nome;
	private String cnpj;
	private Funcionario[] empregados;
	private int numFunc;
	
	public String getNome(){
		return this.nome;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public Empresa(int tamanho){
		this.empregados = new Funcionario[tamanho];
	}
	
	public Funcionario getFuncionario(int i){
		return this.empregados[i];
	}
	
	public String getCnpj() {
		return cnpj;
	}


	public void setEmpregados(Funcionario[] empregados) {
		this.empregados = empregados;
	}

	public int getNumFunc() {
		return numFunc;
	}

	void adiciona(Funcionario f){
		numFunc++;
		this.empregados[numFunc-1] = f;
	}
	void mostraEmpregados(){
		for(int i = 0; i < this.numFunc; i++){
			System.out.println("Funcionaro " + i+1);
			this.empregados[i].mostra();
		}
	}

}
