package Day3Exercises.Entities;

public class Courses {
    private double unitPrice;
    private String name;
    private String Id;

    public Courses(double unitPrice,String name, String Id){
        this.name=name;
        this.Id=Id;
        this.unitPrice=unitPrice;

    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }
}
