package data;

public class Step {

    private int id;
    private String shortDescription;

    private String description;
    private String videoURL;
    private String thumbnailURL;


    public Step(int id, String shortDescription, String description, String videoURL, String thumbnailURL) {
        this.id = id;
        this.shortDescription = shortDescription;
        this.description = description;
        this.videoURL = videoURL;
        this.thumbnailURL = thumbnailURL;
    }
}
