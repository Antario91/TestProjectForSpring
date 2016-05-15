package TestProject.repository;

import TestProject.domain.repoForTestEntity;
import TestProject.domain.testEntity;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Alexandr on 15.05.2016.
 */
@Repository
public class repoForTestEntityImpl implements repoForTestEntity {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void add(testEntity obj) {
        sessionFactory.getCurrentSession()
                .save(obj);
    }

    @Override
    public void delete(testEntity obj) {
        sessionFactory.getCurrentSession()
                .delete(obj);
    }

    @Override
    public testEntity getById(int id) {
        return sessionFactory.getCurrentSession()
                .get(testEntity.class, id);
    }

    @Override
    public List<testEntity> getAllTestEntity() {
        return sessionFactory.getCurrentSession()
                .createCriteria(testEntity.class)
                .list();
    }

    @Override
    public testEntity getByName(String name) {
        sessionFactory.getCurrentSession().
        return null;
    }
}