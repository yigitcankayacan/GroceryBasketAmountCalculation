import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double total;

        double tomatoPrice = 3.14;
        double cucumberPrice = 4.11;
        double pepperPrice = 2.22;
        double applePrice = 0.95;


        System.out.print("Please enter your tomato weight(kg): ");
        double tomato = scanner.nextDouble();
        System.out.print("Please enter your cucumber weight(kg): ");
        double cucumber = scanner.nextDouble();
        System.out.print("Please enter your pepper weight(kg): ");
        double pepper = scanner.nextDouble();
        System.out.print("Please enter your apple weight(kg): ");
        double apple = scanner.nextDouble();

        total = tomato * tomatoPrice + cucumber * cucumberPrice + pepper * pepperPrice + apple * applePrice;
        System.out.println("Grocery basket amount= " + total);


    }
}

