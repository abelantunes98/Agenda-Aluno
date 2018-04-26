package lab2;

public class ContaCantina {
	String nomeDaCantina;
	int Conta = 0;
	int Quantidade = 0;
	
	public ContaCantina(String nomeDaCantina) {
		this.nomeDaCantina = nomeDaCantina;
		this.Conta = Conta;
		this.Quantidade = Quantidade;
	}

    public void cadastraLanche(int qtdItens, int valorCentavos) {
    	this.Conta += (qtdItens * valorCentavos);
    	this.Quantidade += qtdItens;
    }
    public void pagaConta(int valorCentavos) {
    	this.Conta -= valorCentavos;
    }
    
    public String toString() {
    	return String.format("%s %d %d", nomeDaCantina, Quantidade, Conta);
    }
}
