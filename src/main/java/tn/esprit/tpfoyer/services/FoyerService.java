package tn.esprit.tpfoyer.services;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.entities.foyer;
import tn.esprit.tpfoyer.repositories.FoyerRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class FoyerService implements IFoyerService {
    FoyerRepository foyerRepository;

    @Override
    public foyer saveFoyer(foyer foyer) {
        return foyerRepository.save(foyer);
    }

    @Override
    public void deleteFoyer(Long id) {
        foyerRepository.deleteById(id);
    }

    @Override
    public foyer getFoyerById(Long id) {
        return foyerRepository.findById(id).get();
    }

    @Override
    public foyer updateFoyer(foyer foyer) {
        return foyerRepository.save(foyer);
    }

    @Override
    public List<foyer> getAllFoyer() {
        return foyerRepository.findAll();
    }
}
