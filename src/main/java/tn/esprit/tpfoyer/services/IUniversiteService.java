package tn.esprit.tpfoyer.services;

import tn.esprit.tpfoyer.entities.Universite;

import java.util.List;

public interface IUniversiteService {
    Universite saveUniversite(Universite universite);

    void deleteUniversite(Long id);

    Universite getUniversiteById(Long id);

    Universite updateUniversite(Universite universite);

    List<Universite> getAllUniversites();
}