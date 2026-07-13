// Criação da classe personagem
public class Personagem {

    // Criação das variaveis de classe
    String nome;
    String classe;
    int nivel;
    int pontosDeVida;
    double poderBase;
    
    // Construtor da classe Personagem
    public Personagem(String nome, String classe, int nivel, int pontosDeVida, double poderBase){
        this.nome = nome;
        this.classe = classe;
        this.nivel = nivel;
        this.pontosDeVida = pontosDeVida;
        this.poderBase = poderBase;
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
        System.out.printf("\n--- status do personagem ---\nNome : %s\nClasse : %s\nNível : %d\nPontos de vida : %d\nPoder base : %f\n",nome,classe,nivel,pontosDeVida,poderBase);
    }
}
