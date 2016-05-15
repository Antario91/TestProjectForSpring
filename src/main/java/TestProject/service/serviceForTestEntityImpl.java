package TestProject.service;

import TestProject.domain.repoForTestEntity;
import TestProject.domain.serviceForTestEntity;
import TestProject.domain.testEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Alexandr on 15.05.2016.
 */
@Service
@Transactional
public class serviceForTestEntityImpl implements serviceForTestEntity {

    @Autowired
    private repoForTestEntity RepoForTestEntity;

    @Override
    public testEntity createEntity(int id, String name, int number) {
        testEntity entity = new testEntity(id, name, number);
        RepoForTestEntity.add(entity);
        return entity;
    }

    @Override
    public void deleteEntity(String name) {

    }

    @Override
    public testEntity getByID(int id) {
        return null;
    }

    @Override
    public testEntity getByNumber(int number) {
        return null;
    }

    @Override
    public List<testEntity> getAll() {
        return null;
    }
}
