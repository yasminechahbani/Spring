package tn.esprit.tpfoyer.controllers;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.entities.Bloc;
import tn.esprit.tpfoyer.entities.Chambre;
import tn.esprit.tpfoyer.entities.Etudiant;
import tn.esprit.tpfoyer.entities.Universite;
import tn.esprit.tpfoyer.services.*;

import java.util.List;

    @RestController
    @RequestMapping("/blocs")
    @AllArgsConstructor
    public class BlocController {
        final IBlocService BlocService;
        @PostMapping("/add")
        Bloc addBloc (@RequestBody Bloc bloc){
            return BlocService.saveOrUpdateBloc(bloc);
        }
        @PutMapping("/update")
        Bloc updateBloc(@RequestBody Bloc bloc){
            return BlocService.saveOrUpdateBloc(bloc);
        }
        @DeleteMapping("/delete")
        void deleteBloc(@RequestParam long idBloc){
            BlocService.deleteBloc(idBloc);
        }
        @GetMapping("/findAll")
        List<Bloc> findAllBloc()
        { return BlocService.getAllBlocs();}


        @GetMapping("find/{idBloc}")
        Bloc findById(@PathVariable long idBloc){
            return BlocService.findBlocById(idBloc);
        }

        @PostMapping("/addBlocEtSonFoyer")
        public Bloc addBlocEtSonFoyer(@RequestBody Bloc b) {
            return BlocService.addBlocEtSonFoyer(b);
        }
        @PutMapping("/affecterBlocAFoyer/{idBloc}/{idFoyer}")
        public Bloc affecterBlocAFoyer(
                @PathVariable long idBloc,
                @PathVariable long idFoyer) {
            return BlocService.affecterBlocAFoyer(idBloc, idFoyer);
        }

        @PutMapping("/desaffecterBlocDeFoyer/{idBloc}")
        public Bloc desaffecterBlocDeFoyer(@PathVariable long idBloc) {
            return BlocService.desaffecterBlocDeFoyer(idBloc);
        }

    }

