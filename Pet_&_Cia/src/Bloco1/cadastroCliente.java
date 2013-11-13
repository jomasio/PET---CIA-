package Bloco1;

/*O sistema deve possui a funcionalidade de
cadastro de clientes. Serão necessárias 
as seguintes informações: nome, endereço, bairro,
cidade, estado, cep, tel, cpf e sexo.*/ 

public class cadastroCliente {
	//atributos da classe cliente
	private String nome;
	private String endereco;
	private String bairro;
	private String cidade;
	private String estado;
	private int cep;
	private int tel;
    private int cpf;
    private boolean sexo;
    
    //construtor da classe cliente
	public cadastroCliente() {
		super();
	}
	public cadastroCliente(String nome, String endereco, String bairro,
			String cidade, String estado, int cep, int tel, int cpf,
			boolean sexo) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
		this.tel = tel;
		this.cpf = cpf;
		this.sexo = sexo;
	}
	
	//os gets e sets da classe cliente
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public int getCep() {
		return cep;
	}
	public void setCep(int cep) {
		this.cep = cep;
	}
	public int getTel() {
		return tel;
	}
	public void setTel(int tel) {
		this.tel = tel;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public boolean isSexo() {
		return sexo;
	}
	public void setSexo(boolean sexo) {
		this.sexo = sexo;
	}

    
    
}

