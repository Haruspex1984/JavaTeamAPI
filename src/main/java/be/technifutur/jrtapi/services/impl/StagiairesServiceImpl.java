package be.technifutur.jrtapi.services.impl;

import be.technifutur.jrtapi.models.entities.Comment;
import be.technifutur.jrtapi.models.entities.DTO.CommentDTO;
import be.technifutur.jrtapi.models.entities.DTO.StagiaireDTO;

import be.technifutur.jrtapi.models.entities.Stagiaire;
import be.technifutur.jrtapi.repositories.CommentRepository;
import be.technifutur.jrtapi.repositories.StagiaireRepository;
import be.technifutur.jrtapi.services.StagiairesService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class StagiairesServiceImpl implements StagiairesService {

    private final StagiaireRepository stagiaireRepository;
    private final CommentRepository commentRepository;

    public StagiairesServiceImpl(StagiaireRepository stagiaireRepository, CommentRepository commentRepository) {
        this.stagiaireRepository = stagiaireRepository;
        this.commentRepository = commentRepository;
    }

    @Override
    public List<StagiaireDTO> getAll() {
        return stagiaireRepository.findAll().stream().map(StagiaireDTO::fromEntity).toList();
    }

    @Override
    public Comment commentDTOToEntity(CommentDTO commentDTO) {
        Comment comment = new Comment();
        Stagiaire stagiaire = stagiaireRepository.findById(commentDTO.getStagiaireId()).orElseThrow();
        comment.setAuthor(commentDTO.getAuthor());
        comment.setContent(commentDTO.getContent());
        comment.setCreationDate(LocalDateTime.now());
        stagiaire.getComments().add(comment);
        commentRepository.save(comment);
        stagiaireRepository.save(stagiaire);
        return comment;
    }
}
