package cours.apprentissage.gestioncommande.business.panier;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/paniers")
@CrossOrigin("*")
public class PanierController {
    private final IPanier iPanier;

    public PanierController(IPanier iPanier) {
        this.iPanier = iPanier;
    }
    @PostMapping("")
    @PreAuthorize("hasAuthority('USER')")
    public Panier save(@RequestBody Panier panier){
        return iPanier.save(panier);
    }
    @GetMapping("")
    @PreAuthorize("hasAuthority('USER')")
    public List<Panier>all(){
        return iPanier.getAll();
    }
}
