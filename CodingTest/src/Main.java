public class Main {
    public static void main(String[] args) {
        String s = "Paiza";
        for(int i = 0; i < s.length()+2; i++){
            System.out.print("+");
        }
        System.out.println();
        System.out.println("+" + s + "+");
        for(int i = 0; i < s.length()+2; i++){
            System.out.print("+");
        }
    }
}