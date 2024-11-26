package Task1;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Gallery {
    private static Map<String, Gallery> instances = new HashMap<>();
    private List<Picture> pictures;
    private String name;
    private String information;

    private Gallery(String name) {
        this.name = name;
    }

    public static Gallery getInstance(String name) {
        if (instances.containsKey(name)) {
            return instances.get(name);
        } else {
            Gallery newGallery = new Gallery(name);
            instances.put(name, newGallery);
            return newGallery;
        }
    }


    public boolean addPicture(Picture picture) {
        if (pictures == null) {
            pictures = new ArrayList<>();
        }
        return pictures.add(picture);
    }

    public boolean removePicture(Picture picture) {
        return pictures.remove(picture);
    }
    public String describePicture(Picture picture) {
        if (pictures.contains(picture)) {
            return picture.toString();
        }
        return "Task1.Picture not found in this gallery.";
    }

    public Picture getPicture(String name) {
        for (Picture picture : pictures) {
            if (picture.getName().equals(name)) {
                return picture;
            }
        }
        return null;
    }
    public List<Picture> getPictures() {
        return new ArrayList<>(pictures);
    }
    public long getPictureCount() {
        return pictures.size();
    }

    public String getName() {
        return name;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }
}