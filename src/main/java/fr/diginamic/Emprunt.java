package fr.diginamic;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "emprunt")
public class Emprunt {

    @Id
    private Integer id;

    @Column(name = "DATE_DEBUT")
    private LocalDate dateDebut;

    @Column(name = "DATE_FIN")
    private LocalDate dateFin;

    @Column(name = "DELAI")
    private Integer delai;

    @ManyToMany
    @JoinTable(name = "COMPO", joinColumns = @JoinColumn(name = "ID_EMP", referencedColumnName = "ID"),
            inverseJoinColumns = @JoinColumn(name = "ID_LIV", referencedColumnName = "ID"))
    private Set<Livre> livres;



    @ManyToOne
    @JoinColumn(name = "ID_CLIENT")
    private Client client;

    public Emprunt() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(LocalDate dateDebut) {
        this.dateDebut = dateDebut;
    }

    public LocalDate getDateFin() {
        return dateFin;
    }

    public void setDateFin(LocalDate dateFin) {
        this.dateFin = dateFin;
    }

    public Integer getDelai() {
        return delai;
    }

    public void setDelai(Integer delai) {
        this.delai = delai;
    }



    public Client getClient() {
        return (Client) client;
    }


    public Emprunt(Integer id, LocalDate dateDebut, LocalDate dateFin, Integer delai, Emprunt emprunt) {
        this.id = id;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.delai = delai;
        //this.emprunt = emprunt;
    }
}
