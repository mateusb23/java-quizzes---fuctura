package exercicio1modulo3.application;

import java.util.Comparator;

import exercicio1modulo3.services.ServiceAddNumbers;

public class Program {

	public static void main(String[] args) {

        var serviceAddNumbers = new ServiceAddNumbers();

       serviceAddNumbers.insertValues();

       serviceAddNumbers.getNumberList().stream()
               .filter(n -> n % 2 == 0)
               .sorted(Comparator.naturalOrder())
               .forEach(System.out::println);

       serviceAddNumbers.getNumberList().stream()
               .filter(n -> n % 2 != 0)
               .sorted(Comparator.reverseOrder())
               .forEach(n -> System.out.println(n));

   }
	
}
