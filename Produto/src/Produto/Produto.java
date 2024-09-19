package Produto;

public class Produto{
	
		//Atributos inseridos de forma privada.
		private String produto;
		private String marca;
		private double valorCompra;
		private double valorVenda;
		private double lucro;
		
		//Construtor.
		public Produto(String produto,String marca, double valorCompra, double valorVenda ) {
			this.produto = produto;
			this.marca = marca;
			this.valorCompra = valorCompra;
			this.valorVenda = valorVenda;
		}
		//Método para calculo de lucro.
		private double lucro() {
			return valorVenda - valorCompra;
		}
		private String produto() {
			return produto;
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


