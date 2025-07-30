package basics;
public class MaxRegionsMaxPieces {
    static int maxRegions(int lines){
        int n = lines;
        return (n * (n+1) / 2) + 1;
    }
    static int maxPieces(int cuts){
        int n = cuts;
        return (n * (n+1) / 2) + 1;
    }
    public static void main(String[] args) {
        System.out.println("Max Regions: " + maxRegions(4));
        System.out.println("Max Pieces: " + maxPieces(4));
    }
}
