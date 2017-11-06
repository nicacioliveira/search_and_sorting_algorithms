package vetor;

import vetor.Aluno;
import vetor.Vetor;

public class TestarVetor {

	public static void main(String[] args) {
		Vetor<Aluno> vetor = new Vetor<Aluno>(20);
		
		vetor.inserir(new Aluno("Nicacio", 9.5));
		vetor.inserir(new Aluno("Milene", 9));
		vetor.inserir(new Aluno("Francis", 10));
		vetor.inserir(new Aluno("Joao", 5));
		vetor.inserir(new Aluno("Savio", 7));
		
		
		ComparadorMaximo compMax = new ComparadorMaximo();
		ComparadorMinimo compMin = new ComparadorMinimo();
		vetor.setComparadorMaximo(compMax);
		vetor.setComparadorMinimo(compMin);
		
		System.out.println(((Aluno) vetor.maximo()).getNome());
		System.out.println(((Aluno) vetor.minimo()).getNome());
		
		
		
	}
}
