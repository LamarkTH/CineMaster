package url.site.tutorial.java.modulo2;

import com.google.gson.annotations.SerializedName;

//Classe super tipo: Possui atributos e métodos em comum para outras classes,ou seja, ela vai herdar coisas para outras classes
public class Titulo implements Comparable<Titulo>{

    //@SerializedName("Title")
    private String nome;
    //@SerializedName("Year")
    private int anoDeLancamento;
    private double duracaoEmMinutos;
    private boolean incluiNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
//Método construtor em Java

    public Titulo(){

    }

    public Titulo(String nome, int anoDeLancamento, double duracaoEmMinutos, boolean incluiNoPlano){
        this.nome=nome;
        this.anoDeLancamento=anoDeLancamento;
        this.duracaoEmMinutos=duracaoEmMinutos;
        this.incluiNoPlano=incluiNoPlano;
    }

    public Titulo(TituloOmdb tituloOmdb){
        this.anoDeLancamento= Integer.valueOf(tituloOmdb.year());
        this.duracaoEmMinutos= Double.valueOf(tituloOmdb.runtime().substring(0,2));
        this.nome= tituloOmdb.title();
    }

    //Conceito de encapsulamento em uma classe
    public void avalia(double nota){
        somaDasAvaliacoes+=nota;
        totalDeAvaliacoes++;
    }

    public double getRetornaAMedia(){
        return (double) somaDasAvaliacoes /totalDeAvaliacoes;//Conceito de encapsulamento.
    }

    //Mostrando valores dos atributos privados ao usuario
    public int getTotalDeAvaliacoes(){//Obs: A convenção get, é utilizada para nomear métodos que acessam apenas atributos privados
        return totalDeAvaliacoes;
    }
    //Permitindo que o usuario atribua valores aos atributos

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public String getAnoDeLancamento() {
        if (anoDeLancamento>2024){
            return "Não estamos em %d".formatted(anoDeLancamento);
        }else{
            return "%d".formatted(anoDeLancamento);
        }
    }

    public void setIncluiNoPlano(boolean incluiNoPlano) {
        this.incluiNoPlano = incluiNoPlano;
    }
    public String getIncluiNoPlano() {
        if(incluiNoPlano){
            return "Sim";
        }
        else{
            return "Não";}
    }

    public double getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void exibeFichaTecnica() {
        System.out.println(getNome());
        System.out.println(getAnoDeLancamento());
        System.out.println(getDuracaoEmMinutos());
        System.out.println(getTotalDeAvaliacoes());
        System.out.println(getRetornaAMedia());
        System.out.println(getIncluiNoPlano());

    }

    @Override
    public String toString() {
        return "Nome= " +
                 nome + '\'' +
                ", anoDeLancamento= " + anoDeLancamento +"\"
                +"Duração em minutos= "+duracaoEmMinutos
                ;
    }

    @Override
    public int compareTo(Titulo titulo) {
        return this.getNome().compareTo(titulo.getNome());
    }
}
