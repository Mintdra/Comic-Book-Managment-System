class Category {
    private int category_id;
    public String name;
    public String description;
    public Category(int category_id, String name, String description) {
        this.category_id = category_id;
        this.name = name;
        this.description = description;
    }
}

// List the genres of comics, each genre has comics or none