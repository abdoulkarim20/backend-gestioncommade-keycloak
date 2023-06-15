package cours.apprentissage.gestioncommande.business.panier;

import java.util.List;

public interface IPanier {
    Panier save(Panier panier);

    List<Panier> getAll();
}
