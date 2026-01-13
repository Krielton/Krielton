package for_each_Loop;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Set<String> lodge  = new HashSet<>();

        String input = "";
        String username = "";

        while (true) {
            System.out.println("1. Login\n2. Logout\n3. Show logged in users\n4. Exit");
            input = sc.next().toLowerCase();
            if (input.equals("login") || input.equals("1")) {
                System.out.print("\nUsername: ");
                username = sc.next().toLowerCase();
                System.out.println();

                if (lodge.contains(username)) {
                    System.out.println("Yoo can't log in twice.\n");
                } else {
                    lodge.add(username);
                    System.out.println("You've' logged in succesfully!\n");
                }
            } else if (input.equals("logout") || input.equals("2")) {
                System.out.print("\nUsername: ");
                username = sc.next().toLowerCase();
                if (!lodge.contains(username)) {
                    System.out.println("\nYou're not logged in yet.\n");
                } else {
                lodge.remove(username);
                System.out.println("\nYou've logged out succesfully!\n");
            }
        } else if (input.equals("show") || input.equals("3")) {
                System.out.println("\n" + lodge);
                System.out.println();
            }
            else if (input.equals("exit") || input.equals("4")) {
                System.out.println("\nGoodbye!");
                break;
            } else {
                System.out.println("\nWrong input. Choose from the options below:");
            }


        }

    }
}