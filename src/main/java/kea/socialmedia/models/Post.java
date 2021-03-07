package kea.socialmedia.models;

public class Post {

    private String title;
    private String content;
    private String date;
    private boolean publicOrPrivate;

    public Post(String title, String content, String date, boolean publicOrPrivate) {
        this.title = title;
        this.content = content;
        this.date = date;
        this.publicOrPrivate = publicOrPrivate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public boolean isPublicOrPrivate() {
        return publicOrPrivate;
    }

    public void setPublicOrPrivate(boolean publicOrPrivate) {
        this.publicOrPrivate = publicOrPrivate;
    }
}