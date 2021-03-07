package kea.socialmedia.service;

import kea.socialmedia.models.Post;

import java.util.ArrayList;
import java.util.List;

public class PostService {

    List<Post> postList = new ArrayList<>();

    public List<Post> getAllPost() {
        return postList;
    }

    public void addPost(Post post) {
        postList.add(post);
    }
}
