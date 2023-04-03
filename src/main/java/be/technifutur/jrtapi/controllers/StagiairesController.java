package be.technifutur.jrtapi.controllers;

import be.technifutur.jrtapi.models.entities.Comment;
import be.technifutur.jrtapi.models.entities.DTO.CommentDTO;
import be.technifutur.jrtapi.models.entities.DTO.StagiaireDTO;
import be.technifutur.jrtapi.models.forms.CommentForm;
import be.technifutur.jrtapi.services.StagiairesService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class StagiairesController {

    private final StagiairesService service;

    public StagiairesController(StagiairesService service) {
        this.service = service;
    }

    @GetMapping("/stagiaires/all")
    public List<StagiaireDTO> getAll(){
        return service.getAll();
    }

    @PostMapping("/stagiaires/new-comment")
    public void newComment(@RequestBody CommentDTO commentDTO){
        service.commentDTOToEntity(commentDTO);
    }














}
