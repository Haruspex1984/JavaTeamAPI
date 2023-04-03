package be.technifutur.jrtapi.models.entities.DTO;

import be.technifutur.jrtapi.models.entities.Quality;
import be.technifutur.jrtapi.models.entities.Stagiaire;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
@Builder
public class StagiaireDTO {

    private Long id;
    private String firstname;
    private String lastname;
    private String image;
    private LocalDate birthdate;
    private List<QualityDTO> qualities;
    private List<CommentDTO> comments;

    public static StagiaireDTO fromEntity(Stagiaire entity) {
        if (entity == null) {
            return null;
        }
        return StagiaireDTO.builder()
                .id(entity.getId())
                .birthdate(entity.getBirthdate())
                .firstname(entity.getFirstname()).lastname(entity.getLastname())
                .image(entity.getImage())
                .comments(entity.getComments().stream().map(CommentDTO::fromEntity).toList())
                .qualities(entity.getQualities().stream().map(QualityDTO::fromEntity).toList()).build();
    }
}
