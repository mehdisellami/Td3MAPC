package general;

import java.util.Collection;

public class GroupeClient implements PrePostVisitable,Visitable  {

    String name;
    Collection <Client> clients;
    Collection <Commande> commandes;
    Collection <Ligne> lignes;


    public GroupeClient(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    @Override
    public void accept(PrePostVisitor prePostVisitor) {

    }


    @Override
    public void accept(Visitor visitor) {

    }

    public void addClient( Client cl){
        clients.add(cl);

    }

    public void addLigne(String name, Ligne l){
        new Ligne(name);
        lignes.add(l.getName());

    }

    public void addCommande( String name ,Commande co){
        Client cl = new Client(name);
        commandes.add(co.getName());

    }


}
