import java.util.Arrays;

public class Picture {
    private String canvas;
    private String name;
    private int year;
    private String author;
    private String theme;
    private String category;
    private Size size;
    private String[] colors;
    private boolean isWithFrames;

    public String getCanvas() {
        return canvas;
    }

    public void setCanvas(String canvas) {
        this.canvas = canvas;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public String[] getColors() {
        return colors;
    }

    public void setColors(String[] colors) {
        this.colors = colors;
    }

    public boolean isWithFrames() {
        return isWithFrames;
    }

    public void setWithFrames(boolean withFrames) {
        isWithFrames = withFrames;
    }

    @Override
    public String toString() {
        return "Picture{" +
                "canvas='" + canvas + '\'' +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", author='" + author + '\'' +
                ", theme='" + theme + '\'' +
                ", category='" + category + '\'' +
                ", size=" + size +
                ", colors=" + Arrays.toString(colors) +
                ", isWithFrames=" + isWithFrames +
                '}';
    }
}
