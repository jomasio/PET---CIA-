package bloco2;

/*O sistema deve possui também a funcionalidade
 *  de cadastro de animais. Serão necessárias as 
 *  seguintes informações: nome (se existir), idade, 
 *  tipo de animal (cão e gato), preço, data de entrada,
 *   data de saída (Se o animal já estiver sido vendido).
 */

public class cadastroAnimais {
	
	//atributos da classe cadastro de animais
	private String nome ;
	private String idade;
	private String preco;
	private String dataDeEntrada;
	private String dataDeSaida;
	
	
	//construtores da classe cadastro de animais
	public cadastroAnimais() {
		super();
	}

    public cadastroAnimais(String nome, String idade, String preco,
			String dataDeEntrada, String dataDeSaida) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.preco = preco;
		this.dataDeEntrada = dataDeEntrada;
		this.dataDeSaida = dataDeSaida;
	}

    //gets e sets da classe cadastro de animais
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public String getPreco() {
		return preco;
	}

	public void setPreco(String preco) {
		this.preco = preco;
	}

	public String getDataDeEntrada() {
		return dataDeEntrada;
	}

	public void setDataDeEntrada(String dataDeEntrada) {
		this.dataDeEntrada = dataDeEntrada;
	}

	public String getDataDeSaida() {
		return dataDeSaida;
	}

	public void setDataDeSaida(String dataDeSaida) {
		this.dataDeSaida = dataDeSaida;
	}

	
}
