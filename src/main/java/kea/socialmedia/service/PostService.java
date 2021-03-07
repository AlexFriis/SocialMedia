package kea.socialmedia.service;

import kea.socialmedia.models.Post;

import java.util.List;

public interface PostService {

    List<Post> getAll();

    void saveAll(List<Post> posts);

    void save(Post post);

}
