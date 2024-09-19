import Produto.Produto;

class Nomes{
	//Inserindo os Atributos da pessoa.
	private String nome;
	private String sobrenome;
	private double altura;
	private int idade;
	
	//Construtor
	public Nomes(String nome,  String sobrenome,double altura, int idade) {
		this.nome = nome;
		this.altura = altura;
		this.idade = idade;
		this.sobrenome=sobrenome;
		}
	//Usando o get para acessar os Atributos.
	public String getNome() {
		return nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public int getIdade() {
		return idade;
	}
	public double getAltura() {
		return altura;
	}
}

public class Nome{
	public static void main(String[] args) {
		//Instanciar o mostrador do email gerado para o indivíduo.
		Nomes n1 = new Nomes ("João", "Silva", 1.98, 14/12/2000);
		Nomes n2 = new Nomes ("Paulo", "Pereira", 1.54, 25/05/2007);
		
		//Revelando os dados e o email;Métodos.
		System.out.println("Nome: " + n1.getNome() +" "+ n1.getSobrenome());
		System.out.println("Seu email é: " + n1.getNome() + "." +n1.getSobrenome() + "@domínio.com");
		System.out.println("Nome: " + n2.getNome() +" "+ n2.getSobrenome());
		System.out.println("Seu email é: " + n2.getNome() + "." +n2.getSobrenome() + "@domínio.com");
		//Instanciar o Mostrador do Produto
				
				Produto p = new Produto ("Pão","Panco",2.80, 4.75);
				
				//Mostrando os métodos
				System.out.println("\nNome do produto: " + p.getProduto());
				System.out.println("Marca do produto: " + p.getMarca());
				System.out.println("Valor do produto:R$" + p.getValorCompra());
				System.out.println("Valor de venda do produto:R$" +p.getValorVenda());
				System.out.println("Lucro encima do produto: R$" +p.getLucro());
		}
}
