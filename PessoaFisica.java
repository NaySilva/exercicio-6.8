
public class PessoaFisica {
	String nome;
	String cpf;
	
	
	public String toString() {
		return "PessoaFisica [nome=" + nome + ", cpf=" + cpf + "]";
	}

	public PessoaFisica(String nome, String cpf){
		if (valida(cpf)){
			this.nome = nome;
			this.cpf = cpf;
		}
	}
	
	public boolean valida(String cpf){
		if ((cpf.length()>11) || (cpf.length() < 11)){
			System.out.println("Cpf invalido!");
			this.cpf = null;
			return false;
		}else{
			return true;
		}
	}
	
}
