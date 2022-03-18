package entites;

public class ContaCorrente extends Conta{
	
	@Override
	public void Depositar(float numSaque) {
		this.setSaldo(this.getSaldo() - numSaque -(numSaque * (20/100))); 
	}

	@Override
	public String toString() {
		return "ContaCorrente [getTitular()=" + getTitular() + ", getNumeroconta()=" + getNumeroconta()
				+ ", getSaldo()=" + getSaldo() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
		
		
	}
      
