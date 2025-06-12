import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Add {

    private static List<Comic> comicDatabase = new ArrayList<>();

    private static void addNewComic(Comic newComic) {
        comicDatabase.add(newComic);
        System.out.println("\nSuccessfully added new comic: '" + newComic.title + "'");
    }

    private static void displayAllComics() {
        System.out.println("\n--- All Comics in Library ---");
        if (comicDatabase.isEmpty()) {
            System.out.println("The library is currently empty.");
        } else {
            for (Comic comic : comicDatabase) {
                System.out.println(comic);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Comic Book Entry System ---");
        System.out.println("\nPlease enter the new comic's details:");

        System.out.print("Enter Comic ID: ");
        int comicId = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Title: ");
        String title = scanner.nextLine();

        System.out.print("Enter Author: ");
        String author = scanner.nextLine();

        System.out.print("Enter Description: ");
        String description = scanner.nextLine();

        System.out.print("Enter Cover Image file name: ");
        String coverImage = scanner.nextLine();

        System.out.print("Enter Release Date (e.g., 2025-06-12): ");
        String releaseDate = scanner.nextLine();

        System.out.print("Enter Status (e.g., Ongoing, Completed): ");
        String status = scanner.nextLine();

        System.out.print("Enter Category Name: ");
        String category = scanner.nextLine();

        Comic newComic = new Comic(comicId, title, author, description, coverImage, releaseDate, status, category);

        addNewComic(newComic);
        displayAllComics();
        scanner.close();
    }
}