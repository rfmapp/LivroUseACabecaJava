package capitulo1;

/**
 * Programa que cria frases com o uso de palavras aleatórias.
 * 
 * @author rafael
 *
 */
public class PhraseOMatic {

	public static void main(String[] args) {
		
		/* Definição de três listas de palavras variadas. */
		String[] wordListOne = {"24/7", "várias camadas", "30.000 pés", "B-to-B", "todos ganham", "front-end", 
		"baseado na web", "difundido", "inteligente", "seis sigma", "caminho crítico", "dinâmico"};
		
		String[] wordListTwo = {"hebilitado", "adesivo", "valor agregado", "orientado", "central", "distribuído", 
		"agrupado", "solidificado", "independente da máquina", "posicionado", "em rede", "dedicado", "alavancado", 
		"alinhado", "destinado", "compartilhado", "cooperativo", "acelerado"};
		
		String[] wordListThree = {"processo", "ponto máximo", "solução", "arquitetura", "habilitação no núcleo", 
		"estratégia", "mindshare", "portal", "espaço", "visão", "paradigma", "missão"};
		
		/* Definição de variáveis que recebem como valor o tamanho das listas criadas acima. */
		int oneLength = wordListOne.length;
		int twoLength = wordListTwo.length;
		int threeLength = wordListThree.length;
		
		/* Definição das três palavras que serão utilizadas na construção da frase.
		 * É utilizada a função 'random' do java em conjunto com as variáveis que 
		 * possuem o tamanho de cada lista de palavras (quantidade de palavras 
		 * em cada lista). Como 'random' utiliza um número na faixa entre 0 
		 * e 1, multimplicamos pela quantida de palavras de cada lista. */		
		int rand1 = (int) (Math.random() * oneLength);
		int rand2 = (int) (Math.random() * twoLength);
		int rand3 = (int) (Math.random() * threeLength);
		
		/* Definimos uma variável que recebe o conjunto de três palavras escolhidas aleatóriamente. */
		String phrase = wordListOne[rand1] + " " + 
		wordListTwo[rand2] + " " + wordListThree[rand3];
		
		/* Exibimos a frase final. */
		System.out.println("Precisamos de " + phrase);

	}

}
