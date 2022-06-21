package pacote;

import java.util.Scanner;

public class Ex3_MaiorMedia {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);


    float soma = 0;
    int numero;
    int maior = 0;
    int count = 0;    

    do {
      System.out.println("Numero: ");
      numero = scan.nextInt();
      if (numero > maior) {
        maior = numero;
      }
      soma += numero;
      ++count;
      System.out.println("Maior: " + maior);
    } while(count < 5);
    System.out.println("A média é: " + soma/5);
  }
}
