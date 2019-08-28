package ru.mingazov.task9.part2;

public class Test {
    public static void main(String[] args) {
        Child child = new Child();
        child.run();
        child.runFast();
        child.swim();

        Swimmer swimmer = new Swimmer();
        swimmer.run();
        swimmer.swimFast();


        Runner runner = new Runner();
        runner.runFast();
        runner.runSlow();
        runner.weight();
        runner.getName();
    }
}
