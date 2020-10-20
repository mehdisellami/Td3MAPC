package general;

public class PrintRapportCommandes implements Visitor {
    @Override
    public void visit(GroupeClient groupeClient) {

        System.out.println("le Groupe client :" +groupeClient.getName());
    }

    public void visit(Client client) {
    System.out.println("le client est" +client.getName());
    }
    public void visit(Commande commande) {

        System.out.println("la commande est" +commande.getName());
    }
    public void visit(Ligne ligne) {

        System.out.println("la visite : " +ligne.getName());

    }
}
