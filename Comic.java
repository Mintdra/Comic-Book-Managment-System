
public class Comic {

    public int comic_id;
    public String title;
    public String author;
    public String description;
    public String cover_image;
    public String release_date;
    public String status;
    public int rating;
    public int views;
    public String category;
    public String comments;

    public static Comic createComic(int comic_id, String title, String author, String description, String cover_image, String release_date, String status, String category) {
        Comic comic = new Comic();
        comic.comic_id = comic_id;
        comic.title = title;
        comic.author = author;
        comic.description = description;
        comic.cover_image = cover_image;
        comic.release_date = release_date;
        comic.status = status;
        comic.category = category;
        return comic;
    }

    public static Comic comicStats(String comments, int rating, int views) {
        Comic comic = new Comic();
        comic.comments = comments;
        comic.rating = rating;
        comic.views = views;
        return comic;
    }
    
    // Display comic details
    public void displayInfo() {
        System.out.println("Comic Details:");
        System.out.println("ID: " + comic_id);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Category: " + category);
        System.out.println("Status: " + status);
        System.out.println("Release Date: " + release_date);
        System.out.println("Description: " + description);
        System.out.println("Cover Image: " + cover_image);
        System.out.println("---------------------------");
    }
}
