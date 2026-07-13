public class Main{
    public static void main(String[] args){
        // Instanciando os objetos "Personagem"
        Personagem p1 = new Personagem("Hanzo","Guerreiro",1,100,20.5);
        Personagem p2 = new Personagem("Zhask","Mago",1,100,50.5);

        // Chamando o método exibirStatus()
        p1.exibirStatus();
        p2.exibirStatus();

        

    }
}
