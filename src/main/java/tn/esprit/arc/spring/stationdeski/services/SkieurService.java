package tn.esprit.arc.spring.stationdeski.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.arc.spring.stationdeski.entites.Skieur;
import tn.esprit.arc.spring.stationdeski.repositories.SkieurRepository;

import java.util.List;
@Service
@AllArgsConstructor
public class SkieurService implements ISkieurService{
    SkieurRepository skieurRepository;

    @Override
    public List<Skieur> retrieveAllSkieurs() {return skieurRepository.findAll();}

    @Override
    public Skieur addSkieur(Skieur e) {
        return skieurRepository.save(e);
    }

    @Override
    public Skieur updateSkieur(Skieur e
    ) {
        skieurRepository.save(e);
        return  e;
    }

    @Override
    public Skieur retrieveSkieur(Integer idSkieur) {
        return skieurRepository.findById(idSkieur).get();
    }

    @Override
    public void deleteSkieur(Integer idMoniteur) {
        skieurRepository.deleteById(idMoniteur);

    }
}
