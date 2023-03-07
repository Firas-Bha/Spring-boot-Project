package tn.esprit.arc.spring.stationdeski.services;

import tn.esprit.arc.spring.stationdeski.entites.Moniteur;
import tn.esprit.arc.spring.stationdeski.entites.Skieur;

import java.util.List;

public interface ISkieurService {
    List<Skieur> retrieveAllSkieurs();

    Skieur addSkieur(Skieur s);

    Skieur updateSkieur (Skieur s);

    public Skieur retrieveSkieur(Integer idSkieur);

    public void deleteSkieur(Integer idMoniteur);
}
