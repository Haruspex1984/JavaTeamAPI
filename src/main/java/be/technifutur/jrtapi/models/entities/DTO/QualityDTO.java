package be.technifutur.jrtapi.models.entities.DTO;

import be.technifutur.jrtapi.models.entities.Quality;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class QualityDTO {
    private String content;
    public static QualityDTO fromEntity(Quality entity) {
        if (entity == null) {
            return null;
        }
        return QualityDTO.builder().content(entity.getContent()).build();
    }
}
