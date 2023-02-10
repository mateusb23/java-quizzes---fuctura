package application;

import model.ServiceAddNumbers;

import java.util.Comparator;

public class Program {

    public static void main(String[] args) {

         var serviceAddNumbers = new ServiceAddNumbers();

        serviceAddNumbers.insertValues();

        serviceAddNumbers.getNumberList().stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);

        serviceAddNumbers.getNumberList().stream()
                .filter(n -> n % 2 != 0)
                .sorted(Comparator.reverseOrder())
                .forEach(n -> System.out.println(n));


    }

}

