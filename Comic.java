
public class Comic {

    int comic_id;
    String title;
    String author;
    String description;
    String cover_image;
    String release_date;
    String status;
    int rating;
    int views;
    String category;
    String comments;

     public Comic(int comic_id, String title, String author, String description, String cover_image,
                 String release_date, String status, String category) {
        this.comic_id = comic_id;
        this.title = title;
        this.author = author;
        this.description = description;
        this.cover_image = cover_image;
        this.release_date = release_date;
        this.status = status;
        this.category = category;
    }

    @Override
    public String toString() {
        return "ID: " + comic_id
                + "\nTitle: " + title
                + "\nAuthor: " + author
                + "\nCategory: " + category
                + "\nStatus: " + status
                + "\nRelease Date: " + release_date
                + "\nDescription: " + description
                + "\nCover Image: " + cover_image
                + "\n---------------------------";
    }
}