public class ContaLaboratorio {
	private String nomeLaboratorio;	
	private int cota = 2000;
	
	public ContaLaboratorio(String nomeLaboratorio) {
		this.nomeLaboratorio = nomeLaboratorio;
	}
	
	public ContaLaboratorio(String nomeLaboratorio, int cota) {
		this.cota = cota;
		this.nomeLaboratorio = nomeLaboratorio;
	}

	void consomeEspaco(int mbytes) {
		this.cota -= mbytes; 
	}
	
	void liberaEspaco(int mbytes) {
		cota += mbytes;
		
		if (this.cota > 2000) {	// Se ultrapassar os 2000 não aumenta o limite.
		this.cota = 2000;
		}
	}
	
	public boolean atingiuCota() {
		return cota <= 0;
	}
	
	public String toString() {
		return nomeLaboratorio + " " + (2000 - this.cota) + "/2000";
		
	}
	
	
	



}
