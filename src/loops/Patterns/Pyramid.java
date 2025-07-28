package loops.Patterns;
public class Pyramid {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1; i<=n; i++){
            // Spaces
            for(int space = 1; space <= n-i; space++){
                System.out.print("   ");
            }
            // Stars
            for (int star = 1; star <= 2 * i - 1; star++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
