import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {

            String inputPath = "input.txt";
            String outputPath = "output.txt";


            BufferedReader reader = new BufferedReader(new FileReader(inputPath));
            StringBuilder contentBuilder = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {

                line = line.replaceAll("Nha Trang", "Vũng Tàu");
                contentBuilder.append(line).append("\n");
            }
            reader.close();

            BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath));
            writer.write(contentBuilder.toString());
            writer.close();

            System.out.println("Thay thế từ thành công và ghi vào file output.txt.");
        } catch (IOException e) {
            System.err.println("Xảy ra lỗi khi đọc hoặc ghi file: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
