public class Main {
    public static void main(String[] args) {

        int x = 1;
        int y = 100;
        for (int i = x; i < y; i++){
            if (i%3 == 0 && i%5 == 0){
                System.out.println("FIZZBUZZ");
            } else if (i%3 == 0){
                System.out.println("FIZZ");
            } else if (i%5 == 0){
                System.out.println("BUZZ");
        } else {
                System.out.println(i);
            }
        }
        System.out.println();
    }
}