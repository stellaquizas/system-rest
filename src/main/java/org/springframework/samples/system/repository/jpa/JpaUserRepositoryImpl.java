package org.springframework.samples.system.repository.jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import org.springframework.context.annotation.Profile;
import org.springframework.dao.DataAccessException;
import org.springframework.samples.system.model.User;
import org.springframework.samples.system.repository.UserRepository;
import org.springframework.stereotype.Repository;

@Repository
@Profile("jpa")
public class JpaUserRepositoryImpl implements UserRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    public void save(User user) throws DataAccessException {
        if (this.em.find(User.class, user.getUsername()) == null) {
            this.em.persist(user);
        } else {
            this.em.merge(user);
        }
    }
}
