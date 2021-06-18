package fr.diginamic;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "livre")
public class Livre {

    @Id
    private Integer id;

    @Column(name = "titre")
    private String titre;



    @Column(name = "auteur")
    private String auteur;

    // relation ManyToMany avec la table Emprunt



    @ManyToMany
    @JoinTable(name = "COMPO", joinColumns = @JoinColumn(name = "ID_LIV", referencedColumnName = "ID"),
            inverseJoinColumns = @JoinColumn(name = "ID_EMP", referencedColumnName = "ID"))
    private Set<Emprunt> emprunts;


    public Livre() {

        emprunts = new HashSet<Emprunt>();
    }

    public Livre(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Set<Emprunt> getEmprunts() {
        return emprunts;
    }

    public void setEmprunts(Set<Emprunt> emprunts) {
        this.emprunts = emprunts;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    @Override
    public String toString() {
        return "Livre{" +
                "id=" + id +
                ", titre='" + titre + '\'' +
                ", auteur='" + auteur + '\'' +
                '}';
    }

    public Livre(Integer id, String titre, String auteur, Set<Emprunt> emprunts) {
        this.id = id;
        this.titre = titre;
        this.auteur = auteur;
        this.emprunts = emprunts;
    }
}
