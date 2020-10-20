package general;

import java.util.Collection;

public class Client implements PrePostVisitable,Visitable {


    String name;

    Collection<Commande> commandes;
    Collection <Ligne> lignes;


    public Client(String name) {
        this.name = name;
    }




    void addLigne(String name , Ligne ligne){
        new Client (name);
        lignes.add(ligne);
    }

    public void addCommande( Commande commande){
        commandes.add(commande);

    }


    @Override
    public void accept(PrePostVisitor prePostVisitor) {

    }


    @Override
    public void accept(Visitor visitor) {

    }
}
