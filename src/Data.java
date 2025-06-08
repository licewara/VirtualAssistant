package src;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Data {
    private static final String DATA_DIR = "data";
    private static final String DATA_FILE = "user_data.txt";
    private static final String RECOMMENDATIONS_FILE = "recommendations.txt";
    private static final String COUNTER_FILE = "data/id_counter.txt";

    static {
        new File(DATA_DIR).mkdirs();
    }

    public static int getNextId() {
      try {
          // Lê o último ID usado
          if (!Files.exists(Paths.get(COUNTER_FILE))) {
              Files.write(Paths.get(COUNTER_FILE), "0".getBytes());
          }
          
          String currentId = new String(Files.readAllBytes(Paths.get(COUNTER_FILE))).trim();
          int nextId = Integer.parseInt(currentId) + 1;
          
          // Atualiza o arquivo com o novo ID
          Files.write(Paths.get(COUNTER_FILE), String.valueOf(nextId).getBytes());
          
          return nextId;
      } catch (IOException e) {
          System.err.println("Erro ao gerar ID: " + e.getMessage());
          return -1; // Retorna -1 em caso de erro
      }
  }

    
    // Formatar a data para incluir no registro
    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    
    public static void saveUserData(int id, String data) {
        try (FileWriter writer = new FileWriter(DATA_FILE, true)) {
            String timestamp = LocalDateTime.now().format(DATE_FORMATTER);
            writer.write(String.format("[ID:%05d] %s - %s\n", id, timestamp, data));
        } catch (IOException e) {
            System.err.println("Erro ao salvar dados: " + e.getMessage());
        }
  }

    public static String findUserById(int id) {
      try {
          String content = new String(Files.readAllBytes(Paths.get(DATA_FILE)));
          String pattern = "\\[ID:" + String.format("%05d", id) + "\\].*?(?=\\n\\[ID:|\\Z)";
          
          Pattern r = Pattern.compile(pattern, Pattern.DOTALL);
          Matcher m = r.matcher(content);
          
          return m.find() ? m.group() : "Cliente não encontrado!";
      } catch (IOException e) {
          return "Erro ao ler arquivo: " + e.getMessage();
      }
  }

  public static void saveRecommendation(ArrayList<String> produtosRecomendados) {
    try (FileWriter writer = new FileWriter(RECOMMENDATIONS_FILE, true)) {
        String timestamp = LocalDateTime.now().format(DATE_FORMATTER);
        writer.write(timestamp + " - RECOMENDAÇÕES:\n");

        for (String produto : produtosRecomendados) {
          writer.write("- "+ produto + "\n");
        }

        writer.write("\n"); 
    } catch (IOException e) {
        System.err.println("Erro ao salvar recomendação: " + e.getMessage());
    }
  }
    public static String readAllData() {
      try {
        return new String(Files.readAllBytes(Paths.get(DATA_FILE)));
      } catch (IOException e) {
        return "Nenhum dado encontrado ou erro ao ler arquivo";
      }
    }
}
