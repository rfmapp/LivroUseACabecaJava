package capitulo1;

/**
 * Programa que simula a canção/brincadeira de garrafas de cerveja.
 *  
 * @author rafael
 *
 */

/* Definição da Classe. */
public class BeerSong {
	/* Definição do método principal da classe. */
	public static void main(String[] args) {
		
		/* Declaração e atribuição de valores das variáveis. */
		int beerNum = 99;
		String word = "bottles";
		
		/* Estrutura de controle. */
		while (beerNum > 0) {
			
			/* 
			 * Testa se a quantidade de cerveja é igual a 1, para que 
			 * a palavra fique no singular.
			 */
			if (beerNum == 1) {
				word = "bottle";
			}
			
			/* Série de mensagens sobre a brincadeira. */
			System.out.println(beerNum + " " + word + " of beer on the wall!");
			System.out.println(beerNum + " " + word + " of beer.");
			System.out.println("Take one down.");
			System.out.println("Pass it around.");
			
			/* Decrementa a quantidade de cervejas. */
			beerNum = beerNum - 1;
			
			/* Exibe mensagem que finaliza a brincadeira. */
			if (beerNum <= 0) {
				System.out.println("No more bottles of beer on the wall.");
			}
		}

	}

}
