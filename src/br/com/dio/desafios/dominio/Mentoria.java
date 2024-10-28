package br.com.dio.desafios.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
    private LocalDate data;

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    public Mentoria() {
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Mentoria { ");
        sb.append("titulo = ").append(getTitulo());
        sb.append(", descricao = ").append(getDescricao());
        sb.append(", data = ").append(data);
        sb.append(" }");
        return sb.toString();
    }

}
