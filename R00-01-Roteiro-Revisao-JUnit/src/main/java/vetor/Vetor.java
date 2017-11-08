package vetor;

import java.util.Comparator;

/**
 * Implementação de um vetor de objetos simples para exercitar os conceitos de
 * Generics.
 * 
 * @author Adalberto
 * @param <T>
 *
 */
public class Vetor<T extends Comparable<T>> {

	// O array interno onde os objetos manipulados sÃ£o guardados
	   private T[] arrayInterno;

	   // O tamanho que o array interno terÃ¡
	   private int tamanho;

	   // Indice que guarda a proxima posiÃ§Ã£o vazia do array interno
	   private int indice;

	   // O Comparators a serem utilizados
	   private Comparator<T> comparadorMaximo;
	   private Comparator<T> comparadorMinimo;

	   public Vetor(int tamanho) {
	      super();
	      this.tamanho = tamanho;
	      this.indice = -1;
	      this.arrayInterno = (T[]) new Comparable[tamanho];
	   }

	   public void setComparadorMaximo(Comparator<T> comparadorMaximo) {
	      this.comparadorMaximo = comparadorMaximo;
	   }

	   public void setComparadorMinimo(Comparator<T> comparadorMinimo) {
	      this.comparadorMinimo = comparadorMinimo;
	   }

	   // Insere um objeto no vetor
	   public void inserir(T o) {
	      this.arrayInterno[++this.indice] = o;
	   }

	   // Remove um objeto do vetor
	   public T remover(T o) {
		   T result = null;
		   boolean achou = false;
		   int i = 0;
		   while (i <= indice && !achou) {
			   if (arrayInterno[i].equals(o)) {
				   result = arrayInterno[i];
				   arrayInterno[i] = arrayInterno[indice];
				   arrayInterno[indice] = null;
				   indice--;
				   achou = true;
				   i++;
				   } else {
					   i++;   
				   }
			   };
			   return result;
		}
	   
	   // Procura um elemento no vetor
	   public T procurar(T o) {
	      for (T t : arrayInterno) {
	         if (t.equals(o)) {
	            return t;
	         }
	      }
	      return null;
	   }

	   // Diz se o vetor estÃ¡ vazio
	   public boolean isVazio() {
	      return indice == -1;
	   }

	   // Diz se o vetor estÃ¡ cheio
	   public boolean isCheio() {
	      return indice == this.arrayInterno.length - 1;
	   }

	   public T maximo() {
	      T resp = null;
	      if (this.indice != -1) {
	         resp = arrayInterno[0];
	         for (int i = 0; i <= indice; i++) {
	            if (comparadorMaximo.compare(resp, arrayInterno[i]) < 0) {
	               resp = arrayInterno[i];
	            }
	         }
	      }
	      return resp;
	   }

	   public T minimo() {
	      T resp = null;
	      if (this.indice != -1) {
	         resp = arrayInterno[0];
	         for (int i = 0; i <= indice; i++) {
	            if (comparadorMinimo.compare(resp, arrayInterno[i]) < 0) {
	               resp = arrayInterno[i];
	            }
	         }
	      }
	      return resp;
	   }

	}

	class ComparadorMaximo implements Comparator<Aluno> {

	   @Override
	   public int compare(Aluno o1, Aluno o2) {
	      return (int) (o1.getMedia() - o2.getMedia());
	   }

	}

	class ComparadorMinimo implements Comparator<Aluno> {

	   @Override
	   public int compare(Aluno o1, Aluno o2) {
	      return (int) (o2.getMedia() - o1.getMedia());
	   }

	}
