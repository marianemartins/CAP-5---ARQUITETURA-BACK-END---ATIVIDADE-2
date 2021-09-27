package model;

public class Teatro {
	
	private int id;
	private String nome;
	private String peca;
	
	
	public Teatro(int id, String nome, String peca) {
		super();
		this.id = id;
		this.nome = nome;
		this.peca = peca;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPeca() {
		return peca;
	}
	public void setPeca(String peca) {
		this.peca = peca;
	}

}
