package ru.mingazov.task4;


public class Main {
    public static void main(String[] args) {
        Aquarium aquarium       = new Aquarium();
        aquarium.setVolume(50);


        Turtle tortila          = new Turtle("Tortilla","green", 10 );
        aquarium.setInside(new Animal[] {tortila});

        PredatorFish smallShark = new PredatorFish("smallShark", "grey", 7);
        aquarium.setInside(new Animal[] {smallShark});

        PredatorFish piranha    = new PredatorFish("piranha", "grey", 4);
        aquarium.setInside(new Animal[] {piranha});

        PredatorFish tigerFish  = new PredatorFish("tigerFish", "yellow", 6);
        aquarium.setInside(new Animal[] {tigerFish});

        PeacefullFish guppi     = new PeacefullFish("guppi", "darkBlue", 1);
        aquarium.setInside(new Animal[] {guppi});

        PeacefullFish catFish   = new PeacefullFish("catFish", "black", 3);
        aquarium.setInside(new Animal[] {catFish});



        aquarium.setInside(new Animal[] {tortila, smallShark, piranha, tigerFish, guppi, catFish});

        System.out.println(aquarium);

        Remain.value(aquarium.getVolume(), tortila.getLivingSpace(), smallShark.getLivingSpace(),
                piranha.getLivingSpace(), tigerFish.getLivingSpace(), guppi.getLivingSpace(),
                catFish.getLivingSpace());



    }
}
