package tn.esprit.tpfoyer.services;

import tn.esprit.tpfoyer.entities.Reservation;

import java.util.List;

public interface IReservationService {
    Reservation saveReservation(Reservation reservation);

    void deleteReservation(String id);

    Reservation getReservationById(String id);

    Reservation updateReservation(Reservation reservation);

    List<Reservation> getAllReservations();
}