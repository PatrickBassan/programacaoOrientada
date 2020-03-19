/*
 * Defini��o de uma classe
 * visibilidade publica
 * */
public class Conta {
	private String nome;
	private double saldo;

	
	//nome do construtor = nome da classe
	public Conta(String n, double b) {
		saldo = b;
		nome = n;
	}
	
	public void setNome(String n) {
		nome = n;
	}

	public String getNome() {
		return nome;
	}

	/*
	 * M�todo -> A��o/Fun��o visibilidade publica -> Qualquer classe/objeto pode ver
	 * recebe um double (s) retorna void -> n�o retorna nada
	 */
	public void setSaldo(double s) {
		saldo = s;
	}

	/*
	 * M�todo -> A��o/Fun��o visibilidade publica -> Qualquer classe/objeto pode ver
	 * recebe (nada) retorna double (saldo)
	 */
	public double getSaldo() {
		return saldo;
	}
	
	/*
	 * m�todo para depositar
	 * receber um double (v)
	 * retornar nada (void)
	 * */
	public void depositar(double v) {
		saldo += v;
	}
	
	  public boolean podeSacar(double v){
		    if(v <= saldo) return true;
		    else return false;
		  }
	
	  public void sacar(double v){
		    saldo -= v;
		  }
	
	/*
	 * %s -> String
	 * %d -> int
	 * %f -> float/double
	 * %b -> boolean
	 * 
	 * %n -> nova linha
	 * 
	 * %.x -> n�mero de casas depois da ,
	 * */
	
	public String retornaSituacao(){
	    return String.format("Nome do titular: %s%nSaldo: R$ %.2f",nome,saldo);
	  }
}
