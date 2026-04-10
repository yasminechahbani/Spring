package tn.esprit.tpfoyer.services;

import tn.esprit.tpfoyer.entities.Bloc;

import java.util.List;

public interface IBlocService {
    Bloc saveOrUpdateBloc(Bloc bloc);

    void deleteBloc(Long id);

    Bloc findBlocById(Long id);


    List<Bloc> getAllBlocs();
    //Exo 1
    Bloc addBlocEtSonFoyer(Bloc b);
    Bloc affecterBlocAFoyer(long idBloc, long idFoyer);
    Bloc desaffecterBlocDeFoyer(long idBloc);}
