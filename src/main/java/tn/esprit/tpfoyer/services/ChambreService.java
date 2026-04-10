package tn.esprit.tpfoyer.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.entities.Chambre;
import tn.esprit.tpfoyer.entities.Reservation;
import tn.esprit.tpfoyer.repositories.ChambreRepository;
import tn.esprit.tpfoyer.repositories.ReservationRepository;

import java.util.HashSet;
import java.util.List;

@Service
@AllArgsConstructor
public class ChambreService implements IChambreService {

    ChambreRepository chambreRepository; //injecTion de dependence ici
    ReservationRepository reservationRepository;
    @Override
    public Chambre saveChambre(Chambre chambre) {
        chambre.setReservations(new HashSet<>());
        return chambreRepository.save(chambre);
    }

    @Override
    public void deleteChambre(Long id) {
        chambreRepository.deleteById(id);
    }

    @Override
    public Chambre getChambreById(Long id) {
        return chambreRepository.findById(id).get();
    }

    @Override
    public Chambre updateChambre(Chambre chambre) {
        return chambreRepository.save(chambre);
    }

    @Override
    public List<Chambre> getAllChambres() {
        return chambreRepository.findAll();
    }


    // exo 2
    @Override
    public Chambre addChambreEtSaReservation(Chambre c) {
        return chambreRepository.save(c);
    }

    @Override
    public Chambre reserverChambre(long idChambre, String idReservation) {
        Chambre chambre = chambreRepository.findById(idChambre).get();
        Reservation reservation = reservationRepository.findById(idReservation).get();
        // set le fils dans le parent
        chambre.getReservations().add(reservation);
        return chambreRepository.save(chambre);
    }

    // Cas 5 — désaffectation: remove from list
    @Override
    public Chambre annulerReservation(long idChambre, String idReservation) {
        Chambre chambre = chambreRepository.findById(idChambre).get();
        Reservation reservation = reservationRepository.findById(idReservation).get();
        chambre.getReservations().remove(reservation);
        return chambreRepository.save(chambre);
    }
}
