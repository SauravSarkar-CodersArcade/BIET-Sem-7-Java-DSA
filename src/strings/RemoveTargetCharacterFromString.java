package strings;
public class RemoveTargetCharacterFromString {
    public static void main(String[] args) {
        String str = "JAVA PROGRAMMING";
        char ch = 'A';
        String result = removeDuplicates(str, ch);
        System.out.println(result); // "JV PROGRMMING"
    }
    static String removeDuplicates(String str, char ch){
        String finalStr = "";
        for (int i=0; i<str.length(); i++){
            if(str.charAt(i) != ch){
                finalStr += str.charAt(i);
            }
        }
        return finalStr;
    }
}
