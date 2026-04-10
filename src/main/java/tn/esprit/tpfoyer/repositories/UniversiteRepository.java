package tn.esprit.tpfoyer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tpfoyer.entities.Universite;
import tn.esprit.tpfoyer.entities.foyer;

import java.util.List;

@Repository
public interface UniversiteRepository extends JpaRepository<Universite, Long> {

    //Récupèrer les projets dont le coût est supérieur à une valeur donnée.
    List<Universite>  findByFoyer_CapaciteFoyerGreaterThan(int capacite);
    //Afficher les projets dont le nom commence par la valeur 1 et dont la description
    //du projetDetail
    //asocié contient la valeur 2
    List<Universite> findByNomUniversiteStartingWithAndFoyer_NomFoyerContaining(String nomU, String nomF);
   //Calculer le nombre de projets dont la date de début se situe entre deux dates
   //données
    long countByFoyer_CapaciteFoyerBetween(long min, long max);

}
