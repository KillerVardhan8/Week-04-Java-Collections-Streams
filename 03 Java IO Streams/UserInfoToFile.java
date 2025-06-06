package IOStreams;
import java.io.*;
public class UserInfoToFile {
    public static void main(String[] args) {
        BufferedReader reader = null;
        FileWriter writer = null;

        try {
            reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter your name: ");
            String name = reader.readLine();

            System.out.print("Enter your age: ");
            String age = reader.readLine();

            System.out.print("Enter your favorite programming language: ");
            String language = reader.readLine();

            String data = "Name: " + name + System.lineSeparator()
                        + "Age: " + age + System.lineSeparator()
                        + "Favorite Programming Language: " + language + System.lineSeparator();

          
            writer = new FileWriter("userinfo.txt");
            writer.write(data);

            System.out.println("User information saved to userinfo.txt");

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        } finally {
         
            try {
                if (reader != null) reader.close();
                if (writer != null) writer.close();
            } catch (IOException ex) {
                System.out.println("Error closing resources: " + ex.getMessage());
            }
        }
    }
}