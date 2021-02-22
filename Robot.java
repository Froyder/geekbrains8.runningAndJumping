package ru.geek.homeworks.lesson8.runningAndJumping;

public class Robot implements Participant {

    public final int MAX_RUN = 20000;  //в метрах - максимальная дистанция бега для робота
    public final int MAX_JUMP = 200;  //в метрах - максимальная высота прыжка для робота
    public String name;

    public Robot (String name) {
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
