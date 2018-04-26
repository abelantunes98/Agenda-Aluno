package lab2;

public class Disciplina {
	public int Horas = 0;
	private String nomeDisciplina;
	private int Media;
	double[] Notas = new double[4];
	
	public Disciplina(String nomeDisciplina){
		this.nomeDisciplina = nomeDisciplina;
		this.Media = Media;
		this.Notas = Notas;
		this.Horas = Horas;
	}
	
	private void cadastraHoras(int horas){
		this.Horas += horas;
	}
	
	public void cadastraNota(int nota, double valorNota) {
		this.Notas[nota - 1] = valorNota;
		
	}
	
	public boolean aprovado() {
		
		for (double Nota:this.Notas) {
			this.Media += Nota;
		}
		
		if (this.Media >= 7){
			return true;
		}
		
		else {
			return false;
		}
		
		
	}
	
	private String Conversor(double[] array) {
		 String Saida = "[";
		
		for (double num : array) {
			Saida += String.valueOf(num);
		}
		
		return Saida;
	}
	
	public String toString(){
		return String.format("%s %d %.1f %s", this.nomeDisciplina, this.Horas, this.Media, Conversor(Notas));
		
	}
	
}

