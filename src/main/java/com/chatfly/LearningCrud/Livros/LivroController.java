package com.chatfly.LearningCrud.Livros;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livros")
public class LivroController {

    private LivroService livroService;

    public LivroController(LivroService livroService) {
        this.livroService = livroService;
    }

    @GetMapping("/listar")
    public List<LivroDTO> getListarLivros() {
        return livroService.listarLivros();
    }

    @PostMapping("/criar")
    public LivroDTO postCriarLivro(@RequestBody LivroDTO livroDTO) {
        return livroService.criarLivro(livroDTO);
    }

    @DeleteMapping("/deletar/{id}")
    public void deleteDeletarLivro(@PathVariable Long id) {
        livroService.deletarLivro(id);
    }

    @PutMapping("/alterar/{id}")
    public LivroDTO putAtualizarLivro(@PathVariable Long id, @RequestBody LivroDTO livroAtualizado) {
        return livroService.atualizarLivro(id, livroAtualizado);
    }

}
