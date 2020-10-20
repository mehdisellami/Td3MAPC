package general;

import java.util.Collection;

public class GroupeClient implements PrePostVisitable,Visitable  {

    String name;
    Collection <Client> clients;


    public GroupeClient(String name) {
        this.name = name;

    }

    @Override
    public void accept(PrePostVisitor prePostVisitor) {

    }


    @Override
    public void accept(Visitor visitor) {

    }
}
