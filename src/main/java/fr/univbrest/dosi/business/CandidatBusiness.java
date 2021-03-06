package fr.univbrest.dosi.business;

import fr.univbrest.dosi.bean.Candidat;

import java.util.List;

public interface CandidatBusiness {

    public Candidat creerCandidat(Candidat candidat);

    public void modifierCandidat(Candidat candidat);

    void supprimerCandidat(String noCandidat);

    List<Candidat> recupererTousLesCandidats();

    List<Candidat> rechercheCandidatsParNom(String nom);

    List<Candidat> rechercheCandidatsUniversiteOrigine(String universiteOrigines);

    Candidat recupererCandidatParCode(String noCandidat);

    long nombreCandidat();
}
