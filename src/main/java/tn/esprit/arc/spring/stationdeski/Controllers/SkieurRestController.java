package tn.esprit.arc.spring.stationdeski.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import tn.esprit.arc.spring.stationdeski.entites.Skieur;
import tn.esprit.arc.spring.stationdeski.services.ISkieurService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/skieur")
public class SkieurRestController {
    ISkieurService skieurService;

    // http://localhost:8089/stationSki/skieur/retrieve-all-skieurs
    @GetMapping("/retrieve-all-skieurs")
    public List<Skieur> getSkieurs() {
        List<Skieur> listSkieurs = skieurService.retrieveAllSkieurs();
        return listSkieurs;
    }

    // http://localhost:8089/stationSki/skieur/retrieve-skieur/8
    @GetMapping("/retrieve-skieur/{skieur-id}")
    public Skieur retrieveSkieur(@PathVariable("skieur-id") Integer skieurId) {
        return skieurService.retrieveSkieur(skieurId);
    }

    // http://localhost:8089/stationSki/skieur/add-skieur
    @PostMapping("/add-skieur")
    public Skieur addSkieur(@RequestBody Skieur m) {
        Skieur skieur = skieurService.addSkieur(m);
        return skieur;
    }

    // http://localhost:8089/stationSki/skieur/remove-skieur/1
    @DeleteMapping("/remove-skieur/{skieur-id}")
    public void removeSkieur(@PathVariable("skieur-id") Integer skieurId) {
        skieurService.deleteSkieur(skieurId);
    }

    // http://localhost:8089/stationSki/skieur/update-skieur
    @PutMapping("/update-skieur")
    public Skieur updateSkieur(@RequestBody Skieur m) {
        Skieur skieur = skieurService.updateSkieur(m);
        return skieur;
    }


}
