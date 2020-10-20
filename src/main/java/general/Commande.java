package general;

import java.util.Collection;

public class Commande implements PrePostVisitable,Visitable {


    String name;

    Collection <Ligne> lignes;

    public Commande(String name) {
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

        for (Ligne l: lignes.values()){
            accept(visitor);

        }

    }



    public void addLigne( Ligne l){
        lignes.add(l);

    }
}
