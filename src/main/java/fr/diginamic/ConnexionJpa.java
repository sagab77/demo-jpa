package fr.diginamic;

import javax.persistence.*;

public class ConnexionJpa {

    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("bibliotheque");
        EntityManager em = factory.createEntityManager();

        EntityTransaction transaction = em.getTransaction();
        transaction.begin();


        /* Region region = new Region();
        region.setId(2);
        region.setCode("198756");
        region.setPopulation(2500000);
        manager.persist(region);*/


        Livre livre = em.find(Livre.class, 1);

        if (livre != null) {
            System.out.println(livre.getId() + livre.getAuteur());


        }



        transaction.commit();

        System.out.println();



       /* TypedQuery<Livre> query = em.createQuery("select livre from Livre livre where livre.nom='Germinal'",Livre.class);
        Livre livre1 = query.getResultList().get(2);*/

        em.close();
        factory.close();


    }
}
