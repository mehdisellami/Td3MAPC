package general;

public class Commande implements PrePostVisitable,Visitable {


    String name;

    public Commande(String name) {
        this.name = name;
    }

    @Override
    public void accept(PrePostVisitor prePostVisitor) {

    }


    @Override
    public void accept(Visitor visitor) {

    }
}
