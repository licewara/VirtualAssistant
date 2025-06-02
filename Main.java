import java.util.Scanner;
import java.util.ArrayList;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.print("Seja bem-vindo(a)!\n" + //
            "Você já conhece nossa assistente virtual de beleza?\n" + //
            "Ela está pronta para montar uma lista personalizada de produtos, feita especialmente para você, com base nas suas características e na sua rotina. Vamos começar?\n" + //
            "\n" + //
            "Digite [1] para 'Quero Agora' e [2] para 'Talvez depois'\n" + //
            "--> ");

    // Criando as variáveis que vão ter os valores digitados pelo usuário
    int escolha, genero, idade, tipoDePele, tomDePele, condicoesDePele, preferenciaFragancia, usaProdutos, produtosProcurados;
    String generoStr = "", tipoDePeleStr = "", tomDePeleStr = "", condicoesDePeleStr = "Nenhuma", preferenciaFraganciaStr = "", 
    usaProdutosStr = "", produtosProcuradosStr = "";
  
    //Arrays com os produtos específicos para cada tipo de pele, separados pelos que tem fragância e pelos que não tem
    String[] produtosGeraisComFrag = {"ProdutoPeleOleosaGeralFrag", "ProdutoPeleSecaGeralFrag", "ProdutoPeleMistaGeralFrag", "ProdutoPeleNormalGeralFrag", 
    "ProdutoPeleSensivelGeralFrag"};
    String[] produtosGeraisSemFrag = {"ProdutoPeleOleosaGeralSemFrag", "ProdutoPeleSecaGeralSemFrag", "ProdutoPeleMistaGeralSemFrag", 
    "ProdutoPeleNormalGeralSemFrag", "ProdutoPeleSensivelGeralSemFrag"};
    String[] produtosTom1ComFrag = {"ProdutoTom1OleosaFrag", "ProdutoTom1SecaFrag", "ProdutoTom1MistaFrag", "ProdutoTom1NormalFrag", "ProdutoTom1SensivelFrag"};
    String[] produtosTom1SemFrag = {"ProdutoTom1OleosaSemFrag","ProdutoTom1SecaSemFrag", "ProdutoTom1MistaSemFrag", "ProdutoTom1NormalSemFrag",
    "ProdutoTom1SensivelSemFrag" };
    String[] produtosTom2ComFrag = {"ProdutoTom2OleosaFrag", "ProdutoTom2SecaFrag", "ProdutoTom2MistaFrag", "ProdutoTom2NormalFrag", "ProdutoTom2SensivelFrag"};
    String[] produtosTom2SemFrag = {"ProdutoTom2OleosaSemFrag","ProdutoTom2SecaSemFrag", "ProdutoTom2MistaSemFrag", "ProdutoTom2NormalSemFrag",
    "ProdutoTom2SensivelSemFrag" };
    String[] produtosTom3ComFrag = {"ProdutoTom3OleosaFrag", "ProdutoTom3SecaFrag", "ProdutoTom3MistaFrag", "ProdutoTom3NormalFrag", "ProdutoTom3SensivelFrag"};
    String[] produtosTom3SemFrag = {"ProdutoTom3OleosaSemFrag","ProdutoTom3SecaSemFrag", "ProdutoTom3MistaSemFrag", "ProdutoTom3NormalSemFrag",
    "ProdutoTom3SensivelSemFrag" };
    String[] produtosTom4ComFrag = {"ProdutoTom4OleosaFrag", "ProdutoTom4SecaFrag", "ProdutoTom4MistaFrag", "ProdutoTom4NormalFrag", "ProdutoTom4SensivelFrag"};
    String[] produtosTom4SemFrag = {"ProdutoTom4OleosaSemFrag","ProdutoTom4SecaSemFrag", "ProdutoTom4MistaSemFrag", "ProdutoTom4NormalSemFrag",
    "ProdutoTom4SensivelSemFrag" };
    String[] produtosTom5ComFrag = {"ProdutoTom5OleosaFrag", "ProdutoTom5SecaFrag", "ProdutoTom5MistaFrag", "ProdutoTom5NormalFrag", "ProdutoTom5SensivelFrag"};
    String[] produtosTom5SemFrag = {"ProdutoTom5OleosaSemFrag","ProdutoTom5SecaSemFrag", "ProdutoTom5MistaSemFrag", "ProdutoTom5NormalSemFrag",
    "ProdutoTom5SensivelSemFrag" };
    String[] produtosTom6ComFrag = {"ProdutoTom6OleosaFrag", "ProdutoTom6SecaFrag", "ProdutoTom6MistaFrag", "ProdutoTom6NormalFrag", "ProdutoTom6SensivelFrag"};
    String[] produtosTom6SemFrag = {"ProdutoTom6OleosaSemFrag","ProdutoTom6SecaSemFrag", "ProdutoTom6MistaSemFrag", "ProdutoTom6NormalSemFrag",
    "ProdutoTom6SensivelSemFrag" };

    //Array contendo os produtos específicos para o cliente.
    ArrayList<String> produtosCliente = new ArrayList<String>();

    //Parte opcional || int orcamentoMedio;

    // Looping que vai rodar o código principal enquanto o usuário desejar. Encerra quando escolha = 0.
    do {
      escolha = scanner.nextInt();
      while (escolha != 1 || escolha != 0){
        if (escolha == 1){
          System.out.println("Olá! Eu sou a Genovia, sua assistente de beleza personalizada.  \n" + //
                  "Estou aqui para te ajudar a encontrar os melhores produtos de skincare e maquiagem,  \n" + //
                  "de acordo com o seu tipo de pele, preferências e necessidades.  \n");

          System.out.println("Privacidade em primeiro lugar!  \n" + //
                  "Seus dados são utilizados apenas para gerar um relatório personalizado.  \n" + //
                  "Estamos de acordo com a Lei Geral de Proteção de Dados (LGPD). \n");

          System.out.println("-------------------------------------------------------\n" + //
                        "Sobre você\n" + //
                        "-------------------------------------------------------\n");

          System.out.print("1. Qual seu gênero?\n" + //
                        "(1) Feminino  \n" + //
                        "(2) Masculino  \n" + //
                        "(3) Prefiro não informar  \n" + //
                        "(4) Outro\n " + //
                        "Digite seu gênero: ");

          genero = scanner.nextInt();        

          switch (genero){
            case 1: generoStr = "Feminino"; break;
            case 2: generoStr = "Masculino"; break;
            case 3: generoStr = "Não-informado"; break;
            case 4: generoStr = "Outro"; break;
          }

          System.out.print("\n2. Qual sua idade?\n"  + //
                        "Digite sua idade: ");

          idade = scanner.nextInt();

          System.out.print("\n-------------------------------------------------------\n" + //
                        "Características da sua pele\n" + //
                        "-------------------------------------------------------\n");
                          
          System.out.print("\n3. Qual o seu tipo de pele?\n" + //
                        "(1) Oleosa  \n" + //
                        "(2) Seca  \n" + //
                        "(3) Mista  \n" + //
                        "(4) Normal  \n" + //
                        "(5) Sensível  \n" + //
                        "Digite seu tipo de pele: ");

          tipoDePele = scanner.nextInt();
          switch (tipoDePele){
            case 1: tipoDePeleStr = "Oleosa"; break;
            case 2: tipoDePeleStr = "Seca"; break;
            case 3: tipoDePeleStr = "Mista"; break;
            case 4: tipoDePeleStr = "Normal"; break;
            case 5: tipoDePeleStr = "Sensível"; break;
          }

          System.out.print("\n4. Qual o seu tom de pele?\n" + //
                        "(1) Tom 1 - Pele muito clara  \n" + //
                        "(2) Tom 2 - Pele clara a média \n" + //
                        "(3) Tom 3 - Pele média \n" + //
                        "(4) Tom 4 - Pele média escura \n" + //
                        "(5) Tom 5 - Pele negra  \n" + //
                        "(6) Tom 6 - Pele negra profunda \n" + //
                        "Digite seu tom de pele: ");

          tomDePele = scanner.nextInt();
          switch (tomDePele){
            case 1: tomDePeleStr = "Tom 1 - Pele muito clara"; break;
            case 2: tomDePeleStr = "Tom 2 - Pele clara a média"; break;
            case 3: tomDePeleStr = "Tom 3 - Pele média"; break;
            case 4: tomDePeleStr = "Tom 4 - Pele média escura"; break;
            case 5: tomDePeleStr = "Tom 5 - Pele negra"; break;
            case 6: tomDePeleStr = "Tom 6 - Pele negra profunda"; break;
          }

          /*CONDIÇÕES DE PELE 
          
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

          //Adicionar posteriormente a opção do usuário conseguir digitar mais de uma opção
          condicoesDePele = scanner.nextInt();
          switch (condicoesDePele){
            case 1: condicoesDePeleStr = "Acne"; produtosCliente.add("ProdutoAcne"); break;
            case 2: condicoesDePeleStr = "Rosácea"; produtosCliente.add("ProdutoRosácea"); break;
            case 3: condicoesDePeleStr = "Manchas"; produtosCliente.add("ProdutoManchas"); break;
            case 4: condicoesDePeleStr = "Oleosidade excessiva"; produtosCliente.add("ProdutoOleosidadeExcessiva");  break;
            case 5: condicoesDePeleStr = "Ressecamento"; produtosCliente.add("ProdutoRessecamento"); break;
            case 6: condicoesDePeleStr = "Poros dilatados"; produtosCliente.add("ProdutoPorosDilatados"); break;
            case 7: condicoesDePeleStr = "Sensibilidade a produtos"; produtosCliente.add("ProdutoSensAProdutos"); break;
            case 8: condicoesDePeleStr = "Nenhuma condição da pele citada"; break;
          }*/

          System.out.print("\n" + //
                        "5. Você prefere produtos com ou sem fragrância? [1 para COM FRAGANCIA || 2 para SEM FRAGANCIA] \n" +
                        "Digite aqui sua preferência: ");

          preferenciaFragancia = scanner.nextInt();
          switch (preferenciaFragancia){
            case 1: preferenciaFraganciaStr = "Produtos com fragância"; break;
            case 2: preferenciaFraganciaStr = "Produtos sem fragância"; break;
          }

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
                        "Sobre sua rotina\n" + //
                        "-------------------------------------------------------");
          
          System.out.print("7. Você já usa produtos de skincare ou maquiagem?\n" + //
                        "(1) Sim, uso todos os dias  \n" + //
                        "(2) Uso algumas vezes por semana  \n" + //
                        "(3) Raramente  \n" + //
                        "(4) Nunca usei, quero começar agora  \n" + //
                        "Digite aqui se usa produtos: ");

          usaProdutos = scanner.nextInt();
          switch (usaProdutos){
            case 1: usaProdutosStr = "Todos os dias"; break;
            case 2: usaProdutosStr = "Algumas vezes por semana"; break;
            case 3: usaProdutosStr = "Raramente utiliza"; break;
            case 4: usaProdutosStr = "Nunca utiliza"; break;
          }

          /* Testar sem essa parte por enquanto
          System.out.print("8. Quais produtos você está procurando no momento? (escolha mais de um, separando por vírgulas)\n" + //
                        "(1) Skincare\n" + //
                        "(2) Maquiagem\n" + //
                        "(3) Ambos\n" + //
                        "Digite aqui quais produtos você está procurando: ");

          produtosProcurados = scanner.nextInt();
          switch (produtosProcurados){
            case 1: produtosProcuradosStr = "De skincare"; break;
            case 2: produtosProcuradosStr = "De maquiagem"; break;
            case 3: produtosProcuradosStr = "De skincare/maquiagem"; break;
          }
          */

          // Opção de CONTINUAR || caso o usuário deseje ver o relatório dele ou não
          System.out.print("Deseja continuar? [1 para SIM e 2 para NÃO]\n" + //
                        "--> ");

          System.out.println("-------------------------------------------------------\n" + //
                        "Geração do Relatório\n" + //
                        "-------------------------------------------------------");
                        
          System.out.println("Obrigada por responder, estamos processando seus dados...");

          // Coletar os dados do usuário
          String userdata = String.format(
            """
            Gênero: %s, 
            Idade: %d, 
            Tipo de Pele: %s, 
            Tom de Pele: %s,  
            Condições: %s,
            Fragância: %s, 
            Utiliza produtos: %s
            """    
            ,generoStr, idade, tipoDePeleStr, tomDePeleStr, condicoesDePeleStr, preferenciaFraganciaStr, usaProdutosStr
          );

          //Envia os dados para o bloco de notas
          Data.saveUserData(userdata);

          // Coletar os dados do usuário
          String recommendation = "Produtos recomendados: ";

          //Envia os dados para o bloco de notas
          Data.saveRecommendation(recommendation);

          System.out.print("Genovia identificou que sua pele possui as seguintes características: Pele" + //
                        tipoDePeleStr + tomDePeleStr + condicoesDePeleStr);

          System.out.println("Com base nessas informações, criamos uma lista personalizada com produtos que:\n" + //
                        "- Respeitam suas restrições\n" + //
                        "- Atendem às suas preferências\n" + //
                        "- Estão dentro do seu orçamento");


          System.out.print("Deseja visualizar a lista de produtos recomendados?\n" + //
                        "(1) Sim, mostrar lista de produtos  \n" + //
                        "(2) Não, encerrar aqui  \n" + //
                        "--> ");
                    
          int visualizarProdutos = scanner.nextInt();

          //Mostrar a lista de produtos || caso 1: mostra || caso 2: pula || caso else: repete até digitar 1 ou 2
          while (visualizarProdutos != 1 || visualizarProdutos != 2){
            if (visualizarProdutos == 1){

              // mostrar lista dos produtos
  
            } else if (visualizarProdutos != 1 && visualizarProdutos != 2){
  
              System.out.print("Não entendi! Por favor, digite novamente [1 para SIM 2 para NÃO] --> ");
              visualizarProdutos = scanner.nextInt();
  
            } else{
              break;
            }
          }

          // FINAL. Pergunta se o usuário deseja continuar utilizando a assistente ou não.
          escolha = scanner.nextInt();

          } else if (escolha == 0){
            System.out.println("Certo! Se precisar de ajuda {} ");
            break;
          } else {
            System.out.print("Desculpe, não entendi! Digite o número 1 caso precise de ajuda e o número 2 caso NÃO precise de ajuda --> ");
            escolha = scanner.nextInt();
          }
        }
      
    } while (escolha == 1);

    scanner.close();

  }
}