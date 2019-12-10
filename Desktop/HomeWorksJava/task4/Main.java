package ru.mingazov.task4;


public class Main {
    public static void main(String[] args) {
        Aquarium aquarium       = new Aquarium();
        aquarium.setVolume(50);


        Turtle tortila          = new Turtle("Tortilla","green", 10 );

        PredatorFish smallShark = new PredatorFish("smallShark", "grey", 7);

        PredatorFish piranha    = new PredatorFish("piranha", "grey", 4);

        PredatorFish tigerFish  = new PredatorFish("tigerFish", "yellow", 6);

        PeacefullFish guppi     = new PeacefullFish("guppi", "darkBlue", 1);

        PeacefullFish catFish   = new PeacefullFish("catFish", "black", 3);



        aquarium.setInside(new Animal[] {tortila, smallShark, piranha, tigerFish, guppi, catFish});

        System.out.println(aquarium);

        Remain.value(aquarium.getVolume(), tortila.getLivingSpace(), smallShark.getLivingSpace(),
                piranha.getLivingSpace(), tigerFish.getLivingSpace(), guppi.getLivingSpace(),
                catFish.getLivingSpace());



    }
}
