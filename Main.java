import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Admin admin = Admin.getInstance();
        Comic comic = null;

        while (true) {
            System.out.println("\n=== Comic Management System ===");
            System.out.println("1. Upload Comic");
            System.out.println("2. View Comic Info");
            System.out.println("3. Exit");
            System.out.print("Choose option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    comic = admin.uploadComic();
                    break;
                case 2:
                    if (comic != null) {
                        admin.viewComicInfo(comic);
                    } else {
                        System.out.println("No comic uploaded yet.");
                    }
                    break;
                case 3:
                    System.out.println("Exiting system...");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
