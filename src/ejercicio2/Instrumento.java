package ejercicio2;

public class Instrumento {
	public String tipo;
	
	public void tocar(Violin violin) {
		tipo = "violin";
		
		System.out.println("Esta tocando un " + tipo + " y tiene cuerdas");
		
	}
	public void tocar(Guitarra guitarra) {
		tipo = "guitarra";
		
		System.out.println("Esta tocando una " + tipo + " y tiene cuerdas");
		
	}
	public void tocar(Piano piano) {
		tipo = "piano";
		
		System.out.println("Esta tocando un " + tipo + " y no tiene cuerdas");
		
	}
}
