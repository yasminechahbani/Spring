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

@RestController
@RequestMapping("/etudiant")
@AllArgsConstructor
public class EtudiantControllers {

    final IEtudiantService etudiantService;

    @PostMapping("/add")
    Etudiant addEtudiant(@RequestBody Etudiant etudiant) {
        return etudiantService.saveEtudiant(etudiant);
    }

    @PutMapping("/update")
    Etudiant UpdateEtudiant(@RequestBody Etudiant etudiant) {
        return etudiantService.updateEtudiant(etudiant);
    }
    @DeleteMapping("/delete/{idEtudiant}")
    void deleteEtudiantById(@PathVariable long idEtudiant) {
        etudiantService.deleteEtudiant(idEtudiant);
    }


    @GetMapping("/findAll")
    List<Etudiant> findAlletudiant(){
        return etudiantService.getAllEtudiants();
    }

    @GetMapping("/findById/{idEtudiant}")
    Etudiant findById(@PathVariable long idEtudiant) {
        return etudiantService.getEtudiantById(idEtudiant);
    }




}
