package classes;

public class Comerciantes {
	
	private String nome;
	private long documento;
	private char tipoComerciante;
	public double quantidadeAlimento;
	public String alimento;
	
	//CONSTRUTOR
	
	public Comerciantes() {
		
	}
	
	//SOBRECARGA

	public Comerciantes(long documento, char tipoComerciante) {
		this.documento = documento;
		this.tipoComerciante = tipoComerciante;
	}

	//ENCAPSULAMENTO
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getDocumento() {
		return documento;
	}

	public void setDocumento(long documento) {
		this.documento = documento;
	}

	public char getTipoComerciante() {
		return tipoComerciante;
	}

	public void setTipoComerciante(char tipoComerciante) {
		this.tipoComerciante = tipoComerciante;
	}
	

	//METODOS
	
	
	
	public void alimento(String alimento) {
		
	}

	public void quantidade(double quantidadeAlimento) {
		
	}
}



