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

public class Nome {

	public static void main(String[] args) {
		//Instanciar o mostrador do email gerado para o indivíduo.
		Nomes n = new Nomes ("João", "Silva", 1.98, 14/12/2000);
		
		//Revelando os dados e o email;Métodos.
		System.out.println("Nome: " + n.getNome() +" "+ n.getSobrenome());
		System.out.println("Seu email é:" + n.getNome() + "." +n.getSobrenome() + "@domínio.com");
}

	}

