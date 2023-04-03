package be.technifutur.jrtapi.services;

import be.technifutur.jrtapi.models.entities.Comment;
import be.technifutur.jrtapi.models.entities.DTO.CommentDTO;
import be.technifutur.jrtapi.models.entities.DTO.StagiaireDTO;
import be.technifutur.jrtapi.models.forms.CommentForm;

import java.util.List;

public interface StagiairesService {

    List<StagiaireDTO> getAll();

    Comment commentDTOToEntity(CommentDTO commentDTO);



}
