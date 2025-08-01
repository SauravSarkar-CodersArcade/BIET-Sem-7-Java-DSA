package exceptions;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class E4 {
    public static void main(String[] args) throws IOException {
        String str;
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            System.out.println("Enter any data or press any key:");
            str = br.readLine();
            System.out.println(str);
            // br.close(); Not required ??
        }
    }
}
