package tn.esprit.tpfoyer.services;

import tn.esprit.tpfoyer.entities.foyer;

import java.util.List;

public interface IFoyerService {
    foyer saveFoyer(foyer foyer);

    void deleteFoyer(Long id);

    foyer getFoyerById(Long id);

    foyer updateFoyer(foyer foyer);

    List<foyer> getAllFoyer();
}