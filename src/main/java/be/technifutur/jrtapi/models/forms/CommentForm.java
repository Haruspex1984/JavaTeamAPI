package be.technifutur.jrtapi.models.forms;

import be.technifutur.jrtapi.models.entities.Comment;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CommentForm {
    @NotNull
    private String author;
    @NotNull
    private String content;

    public Comment toEntity(){
        Comment newComment = new Comment();
        newComment.setAuthor(author);
        newComment.setContent(content);
        return newComment;
    }



}
