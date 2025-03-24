
public class Data {
	private int dia, mes;

	public Data(int dia, int mes) {
		this.dia = dia;
		this.mes = mes;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}
	
	public boolean verificaData() {
		int[] diasDosMeses = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if (mes < 1 || mes > 12) {
			return false;
		}
		
		return dia > 0 && dia <= diasDosMeses[mes];
	}
	
	public String dataVerificada() {
		return verificaData() ? "Data válida!" : "Data inválida!";
	}

	@Override
	public String toString() {
		return "Data de aniversário: "+ dia +"/"+ mes;
	}
}
