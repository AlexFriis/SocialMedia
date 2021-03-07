package kea.socialmedia.controllers;


import kea.socialmedia.models.Post;
import kea.socialmedia.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/gameMedia/")

public class PostController {

    private final PostService postService;

    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("dashboard")
    public String showDashboard(Model model) {
        model.addAttribute("posts", postService.getAllPost());
        return "dashboard";
    }

    @GetMapping("submit")
    public String showSubmitPostForm(Post post) {
        return "submit-post";
    }

    @PostMapping("submit-post")
    public String addStudent(@Validated Post post, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "submit-post";
        }
        model.addAttribute("successMessage", "Post has been registered successfully!");
        model.addAttribute("post", post);
        postService.addPost(post);
        return "dashboard";
    }

}
