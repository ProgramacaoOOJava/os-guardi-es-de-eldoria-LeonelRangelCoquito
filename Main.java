// Criar a classe main que é a classe que executa o programa java e é onde instaciamos os objetos
public class Main{
    public static void main(String[] args){
        // Instanciando os objetos "Personagem"
        Personagem p1 = new Personagem("Hanzo","Guerreiro",1,100,20.5);
        Personagem p2 = new Personagem("Zhask","Mago",1,100,50.5);

        // Chamando o método exibirStatus()
        p1.exibirStatus();
        p2.exibirStatus();

        // teste de modificação de atributos do obejto p1
        //p1.classe = "Assassino";

        // Exibir p1 apos modificação
        //p1.exibirStatus();

    }
}
