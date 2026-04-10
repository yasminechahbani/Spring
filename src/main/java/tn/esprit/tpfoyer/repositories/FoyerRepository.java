package tn.esprit.tpfoyer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tpfoyer.entities.foyer;
@Repository
public interface FoyerRepository extends JpaRepository<foyer, Long> {
}
