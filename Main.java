import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.println("Olá, eu sou a Genovia! Uma assistente virtual com o intuito de te ajudar a escolher os melhores produtos para sua pele.");
    System.out.print("Deseja ajuda? [0 para NÃO | 1 para SIM] --> ");

    int escolha;

    do {
      escolha = scanner.nextInt();
      while (escolha != 1 || escolha != 0){
        if (escolha == 1){

          

        } else if (escolha == 0){
          System.out.println("Certo! Se precisar de ajuda -------- ");
          break;
        } else {
          System.out.println("Desculpe, não entendi! Digite o número 1 caso precise de ajuda e o número 2 caso NÃO precise de ajuda.");
          escolha = scanner.nextInt();
        }
      }
      
    } while (escolha == 1);

    scanner.close();

  }
}