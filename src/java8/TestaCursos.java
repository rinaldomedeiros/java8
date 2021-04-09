package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestaCursos {

	public static void main(String[] args) {

		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));
		
		cursos.sort(Comparator.comparing(Curso::getAlunos));
	
//		cursos.forEach(c -> System.out.println(c.getNome()));
		
//		cursos.stream()
//		   .filter(c -> c.getAlunos() > 50)
//		   .map(Curso::getAlunos)
//		   .forEach(System.out::println);

//		cursos.stream()
//		.filter(c -> c.getAlunos() > 50)
//		.findFirst()
//		.ifPresent(c -> System.out.println(c.getNome()));

//		cursos.stream()
//		   .mapToInt(c -> c.getAlunos())
//		   .average()
//		   .ifPresent(System.out::println);
//		   
	

		List<Curso> stream = cursos.stream()
				   .filter(c -> c.getAlunos() > 50)
				   .collect(Collectors.toList());
		
		stream.forEach(System.out::println);
		
	}

}
