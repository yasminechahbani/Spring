package tn.esprit.tpfoyer.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.entities.Chambre;
import tn.esprit.tpfoyer.entities.Etudiant;
import tn.esprit.tpfoyer.entities.Universite;
import tn.esprit.tpfoyer.services.*;

import java.util.List;


@RestController
@RequestMapping("/universite")
@AllArgsConstructor

public class UniversiteControllers {
    final IUniversiteService universiteService;

    @PostMapping("/add")
    Universite addUniversite(@RequestBody Universite universite) {
        return universiteService.saveUniversite(universite);
    }

    @PutMapping("/update")
    Universite UpdateUniversite(@RequestBody Universite universite) {
        return universiteService.updateUniversite(universite);
    }

    @DeleteMapping("/delete")
    void deleteUniversite(@RequestParam long iduniversite) {
        universiteService.deleteUniversite(iduniversite);
    }

    @GetMapping("/findAll")
    List<Universite> findAllUniversite(){
        return universiteService.getAllUniversites();
    }

    @GetMapping("/findById/{iduniversite}")
    Universite findById(@PathVariable long iduniversite) {
        return universiteService.getUniversiteById(iduniversite);
    }

    @GetMapping("/findByNomAndFoyer/{nomU}/{nomF}")
    List<Universite> findByNomUniversiteStartingWithAndFoyer_NomFoyerContaining(
            @PathVariable String nomU,
            @PathVariable String nomF) {
        return universiteService.findByNomUniversiteStartingWithAndFoyer_NomFoyerContaining(nomU, nomF);
    }


}
