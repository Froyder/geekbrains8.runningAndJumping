package ru.geek.homeworks.lesson8.runningAndJumping;

public interface Participant {

    //общий интерфейсный метод бега для участников (принимает длину препятставия)
    boolean run (int trackLength);

    //общий интерфейсный метод прыжка для участников (принимает высоту препятствия)
    boolean jump (int wallHeight);

    int getMaxRun();

    int getMaxJump();

}
