package produto;

public class RepositorioProduto<T extends Produto> implements IrepositorioProduto<T> {

	private T[] produtos;
	private int index = -1;
	
	@SuppressWarnings("unchecked")
	public RepositorioProduto() {
		this.produtos = (T[]) new Object[10];
	}
	
	@SuppressWarnings("unchecked")
	public RepositorioProduto(int tamanho) {
		this.produtos = (T[]) new Object[tamanho];
	}
	
	private int procurarIndice(int codigo) {
		int result = -1;
		for (int i = 0; i < index+1; i++) {
			if (this.produtos[i].getCodigo() == codigo) {
				result = i;
				break;
			}
		}
		return result;
	}
	
	
	/**
	 * Inserir levando em conta o tamanho do array. Caso nao seja possivel adicionar
	 * o array é expandido.
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void inserir(T produto) {
		if (this.produtos.length-1 == this.index) {
			T[] novoRep = (T[]) new Object[this.produtos.length*2];
			for (int i=0; i < this.produtos.length; i++) {
				novoRep[i] = this.produtos[i];
			}
			this.produtos = novoRep;
		}
		this.produtos[++index] = produto;
	}

	/**
	 * 
	 */
	@Override
	public void atualizar(T produto) {
		if (produto != null) {
			int index = procurarIndice(produto.getCodigo());
			if (index != -1) {
				this.produtos[index] = produto;
			} else {
				throw new RuntimeException();
			}
		} else {
			throw new RuntimeException();
		}
	}
	
	/**
	 * 
	 */
	@Override
	public boolean existe(int codigo) {
		int result = procurarIndice(codigo);
		boolean resp = result != -1;
		return resp;
	}
	
	/**
	 * Remove um produto e reorganiza o array para remover o buraco da remocao.
	 */
	@Override
	public void remover(int codigo) {
		int indexProduto = this.procurarIndice(codigo);
		if (indexProduto == -1) {
			throw new RuntimeException();
		}
		
		@SuppressWarnings("unchecked")
		T[] produtos = (T[]) new Object[this.produtos.length-1];
		this.produtos[indexProduto] = null;
		int count = 0;
		int i = 0;
		
		while (i < this.produtos.length) {
			
			if (this.produtos[i] != null) {
				produtos[count++] = this.produtos[i];
			}
			
			i++;
		}
		this.index--;
		this.produtos = produtos;
	}

	@Override
	public Produto procurar(int codigo) {
		int index = this.procurarIndice(codigo);
		if (index == -1) {
			throw new RuntimeException();
		}
		Produto produto = this.produtos[index];
		return produto;
	}

}
