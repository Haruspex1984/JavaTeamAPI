package be.technifutur.jrtapi.repositories;

import be.technifutur.jrtapi.models.entities.Quality;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QualityRepository extends JpaRepository<Quality,Long> {
}
