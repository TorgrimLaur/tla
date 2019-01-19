package no.enterpriseprogramming.tla.quiz;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity //annotation to specify that this class is an entity.
public class SubCategory {

    //Entity classes must have primarykey. Therefore use of @id
    @Id@GeneratedValue
    private int id;
    private String name;


    //entity classes can not have parameterized constructors
    public SubCategory(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
