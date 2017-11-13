package produto;

import java.util.ArrayList;

/**
 * Classe que representa um repositório de produtos usando ArrayList como
 * estrutura sobrejacente. Alguns métodos (atualizar, remover e procurar) ou
 * executam com sucesso ou retornam um erro. Para o caso desde exercício, o erro
 * será representado por uma RuntimeException que não precisa ser declarada na
 * clausula "throws" do mos metodos.
 *
 * @author Adalberto
 */
public class RepositorioProdutoArrayList implements IrepositorioProduto<Produto> {

	/**
	 * A estrutura onde os produtos sao mantidos. Voce nao precisa se preocupar
	 * por enquanto com o uso de generics em ArrayList.
	 */
	@SuppressWarnings("rawtypes")
	private ArrayList produtos;

	/**
	 * A posicao do ultimo elemento inserido no array de produtos. o valor
	 * inicial é -1 para indicar que nenhum produto foi ainda guardado no array.
	 */
	private int index = -1;

	@SuppressWarnings("rawtypes")
	public RepositorioProdutoArrayList(int size) {
		super();
		this.produtos = new ArrayList();
	}

	/**
	 * Recebe o codigo do produto e devolve o indice desse produto no array ou
	 * -1 caso ele nao se encontre no array. Esse método é util apenas na
	 * implementacao com arrays por questoes de localizacao. Outras classes que
	 * utilizam outras estruturas internas podem nao precisar desse método.
	 * 
	 * @param codigo
	 * @return
	 */
	private int procurarIndice(int codigo) {
		return this.produtos.indexOf(new Produto(codigo, null, 0.0, null));
	}

	/**
	 * Recebe o codigo e diz se tem produto com esse codigo armazenado
	 * 
	 * @param codigo
	 * @return
	 */
	public boolean existe(int codigo) {
		return this.produtos.contains(new Produto(codigo, null, 0.0, null));
	}

	/**
	 * Insere um novo produto (sem se preocupar com duplicatas)
	 */
	@SuppressWarnings("unchecked")
	public void inserir(Produto produto) {
		if (produto != null) this.produtos.add(produto);
	}

	/**
	 * Atualiza um produto armazenado ou retorna um erro caso o produto nao
	 * esteja no array. Note que, para localizacao, o código do produto será
	 * utilizado.
	 * @throws FileNotFoundException 
	 */
	@SuppressWarnings("unchecked")
	public void atualizar(Produto produto) {
		if (produto != null) {
			int index = this.procurarIndice(produto.getCodigo());
			if (index == -1) {
				throw new RuntimeException();
			}
			this.produtos.set(index, produto);
		} else {
			throw new RuntimeException("Erro no objeto que foi passado par ao m�todo.");
		}
		
	}

	/**
	 * Remove produto com determinado codigo, se existir, ou entao retorna um
	 * erro, caso contrário. Note que a remoção NÃO pode deixar "buracos" no
	 * array.
	 * 
	 * @param codigo
	 * @throws FileNotFoundException 
	 */
	public void remover(int codigo) {
		if (this.existe(codigo)) {
			this.produtos.remove(new Produto(codigo, null, 0.0, null));
		} else {
			throw new RuntimeException("O produto n�o existe.");
		}
	}

	/**
	 * Retorna um produto com determinado codigo ou entao um erro, caso o
	 * produto nao esteja armazenado
	 * 
	 * @param codigo
	 * @return
	 * @throws FileNotFoundException 
	 */
	public Produto procurar(int codigo) {
		if (this.existe(codigo)) {
			int indice = this.procurarIndice(codigo);
			return (Produto) this.produtos.get(indice);
		} else {
			throw new RuntimeException("O produto n�o existe.");
		}
	
	}
}
