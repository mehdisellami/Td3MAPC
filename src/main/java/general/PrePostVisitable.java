package general;

public interface PrePostVisitable extends PrePostVisitor {


    void accept(PrePostVisitor prePostVisitor) ;
}
