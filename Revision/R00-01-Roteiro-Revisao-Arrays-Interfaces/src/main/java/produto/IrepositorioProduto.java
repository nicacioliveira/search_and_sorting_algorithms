package produto;

public interface IrepositorioProduto {
	
	void inserir(Produto produt0);
	
	void atualizar(Produto produto);
	
	boolean existe(int codigo);
	
	void remover(int codigo);
	
	Produto procurar(int codigo);
	
	
	
}
