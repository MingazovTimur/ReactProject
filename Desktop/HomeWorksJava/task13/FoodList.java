package ru.mingazov.task13;

public enum FoodList {VEGETABLES("Овощи", "Не вкусно", 1), PORRIDGE("Кашка", "Не вкусно", 2),
    SAUSAGE("Сосисоны", "Вкусно", 3), EGG("Куриное яйцо", "Не вкусно", 4), FISH("Рыба", "Вкусно", 5);

    FoodList(String name, String taste, int choice) {

        this.taste  = taste;
        this.choice = choice;
        this.name   = name;
    }
    private String name;
    private String taste;
    private int choice;

    public String getName() {
        return name;
    }

    public String getTaste() {
        return taste;
    }

    public int getChoice() {
        return choice;
    }


    @Override
    public String toString() {
        return "FoodList{" +
                "name='" + name + '\'' +
                ", taste='" + taste + '\'' +
                ", choice=" + choice +
                '}';
    }

    public void showFood (){
        for (FoodList i:FoodList.values()) {
            System.out.println("Нажмите соответствующую клавишу для выбора:");
            System.out.println(i.choice + ". " + i.name);
            System.out.println("_________________________");
        }
    }
}
