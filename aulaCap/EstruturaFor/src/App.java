public class App {
    public static void main(String[] args) throws Exception {
        
        for(int i = 0; i < 10; i++) {
            if (i == 5) {
                System.out.println("i is 5");
                break;
            } else {
                System.out.println("i is not 5");
            }

            System.out.println("i is " + i);

            if (i == 7) {
                System.out.println("i is 7");
                continue;
            } else {
                System.out.println("i is not 7");
            }
        }
    }
}
