import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.println("Olá! Eu sou a Genovia, sua assistente de beleza personalizada.  \n" + //
            "Estou aqui para te ajudar a encontrar os melhores produtos de skincare e maquiagem,  \n" + //
            "de acordo com o seu tipo de pele, preferências e necessidades.  \n");

    System.out.println("Privacidade em primeiro lugar!  \n" + //
            "Seus dados são utilizados apenas para gerar um relatório personalizado.  \n" + //
            "Estamos de acordo com a Lei Geral de Proteção de Dados (LGPD). \n");

    System.out.print("Deseja ajuda? [0 para NÃO | 1 para SIM] --> ");



    int escolha, genero, idade, tipoDePele, tomDePele, condicoesDePele, preferenciaFragancia, usaProdutos, produtosUtilizados;
    //int orcamentoMedio;

    do {
      escolha = scanner.nextInt();
      while (escolha != 1 || escolha != 0){
        if (escolha == 1){

          System.out.println("-------------------------------------------------------\n" + //
                        "🧍 Sobre você\n" + //
                        "-------------------------------------------------------\n");

          System.out.print("1. Qual seu gênero?\n" + //
                        "(1) Feminino  \n" + //
                        "(2) Masculino  \n" + //
                        "(3) Prefiro não informar  \n" + //
                        "(4) Outro\n " + //
                        "Digite seu gênero: ");

          genero = scanner.nextInt();

          System.out.print("\n2. Qual sua idade?\n"  + //
                        "Digite sua idade: ");

          idade = scanner.nextInt();

          System.out.print("\n-------------------------------------------------------\n" + //
                        "🧖‍♀️ Características da sua pele\n" + //
                        "-------------------------------------------------------\n");
                          
          System.out.print("\n3. Qual o seu tipo de pele?\n" + //
                        "(1) Oleosa  \n" + //
                        "(2) Seca  \n" + //
                        "(3) Mista  \n" + //
                        "(4) Normal  \n" + //
                        "(5) Sensível  \n" + //
                        "Digite seu tipo de pele: ");

          tipoDePele = scanner.nextInt();

          System.out.print("\n4. Qual o seu tom de pele?\n" + //
                        "(1) Muito clara  \n" + //
                        "(2) Clara  \n" + //
                        "(3) Morena clara  \n" + //
                        "(4) Morena média  \n" + //
                        "(5) Negra  \n" + //
                        "Digite seu tom de pele: ");

          tomDePele = scanner.nextInt();

          System.out.print("\n5. Quais dessas condições você possui atualmente na pele? (pode escolher mais de uma separando por vírgulas)\n" + //
                        "(1) Acne  \n" + //
                        "(2) Rosácea  \n" + //
                        "(3) Manchas  \n" + //
                        "(4) Oleosidade excessiva  \n" + //
                        "(5) Ressecamento  \n" + //
                        "(6) Poros dilatados  \n" + //
                        "(7) Sensibilidade a produtos  \n" + //
                        "(8) Nenhuma das opções acima  \n" + //
                        "Digite as condições de sua pele: ");

          condicoesDePele = scanner.nextInt();

          System.out.print("\n" + //
                        "6. Você prefere produtos com ou sem fragrância? [1 para COM FRAGANCIA || 2 para SEM FRAGANCIA] \n" +
                        "Digite aqui sua preferência: ");

          preferenciaFragancia = scanner.nextInt();

          /*OPCIONAL
           System.out.print("10. Qual seu orçamento médio por produto? \n" + //
                          "(1) Até R$ 30  \n" + //
                          "(2) R$ 31 a R$ 60  \n" + //
                          "(3) R$ 61 a R$ 100  \n" + //
                          "(4) Acima de R$ 100 \n " + //
                          "Digite aqui seu orçamento médio: ");

            orcamentoMedio = scanner.nextInt();
            */
           
          System.out.println("-------------------------------------------------------\n" + //
                        "💅 Sobre sua rotina\n" + //
                        "-------------------------------------------------------");
          
          System.out.print("7. Você já usa produtos de skincare ou maquiagem?\n" + //
                        "(1) Sim, uso todos os dias  \n" + //
                        "(2) Uso algumas vezes por semana  \n" + //
                        "(3) Raramente  \n" + //
                        "(4) Nunca usei, quero começar agora  \n" + //
                        "Digite aqui se usa produtos: ");

          usaProdutos = scanner.nextInt();

          System.out.println("8. Quais produtos você está procurando no momento? (escolha mais de um, separando por vírgulas)\n" + //
                        "(1) Skincare\n" + //
                        "(2) Maquiagem\n" + //
                        "(3) Ambos\n" + //
                        "Digite aqui quais produtos você está procurando: ");

          produtosUtilizados = scanner.nextInt();

          System.out.println("Deseja continuar? [1 para SIM e 2 para NÃO]\n" + //
                        "--> ");

          System.out.println("-------------------------------------------------------\n" + //
                        "📄 Geração do Relatório\n" + //
                        "-------------------------------------------------------");
                        
          System.out.println("Obrigada por responder, estamos processando seus dados...");

          System.out.println("✔️ Genovia identificou que sua pele possui as seguintes características: \n" + //
                        tipoDePele + tomDePele + condicoesDePele);

          System.out.println("Com base nessas informações, criamos uma lista personalizada com produtos que:\n" + //
                        "- Respeitam suas restrições\n" + //
                        "- Atendem às suas preferências\n" + //
                        "- Estão dentro do seu orçamento");

          System.out.println("Deseja visualizar a lista de produtos recomendados?\n" + //
                        "(1) Sim, mostrar lista de produtos  \n" + //
                        "(2) Não, encerrar aqui  \n" + //
                        "--> ");
                    
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

          escolha = scanner.nextInt();

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