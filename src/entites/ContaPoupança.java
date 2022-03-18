package entites;

public class ContaPoupança extends Conta{

	@Override
	public void Depositar(float numDepos) {
		this.setSaldo(this.getSaldo() + numDepos +(numDepos * (5/100))); 
	}

	@Override
	public String toString() {
		return "ContaPoupança [getTitular()=" + getTitular() + ", getNumeroconta()=" + getNumeroconta()
				+ ", getSaldo()=" + getSaldo() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
		
	}


