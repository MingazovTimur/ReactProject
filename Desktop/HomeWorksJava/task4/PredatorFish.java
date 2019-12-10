package ru.mingazov.task4;

public class PredatorFish extends Animal{
    private String name;
    private String color;
    private int livingSpace;

    public PredatorFish(String name, String color, int livingSpace) {
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
        System.out.println("Хищная рыба поела травы, но ей хочется мяса");
    }
    /*
    @Override
    protected int die(Animal animal) {
        System.out.println("Хищная рыба погибла, место в аквариуме увеличилось на " + PredatorFish.livingSpace+
                " и стало равно " + (Aquarium.volume + PredatorFish.livingSpace));
        return Aquarium.volume = Aquarium.volume + PredatorFish.livingSpace;
    }

    private int eatFish(PredatorFish predatorFish) {
        System.out.println("Хищная рыба съела беззащитную рыбку, теперь места в аквариуме больше на " +
                PeacefullFish.livingSpace + " и в общем составляет " + (Aquarium.volume + PeacefullFish.livingSpace));
        return Aquarium.volume = Aquarium.volume + PeacefullFish.livingSpace;
    }
     */
    @Override
    public String toString() {
        return "Хищная рыба " +
                "по имени " + name +
                " с " + color + " цветом"+
                " и нуждающаяся в " + livingSpace + " литрах пространства для жизни" + '\n' ;
    }

}
