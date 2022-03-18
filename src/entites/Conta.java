package entites;

public class Conta {
	private String titular;
	private int numeroconta;
	private double saldo;
	
	public Conta(String titular, int numeroconta, double saldo) {
		this.titular = titular;
		this.numeroconta = numeroconta;
		this.saldo = saldo;
		
	}
	public Conta() {
		
	} 
	
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public int getNumeroconta() {
		return numeroconta;
	}
	public void setNumeroconta(int numeroconta) {
		this.numeroconta = numeroconta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
		
	}
	public void Sacar(float numSaque)  {
		this.saldo = this.saldo - numSaque;
	}
	
	public void Depositar(float numDepos)  {
		this.saldo = this.saldo + numDepos;
	}
	@Override
	public String toString() {
		return "Conta [titular=" + titular + ", numeroconta=" + numeroconta + ", saldo=" + saldo + "]";
	}
}
	
	
	


