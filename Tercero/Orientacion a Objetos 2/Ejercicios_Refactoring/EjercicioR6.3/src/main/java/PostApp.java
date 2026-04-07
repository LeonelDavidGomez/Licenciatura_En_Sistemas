import java.util.List;
import java.util.stream.Collectors;

public class PostApp {
	private List<Post> posts;

    public List<Post> ultimosPosts(Usuario user, int cantidad) {
        // También hice replace temp with query
        return filtrarPrimerosNPosts(cantidad, ordenarPostsPorFecha(getPostsOtrosUsuarios(user)));
    }

    private List<Post> getPostsOtrosUsuarios(Usuario user) {
        return posts.stream().filter(
                post -> !post.getUsuario().equals(user)) // ¿Delegación a Post? Hay envidia de atributos
                .collect(Collectors.toList());
    }

    private List<Post> ordenarPostsPorFecha(List<Post> postsOtrosUsuarios) {
        return postsOtrosUsuarios.stream()
                .sorted((post1, post2) -> post1.getFecha().compareTo(post2.getFecha()))
                .collect(Collectors.toList());
    }

    private List<Post> filtrarPrimerosNPosts(int cantidad, List<Post> postsOtrosUsuarios) {
        return postsOtrosUsuarios.stream().limit(cantidad).collect(Collectors.toList());
    }

}
