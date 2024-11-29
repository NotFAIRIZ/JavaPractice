public class UkrainePictureBuilder extends PictureBuilder {

    public UkrainePictureBuilder() {
    }

    @Override
    public UkrainePictureBuilder setBasicParams(String name, int year, String author) {
        picture.setName(name);
        picture.setYear(year);
        picture.setAuthor(author);
        return this;
    }

    @Override
    public UkrainePictureBuilder setSizeParms(Size size) {
        picture.setSize(size);
        return this;
    }

    @Override
    public UkrainePictureBuilder setColorParms(String[] colors, boolean isWithFrames, String canvas) {
        picture.setColors(colors);
        picture.setWithFrames(isWithFrames);
        picture.setCanvas(canvas);
        return this;
    }

    @Override
    public UkrainePictureBuilder setCategoryParms(String category, String theme) {
        picture.setCategory(category);
        picture.setTheme(theme);
        return this;
    }
}
