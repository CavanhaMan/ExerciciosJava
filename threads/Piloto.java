
public class Piloto extends Thread {

	String nome;
	Integer voltas;
	
	public Piloto(String nome, Integer voltas) {
			this.nome = nome;
			this.voltas = voltas;
	}

	public void run() {
		int i = 1;
		while (i <= voltas) {
			System.out.println(nome + " percorreu " + i + " voltas.");
			i++;
		}
		System.out.println(nome + " completou a corrida. \\o/ \\o/  \\o/ \\o/  \\o/ \\o/  \\o/ \\o/ ");
	}
}
