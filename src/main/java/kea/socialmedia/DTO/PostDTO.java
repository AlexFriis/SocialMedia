package kea.socialmedia.DTO;

import kea.socialmedia.models.Post;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

public class PostDTO {

   private List<Post> posts;

    public PostDTO() {
        this.posts = new ArrayList<>();
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public void addPost(Post post) {
        this.posts.add(post);
    }

    public void setPrivate(Post post) { this.posts.set(i)}
}
