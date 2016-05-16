package TestProject.domain;

import java.util.List;

/**
 * Created by Alexandr on 15.05.2016.
 */
public interface repoForTestEntity {
    void add (testEntity obj);
    void delete (testEntity obj);
    testEntity getById (int id);
    List<testEntity> getAllTestEntity ();
    List<testEntity> getByName (String name);
}
