package collections;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ExemploMap {
  public static void main(String[] args) {
    System.out.println("Crie um dicionário que relacione os modelos e seus respectivos significados");

    Map<String, Double> carrosPopulares = new HashMap<>(){{
      put("gol", 14.4);
      put("uno", 15.6);
      put("mobi", 16.1);
      put("hb20", 14.5);
      put("kwid", 15.6);
    }};
    System.out.println(carrosPopulares.toString());

    System.out.println("Substitua o consumo do gol por 15,5 km/l: ");
    carrosPopulares.put("gol", 15.2);
    System.out.println(carrosPopulares.toString());

    System.out.println("Confira se o modelo tucson está no dicionário: " + carrosPopulares.containsKey("tucson"));
    
    System.out.println("Exiba o consumo do uno: " + carrosPopulares.get("uno"));
    
    System.out.println("Exiba os modelos: ");
    Set<String> modelos = carrosPopulares.keySet();
    System.out.println(modelos);

    System.out.println("Exiba os consumos dos carros: ");
    Collection<Double> consumos = carrosPopulares.values();
    System.out.println(consumos);
    
    System.out.println("Exiba o modelo mais econômico e seu consumo: ");
    Double consumoMaisEficiente = Collections.max(carrosPopulares.values()); 
    
    Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
    String modeloMaisEficiente = "";

    for (Map.Entry<String, Double> entry: entries) {
      if(entry.getValue().equals(consumoMaisEficiente)) {
        modeloMaisEficiente = entry.getKey();
      }    
    }

    System.out.println("Modelo mais eficiente: " + modeloMaisEficiente + " - " + consumoMaisEficiente);

    Iterator<Double> iterator = carrosPopulares.values().iterator();
    Double soma = 0d;
    
    while(iterator.hasNext()) {
      soma += iterator.next();
    }
    System.out.println("exiba a soma dos consumos: " + soma);

    System.out.println("exiba a media de consumo: " + (soma/carrosPopulares.size()));

    System.out.println("Remova os modelos com o consumo igual a 15,6 km/l"); Iterator<Double> iterator2 = carrosPopulares.values().iterator();
    while(iterator2.hasNext()) {
      if(iterator2.next().equals(15.6)) iterator2.remove();
    } 
    System.out.println(carrosPopulares);
    
    System.out.println("Exiba o dicionário ordenado pelo modelo: ");
    Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares);
    System.out.println(carrosPopulares2.toString());
    
    System.out.println("Apague o dicionario de carros: ");   
    carrosPopulares.clear();
    
    System.out.println("Confira se o dicionario está vazio " + carrosPopulares.isEmpty());
  }
}