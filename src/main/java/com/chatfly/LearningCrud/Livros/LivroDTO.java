package com.chatfly.LearningCrud.Livros;

public class LivroDTO {

    private Long id;
    private String nome;
    private String autor;
    private int quantidadeDePaginas;

    public LivroDTO(){
    }

    public LivroDTO(Long id, String nome, String autor, int quantidadeDePaginas) {
        this.id = id;
        this.nome = nome;
        this.autor = autor;
        this.quantidadeDePaginas = quantidadeDePaginas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getQuantidadeDePaginas() {
        return quantidadeDePaginas;
    }

    public void setQuantidadeDePaginas(int quantidadeDePaginas) {
        this.quantidadeDePaginas = quantidadeDePaginas;
    }
}
