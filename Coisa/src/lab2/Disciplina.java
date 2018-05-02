package lab2;

import java.util.Arrays;

public class Disciplina {
	public int NumeroNotas;
	public int Horas = 0;
	private String nomeDisciplina;
	private double Media;
	public int[] Pesos = new int [0];
	double[] Notas = new double[NumeroNotas];
	
	public Disciplina(String nomeDisciplina){
		this.nomeDisciplina = nomeDisciplina;
		this.Media = Media;
		this.Horas = Horas;
		this.Notas = new double [4];
	}
	public Disciplina(String nomeDisciplina, int NumeroNotas){
		this.nomeDisciplina = nomeDisciplina;
		this.Notas = new double [NumeroNotas];
		this.Horas = Horas;
		this.NumeroNotas = NumeroNotas;
	}
	
	public Disciplina(String nomeDisciplina, int NumeroNotas, int[] Pesos){
		this.nomeDisciplina = nomeDisciplina;
		this.Pesos = Pesos;
		this.Horas = Horas;
		this.Notas = new double [NumeroNotas];
		this.NumeroNotas = NumeroNotas;
	}
	
	public void cadastraHoras(int horas){
		this.Horas += horas;
	}
	
	public void cadastraNota(int nota, double valorNota) {
		this.Notas[nota - 1] = valorNota;
	}
	
	private double CalculaMedia() {
		double media = 0;
		if (this.Pesos.length == 0){
			for (double Nota:this.Notas) {
				media += (Nota / this.Notas.length);
			}
		}
		
		else{
			for (int x = 0; x < this.NumeroNotas; x++){
				media += ((this.Notas[x] * this.Pesos[x]) / 10);
			}
		}
		
		return media; 
	}
	
	public boolean aprovado() {
		
		double media = CalculaMedia();
		
		if (media >= 7){
			return true;
		}
		
		else {
			return false;
		}
		
		
	}
	
	public String toString(){
		return String.format("%s %d %.1f %s", this.nomeDisciplina, this.Horas, CalculaMedia(),  Arrays.toString(Notas));
		
	}
	
}

