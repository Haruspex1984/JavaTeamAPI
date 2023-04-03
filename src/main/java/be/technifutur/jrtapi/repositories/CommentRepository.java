package be.technifutur.jrtapi.repositories;

import be.technifutur.jrtapi.models.entities.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment,Long> {
}
