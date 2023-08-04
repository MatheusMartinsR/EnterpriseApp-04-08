package br.com.fiap;

import br.com.fiap.domain.entity.Aluno;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {


        EntityManagerFactory factory = Persistence.createEntityManagerFactory("maria-db");

        EntityManager manager = factory.createEntityManager();

        Aluno matheus = new Aluno();
        matheus.setNome("Matheus Martins da Rocha").setRm("RM96505");

        Aluno augusto = new Aluno();
        augusto.setNome("Augusto Santana").setRm("RM98541");

        manager.getTransaction().begin();

        manager.persist(matheus);
        manager.persist(augusto);

        manager.getTransaction().commit();

        manager.close();
        factory.close();

        System.out.println(matheus);
        System.out.println(augusto);


    }
}