import java.util.Scanner;

public class Pages {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                System.out.print("please enter age:");
                int age = scanner.nextInt();
              String name = scanner.nextLine();
              System.out.println( age + " year olds must read " + (100-age) + " pages before giving up on a book");






    }
}
