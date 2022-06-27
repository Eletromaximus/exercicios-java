package exercicioProposto;

import java.util.Arrays;
import java.util.List;
// import java.util.function.Consumer;
import java.util.stream.Collectors;

public class ExerciciosStreamApi {
  public static void main(String[] args) {
    List<String> numerosAleatorios = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

    System.out.println("Imprima todos os elementos dessa lista de String: ");

    // numerosAleatorios.stream().forEach(new Consumer<String>() {
    //   @Override
    //   public void accept(String s) {
    //     System.out.println(s);
    //   }
    // });

    // numerosAleatorios.stream().forEach(s -> System.out.println(s));

    numerosAleatorios.stream().forEach(System.out::println);

    System.out.println("Pegue os 5 primeiros número e coloque dentro de um Set: ");
    numerosAleatorios.stream()
      .limit(5)
      .collect(Collectors.toSet())
      .forEach(System.out::println);
    // Set não aceita números repetidos
  }
}
