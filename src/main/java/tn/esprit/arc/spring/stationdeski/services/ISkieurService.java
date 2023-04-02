package tn.esprit.arc.spring.stationdeski.services;

import tn.esprit.arc.spring.stationdeski.entites.Moniteur;
import tn.esprit.arc.spring.stationdeski.entites.Skieur;
import tn.esprit.arc.spring.stationdeski.entites.TypeAbonnement;

import java.util.List;

public interface ISkieurService {
    List<Skieur> retrieveAllSkieurs();

    Skieur addSkieur(Skieur s);

    Skieur updateSkieur (Skieur s);

    public Skieur retrieveSkieur(Integer idSkieur);

    public void deleteSkieur(Integer idMoniteur);
    Skieur assignSkieurToPiste(Long numSkieur, Long numPiste);
    public Skieur addSkieurAndAssignToCours(Skieur skieur, Long numCours);
    List<Skieur> retrieveSkieursByAbonnementType(TypeAbonnement typeAbonnement);
}
