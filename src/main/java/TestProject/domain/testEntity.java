package TestProject.domain;

import javax.persistence.*;

/**
 * Created by Alexandr on 15.05.2016.
 */
@Entity
@Table(name = "`entity !`")
public class testEntity {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "NUMBER")
    private int number;

    public testEntity(int id, String name, int number) {
        this.id = id;
        this.name = name;
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getNumber(){
        return number;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number){
        this.number = number;
    }
}