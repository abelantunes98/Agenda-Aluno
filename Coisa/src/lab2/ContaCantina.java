package lab2;
import java.util.ArrayList;

public class ContaCantina {
	String nomeDaCantina;
	int Conta = 0;
	int Quantidade = 0;
	ArrayList<String> ArrayDetalhes = new ArrayList();
	
	public ContaCantina(String nomeDaCantina) {
		this.nomeDaCantina = nomeDaCantina;
		this.Conta = Conta;
		this.Quantidade = Quantidade;
	}
	
	public void cadastrarLanche(int qtdItens, int valorCentavos, String detalhes){
		this.Conta += (qtdItens * valorCentavos);
    	this.Quantidade += qtdItens;
    	this.ArrayDetalhes.add(detalhes);
	}
	
	public String listarDetalhes(){
		String saida = "";
		for (int i = (this.ArrayDetalhes.size() - 1) ; i >= (this.ArrayDetalhes.size() - 5) ; i--){
		 saida += (this.ArrayDetalhes.get(i)) + " \n";
		}
		return saida;
		
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
