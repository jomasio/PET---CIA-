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
	private String cep;
	private String tel;
    private String cpf;
    private String sexo;
    
    //construtor da classe cliente
	public cadastroCliente() {
		super();
	}
	public cadastroCliente(String nome, String endereco, String bairro,
			String cidade, String estado, String cep, String tel, String cpf,
			String sexo) {
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
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
    
    
}

