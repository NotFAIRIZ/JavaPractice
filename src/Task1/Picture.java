package Task1;

public class Picture {
    private String name;
    private int year;
    private String author;

    Picture(String name, int year, String author) {
        this.author = author;
        this.year = year;
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Task1.Picture{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", author='" + author + '\'' +
                '}';
    }
}