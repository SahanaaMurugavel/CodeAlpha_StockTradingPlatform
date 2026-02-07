import java.util.Scanner;

class User {
    double balance = 10000;

    void buyStock(double price) {
        if (balance >= price) {
            balance -= price;
            System.out.println("Stock bought successfully.");
        } else {
            System.out.println("Not enough balance.");
        }
    }

    void sellStock(double price) {
        balance += price;
        System.out.println("Stock sold successfully.");
    }
}

public class StockTradingPlatform {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        User user = new User();
        double stockPrice = 500;

        System.out.println("Stock Price: ₹" + stockPrice);
        System.out.println("1. Buy Stock");
        System.out.println("2. Sell Stock");
        System.out.print("Choose option: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            user.buyStock(stockPrice);
        } else if (choice == 2) {
            user.sellStock(stockPrice);
        } else {
            System.out.println("Invalid choice");
        }

        System.out.println("Remaining Balance: ₹" + user.balance);
        sc.close();
    }
}
