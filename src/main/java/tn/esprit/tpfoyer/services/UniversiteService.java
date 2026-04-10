package tn.esprit.tpfoyer.services;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.entities.Universite;
import tn.esprit.tpfoyer.repositories.UniversiteRepository;

import java.util.List;
@Service
@AllArgsConstructor
public class UniversiteService implements IUniversiteService {
    UniversiteRepository universiteRepository;


    @Override
    public Universite saveUniversite(Universite universite) {
        return universiteRepository.save(universite);
    }

    @Override
    public void deleteUniversite(Long id) {
        universiteRepository.deleteById(id);

    }

    @Override
    public Universite getUniversiteById(Long id) {
        return universiteRepository.findById(id).get();
    }

    @Override
    public Universite updateUniversite(Universite universite) {
        return universiteRepository.save(universite);
    }

    @Override
    public List<Universite> getAllUniversites() {
        return universiteRepository.findAll();
    }
    @Override
    public List<Universite> findByNomUniversiteStartingWithAndFoyer_NomFoyerContaining(String nomU, String nomF) {
        return universiteRepository.findByNomUniversiteStartingWithAndFoyer_NomFoyerContaining(nomU, nomF);
    }
}
