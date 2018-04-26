package lab2;

import java.util.Arrays;

public class Disciplina {
	public int Horas = 0;
	private String nomeDisciplina;
	private double Media;
	double[] Notas = new double[4];
	
	public Disciplina(String nomeDisciplina){
		this.nomeDisciplina = nomeDisciplina;
		this.Media = Media;
		this.Notas = Notas;
		this.Horas = Horas;
	}
	
	public void cadastraHoras(int horas){
		this.Horas += horas;
	}
	
	public void cadastraNota(int nota, double valorNota) {
		this.Notas[nota - 1] = valorNota;
	}
	
	private double CalculaMedia(double[] Notas) {
		double media = 0;
		
		for (double Nota:this.Notas) {
			media += (Nota / 4.0);
		}
		
		return media; 
	}
	
	public boolean aprovado() {
		
		double exemplo = CalculaMedia(this.Notas);
		
		if (exemplo >= 7){
			return true;
		}
		
		else {
			return false;
		}
		
		
	}
	
	public String toString(){
		return String.format("%s %d %.1f %s", this.nomeDisciplina, this.Horas, CalculaMedia(this.Notas),  Arrays.toString(Notas));
		
	}
	
}

