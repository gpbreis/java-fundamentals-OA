import br.com.gpbreis.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductTester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int tempItem = 0;
        String tempName;
        int tempUnitsInStock = 0;
        double tempPrice = 0;

        System.out.print("Enter the code number for product 1: ");
        tempItem = in.nextInt();
        in.nextLine();
        System.out.print("Enter the name of the product: ");
        tempName = in.nextLine();
        System.out.print("Enter the quantity of products in stock: ");
        tempUnitsInStock = in.nextInt();
        System.out.print("Enter the price of the product: ");
        tempPrice = in.nextDouble();

        Product p1 = new Product(tempItem, tempName, tempUnitsInStock, tempPrice);

        System.out.print("Enter the code number for product 2: ");
        tempItem = in.nextInt();
        in.nextLine();
        System.out.print("Enter the name of the product: ");
        tempName = in.nextLine();
        System.out.print("Enter the quantity of products in stock: ");
        tempUnitsInStock = in.nextInt();
        System.out.print("Enter the price of the product: ");
        tempPrice = in.nextDouble();

        in.close();

        Product p2 = new Product(tempItem, tempName, tempUnitsInStock, tempPrice);
        Product p3 = new Product();
        Product p4 = new Product();
        Product p5 = new Product(5, "Fiio K5 PRO ESS", 1, 100);
        Product p6 = new Product(6, "Hifiman he400se", 1, 250);

        p3.setItem(3);
        p3.setName("Samsung Galaxy S22 Ultra");
        p3.setUnitsInStock(1);
        p3.setPrice(900);

        p4.setItem(4);
        p4.setName("Samsung Galaxy S8");
        p4.setUnitsInStock(1);
        p4.setPrice(600);

        p6.setActive(false);

        List<Product> productList = new ArrayList<>();
        productList.add(p1);
        productList.add(p2);
        productList.add(p3);
        productList.add(p4);
        productList.add(p5);
        productList.add(p6);

        for (Product product: productList) {
            System.out.println(product.toString());
            System.out.println();
        }
    }
}
