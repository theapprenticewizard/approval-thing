package com.apprenticewizard.approvals.services;

import com.apprenticewizard.approvals.models.Application;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.Collection;

@ApplicationScoped
public class ApplicationService {

    @Inject
    EntityManager entityManager;

    @Transactional
    public Collection<Application> findAll() {
        String jpql = "SELECT application FROM Application application";
        TypedQuery<Application> query = entityManager.createQuery(jpql, Application.class);
        return query.getResultList();
    }

    @Transactional
    public void create(Application application) {
        entityManager.persist(application);
    }
}
