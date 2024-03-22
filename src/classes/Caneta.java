package classes;

public class Caneta {
	String cor;
	String marca;
	double carga;
	boolean tampada=true;
	
	public void setCor(String cor) {
		this.cor=cor;
	}
	public String getCor() {
		return this.cor;
	}
	
	
	public void setMarca(String marca) {
		this.marca= marca;
	}
	public String getMarca() {
		return this.marca;
	}
	

	public void setCarga( double carga) {
		this.carga=carga;
	}
	public double getCarga() {
		return this.carga;
	}
	
	

	public void setTampada(boolean tampada) {
		this.tampada=true;
	}
	public boolean getTampada() {
		return this.tampada;
	}
	
	//construtores
	public Caneta() { 
	 
	}
	
	
	public Caneta(String cor) {
	this.cor=cor; 
	this.tampada=true;
	}
	public Caneta(String cor,String marca, double carga) {
		this.cor=cor;
			this.marca=marca;
				this.carga=carga;
	
	}
	
    public String toString() {
    	return "\n cor:" + this.cor
    		+"\n Marca:" + this.marca
    		+"\n Carga:" + this.carga
    		+"\n tampada:" + this.tampada;
    }
	void tampar() {
		this.tampada = true;
}
	void destampar() {
	this.tampada = false;
	}
	void escrever(double cg) {
		if(this.carga == 0) {
			System.out.println("Caneta vazia");}
			else if(this.tampada == true) {
				System.out.println("Destampa a caneta animal");}
				else {
					System.out.println("pode escrever");
						if(this.carga<0) {
		                  this.carga = 0;}
				
			
		} 
	}
       void recarregar(double rc) {
    	  this.carga+= rc;
            if(this.carga>1.0)
            	System.out.println("LOTADO");
       }
       
  
    	   
}
