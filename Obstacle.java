package ru.geek.homeworks.lesson8.runningAndJumping;

public interface Obstacle {

    //общий интерфейсный метод для препятствий ("принимает" участника)
    boolean passTheObstacle(Participant participant);

    //возвращает общую информацию о препяствии в нашем случае - высота или длина)
    int getInfo();

}
