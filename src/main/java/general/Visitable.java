package general;

public interface Visitable extends Visitor {

    void accept(Visitor visitor);
}
