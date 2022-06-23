package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class ExemploList {
  public static void main (String[] args) {
    // Antiga maneira de declarar Arrays, antes do java 5
    // List notas = new ArrayList();
    // List<Double> notas= new ArrayList<>(); //diamont operator
    // ArrayList<Double> notas = new ArrayList<>(); // não recomendada, mas possível
    // List<Double> notas = Arrays.asList(7d, 8.5, 9.3); // é valida, porem não é possível remover, nem alterar
    // List<Double> notas = List.of(7d, 8.5, 9.3);
     // assim como a de cima, imutável

    List<Double> notas = new ArrayList<Double>();
    notas.add(7d);
    notas.add(7d);
    notas.add(7d);
    notas.add(7d);
    notas.add(7d);
    notas.add(7d);
    System.out.println(notas.toString());
    
    notas.add(4, 8d);
    System.out.println(notas.toString());
    notas.set(3, 6.0);
    System.out.println(notas);
    // for (Double nota: notas) System.out.println(nota);
    System.out.println(notas.get(2));
    System.out.println(Collections.max(notas));
    System.out.println(Collections.min(notas));
    Iterator<Double> iterator = notas.iterator();
    Double soma = 0d;
    while(iterator.hasNext()) {
      Double next = iterator.next();
      soma += next;
    }
    System.out.println(soma);
    notas.clear();
    System.out.println(notas);

    System.out.println("Confira se está vazia " + notas.isEmpty());
  }
}