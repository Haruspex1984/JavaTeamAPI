package be.technifutur.jrtapi.repositories;

import be.technifutur.jrtapi.models.entities.Stagiaire;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StagiaireRepository extends JpaRepository<Stagiaire,Long> {
}
