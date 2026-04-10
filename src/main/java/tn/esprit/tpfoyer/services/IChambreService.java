package tn.esprit.tpfoyer.services;
import tn.esprit.tpfoyer.entities.Chambre;

import java.util.List;

public interface IChambreService {
    Chambre saveChambre(Chambre chambre);

    void deleteChambre(Long id);

    Chambre getChambreById(Long id);

    Chambre updateChambre(Chambre chambre);

    List<Chambre> getAllChambres();
    Chambre addChambreEtSaReservation(Chambre c);
    Chambre reserverChambre(long idChambre, String idReservation);
    Chambre annulerReservation(long idChambre, String idReservation);
}