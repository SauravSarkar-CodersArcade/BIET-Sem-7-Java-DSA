package dsa.dataStructures.collections;
import java.io.FileWriter;
import java.util.Properties;
public class SaveProperties {
    public static void main(String[] args) throws Exception{
        Properties props = new Properties();
        props.setProperty("app.version", "1.2.0");
        props.setProperty("app.maintainer", "Arun");
        props.setProperty("app.organisation", "IBM");
        props.store(new FileWriter("./app.properties"),
                "Application Settings");
    }
}
