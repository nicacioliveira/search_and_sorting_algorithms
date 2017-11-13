package produto;
import static org.junit.Assert.*;

import java.util.Date;
import java.util.GregorianCalendar;

import org.junit.Before;
import org.junit.Test;

public class TestRepositorioProdutos {
	
	private RepositorioProdutoArrayList repositorio;
	
	private RepositorioProdutoPerecivelArray repositorioProdutoPerecivel;
	
	private RepositorioProdutoNaoPerecivelArray repositorioProdutoNaoPerecivel;
	

	
	@Before
	public void setUp() {
		this.repositorio = new RepositorioProdutoArrayList(10);
		this.repositorioProdutoPerecivel = new RepositorioProdutoPerecivelArray(10);
		this.repositorioProdutoNaoPerecivel = new RepositorioProdutoNaoPerecivelArray(10);
	}
	
	@Test
	public void testExiste() {
		assertFalse(repositorio.existe(5));

	}

	@Test
	public void testInserir() {
		repositorio.inserir(new Produto(5,"Feijao",10.0,"Feijão carioca"));
		assertNotNull(repositorio.existe(5));
		
		repositorioProdutoPerecivel.inserir(new ProdutoPerecivel(5, "feijao", 10.0, "feijao", new GregorianCalendar()));
		repositorioProdutoNaoPerecivel.inserir(new ProdutoNaoPerecivel(5, "feijao", 10.0, "feijao", "Qualquer"));
		

	}

	@Test
	public void testAtualizar() {
		repositorio.inserir(new Produto(5,"Feijao",10.0,"Feijão carioca"));
		repositorio.atualizar(new Produto(5,"Feijao",10.0,"Feijão macassar"));
		assertEquals("Feijão macassar",repositorio.procurar(5).getDescricao());
		
		repositorioProdutoPerecivel.inserir(new ProdutoPerecivel(5,"Feijao",10.0,"Feijão carioca", new GregorianCalendar()));
		repositorioProdutoPerecivel.atualizar(new ProdutoPerecivel(5,"Feijao",10.0,"Feijão macassar", new GregorianCalendar()));
		assertEquals("Feijão macassar",repositorio.procurar(5).getDescricao());
		
		repositorioProdutoNaoPerecivel.inserir(new ProdutoNaoPerecivel(5, "feijao", 10.0, "feijao", "Qualquer"));
		repositorioProdutoNaoPerecivel.atualizar(new ProdutoNaoPerecivel(5, "feijao", 10.0, "feijao", "Qualquer"));
		assertEquals("Feijão macassar",repositorio.procurar(5).getDescricao());

	}

	@Test
	public void testRemover() {
		repositorio.inserir(new Produto(5,"Feijao",10.0,"Feijão carioca"));
		repositorio.remover(5);
		//assertNull(repositorio.existe(5));
		assertFalse(repositorio.existe(5));
		
		repositorioProdutoPerecivel.inserir(new ProdutoPerecivel(5,"Feijao",10.0,"Feijão carioca", new GregorianCalendar()));
		repositorioProdutoPerecivel.remover(5);
		//assertNull(repositorio.existe(5));
		assertFalse(repositorioProdutoPerecivel.existe(5));
		
		repositorioProdutoNaoPerecivel.inserir(new ProdutoNaoPerecivel(5, "feijao", 10.0, "feijao", "Qualquer"));
		repositorioProdutoNaoPerecivel.remover(5);
		//assertNull(repositorio.existe(5));
		assertFalse(repositorioProdutoNaoPerecivel.existe(5));
	}

	@Test(expected= RuntimeException.class)
	public void testProcurar() {
		
		assertNull(repositorio.procurar(5));
		repositorio.inserir(new Produto(5,"Feijao",10.0,"Feijão carioca"));
		assertNotNull(repositorio.procurar(5));
		
		repositorioProdutoPerecivel.inserir(new ProdutoPerecivel(5,"Feijao",10.0,"Feijão carioca", new GregorianCalendar()));
		assertNotNull(repositorioProdutoPerecivel.procurar(5));
		
		repositorioProdutoNaoPerecivel.inserir(new ProdutoNaoPerecivel(5, "feijao", 10.0, "feijao", "Qualquer"));
		assertNotNull(repositorioProdutoNaoPerecivel.procurar(5));
	}

}
