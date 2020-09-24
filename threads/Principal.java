public class Principal {

	public static void main(String[] args)   throws Exception {
		int voltas = 72;
		Piloto piloto1 = new Piloto("Airton Senna",voltas);
		Piloto piloto2 = new Piloto("Michael Schumacher",voltas);
		Piloto piloto3 = new Piloto("Rubinho Pé de Xinelo",voltas);

		System.out.println(" \\o/ \\o/ \\o/ \\o/  A corrida maluca COMEÇOU!  \\o/ \\o/ \\o/ \\o/\n\n");

		piloto3.start();
		piloto1.start();
		piloto2.start();
		
		piloto3.join();
		piloto1.join();
		piloto2.join();

		System.out.println("\n \n \\o/ \\o/ \\o/ \\o/  A corrida maluca TERMINOU!  \\o/ \\o/ \\o/ \\o/\n\n");
	}

}
