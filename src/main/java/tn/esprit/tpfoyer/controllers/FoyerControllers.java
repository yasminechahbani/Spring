package tn.esprit.tpfoyer.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.entities.Chambre;
import tn.esprit.tpfoyer.entities.Etudiant;
import tn.esprit.tpfoyer.entities.foyer;
import tn.esprit.tpfoyer.services.*;

import java.util.List;

@RestController
@RequestMapping("/foyer")
@AllArgsConstructor
public class FoyerControllers {
    final IFoyerService foyerService;

    @PostMapping("/add")
    foyer addFoyer(@RequestBody foyer foyer) {
        return foyerService.saveFoyer(foyer);
    }

    @PutMapping("/update")
    foyer UpdateFoyer(@RequestBody foyer foyer) {
        return foyerService.updateFoyer(foyer);
    }

    @DeleteMapping("/delete")
    void deleteFoyer(@RequestParam long idFoyer) {
        foyerService.deleteFoyer(idFoyer);
    }

    @GetMapping("/findAll")
    List<foyer> findAllFoyer(){
        return foyerService.getAllFoyer();
    }

    @GetMapping("/findById/{idFoyer}")
    foyer findById(@PathVariable long idFoyer)
    {return foyerService.getFoyerById(idFoyer);}
}
