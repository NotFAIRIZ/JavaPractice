public abstract class PictureBuilder {
    protected Picture picture;

    public PictureBuilder() {
        picture = new Picture();
    }

    public abstract PictureBuilder setBasicParams(String name, int year, String author);

    public abstract PictureBuilder setSizeParms(Size size);

    public abstract PictureBuilder setColorParms(String[] colors, boolean isWithFrames, String canvas);

    public abstract PictureBuilder setCategoryParms(String category, String theme);

    public Picture build() {
        return picture;
    }



}
