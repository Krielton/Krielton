import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Maps {
    public static void main(String[] args) {
    Map<String, Integer> product  = new HashMap<>();

    Scanner sc = new Scanner(System.in);

    product.put("Baracklé", 54);
    product.put("Almalé", 103);

    System.out.println("Which of the product's quantity do you want to check?");
    System.out.print("You: ");
    String productName = sc.next();
    int productQuantity = 0;
    String input = "";

    if (product.containsKey(productName)) {
        System.out.println("Quantity: " + product.get(productName));

    }
    else {
        System.out.println("This product is not available in your store. Do you want to add it?");
        System.out.print("You: ");
        input = sc.next();

        if (input.equalsIgnoreCase("yes")) {
            System.out.print("Product name: ");
            productName = sc.next();
            System.out.print("Product quantity: ");
            productQuantity = sc.nextInt();

            product.put(productName, productQuantity);

        } else {
            System.out.println("OK, goodbye!");
        }


    }

    }
}
