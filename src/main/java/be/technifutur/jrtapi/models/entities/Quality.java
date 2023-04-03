package be.technifutur.jrtapi.models.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Getter
@Setter
public class Quality {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "quality_id", nullable = false)
    private Long id;

    @Column(nullable = false)
    private String content;


    @ManyToMany(mappedBy = "qualities")
    private Set<Stagiaire> stagiaires = new LinkedHashSet<>();

}
