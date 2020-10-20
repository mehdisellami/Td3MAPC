package general;

public class Ligne  implements PrePostVisitable,Visitable {

    String name;
    int sum;

    public Ligne(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }



    public Ligne(String name, int sum) {
        this.name = name;
        this.sum = sum;
    }

    @Override
    public void accept(PrePostVisitor prePostVisitor) {

    }


    @Override
    public void accept(Visitor visitor) {

    }

}
