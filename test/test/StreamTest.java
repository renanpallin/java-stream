package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import streams.Streams;

public class StreamTest {

	@Test
	public void test() {
		String mensagemAmigavel = "Não foi encontrado nenhuma sequência de caracteres com "
	    		+ "as caracteríscticas necessárias =(";

		assertEquals("e", Streams.findChar("aAbBABacafe"));
		assertEquals("e", Streams.findChar("aAbBABacafevilo"));
		assertEquals("A", Streams.findChar("abA"));
		assertEquals(mensagemAmigavel, Streams.findChar("rtytd"));
		assertEquals(mensagemAmigavel, Streams.findChar(""));
		assertEquals(mensagemAmigavel, Streams.findChar("aAbBABacafeabagsdfaged"));
		assertEquals("u", Streams.findChar("aAbBokuABacafe"));
	}
}
