package Day3Exercises.Entities;

public class Instructor {
    private String name;
    private int Id;

    public Instructor(String name,int Id){
        this.name=name;
        this.Id=Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }
}
