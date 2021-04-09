package java8;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class TestaDatas {
	public static void main(String[] args) {
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);
		
		LocalDate dataFutura = LocalDate.of(2099, Month.JANUARY, 25);
		System.out.println(dataFutura);
	
		Period periodo = Period.between(hoje, dataFutura);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String dataFormatada = formatter.format(hoje);
		
		System.out.println(dataFormatada);
		
	}
}
