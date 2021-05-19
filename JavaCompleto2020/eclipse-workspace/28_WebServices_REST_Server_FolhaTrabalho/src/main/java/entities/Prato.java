package entities;

public class Prato {
	
	private Integer id;
	private String nome;
	private Integer quantidade;
	private Double preco;
	
	public Prato(Integer id, String nome, Integer quantidade, Double preco) {
		this.id = id;
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Integer getQuantidade() {
		return quantidade;
	}
	
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	
	public Double getPreco() {
		return preco;
	}
	
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	@Override
	public String toString() {
		return "Prato [id=" + id + ", nome=" + nome + ", quantidade=" + quantidade + ", preco=" + preco + "]";
	}
	
}
