package entidades;
// Criação da classe personagem
public abstract class  Personagem {

    // Criação das variaveis de classe
    protected String nome;
    protected String classe;
    protected int nivel;
    protected int pontosDeVida;
    protected double poderBase;
    protected String habilidade;
    
    // Construtor da classe Personagem
    public Personagem(String nome, int nivel, int pontosDeVida, double poderBase,String habilidade){
        this.nome = nome;
        this.nivel = nivel;
        this.pontosDeVida = pontosDeVida;
        this.poderBase = poderBase;
        this.habilidade = habilidade;
    }
    
    /*
    Metodo de classe que exibe o status do personagem. Saída :
    --- status do personagem ---
    Nome : ...
    Clase : ...
    Nivel : ...
    Pontos de vida : ...
    Poder base : ...
    
    */
    public void exibirStatus(){
        System.out.printf("\n----- status do personagem -----\n");
    }

    public abstract void usarHabilidadeEspecial();
}
