package java8;

import java.util.ArrayList;
import static java.util.Comparator.comparing;
import java.util.List;

public class Teste {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("Casa do código");
		palavras.add("caelum");
	
		//Comparator<String> ordenacao = new OrdenaPorTamanho();
//		palavras.sort((s1, s2) -> s1.length() - s2.length());
//		palavras.sort(Comparator.comparing(s -> s.length()));
//		palavras.sort(comparing(String::length));
		palavras.sort(String.CASE_INSENSITIVE_ORDER);

		
		
//		palavras.forEach(palavra -> System.out.println(palavra));
		palavras.forEach(System.out::println);
	}
}
