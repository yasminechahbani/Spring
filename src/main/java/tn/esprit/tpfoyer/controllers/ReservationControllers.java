package tn.esprit.tpfoyer.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.entities.Chambre;
import tn.esprit.tpfoyer.entities.Etudiant;
import tn.esprit.tpfoyer.entities.Reservation;
import tn.esprit.tpfoyer.services.*;

import java.util.List;


@RestController
@RequestMapping("/reservation")
@AllArgsConstructor
public class ReservationControllers {
    final IReservationService reservationService;

    @PostMapping("/add")
    Reservation addReservation(@RequestBody Reservation  reservation) {
        return reservationService.saveReservation( reservation);
    }

    @PutMapping("/update")
    Reservation UpdateReservation(@RequestBody Reservation  reservation) {
        return reservationService.saveReservation( reservation);
    }

    @DeleteMapping("/delete")
    void deleteReservation(@RequestParam String idReservation) {
        reservationService.deleteReservation(idReservation);
    }

    @GetMapping("/findAll")
    List<Reservation> findAllReservation(){
        return reservationService.getAllReservations();
    }

    @GetMapping("/findById/{idReservation}")
    Reservation findById(@PathVariable String idReservation) {
        return reservationService.getReservationById(idReservation);
    }
}
