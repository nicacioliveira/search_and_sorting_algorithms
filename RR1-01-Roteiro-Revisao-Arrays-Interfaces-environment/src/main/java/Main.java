import produto.ProdutoNaoPerecivel;
import produto.RepositorioProdutoNaoPerecivelArray;

public class Main {

	public static void main(String[] args) {
		
		RepositorioProdutoNaoPerecivelArray repositorioNaoPerecivel = new RepositorioProdutoNaoPerecivelArray(3);
		repositorioNaoPerecivel.inserir(new ProdutoNaoPerecivel(1, "Feijao", 10.50, "Feijao normal", "Qualquer"));
		repositorioNaoPerecivel.inserir(new ProdutoNaoPerecivel(2, "Feijao", 10.50, "Feijao normal", "Qualquer"));
		repositorioNaoPerecivel.inserir(new ProdutoNaoPerecivel(3, "Feijao", 10.50, "Feijao normal", "Qualquer"));
		repositorioNaoPerecivel.inserir(new ProdutoNaoPerecivel(5, "Feijao", 10.50, "Feijao normal", "Qualquer"));
		repositorioNaoPerecivel.inserir(new ProdutoNaoPerecivel(6, "Feijao", 10.50, "Feijao normal", "Qualquer"));
		
		repositorioNaoPerecivel.atualizar(new ProdutoNaoPerecivel(2, "atualizado", 150.5, "atualizada", "atualizacao"));
		
		repositorioNaoPerecivel.existe(10);
		repositorioNaoPerecivel.procurar(1);
		
		repositorioNaoPerecivel.remover(1);
		repositorioNaoPerecivel.remover(2);
		repositorioNaoPerecivel.remover(3);
		repositorioNaoPerecivel.remover(6);
		repositorioNaoPerecivel.remover(5);
		
		
		
		System.out.println("hello world");
	}
	
}
