import com.fasterxml.jackson.annotation.JsonProperty;

public class Info {
    private final String id;
    private final String text;
    private final String type;
    private final String user;

    public String getUpvote() {
        return upvote;
    }

    private final String upvote;

    public Info( @JsonProperty("id") String id,
                 @JsonProperty("text") String text,
                 @JsonProperty("type") String type,
                 @JsonProperty("user") String user,
                 @JsonProperty("upvotes") String upvote
    ) {
        this.id = id;
        this.text = text;
        this.type = type;
        this.user = user;
        this.upvote = upvote;
    }


    @Override
    public String toString() {
        return "Info{" +
                "id='" + id + '\'' +
                ", text='" + text + '\'' +
                ", type='" + type + '\'' +
                ", user='" + user + '\'' +
                ", upvotes='" + upvote + '\'' +
                '}';
    }
}
