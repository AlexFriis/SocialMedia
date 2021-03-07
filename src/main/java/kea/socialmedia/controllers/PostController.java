package kea.socialmedia.controllers;


import kea.socialmedia.DTO.PostDTO;
import kea.socialmedia.models.Post;
import kea.socialmedia.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/gameMedia/")

public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping("dashboard")
    public String showDashboard(Model model) {
        model.addAttribute("posts", postService.getAll());
        return "gameMedia/dashboard";
    }

    @GetMapping("submit")
    public String showSubmitPostForm(Model model) {
        PostDTO postsForm = new PostDTO();
        postsForm.addPost(new Post());
        model.addAttribute("form", postsForm);

        return "gameMedia/submit-post";
    }

    @PostMapping("submit-post")
    public String savePost(@ModelAttribute PostDTO form, Model model) {
        postService.saveAll(form.getPosts());

        model.addAttribute("posts", postService.getAll());

        return "redirect:/gameMedia/dashboard";
    }

}
