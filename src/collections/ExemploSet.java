package collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploSet {
  public static void main (String[] args) {
    System.out.println("Crie um conjunto e adione as notas");
    Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d));

    System.out.println("Confira se a nota está no conjunto" + notas.contains(5d));

    System.out.println("Exiba a maior nota" + Collections.max(notas));

    System.out.println("Exiba a menor nota" + Collections.min(notas));

    Iterator<Double> iterator = notas.iterator();
    Double soma = 0.0;
    while(iterator.hasNext()) {
      Double next = iterator.next();
      soma += next;
    }

    System.out.println("Exiba a soma dos valores" + soma);

    System.out.println("Exiba a média das notas" + (soma/notas.size()));
    //HashSet é mais leve e mais perfomatico
    // Mas é mais limitado
    System.out.println("Remova as notas menores que 7 e exiba a lista: ");

    Iterator<Double> iterator1 = notas.iterator();
    while(iterator1.hasNext()) {
      Double next = iterator1.next();
      if (next < 7) iterator1.remove();
    }
    System.out.println(notas);

    //Evoluindo essa lista
    Set<Double> notas2 = new LinkedHashSet<>();
    notas2.add(7d);
    notas2.add(8.5);
    notas2.add(9.3);
    notas2.add(5d);
    notas2.add(7d);
    notas2.add(0d);
    notas2.add(3.6);
    //Não aceita elementos repetidos
    System.out.println(notas2);
    Set<Double> notas3 = new TreeSet<>(notas2);
    //Está ordenado, pode observar que sim
    System.out.println(notas3);
    //primeiro conjunto apagado
    notas.clear();

    System.out.println("Confira se o conjunto está vazio " + notas.isEmpty());
    System.out.println("Confira se o conjunto está vazio " + notas2.isEmpty());
    System.out.println("Confira se o conjunto está vazio " + notas3.isEmpty());
  }
}
