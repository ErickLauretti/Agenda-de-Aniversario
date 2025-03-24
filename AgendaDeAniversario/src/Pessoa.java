
public class Pessoa {
	private String nome, telefone, email;
	private Data dataDeAniversario;
	
	public Pessoa(String nome, String telefone, String email, int dia, int mes) {
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.dataDeAniversario = new Data(dia, mes);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Data getDataDeAniversario() {
		return dataDeAniversario;
	}

	public void setDataDeAniversario(Data dataDeAniversario) {
		this.dataDeAniversario = dataDeAniversario;
	}
	
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", telefone=" + telefone + ", email=" + email + ", dataDeAniversario="
				+ dataDeAniversario + "]";
	}
}
