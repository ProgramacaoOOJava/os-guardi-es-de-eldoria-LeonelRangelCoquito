package entidades.Mago;
import entidades.Personagem;

// Criação da classe mago 
public class Mago extends Personagem{
    // atributo de classe 
    double inteligencia;
    String classe = "Mago";

    // classe contrutora
    public Mago(String nome, int nivel, int pontosDeVida, double poderBase, double inteligencia, String habilidade){
        super(nome,nivel,pontosDeVida,poderBase,habilidade);
        this.inteligencia = inteligencia;
        this.habilidade = habilidade;
    };
    // Definição do metodo exibirStatus()
    public void exibirStatus(){
        super.exibirStatus();
        System.out.println("Nome: "+nome);
        System.out.println("Classe: "+classe);
        System.out.println("Nivel: "+nivel);
        System.out.println("Pontos de vida: "+pontosDeVida);
        System.out.println("Poder base: "+poderBase);
        System.out.println("Inteligencia: "+inteligencia);
        System.out.println("Habilidade: "+habilidade+"\n");

    }
    
    // implementação da Habilidade
    // Sobreescrita do método usarHabilidadeEspecial()
    @Override
    public void usarHabilidadeEspecial(){
        System.out.println(classe+" "+nome+" lancou a habilidade: "+habilidade+"\n");
    }
}
