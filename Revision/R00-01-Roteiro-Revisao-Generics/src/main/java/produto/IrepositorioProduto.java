package produto;

public interface IrepositorioProduto<T extends Produto> {
	
	void inserir(T produto);
	
	void atualizar(T produto);
	
	boolean existe(int codigo);
	
	void remover(int codigo);
	
	Produto procurar(int codigo);

	
	
	
}
