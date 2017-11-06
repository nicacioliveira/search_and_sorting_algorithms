package vetor;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestVetor {

	private Vetor<Aluno> vetor1;
	private ComparadorMaximo comparadorMaximo;
	private ComparadorMinimo comparadorMinimo;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		vetor1 = new Vetor<>(10);
		comparadorMaximo = new ComparadorMaximo();
		comparadorMinimo = new ComparadorMinimo();
		vetor1.setComparadorMaximo(comparadorMaximo);
		vetor1.setComparadorMinimo(comparadorMinimo);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testInserir() {
		Aluno aluno = new Aluno("Nicácio", 10.5);
		vetor1.inserir(aluno);
	}

	@Test
	public void testRemover() {
		Aluno aluno = new Aluno("Lucas", 5.5);
		vetor1.inserir(aluno);
		vetor1.remover(aluno);
		assertTrue(vetor1.isVazio());
	}

	@Test
	public void testProcurar() {
		Aluno aluno = new Aluno("Nicácio", 10.5);
		vetor1.inserir(aluno);
		assertNotNull(vetor1.procurar(aluno));
	}

	@Test
	public void testIsVazio() {
		assertTrue(vetor1.isVazio());
	}

	@Test
	public void testIsCheio() {
		Aluno aluno = new Aluno("Nicácio", 10.5);
		for (int i = 0; i < 10; i++) vetor1.inserir(aluno);
		assertTrue(vetor1.isCheio());
	}

	@Test
	public void testMaximo() {
		Aluno aluno1 = new Aluno("Nicácio", 10.5);
		Aluno aluno2 = new Aluno("Oliveiros", 12);
		vetor1.inserir(aluno1);
		vetor1.inserir(aluno2);
		Aluno alunoMaximo = vetor1.maximo();
		assertEquals(aluno2, alunoMaximo);
	}

	@Test
	public void testMinimo() {
		Aluno aluno1 = new Aluno("Nicácio", 10.5);
		Aluno aluno2 = new Aluno("Oliveiros", 12);
		vetor1.inserir(aluno1);
		vetor1.inserir(aluno2);
		Aluno alunoMinimo = vetor1.minimo();
		assertEquals(aluno1, alunoMinimo);
	}

}
