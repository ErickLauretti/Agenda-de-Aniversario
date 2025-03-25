
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

	@Override
	public String toString() {
		if (this.dia >= 10 && this.mes >= 10) {
			return this.dia + "/" + this.mes;
		} else if (this.dia >= 10) {
			return this.dia + "/0" + this.mes;	
		} else if (this.mes >= 10){
			return "0" + this.dia + "/" + this.mes;
		} else {
			return "0" + this.dia + "/0" + this.mes;
		}
		
	}
}
