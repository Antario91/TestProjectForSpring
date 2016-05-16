package TestProject.domain;

import java.util.List;

/**
 * Created by Alexandr on 15.05.2016.
 */
public interface serviceForTestEntity {
    testEntity createEntity (int id, String name, int number);
    void deleteEntity(String name);
    testEntity getByID (int id);
    testEntity getByName (String name);
    List<testEntity> getAll ();
}
