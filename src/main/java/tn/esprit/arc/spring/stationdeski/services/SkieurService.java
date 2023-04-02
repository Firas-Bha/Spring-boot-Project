package tn.esprit.arc.spring.stationdeski.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.arc.spring.stationdeski.entites.*;
import tn.esprit.arc.spring.stationdeski.repositories.AbonnementRepository;
import tn.esprit.arc.spring.stationdeski.repositories.CoursRepository;
import tn.esprit.arc.spring.stationdeski.repositories.SkieurRepository;
import tn.esprit.arc.spring.stationdeski.repositories.PisteRepository;


import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Service
@AllArgsConstructor
public class SkieurService implements ISkieurService{
    SkieurRepository skieurRepository;
    PisteRepository pisteRepository;
    AbonnementRepository abonnementRepository;
    CoursRepository coursRepository ;

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

    @Transactional
    public Skieur assignSkieurToPiste(Long numSkieur, Long numPiste){
        Skieur sk=skieurRepository.GetSkieurByNum(String.valueOf(numSkieur));
        Piste ps=pisteRepository.GetPisteByNum(String.valueOf(numPiste));

        sk.getPistes().add(ps);

        return sk;

    }
    @Transactional
    public Skieur addSkieurAndAssignToCours(Skieur skieur, Long numCours){
        Cours cours=coursRepository.getCoursByNum(String.valueOf(numCours));
        Skieur s=skieurRepository.save(skieur);
        Set<Inscription> inscriptions= s.getInscriptions();
        for (Inscription ins:inscriptions
        ) {
            ins.setCours(cours);
        }
        return s;
    }

    @Override
    public List<Skieur> retrieveSkieursByAbonnementType(TypeAbonnement typeAbonnement) {
        Set<Abonnement> ab=abonnementRepository.getAbonByType(typeAbonnement);
        Skieur skieur= new Skieur();
        List<Skieur> skieurList= new ArrayList<>();
        System.out.println("abonnements= "+ab);

        for (Abonnement a:ab)
        {
            skieurList=skieurRepository.findByAbonnement(a);
            System.out.println(skieur);


        }
        return skieurList;
    }
}
