package kea.socialmedia.service;

import kea.socialmedia.models.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {

    List<Post> postList = new ArrayList<>();

    public List<Post> getAllPost() {
        return postList;
    }

    public void addPost(Post post) {
        postList.add(post);
    }

}
