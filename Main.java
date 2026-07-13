import java.util.ArrayList;
import java.util.List;
import entidades.Personagem;
import entidades.Guerreiro.Guerreiro;
import entidades.Mago.Mago;

public class Main{
    public static void main(String[] args){
        
       List<Personagem> herois = new ArrayList<>();
        herois.add(new Mago("Eudora",10,100,120.5,8,"Ataque do trovão!"));
        herois.add(new Mago("Xavier",10,100, 200,10,"Luz do amanhecer!"));
        herois.add(new Guerreiro("Aulus", 10,150, 2, 150, "Machado sanguinário"));
        
       for(Personagem heroi: herois){
        heroi.exibirStatus();
        heroi.usarHabilidadeEspecial();
       }



    }
}
