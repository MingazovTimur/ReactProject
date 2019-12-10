package ru.mingazov.task4;


public class Turtle extends Animal {

    private String name;
    private String color;
    private int livingSpace;

    public Turtle(String name, String color, int livingSpace) {
        this.name = name;
        this.color = color;
        this.livingSpace = livingSpace;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public int getLivingSpace() {
        return livingSpace;
    }

    public void setLivingSpace(int livingSpace) {
        this.livingSpace = livingSpace;
    }

    @Override
    public void eatFood() {
        System.out.println("Черепаха поела");
    }
    /*
    @Override
    protected int die(Animal animal) {
        System.out.println("Покойся с миром черепаха, место в аквариуме увеличилось на " + Turtle.livingSpace+
        " и стало равно " + (Aquarium.volume + Turtle.livingSpace));
        return Aquarium.volume = Aquarium.volume + Turtle.livingSpace;
    }

    private int eatPeacefullFish(Turtle turtle){
        System.out.println("Черепаха съела безобидную рыбу, жилого пространства в аквариуме увеличилось на " +
                PeacefullFish.livingSpace + "и стало равно " + (Aquarium.volume + PeacefullFish.livingSpace));
        return Aquarium.volume = Aquarium.volume + PeacefullFish.livingSpace;
    }

    private int eatPredatorFish(Turtle turtle){
        System.out.println("Черепаха съела хищную рыбу, жилого пространства в аквариуме увеличилось на " +
                PredatorFish.livingSpace + "и стало равно " + (Aquarium.volume + PredatorFish.livingSpace));
        return Aquarium.volume = Aquarium.volume + PredatorFish.livingSpace;
    }

     */

    @Override
    public String toString() {
        return "Черепаха " +
                "по имени " + name +
                " с " + color + " цветом"+
                " и нуждающаяся в " + getLivingSpace() + " литрах пространства для жизни" + '\n';
    }
}
