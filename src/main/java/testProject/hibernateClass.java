package testProject;

import javax.persistence.*;

/**
 * Created by Admin on 11.05.2016.
 */
@Entity
@Table(name = "`Class for hibernate`")
public class hibernateClass {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Name")
    private String name;

    public hibernateClass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString (){
        return "ID -> " + id + "\n" + "Name -> " + name + "\n";
    }
}
