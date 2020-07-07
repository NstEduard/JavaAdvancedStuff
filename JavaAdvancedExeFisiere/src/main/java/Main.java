import java.io.*;

public class Main {
    /*
     * - sa se citeasca linie cu linie si sa se scrie in alt fisier liniile care au numar par de cuvinte
     * */
    public static void main(String[] args) throws IOException {

        try {
            String textDeCitit = "E:\\JavaCursuriSDAcademy\\JavaAdvancedExeFisiere\\src\\main\\java\\FisierDeCitit";
            String textDeScris = "E:\\JavaCursuriSDAcademy\\JavaAdvancedExeFisiere\\src\\main\\java\\FisierDeScris";

            FileReader fileReader = new FileReader(textDeCitit);
            FileWriter fileWriter = new FileWriter(textDeScris);

            BufferedReader bufferedReader = new BufferedReader(fileReader);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            String text = bufferedReader.readLine();
            while (text != null) {
                String[] word = text.split(" ");
                if (word.length % 2 == 0) {
                    bufferedWriter.write(text);
                    bufferedWriter.flush();
                    bufferedWriter.newLine();
                }
                text = bufferedReader.readLine();
            }
            bufferedWriter.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
