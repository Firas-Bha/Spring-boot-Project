package tn.esprit.arc.spring.stationdeski.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.arc.spring.stationdeski.entites.Moniteur;
import tn.esprit.arc.spring.stationdeski.repositories.MoniteurRepository;

import java.util.List;
@Service
@AllArgsConstructor
public class MoniteurService implements iMoniteurService {
    MoniteurRepository moniteurRepository;

    @Override
    public List<Moniteur> retrieveAllMoniteurs() {
        return moniteurRepository.findAll();
    }

    @Override
    public Moniteur addMoniteur(Moniteur e) {
        return moniteurRepository.save(e);
    }

    @Override
    public Moniteur updateMoniteur(Moniteur e) {
         moniteurRepository.save(e);
         return  e;
    }

    @Override
    public Moniteur retrieveMoniteur(Integer idMoniteur) {
        return moniteurRepository.findById(idMoniteur).get();
    }

    @Override
    public void deleteMoniteur(Integer idMoniteur) {
        moniteurRepository.deleteById(idMoniteur);

    }
}
