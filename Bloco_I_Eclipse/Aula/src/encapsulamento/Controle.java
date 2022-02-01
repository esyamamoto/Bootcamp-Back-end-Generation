package encapsulamento;

public class Controle implements intercontrole {

	//ATRIBUTOS CLASSE
	
	private int vol;
    private boolean ligado;
    private int canal;

    
    //METODO COSNTRUTOR
    
    public Controle() {
        this.vol=50;
        this.ligado=false;
    }
	
  //GETERS E SETERS 
     
		
	public int getVol() {
		return vol;
	}

	public void setVol(int vol) {
		this.vol = vol;
	}

	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		this.canal = canal;
	}

	@Override
	public void ligar() {
		if(this.ligado==false)
			this.ligado=true;
		
	}
	
	
	
//METODO STATUS
    
    public void status() 
    {
        System.out.println("A tv esta ligada? "+ligado);
        System.out.println("O volume esta em "+vol+"%");
        System.out.println("Esta sicronizado no canal "+canal);
    }

	@Override
	public void desligar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void maisVol() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void menosVol() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void canalUp() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void canalDown() {
		// TODO Auto-generated method stub
		
	} 
	
}

	
	
	