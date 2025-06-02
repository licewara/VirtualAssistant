package src;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Data {
    private static final String DATA_DIR = "data";
    private static final String DATA_FILE = "user_data.txt";
    private static final String RECOMMENDATIONS_FILE = "recommendations.txt";

    static {
        new File(DATA_DIR).mkdirs();
    }
    
    // Formatar a data para incluir no registro
    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    
    public static void saveUserData(String data) {
        try (FileWriter writer = new FileWriter(DATA_FILE, true)) {
            String timestamp = LocalDateTime.now().format(DATE_FORMATTER);
            writer.write(timestamp + " - " + data + "\n");
        } catch (IOException e) {
            System.err.println("Erro ao salvar dados: " + e.getMessage());
        }
  }

  public static void saveRecommendation(String recommendation) {
    try (FileWriter writer = new FileWriter(RECOMMENDATIONS_FILE, true)) {
        String timestamp = LocalDateTime.now().format(DATE_FORMATTER);
        writer.write(timestamp + " - " + recommendation + "\n\n");
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
