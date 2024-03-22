package classes;

public class Principal {
//GABRIEL LUIZ, CHRISTOPHER WILLIAM, DAVI ANDRADE, RAFAEL DOUGLAS :)!!!!!!!!!!!
	public static void main(String[] args) {
		Caneta c1 = new Caneta();
		c1.cor = "preta";
		c1.marca = "bic";
		c1.carga = 1.0;
		
		                                            
		Caneta c2 = new Caneta();
		c2.cor = "amarela";
		c2.marca = "faber";
		c2.carga = 0.3;
		
		
		c1.tampar();
		System.out.println(c1.tampada);
		c1.destampar();
			System.out.println(c1.tampada);
				System.out.println(c1.cor);
					System.out.println(c2.cor);
						System.out.println(c2.tampada);
		c1.escrever(0.2);
		c1.recarregar(c1.carga);
		System.out.println(c1.toString());
		
		Caneta c4=new Caneta();
		Caneta c5=new Caneta("preta");
		Caneta c6=new Caneta("Azul","Bic",0.7);
		
		Caneta c7=new Caneta();
		c7.setCor("azul");
		System.out.println(c7.getCor());
	}

}
