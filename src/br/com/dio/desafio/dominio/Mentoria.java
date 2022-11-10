package br.com.dio.desafio.dominio;

 import java.time.LocalDate;

public class Mentoria  extends Conteudo{

    private  LocalDate data;

    @Override
    public double calcularXp() {
        return 0;
    }

    @Override
    public double calcularXP() {
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
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescrição() + '\'' +
                ", data=" + data +
                '}';
    }

    public void setDescricao(String descrição_mnetoria_java) {
    }
}





