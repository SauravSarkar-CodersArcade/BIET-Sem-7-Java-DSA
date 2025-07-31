package strings;
public class UpperToLowerOrLowerToUpper {
    static String upperToLower(String s){
        String result = "";
        for (int i=0; i<s.length(); i++){
            if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
                result += (char) (s.charAt(i) + 32);
            }else {
                result += s.charAt(i);
            }
        }
        return result;
    }
    static String lowerToUpper(String s){
        String result = "";
        for (int i=0; i<s.length(); i++){
            if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
                result += (char)(s.charAt(i) - 32);
            }else {
                result += s.charAt(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String lower = "bIeT";
        String upper = "JaVa";
        System.out.println(lowerToUpper(lower));
        System.out.println(upperToLower(upper));
        String name = "Anup";
        System.out.println(name.toUpperCase());
        System.out.println(name);
    }
}
