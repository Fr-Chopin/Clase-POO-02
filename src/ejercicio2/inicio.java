package ejercicio2;

public class inicio {

	public static void main(String[] args) {
		Instrumento instrumento = new Instrumento();
		
		Violin stagg = new Violin();
		Guitarra gibson = new Guitarra();
		Piano yamaha = new Piano();
		
		instrumento.tocar(stagg);
		instrumento.tocar(gibson);
		instrumento.tocar(yamaha);

	}

}
