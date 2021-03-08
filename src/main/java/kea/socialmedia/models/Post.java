package kea.socialmedia.models;

public class Post {

    private long id;
    private String title;
    private String author;
    private String subject;
    private String content;
    private String date;
    private boolean publicPost;

    public Post() {
    }

    public Post(long id, String title, String author, String content, String date, boolean publicPost) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.content = content;
        this.date = date;
        this.publicPost = publicPost;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
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

    public boolean isPublicPost() {
        return publicPost;
    }

    public void setPublicPost(boolean publicPost) {
        this.publicPost = publicPost;
    }
}