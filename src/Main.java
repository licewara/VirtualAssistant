package src;
import java.util.Scanner;
import java.util.ArrayList;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.print("Seja bem-vindo(a)!\n" + //
            "Você já conhece nossa assistente virtual de beleza?\n" + //
            "Ela está pronta para montar uma lista personalizada de produtos, feita especialmente para você, com base nas suas características e na sua rotina. Vamos começar?\n" + //
            "\n" + //
            "Digite [1] para 'Quero Agora' || [2] para 'Talvez depois' || [3] para 'Consultar Cliente por ID\n" + //
            "--> ");

    // Criando as variáveis que vão ter os valores digitados pelo usuário
    int escolha, genero, idade, tipoDePele, tomDePele, preferenciaFragancia, usaProdutos;
    String generoStr = "", tipoDePeleStr = "", tomDePeleStr = "", condicoesDePeleStr = "Nenhuma", preferenciaFraganciaStr = "", 
    usaProdutosStr = "";
  
    //Arrays com os produtos específicos para cada tipo de pele, separados pelos que tem fragância e pelos que não tem
    String[] produtosGeraisComFrag = {"ProdutoPeleOleosaGeralFrag", "ProdutoPeleSecaGeralFrag", "ProdutoPeleMistaGeralFrag", "ProdutoPeleNormalGeralFrag", 
    "ProdutoPeleSensivelGeralFrag"};
    String[] produtosGeraisSemFrag = {"ProdutoPeleOleosaGeralSemFrag", "ProdutoPeleSecaGeralSemFrag", "ProdutoPeleMistaGeralSemFrag", 
    "ProdutoPeleNormalGeralSemFrag", "ProdutoPeleSensivelGeralSemFrag"};
    String[] produtosTom1ComFrag = {"Pele Oleosa || Espuma de Limpeza Marca 1", "Pele Oleosa || Água Micelar Marca 1", "Pele Oleosa || Gel-creme Hidratante Marca 1",
    "Pele Seca || Espuma de limpeza Marca 1", "Pele Seca || Demaquilante bifásico Marca 1", "Pele Seca || Sérum ácido hialurônico Marca 1", 
    "Pele Mista || Sabonete líquido neutro Marca 1", "Pele Mista || Demaquilante bifásico Marca 1", "Pele Mista || Sérum ácido hialurônico Marca 1", 
    "Pele Normal || Espuma de Limpeza Neutro Marca 1", "Pele Normal || Água Micelar Marca 1", "Pele Normal || Loção Hidratante Facial Marca 1", 
    "Pele Sensível || Espuma de Limpeza Marca 1", "Pele Sensível || Água Micelar Marca 1", "Pele Sensível || Loção Calmante com pantenol Marca 1"};
    String[] produtosTom1SemFrag = {"Pele Oleosa ||  Espuma de Limpeza Marca 2", "Pele Oleosa ||  Água Micelar Marca 2",  "Pele Oleosa ||  Gel-creme Hidratante Marca 2", 
    "Pele Seca || Espuma de limpeza Marca 2", "Pele Seca || Demaquilante bifásico Marca 2", "Pele Seca || Sérum ácido hialurônico Marca 2", 
    "Pele Mista || Sabonete líquido neutro Marca 2", "Pele Mista || Demaquilante bifásico Marca 2", "Pele Mista || Sérum ácido hialurônico Marca 2", 
    "Pele Normal || Espuma de Limpeza Neutro Marca 2", "Pele Normal || Água Micelar Marca 2", "Pele Normal || Loção Hidratante Facial Marca 2", 
    "Pele Sensível || Espuma de Limpeza Marca 2", "Pele Sensível || Água Micelar Marca 2", "Pele Sensível || Loção Calmante com pantenol Marca 2" };
    String[] produtosTom2ComFrag = {"Pele Oleosa || Protetor Solar em Stick Toque Seco Marca 1", "Pele Oleosa || Protetor Solar em Stick Toque Seco Marca 1", "Pele Oleosa || Esfoliante Facial Suave Enzimático Marca 1", 
    "Pele Seca || Creme reparador facial Marca 1", "Pele Seca || Hidratante e Protetor Labial Marca 1", "Pele Seca || Protetor Solar Toque Hidratante Marca 1",
    "Pele Mista || Serum hidratante Marca 1", "Pele Mista || Hidrante e protetor labial Marca 1", "Pele Mista || ⁠Protetor Solar toque seco Marca 1", 
    "Pele Normal || Protetor solar Marca 1", "Pele Normal || Máscara facial de hidratação Marca 1", "Pele Normal || Balm labial Marca 1", 
    "Pele Sensível || Protetor solar físico Marca 1", "Pele Sensível || ⁠Máscara facial calmante Marca 1", "Pele Sensível || ⁠Balm labial Marca 1"};
    String[] produtosTom2SemFrag = {"Pele Oleosa || Protetor Solar em Stick Toque Seco Marca 2", "Pele Oleosa || Protetor Solar em Stick Toque Seco Marca 2", "Pele Oleosa || Esfoliante Facial Suave Enzimático Marca 2", 
    "Pele Seca || Creme reparador facial Marca 2", "Pele Seca || Hidratante e Protetor Labial Marca 2", "Pele Seca || Protetor Solar Toque Hidratante Marca 2",
    "Pele Mista || Serum hidratante Marca 2", "Pele Mista || Hidrante e protetor labial Marca 2", "Pele Mista || ⁠Protetor Solar toque seco Marca 2", 
    "Pele Normal || Protetor solar Marca 2", "Pele Normal || Máscara facial de hidratação Marca 2", "Pele Normal || Balm labial Marca 2", 
    "Pele Sensível || Protetor solar físico Marca 2", "Pele Sensível || ⁠Máscara facial calmante Marca 2", "Pele Sensível || ⁠Balm labial Marca 2"};
    String[] produtosTom3ComFrag = {"Pele Oleosa || ⁠Serum Matificante Marca 1", "Pele Oleosa || Máscara facial Argila Marca 1","Pele Oleosa || ⁠Demaquilante Marca 1", 
    "Pele Seca || Creme área dos olhos Marca 1", "Pele Seca || ⁠Máscara facial nutritiva Marca 1", "Pele Seca || Espuma de limpeza Marca 1", 
    "Pele Mista || Máscara facial Hidratante Marca 1", "Pele Mista || Tônico equilibrante Marca 1", "Pele Mista || ⁠Esfoliante suave Marca 1",
    "Pele Normal || Espuma de Limpeza Neutro Marca 1", "Pele Normal || Balm Labial Marca 1", "Pele Normal || Máscara Facial de Hidratação Marca 1", 
    "Pele Sensível || Creme para área dos olhos com ativos suaves Marca 1", "Pele Sensível || ⁠Demaquilante em bálsamo calmante Marca 1", "Pele Sensível || ⁠Balm labial Marca 1"};
    String[] produtosTom3SemFrag = {"Pele Oleosa || ⁠Serum Matificante Marca 2", "Pele Oleosa || Máscara facial Argila Marca 2","Pele Oleosa || ⁠Demaquilante Marca 2", 
    "Pele Seca || Creme área dos olhos Marca 2", "Pele Seca || ⁠Máscara facial nutritiva Marca 2", "Pele Seca || Espuma de limpeza Marca 2", 
    "Pele Mista || Máscara facial Hidratante Marca 2", "Pele Mista || Tônico equilibrante Marca 2", "Pele Mista || ⁠Esfoliante suave Marca 2",
    "Pele Normal || Espuma de Limpeza Neutro Marca 2", "Pele Normal || Balm Labial Marca 2", "Pele Normal || Máscara Facial de Hidratação Marca 2", 
    "Pele Sensível || Creme para área dos olhos com ativos suaves Marca 2", "Pele Sensível || ⁠Demaquilante em bálsamo calmante Marca 2", "Pele Sensível || ⁠Balm labial Marca 2" };
    String[] produtosTom4ComFrag = {"Pele Oleosa || ⁠Gel demaquilante Marca 1", "Pele Oleosa || Esfoliante Facial Suave Enzimático Marca 1", "Pele Oleosa || ⁠Água Micelar Marca 1", 
    "Pele Seca || C⁠Creme reparador facial Marca 1", "Pele Seca || Creme área dos olhos Marca 1", "Pele Seca || Espuma de limpeza Marca 1", 
    "Pele Mista || Sabonete líquido neutro Marca 1", "Pele Mista || ⁠Hidrante e protetor labial Marca 1", "Pele Mista || Creme para óleos Marca 1",
    "Pele Normal || Sérum leve antioxidante Marca 1", "Pele Normal || Balm Labial Marca 1", "Pele Normal || Protetor solar Marca 1", 
    "Pele Sensível || Máscara facial calmante  Marca 1", "Pele Sensível || ⁠Loção calmante com pantenol Marca 1", "Pele Sensível || ⁠Espuma de limpeza Marca 1"};
    String[] produtosTom4SemFrag = {"Pele Oleosa || ⁠Gel demaquilante Marca 2", "Pele Oleosa || Esfoliante Facial Suave Enzimático Marca 2", "Pele Oleosa || ⁠Água Micelar Marca 2", 
    "Pele Seca || C⁠Creme reparador facial Marca 2", "Pele Seca || Creme área dos olhos Marca 2", "Pele Seca || Espuma de limpeza Marca 2", 
    "Pele Mista || Sabonete líquido neutro Marca 2", "Pele Mista || ⁠Hidrante e protetor labial Marca 2", "Pele Mista || Creme para óleos Marca 2",
    "Pele Normal || Sérum leve antioxidante Marca 2", "Pele Normal || Balm Labial Marca 2", "Pele Normal || Protetor solar Marca 2", 
    "Pele Sensível || Máscara facial calmante  Marca 2", "Pele Sensível || ⁠Loção calmante com pantenol Marca 2", "Pele Sensível || ⁠Espuma de limpeza Marca 2" };
    String[] produtosTom5ComFrag = {"Pele Oleosa || ⁠Máscara facial Argila Marca 1", "Pele Oleosa || Protetor solar em Stick Toque Seco Marca 1", "Pele Oleosa || ⁠Sabonete em gel suave Marca 1", 
    "Pele Seca || ⁠Hidrante e protetor labial Marca 1", "Pele Seca || ⁠Máscara facial nutritiva Marca 1", "Pele Seca || Espuma de limpeza Marca 1", 
    "Pele Mista || ⁠Sérum hidratante Marca 1", "Pele Mista || Esfoliante suave Marca 1", "Pele Mista || Creme para óleos Marca 1",
    "Pele Normal || Loção hidratante facial  Marca 1", "Pele Normal || Máscara facial de hidratação Marca 1", "Pele Normal || Balm labial  Marca 1", 
    "Pele Sensível || Protetor solar físico  Marca 1", "Pele Sensível || Espuma de limpeza Marca 1", "Pele Sensível || Creme para área dos olhos com ativos suaves Marca 1"};
    String[] produtosTom5SemFrag = {"Pele Oleosa || ⁠Máscara facial Argila Marca 2", "Pele Oleosa || Protetor solar em Stick Toque Seco Marca 2", "Pele Oleosa || ⁠Sabonete em gel suave Marca 2", 
    "Pele Seca || ⁠Hidrante e protetor labial Marca 2", "Pele Seca || ⁠Máscara facial nutritiva Marca 2", "Pele Seca || Espuma de limpeza Marca 2", 
    "Pele Mista || ⁠Sérum hidratante Marca 2", "Pele Mista || Esfoliante suave Marca 2", "Pele Mista || Creme para óleos Marca 2",
    "Pele Normal || Loção hidratante facial  Marca 2", "Pele Normal || Máscara facial de hidratação Marca 2", "Pele Normal || Balm labial  Marca 2", 
    "Pele Sensível || Protetor solar físico  Marca 2", "Pele Sensível || Espuma de limpeza Marca 2", "Pele Sensível || Creme para área dos olhos com ativos suaves Marca 2"};
    String[] produtosTom6ComFrag = {"Pele Oleosa || Espuma de Limpeza Marca 1", "Pele Oleosa || Gel- Creme Hidratante  Marca 1", "Pele Oleosa || ⁠Sérum Matificante Marca 1", 
    "Pele Seca || ⁠Creme reparador facial Marca 1", "Pele Seca || Máscara facial nutritiva Marca 1", "Pele Seca || Demaquilante bifásico Marca 1", 
    "Pele Mista || ⁠Hidrante e protetor labial Marca 1", "Pele Mista || ⁠Máscara facial Hidratante Marca 1", "Pele Mista || ⁠Tônico equilibrante Marca 1",
    "Pele Normal || Protetor solar  Marca 1", "Pele Normal || Sérum leve antioxidante Marca 1", "Pele Normal || Água micelar  Marca 1", 
    "Pele Sensível || Máscara facial calmante Marca 1", "Pele Sensível || Demaquilante em bálsamo calmante Marca 1", "Pele Sensível || Creme para área dos olhos com ativos suaves Marca 1"};
    String[] produtosTom6SemFrag = {"Pele Oleosa || Espuma de Limpeza Marca 2", "Pele Oleosa || Gel- Creme Hidratante  Marca 2", "Pele Oleosa || ⁠Sérum Matificante Marca 2", 
    "Pele Seca || ⁠Creme reparador facial Marca 2", "Pele Seca || Máscara facial nutritiva Marca 2", "Pele Seca || Demaquilante bifásico Marca 2", 
    "Pele Mista || ⁠Hidrante e protetor labial Marca 2", "Pele Mista || ⁠Máscara facial Hidratante Marca 2", "Pele Mista || ⁠Tônico equilibrante Marca 2",
    "Pele Normal || Protetor solar  Marca 2", "Pele Normal || Sérum leve antioxidante Marca 2", "Pele Normal || Água micelar  Marca 2", 
    "Pele Sensível || Máscara facial calmante Marca 2", "Pele Sensível || Demaquilante em bálsamo calmante Marca 2", "Pele Sensível || Creme para área dos olhos com ativos suaves Marca 2"};
    
    //Parte opcional || int orcamentoMedio;

    // Looping que vai rodar o código principal enquanto o usuário desejar. Encerra quando escolha = 0.
    escolha = scanner.nextInt();
    do {
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

        while (true){
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
            default: System.out.println("Desculpe, não entendi. Digite novamente. "); continue;
          }
          break;
        }
      

        System.out.print("\n2. Qual sua idade?\n"  + //
                      "Digite sua idade: ");

        idade = scanner.nextInt();

        System.out.print("\n-------------------------------------------------------\n" + //
                      "Características da sua pele\n" + //
                      "-------------------------------------------------------\n");

        //Looping que só é válido caso o usuário digite um dos números esperados.
        while (true){
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
            default: System.out.println("Desculpe, não entendi. Digite novamente. "); continue;
          }
          break;
        }

        while (true){
          System.out.print("\n4. Qual o seu tom de pele?\n" + //
                      "(1) Tom 1 - Pele muito clara  \n" + //
                      "(2) Tom 2 - Pele clara \n" + //
                      "(3) Tom 3 - Pele média clara \n" + //
                      "(4) Tom 4 - Pele média escura \n" + //
                      "(5) Tom 5 - Pele escura  \n" + //
                      "(6) Tom 6 - Pele muito escura \n" + //
                      "Digite seu tom de pele: ");

          tomDePele = scanner.nextInt();

          switch (tomDePele){
            case 1: tomDePeleStr = "Tom 1 - Pele muito clara"; break;
            case 2: tomDePeleStr = "Tom 2 - Pele clara"; break;
            case 3: tomDePeleStr = "Tom 3 - Pele média clara"; break;
            case 4: tomDePeleStr = "Tom 4 - Pele média escura"; break;
            case 5: tomDePeleStr = "Tom 5 - Pele escura"; break;
            case 6: tomDePeleStr = "Tom 6 - Pele muito escura"; break;
            default: System.out.println("Desculpe, não entendi. Digite novamente. "); continue;
          }
          break;
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

        while (true){
          System.out.print("\n" + //
                      "5. Você prefere produtos com ou sem fragrância? [1 para COM FRAGANCIA || 2 para SEM FRAGANCIA] \n" +
                      "Digite aqui sua preferência: ");

          preferenciaFragancia = scanner.nextInt();

          switch (preferenciaFragancia){
            case 1: preferenciaFraganciaStr = "Produtos com fragância"; break;
            case 2: preferenciaFraganciaStr = "Produtos sem fragância"; break;
            default: System.out.println("Desculpe, não entendi. Digite novamente. "); continue;
          }
          break;
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
        
        while (true){
          System.out.print("6. Você já usa produtos de skincare ou maquiagem?\n" + //
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
            default: System.out.println("Desculpe, não entendi. Digite novamente. "); continue;
          }
          break;
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
        System.out.println("Obrigada por responder, estamos processando seus dados...");

        System.out.println("-------------------------------------------------------\n" + //
                      "Geração do Relatório\n" + //
                      "-------------------------------------------------------");

        //=======Enviar os dados para o bloco de notas user_data.txt========
        // Coletar os dados do usuário no formato que foi digitado abaixo
        String userdata = String.format(
          """
          Gênero: %s, 
          Idade: %d, 
          Tipo de Pele: %s, 
          Tom de Pele: %s,  
          Fragância: %s, 
          Utiliza produtos: %s
          """    
          ,generoStr, idade, tipoDePeleStr, tomDePeleStr, preferenciaFraganciaStr, usaProdutosStr
        );

        //Cria um ID para o usuário
        int clienteId = Data.getNextId();

        // Envia os dados para o bloco de notas user_data.txt
        Data.saveUserData(clienteId, userdata);

        System.out.println("Seu ID de cadastro é: " + String.format("%05d", clienteId));

        //=======Enviar os dados para o bloco de notas recommendations.txt========
        // Cria uma Array para os produtos recomendados para cada pessoa & torna comFragancia True ou False dependendo do valor digitado pelo usuário
        String[] produtosSelecionados;
        boolean comFragancia = preferenciaFraganciaStr.equals("Produtos com fragância");

        switch (tomDePeleStr){
          case "Tom 1 - Pele muito clara": 
            produtosSelecionados = comFragancia ? produtosTom1ComFrag : produtosTom1SemFrag;
            break;
          case "Tom 2 - Pele clara":
            produtosSelecionados = comFragancia ? produtosTom2ComFrag : produtosTom2SemFrag;
            break;
          case "Tom 3 - Pele média clara":
            produtosSelecionados = comFragancia ? produtosTom3ComFrag : produtosTom3SemFrag;
            break;  
          case "Tom 4 - Pele média escura":
            produtosSelecionados = comFragancia ? produtosTom4ComFrag : produtosTom4SemFrag;
            break;
          case "Tom 5 - Pele escura":
            produtosSelecionados = comFragancia ? produtosTom5ComFrag : produtosTom5SemFrag;
            break;
          case "Tom 6 - Pele muito escura":
            produtosSelecionados = comFragancia ? produtosTom6ComFrag : produtosTom6SemFrag;
            break;
          default:
            produtosSelecionados = comFragancia ? produtosGeraisComFrag : produtosGeraisSemFrag;
        }

        // Adiciona na Array "produtosRecomendados" somente os itens específicos para o tipo de pele
        ArrayList<String> produtosRecomendados = new ArrayList<>();
        for (String produto : produtosSelecionados) {
          if (produto.contains(tipoDePeleStr)){
            produtosRecomendados.add(produto);
          }
        }

        //Envia os dados para o bloco de notas "recommendations.txt"
        Data.saveRecommendation(produtosRecomendados);

        System.out.println("Genovia identificou que sua pele possui as seguintes características: Pele " + //
                      tipoDePeleStr + ", " + tomDePeleStr + ", " + condicoesDePeleStr);

        System.out.println("Com base nessas informações, criamos uma lista personalizada com produtos que:\n" + //
                      "- Respeitam suas restrições\n" + //
                      "- Atendem às suas preferências\n" + //
                      "- Estão dentro do seu orçamento");

        System.out.print("Deseja visualizar a lista de produtos recomendados?\n" + //
                      "(1) Sim, mostrar lista de produtos  \n" + //
                      "(2) Não, encerrar aqui  \n" + //
                      "--> ");
        
        //Mostrar a lista de produtos || caso 1: mostra || caso 2: pula || caso else: repete até digitar 1 ou 2              
        int visualizarProdutos = scanner.nextInt();

        while (visualizarProdutos != 1 || visualizarProdutos != 2){
          if (visualizarProdutos == 1){            
            System.out.println("--------PRODUTOS SELECIONADOS--------");
            for (String produto : produtosSelecionados){
              if (produto.contains(tipoDePeleStr)) {
                System.out.println("- " + produto);
              }
            }
            break;
          } else if (visualizarProdutos != 1 && visualizarProdutos != 2){
            System.out.print("Não entendi! Por favor, digite novamente [1 para SIM 2 para NÃO] --> ");
            visualizarProdutos = scanner.nextInt();
          } else {
            break;
          }
        }

        // FINAL. Pergunta se o usuário deseja continuar utilizando a assistente ou não.
        System.out.print("Deseja realizar outro cadastro? [Digite 1 para SIM e 2 para NÃO]");
        System.out.print("--> ");
        escolha = scanner.nextInt();

        while (escolha != 1 && escolha != 2){
          if (escolha == 2){
            System.out.println("Certo! Estarei aqui caso precisar.");
            break;
          } else if (escolha != 1 && escolha != 2){
            System.out.print("Desculpe, não entendi! Digite o número 1 caso precise de ajuda e o número 0 caso NÃO precise de ajuda --> ");
            escolha = scanner.nextInt();
          }
        }
      } else if (escolha == 2){
        System.out.println("Entendo! Estarei aqui caso precisar.");
      } else if (escolha == 3){
        System.out.print("Digite o ID do cliente (ex: 00042): ");
        int idConsulta = scanner.nextInt();
        System.out.println(Data.findUserById(idConsulta));
        System.out.print("Ainda precisa de ajuda? [1] - SIM || [2] - NÃO || [3] - CONSULTAR USUÁRIO\n" + //
                          "--> " );
        escolha = scanner.nextInt();
      } else{
        while (escolha != 1 && escolha != 2 && escolha != 3){
          System.out.print("Desculpe! Não entendi. Digite novamente: ");
          escolha = scanner.nextInt();
        }
      } 
    } while (escolha == 1);
    
    System.out.println("Obrigada pela participação.");

    scanner.close();

  }
}