package ru.geek.homeworks.lesson8.runningAndJumping;

public class Human implements Participant {

    public final int MAX_RUN = 14000;  //в метрах - максимальная дистанция бега для человека
    public final int MAX_JUMP = 140;  //в метрах - максимальная высота прыжка для человека
    public String name;

    public Human (String name) {
        this.name = name;
    }

    //принимает длину дорожки, сравнивает с максимальной длиной бега и возвращает результат
    @Override
    public boolean run (int trackLength) {
        return MAX_RUN > trackLength;
    }

    //принимает высоту стены, сравнивает с максимальной высотой прыжка и возвращает результат
    @Override
    public boolean jump (int wallHeight) {
        return MAX_JUMP > wallHeight;
    }

    @Override
    public int getMaxRun() {
        return MAX_RUN;
    }

    @Override
    public int getMaxJump() {
        return MAX_JUMP;
    }

    @Override
    public String toString() {
        return name;
    }

}