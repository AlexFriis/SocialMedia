package kea.socialmedia.service;

import kea.socialmedia.models.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class InMemoryPostService implements PostService {

    static Map<Long, Post> postDB = new HashMap<>();


    @Override
    public List<Post> getAll() {
        return new ArrayList<>(postDB.values());
    }

    @Override
    public void saveAll(List<Post> posts) {
        long nextId = getNextId();
        for (Post post : posts) {
            if (post.getId() == 0) {
                post.setId(nextId++);
            }
        }
        Map<Long, Post> postMap = posts.stream()
                .collect(Collectors.toMap(Post::getId, Function.identity()));

        postDB.putAll(postMap);
    }

    @Override
    public void save(Post post) {

    }

    private Long getNextId() {
        return postDB.keySet()
                .stream()
                .mapToLong(value -> value)
                .max()
                .orElse(0) + 1;
    }
}
