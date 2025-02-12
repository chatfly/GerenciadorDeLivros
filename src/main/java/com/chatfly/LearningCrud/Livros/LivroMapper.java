package com.chatfly.LearningCrud.Livros;

import org.springframework.stereotype.Component;

@Component
public class LivroMapper {

    public LivroModel map(LivroDTO livroDTO) {

        LivroModel livroModel = new LivroModel();
        livroModel.setId(livroDTO.getId());
        livroModel.setNome(livroDTO.getNome());
        livroModel.setAutor(livroDTO.getAutor());
        livroModel.setQuantidadeDePaginas(livroDTO.getQuantidadeDePaginas());

        return livroModel;

    }

    public LivroDTO map(LivroModel livroModel) {

        LivroDTO livroDTO = new LivroDTO();
        livroDTO.setId(livroModel.getId());
        livroDTO.setNome(livroModel.getNome());
        livroDTO.setAutor(livroModel.getAutor());
        livroDTO.setQuantidadeDePaginas(livroModel.getQuantidadeDePaginas());

        return livroDTO;

    }

}
