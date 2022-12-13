package model;

public class Drinks {

    String name;
    String flavor;
    int levelOfSugar;
    Boolean useAlchol;

    String[] ingredients = new String[4];

    // default and init constructor
    public Drinks() {
        this.name = "Seven";
        this.flavor = "Menta";
        this.levelOfSugar = 12;
        this.useAlchol = false;
        this.ingredients = new String[]{"water", "melon", "lima", "sugar"};
    }

    // constructor using args

    public Drinks(String name, String flavor, int levelOfSugar, Boolean useAlchol, String[] ingredients) {
        this.name = name;
        this.flavor = flavor;
        this.levelOfSugar = levelOfSugar;
        this.useAlchol = useAlchol;
        this.ingredients = ingredients;
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

    public String[] getIngredients() {
        return ingredients;
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

    public void showIngradients(){
        for (String ingr:ingredients) {
            System.out.println(ingr);
        }
    }
    public void getDetails() {
        System.out.println("-----------------------------------------------");
        System.out.println(
                "The name is: " + name + "\n" +
                        "The flavor is:" + flavor + "\n" +
                        "The level of sugar is: " + levelOfSugar + "%\n" +
                        "Contains alcohol? " + useAlchol +
                        "The ingredients length: " + ingredients.length +"\n"
        );
        System.out.println("-----------------------------------------------");
    }


}
