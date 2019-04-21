package ru.mingazov.task4;

public class PeacefullFish extends Animal {
    private String name;
    private String color;
    private int livingSpace;

    public PeacefullFish(String name, String color, int livingSpace) {
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
        System.out.println("Миролюбивая рыбка поела");
    }
    /*
    @Override
    protected int die(Animal animal) {
        System.out.println("Покойся с миром рыбка, место в аквариуме увеличилось на " + PeacefullFish.livingSpace+
                " и стало равно " + (Aquarium.volume + PeacefullFish.livingSpace));
        return Aquarium.volume = Aquarium.volume + PeacefullFish.livingSpace;
    }
     */

    private void hide() {
        System.out.println("Рыбка спряталась");
    }

    @Override
    public String toString() {
        return "Рыбка " +
                "по имени " + name +
                " с " + color + " цветом"+
                " и нуждающаяся в " + livingSpace + " литрах пространства для жизни" + '\n';
    }
}
