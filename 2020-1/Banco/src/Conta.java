/*
 * Definição de uma classe
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
	 * Método -> Ação/Função visibilidade pública -> qualquer classe/objeto pode ver
	 * Recebe um double (s) e retorna void -> não retorna nada
	 */
	public void setSaldo(double s) {
		saldo = s;
	}

	/*
	 * Método -> Ação/Função visibilidade pública -> qualquer classe/objeto pode ver
	 * recebe (nada) e retorna double (saldo)
	 */
	public double getSaldo() {
		return saldo;
	}
	
	/*
	 * Método para depositar
	 * receber um double (v)
	 * retornar nada (void)
	 * */
	public void depositar(double v) {
		saldo += v;
	}
	
	public boolean podeSacar(double v){
		if(v <= saldo) 
			return true;
		else 
			return false;
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
	 * %.x -> número de casas depois do separador decimal
	 * */
	public String retornaSituacao(){
		return String.format("Nome do titular: %s%nSaldo: R$ %.2f",nome,saldo);
	}
}
