package tn.esprit.tpfoyer.services;

import tn.esprit.tpfoyer.entities.Bloc;
import tn.esprit.tpfoyer.entities.foyer;
import tn.esprit.tpfoyer.repositories.BlocRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.repositories.FoyerRepository;


import java.util.List;
@Service
@AllArgsConstructor
public class BlocService implements IBlocService {
    final BlocRepository blocRepository;
    final FoyerRepository foyerRepository;

    @Override
    public Bloc saveOrUpdateBloc(Bloc bloc) {
        bloc.setF(null);
        return blocRepository.save(bloc);
    }

    @Override
    public void deleteBloc(Long id) {
        blocRepository.deleteById(id);
    }

    @Override
    public List<Bloc> getAllBlocs() {
        return blocRepository.findAll();
    }

    @Override

    public Bloc findBlocById(Long id) {
        return blocRepository.findById(id).get();
    }
    @Override
    public Bloc addBlocEtSonFoyer(Bloc b) {
        return blocRepository.save(b);  // cascade saves foyer automatically
    }


    @Override
    public Bloc affecterBlocAFoyer(long idBloc, long idFoyer) {
        Bloc bloc = blocRepository.findById(idBloc).get();
        foyer foy = foyerRepository.findById(idFoyer).get();
        bloc.setF(foy);
        return blocRepository.save(bloc);
    }

    @Override
    public Bloc desaffecterBlocDeFoyer(long idBloc) {
        Bloc bloc = blocRepository.findById(idBloc).get();
        bloc.setF(null);
        return blocRepository.save(bloc);




    }

}