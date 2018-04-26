package lab2;

public class Saude {
String saudeMental = "boa", saudeFisica = "boa";

public Saude(){
	this.saudeFisica = saudeFisica;
	this.saudeMental = saudeMental;
}

public void defineSaudeMental(String valor) {
	this.saudeMental = valor;
}
public void defineSaudeFisica(String valor) {
	this.saudeFisica = valor;
}

public String getStatusGeral(){
	if(this.saudeFisica.equals("boa") && this.saudeMental.equals("boa")) {
		return "boa";
	}
	
	else if (this.saudeFisica.equals("boa") || this.saudeMental.equals("boa")) {
		return "ok";
	}
	
	else {
		return "fraca";
	}
}
	
}
