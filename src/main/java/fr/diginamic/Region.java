package fr.diginamic;

import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;

@Entity
@Table(name = "region")
public class Region {

    @Id
    private int id;

    @Column(name="code")
    public String code;

    @Column(name="population")
    public int population;

    public Region() {

    }

    public Region(int id, String code, int population) {
        this.id = id;
        this.code = code;
        this.population = population;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
}
