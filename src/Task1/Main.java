package Task1;

public class Main {
    public static void main(String[] args) {

        Picture picture1 = new Picture("Black Suprematic Square", 1915, "Kazimir Malevich");
        Picture picture2 = new Picture("Die Toteninsel", 1901, "Arnold Bocklin");
        Picture picture3 = new Picture("Summer Field of Suprematism", 2021, "Sakramar");
        Picture picture4 = new Picture("The Soldier And The Death", 1917, "Hans Larwin");
        Picture picture5 = new Picture("The Shore of Oblivion", 1889, "Eugen Bracht");
        Picture picture6 = new Picture("Empty canvas", 2024, "???");

        System.out.println(picture1.getName());
        System.out.println(picture1.getYear());
        System.out.println(picture1.getAuthor());

        System.out.println();

        System.out.println(picture2.toString());

        Gallery gallery1 = Gallery.getInstance("Task1.Gallery of suprematism");
        Gallery gallery2 = Gallery.getInstance("Melancholic paintings gallery");

        gallery1.addPicture(picture1);
        gallery1.addPicture(picture3);
        gallery1.addPicture(picture6);

        gallery2.addPicture(picture2);
        gallery2.addPicture(picture4);
        gallery2.addPicture(picture5);

        System.out.println();

        System.out.println(gallery1.describePicture(picture3));

        System.out.println();

        System.out.println(gallery1.getPicture("Empty canvas"));
        gallery1.removePicture(picture6);
        System.out.println(gallery1.getPicture("Empty canvas"));

        System.out.println();

        System.out.println(gallery2.getName());
        System.out.println(gallery2.getPictures());
        System.out.println("Pictures in Melancholic paintings gallery: " + gallery2.getPictureCount());

        System.out.println();

        System.out.println(gallery1.getName());
        gallery1.setInformation("The gallery, made by glorious Suprematic Lord.");
        System.out.println(gallery1.getInformation());

    }
}