import br.com.gpbreis.Product;

import java.io.Console;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ProductTester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int maxSize = 0;

        int tempItem = 0;
        String tempName = "";
        int tempUnitsInStock = 0;
        double tempPrice = 0;

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

        Product[] products = new Product[maxSize];

        if (maxSize == 0) {
            System.out.println("No products required!");
        } else {
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
        }
        in.close();

        for (Product product: products) {
            System.out.println(product);
            System.out.println();
        }

    }
}
