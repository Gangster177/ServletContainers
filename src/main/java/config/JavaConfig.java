package config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import controller.PostController;
import repository.PostRepository;
import repository.PostRepositoryStubImpl;
import service.PostService;

@Configuration
public class JavaConfig {
    @Bean
    public PostController postController(PostService service) {
        return new PostController(service);
    }

    @Bean
    public PostService postService(PostRepository repository) {
        return new PostService(repository);
    }

    @Bean
    public PostRepository postRepository() {
        return new PostRepositoryStubImpl();
    }
}