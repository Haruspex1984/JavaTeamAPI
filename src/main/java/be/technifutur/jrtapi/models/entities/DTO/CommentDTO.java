package be.technifutur.jrtapi.models.entities.DTO;

import be.technifutur.jrtapi.models.entities.Comment;
import be.technifutur.jrtapi.models.entities.Quality;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;

import java.time.LocalDateTime;

@Data
@Getter
@Builder
public class CommentDTO {
    private Long id;
    private String author;
    private String content;
    private LocalDateTime creationDate;
    private Long stagiaireId;

    public static CommentDTO fromEntity(Comment entity) {
        if (entity == null) {
            return null;
        }
        return CommentDTO.builder()
                .author(entity.getAuthor())
                .content(entity.getContent())
                .creationDate(entity.getCreationDate())

                .build();
    }
}
