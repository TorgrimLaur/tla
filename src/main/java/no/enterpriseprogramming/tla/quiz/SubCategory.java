package no.enterpriseprogramming.tla.quiz;

public class SubCategory {

    private int id;
    private String name;

    public SubCategory(int id, String name){
        this.id = id;
        this.name = name;
    }

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
