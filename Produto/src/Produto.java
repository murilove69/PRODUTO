class Produto1{
	
		//Atributos inseridos de forma privada.
		private String produto;
		private String marca;
		private double valorCompra;
		private double valorVenda;
		private double lucro;
		
		//Construtor.
		public Produto1(String produto,String marca, double valorCompra, double valorVenda ) {
			this.produto = produto;
			this.marca = marca;
			this.valorCompra = valorCompra;
			this.valorVenda = valorVenda;
		}
		//Método para calculo de lucro.
		private double lucro() {
			return valorVenda - valorCompra;
		}
		
		//Get para acessar os atributos privados.
		public String getProduto() {
			return produto;
		}
		
		public String getMarca() {
			return marca;
		}
		public double getValorCompra() {
			return valorCompra;
		}
		public double getValorVenda() {
			return valorVenda;
		}
		public double getLucro() {
			return lucro();
		}
}
public class Produto {

	public static void main(String[] args) {
		//Instanciar o Mostrador do Produto
		Produto1 p = new Produto1 ("Pão","Panco",2.5, 3.5);
		
		//Mostrando os métodos
		System.out.println("Nome do produto: " + p.getProduto());
		System.out.println("Marca do produto: " + p.getMarca());
		System.out.println("Valor do produto:R$" + p.getValorCompra());
		System.out.println("Valor de venda do produto:R$" +p.getValorVenda());
		System.out.println("Lucro encima do produto: R$" +p.getLucro());

	}

}
