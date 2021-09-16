public class MenuItems {
    // properties/class variables/fields
    private String name;
    private Double price;
    private String description;
    private String category; //(appetizer, main course, or dessert)
    private Boolean isNew;

    //constructors

    public MenuItems(String name, Double price, String description, String category, Boolean isNew){
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = isNew;
    }

    //methods
    //getters and setters
    public String getName(){return this.name;}
    public void setName(String name){this.name = name;}

    public Double getPrice(){return this.price;}
    public void setPrice(Double price){this.price = price;}

    public String getDescription(){return this.description;}
    public void setDescription(String description){this.description = description;}

    public String getCategory(){return this.category;}
    public void setCategory(String category){this.category = category;}

    public Boolean getIsNew(){return this.isNew;}
    public void setIsNew(Boolean isNew){this.isNew = isNew;}

    //other methods

}
