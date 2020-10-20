package general;

public class Client implements PrePostVisitable,Visitable {


    String name;



    public Client(String name) {
        this.name = name;
    }

    void addCommande(Commande commande){

        new Commande("");

    }


    void addLigne(String ch , Ligne ligne){
    }


    @Override
    public void accept(PrePostVisitor prePostVisitor) {

    }


    @Override
    public void accept(Visitor visitor) {

    }
}
