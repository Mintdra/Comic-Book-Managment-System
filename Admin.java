import java.util.Scanner;

public class Admin {

    private int admin_id;
    public String name;
    private String email;
    private String password;

    private static Admin instance = null;

    private Admin(int admin_id, String name, String email, String password) {
        this.admin_id = admin_id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public static Admin getInstance() {
        if (instance == null) {
            instance = new Admin(1001, "IhateCoding", "levi@scouts.com", "secretpass");
        }
        return instance;
    }

    // This method prompts the user, creates and returns the Comic
        Comic uploadComic() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Comic ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Title: ");
        String title = scanner.nextLine();

        System.out.print("Enter Author: ");
        String author = scanner.nextLine();

        System.out.print("Enter Description: ");
        String description = scanner.nextLine();

        System.out.print("Enter Cover Image URL: ");
        String cover = scanner.nextLine();

        System.out.print("Enter Release Date: ");
        String date = scanner.nextLine();

        System.out.print("Enter Status: ");
        String status = scanner.nextLine();

        System.out.print("Enter Category: ");
        String category = scanner.nextLine();

        Comic comic = Comic.createComic(id, title, author, description, cover, date, status, category);
        System.out.println("Comic '" + comic.title + "' uploaded by Admin " + name);
        return comic;
    }

    public void viewComicInfo(Comic comic) {
        System.out.println("Admin: " + name + " (ID: " + admin_id + ")");
        comic.displayInfo();
    }
}
