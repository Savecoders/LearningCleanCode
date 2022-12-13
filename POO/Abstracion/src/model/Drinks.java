package model;

public class Drinks {

    String name;
    String flavor;
    int levelOfSugar;
    Boolean useAlchol;

    // default and init constructor
    public Drinks() {
        this.name = "Seven";
        this.flavor = "Menta";
        this.levelOfSugar = 12;
        this.useAlchol = false;
    }

    // constructor using args

    public Drinks(String name, String flavor, int levelOfSugar, Boolean useAlchol) {
        this.name = name;
        this.flavor = flavor;
        this.levelOfSugar = levelOfSugar;
        this.useAlchol = useAlchol;
    }

    // sets
    public void setName(String name) {
        this.name = name;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public void setLevelOfSugar(int levelOfSugar) {
        this.levelOfSugar = levelOfSugar;
    }

    // gets

    public String getName() {
        return name;
    }

    public String getFlavor() {
        return flavor;
    }

    public int getLevelOfSugar() {
        return levelOfSugar;
    }

    public Boolean getUseAlchol() {
        return useAlchol;
    }

    public Boolean isUseAlchol() {
        return useAlchol;
    }

    public void getDetails() {
        System.out.println("-----------------------------------------------");
        System.out.println(
                "The name is: " + name + "\n" +
                        "The flavor is:" + flavor + "\n" +
                        "The level of sugar is: " + levelOfSugar + "%\n" +
                        "Contains alcohol? " + useAlchol
        );
        System.out.println("-----------------------------------------------");
    }


}
