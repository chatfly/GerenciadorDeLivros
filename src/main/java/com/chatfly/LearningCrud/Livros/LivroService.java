package com.chatfly.LearningCrud.Livros;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class LivroService {

    private LivroRepository livroRepository;
    private LivroMapper livroMapper;

    public LivroService(LivroRepository livroRepository, LivroMapper livroMapper) {
        this.livroRepository = livroRepository;
        this.livroMapper = livroMapper;
    }

    public List<LivroDTO> listarLivros() {
        List<LivroModel> livros = livroRepository.findAll();
        return livros.stream()
                .map(livroMapper::map)
                .collect(Collectors.toList());
    }

    public LivroDTO criarLivro(LivroDTO livroDTO) {
        LivroModel livro = livroMapper.map(livroDTO);
        livro = livroRepository.save(livro);
        return livroMapper.map(livro);
    }

    public void deletarLivro(Long id) {
        livroRepository.deleteById(id);
    }

    public LivroDTO atualizarLivro(Long id, LivroDTO livroDTO) {
        Optional<LivroModel> livroExistente = livroRepository.findById(id);
        if(livroExistente.isPresent()) {
            LivroModel livroAtualizado = livroMapper.map(livroDTO);
            livroAtualizado.setId(id);
            LivroModel livroSalvo = livroRepository.save(livroAtualizado);
            return livroMapper.map(livroSalvo);
        }
        return null;
    }

}
