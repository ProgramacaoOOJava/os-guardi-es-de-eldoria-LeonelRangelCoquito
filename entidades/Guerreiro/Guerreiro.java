package entidades.Guerreiro;
import entidades.Personagem;
// Criação da classe guerreiro
public class Guerreiro extends Personagem {
    // definição do atributo de classe "força"
    int forca;
    String classe = "Guerreiro";
    // criação da classe construtora de Guerreiro.
    public Guerreiro(String nome, int nivel, int pontosDeVida, double poderBase, int forca, String habilidade){
        super(nome,nivel,pontosDeVida,poderBase,habilidade);// Herda os atributos da classe pai
        this.forca = forca;
        

    }
    @Override
    public void exibirStatus(){
        super.exibirStatus();
        System.out.println("Nome: "+nome);
        System.out.println("Classe: "+classe);
        System.out.println("Nivel: "+nivel);
        System.out.println("Pontos de vida: "+pontosDeVida);
        System.out.println("Poder base: "+poderBase);
        System.out.println("Força: "+forca*poderBase);
        System.out.println("Habilidade: "+habilidade+"\n");

    }
    // Implementação da habilidade
    // sobreescrever o metodo da classe pai
     @Override
    public void usarHabilidadeEspecial(){
        System.out.println(classe+" "+nome+" lançou a habilidade: "+habilidade+"\n");
    }


}
