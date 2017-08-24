package estoque.Testes;

import estoque.Models.*;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class TesteDeletePersistencia {

    public static void main(String[] args) {
        EntityManagerFactory enf = Persistence.createEntityManagerFactory("EstoquePU");
        EntityManager em = enf.createEntityManager();

        Produto p = em.find(Produto.class, (long) 1);
        em.getTransaction().begin();
        em.remove(p);
        em.getTransaction().commit();
        em.close();
        enf.close();
    }

}
