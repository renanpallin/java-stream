package streams;

import java.nio.CharBuffer;
import java.util.LinkedHashSet;
import java.util.PrimitiveIterator.OfInt;
import java.util.Set;
import java.util.stream.IntStream;

public class Streams {

	private static char[] vogais = {'a', 'e', 'i', 'o', 'u'};
	public static void main(String[] args) {
		System.out.println( findChar("aAbBABacafeafie") );
	}
	
	/**
	 * Encontra o primeiro caractere Vogal após uma consoante antecessora
     * a uma vogal que não se repita no restante.
     * @param s: String
     * @return Caractere encontrado ou uma mensagem amigável
	 */
	public static String findChar(String s) {
		char result = findChar(s.chars());
	    if (result != Character.MIN_VALUE)
	      return String.valueOf(result);
	    return "Não foi encontrado nenhuma sequência de caracteres com "
	    		+ "as caracteríscticas necessárias =(";
	}
	
	private static char findChar(IntStream stream) {
	    char prev = Character.MIN_VALUE;
	    char previousPrev = Character.MIN_VALUE;

	    Set<Character> possibleCharsWeWant = new LinkedHashSet<>();
	    
	    OfInt iterator = stream.iterator();
	    while (iterator.hasNext()) {
	      final char current = (char) iterator.next().intValue();
    	  if (isVogal(current) && !isVogal(prev) && isVogal(previousPrev))
    		  possibleCharsWeWant.add(current);
    	  else if (possibleCharsWeWant.contains(current))
	    	  possibleCharsWeWant.remove(current);
	      
	      previousPrev = prev;
	      prev = current;
	    }
	    
	    if (possibleCharsWeWant.isEmpty())
	    	return Character.MIN_VALUE;
	    return possibleCharsWeWant.iterator().next();
	  }

	  private static boolean isVogal(char c) {
		  char cLower = Character.toLowerCase(c);
		  return CharBuffer.wrap(vogais).chars().anyMatch(v -> v == cLower);
	  }

}
