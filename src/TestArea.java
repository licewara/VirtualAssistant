package src;
import java.util.Scanner;

public class TestArea {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int visualizarProdutos = scanner.nextInt();

      while (visualizarProdutos != 1 || visualizarProdutos != 0){
        if (visualizarProdutos == 1){

          // mostrar lista dos produtos

        } else if (visualizarProdutos != 1 && visualizarProdutos != 2){

          System.out.print("Não entendi! Por favor, digite novamente [1 para SIM 2 para NÃO] --> ");
          visualizarProdutos = scanner.nextInt();

        } else{
          break;
        }
      }
      
    scanner.close();
  }
}
