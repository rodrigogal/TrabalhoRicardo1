package entities;

public class TrabalhoVetor {
	private int tamanho;
	private String[]vetor;
	
	public TrabalhoVetor(int tamanho) {
		this.tamanho = tamanho;
		this.vetor = new String[tamanho];
	}
	
	public int ReceberTamanho() {
		return tamanho;
	}
	
	public void Inserir(String nome) {
		for(int i = 0; i < ReceberTamanho(); i++) {
			if(vetor[i] == null) {
				vetor[i] = nome;
				break;
			}
		}
	}
	
	public String AcharElementoVetor(int posicaoVetor) {
		return vetor[posicaoVetor];
	}
	
	public void Retirar(int posicaoVetor) {
		vetor[posicaoVetor] = null;
		if(posicaoVetor != ReceberTamanho() - 1) {
			if((vetor[posicaoVetor + 1]) != null) {
				for(int i = (posicaoVetor + 1); i < ReceberTamanho(); i++) {
					vetor[i - 1] = vetor[i];
					vetor[i] = null;
				}
			}
		}
	}
	

	
	
	
}

