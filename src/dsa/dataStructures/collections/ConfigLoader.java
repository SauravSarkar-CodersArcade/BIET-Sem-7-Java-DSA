package dsa.dataStructures.collections;
import java.io.FileReader;
import java.util.Properties;
public class ConfigLoader {
    public static void main(String[] args) throws Exception{
        Properties props = new Properties();
        // Relative Path
        //props.load(new FileReader("./application.properties"));
        // Absolute Path
        props.load(new FileReader
                ("D:\\Idea Projects\\BIET-ISE-VII-DSA\\application.properties"));
        String dbUrl = props.getProperty("db.url");
        String dbUsername = props.getProperty("db.username");
        System.out.println("DB URL: " + dbUrl);
        System.out.println("DB Username: " + dbUsername);
    }
}
