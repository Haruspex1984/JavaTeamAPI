package be.technifutur.jrtapi.models.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.*;

@Entity
@Getter
@Setter
public class Stagiaire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "stagiaire_id", nullable = false)
    private Long id;


    @Column(nullable = false)
    private String firstname;

    @Column(nullable = false)
    private String lastname;

    @Column(nullable = false)
    private LocalDate birthdate;

    private String image;

    @ManyToMany
    @JoinTable(name = "stagiaire_qualities",
            joinColumns = @JoinColumn(name = "stagiaire_id"),
            inverseJoinColumns = @JoinColumn(name = "quality_id"))
    private Set<Quality> qualities = new LinkedHashSet<>();

    @OneToMany(orphanRemoval = true)
    private Set<Comment> comments = new LinkedHashSet<>();

}
