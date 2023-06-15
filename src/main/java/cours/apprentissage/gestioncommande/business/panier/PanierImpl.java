package cours.apprentissage.gestioncommande.business.panier;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PanierImpl implements IPanier {
    private final PanierRepository panierRepositor;

    public PanierImpl(PanierRepository panierRepositor) {
        this.panierRepositor = panierRepositor;
    }

    @Override
    public Panier save(Panier panier) {
        return panierRepositor.save(panier);
    }

    @Override
    public List<Panier> getAll() {
        return panierRepositor.findAll();
    }
}
