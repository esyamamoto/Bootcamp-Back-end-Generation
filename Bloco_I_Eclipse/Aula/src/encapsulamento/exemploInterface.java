package encapsulamento;

public class exemploInterface {
	public static void main (String[] args)
	{
		Controle tv = new Controle ();
		
		tv.ligar();
		tv.canalUp();
		tv.canalDown();
		tv.desligar();
		tv.maisVol();
		tv.menosVol();
		
		tv.status();
		
		
	}
}
