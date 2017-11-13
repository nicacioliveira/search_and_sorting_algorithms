package produto;

public class RepositorioProduto implements IrepositorioProduto {

	private Produto[] produtos;
	private int index = -1;
	
	public RepositorioProduto() {
		this.produtos = new Produto[10];
	}
	
	public RepositorioProduto(int tamanho) {
		this.produtos = new Produto[tamanho];
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
	@Override
	public void inserir(Produto produto) {
		if (this.produtos.length-1 == this.index) {
			Produto[] novoRep = new Produto[this.produtos.length*2];
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
	public void atualizar(Produto produto) {
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
		
		Produto[] produtos = new Produto[this.produtos.length-1];
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
