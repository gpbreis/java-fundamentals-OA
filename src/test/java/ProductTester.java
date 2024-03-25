import br.com.gpbreis.Product;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProductTester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int maxSize, menuChoice = 0;

        maxSize = getNumProducts(in);
        if (maxSize == 0 ) {
            System.out.println("No products required!");
        } else {

            Product[] products = new Product[maxSize];
            addToInventory(products, in);
            do {

                getMenuOption(in);
            } while (menuChoice != 0);
        }
    }

    public static int getMenuOption(Scanner in) {
        int menuOption = 0;

        do {
            System.out.println("1. View Inventory\n" +
                                "2. Add Stock\n" +
                                "3. Deduct Stock\n" +
                                "4. Discontinue Product\n" +
                                "0. Exit\n" +
                                "Please enter a menu option:");
            in.nextLine();
            menuOption = in.nextInt();

            if (menuOption < 0 || menuOption > 4) {
                System.out.println("Incorrect option");
            }
        } while (menuOption < 0);

        return menuOption;
    }

    public static void displayInventory(Product[] products) {

        for (Product product: products) {
            System.out.println(product);
            System.out.println();
        }
    }

    public static void addToInventory(Product[] products, Scanner in) {

        int tempItem = 0;
        String tempName = "";
        int tempUnitsInStock = 0;
        double tempPrice = 0;

        for (int i = 0; i < products.length; i++) {
            System.out.printf("Enter the code number for product %s: ", i + 1);
            tempItem = in.nextInt();
            in.nextLine();
            System.out.print("Enter the name of the product: ");
            tempName = in.nextLine();
            System.out.print("Enter the quantity of products in stock: ");
            tempUnitsInStock = in.nextInt();
            System.out.print("Enter the price of the product: ");
            tempPrice = in.nextDouble();
            products[i] = new Product(tempItem, tempName, tempUnitsInStock, tempPrice);
            System.out.println();
        }

        //in.close();
    }

    public static int getNumProducts(Scanner in) {
        int maxSize = 0;

        do {
            try {
                System.out.println("Enter the number of products you would like to add" +
                        "\nEnter 0 (zero) if you do not wish to add products");
                maxSize = in.nextInt();

                if (maxSize < 0) {
                    System.out.println("Incorrect Value entered");
                }
            } catch (InputMismatchException e) {
                in.nextLine();
                System.out.println("Incorrect data type entered!");
                maxSize = in.nextInt();
            }
        } while (maxSize < 0);

        return maxSize;
    }
}
