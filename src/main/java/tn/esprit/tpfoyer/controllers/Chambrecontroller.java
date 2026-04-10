package tn.esprit.tpfoyer.controllers;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.entities.Chambre;
import tn.esprit.tpfoyer.entities.Etudiant;
import tn.esprit.tpfoyer.services.ChambreService;
import tn.esprit.tpfoyer.services.EtudiantService;
import tn.esprit.tpfoyer.services.IChambreService;
import tn.esprit.tpfoyer.services.IEtudiantService;

import java.util.List;

@Tag(name="Gestion Chambre")
@RestController
@RequestMapping("/chambres")
@AllArgsConstructor
public class Chambrecontroller {
    final IChambreService chambreService;

    @PostMapping("/add")
       Chambre addChambre (@RequestBody Chambre chambre){
        return chambreService.saveChambre(chambre);
    }
    @PutMapping("/update")
   Chambre updateChambre(@RequestBody Chambre chambre){
        return chambreService.updateChambre(chambre);
    }
    @DeleteMapping("/delete")
    void deleteEtudiant(@RequestParam long idChambre){
        chambreService.deleteChambre(idChambre);
    }
    @Operation(description="recuperer tous les chambres")
    @GetMapping("/findAll")
    List<Chambre> findAllChambre(){
        return chambreService.getAllChambres();
    }
   @GetMapping("find/{idChambre}")
    Chambre findById(@PathVariable long idChambre){
        return chambreService.getChambreById(idChambre);
   }

    // Cas 1
    @PostMapping("/addChambreEtSaReservation")
    public Chambre addChambreEtSaReservation(@RequestBody Chambre c) {
        return chambreService.addChambreEtSaReservation(c);
    }

    // Cas 2
    @PutMapping("/reserverChambre/{idChambre}/{idReservation}")
    public Chambre reserverChambre(
            @PathVariable long idChambre,
            @PathVariable String idReservation) {
        return chambreService.reserverChambre(idChambre, idReservation);
    }

    // Cas 5
    @PutMapping("/annulerReservation/{idChambre}/{idReservation}")
    public Chambre annulerReservation(
            @PathVariable long idChambre,
            @PathVariable String idReservation) {
        return chambreService.annulerReservation(idChambre, idReservation);
    }
}
