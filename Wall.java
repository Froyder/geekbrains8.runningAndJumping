package ru.geek.homeworks.lesson8.runningAndJumping;

public class Wall implements Obstacle{

    public final String NAME = ("стена");
    public int wallHeight;

    public Wall (int wallHeight) {
        this.wallHeight = wallHeight;
    }

    //принимает участника, проверяет его способность перепрыгнуть препятствие, возвращает результат
    @Override
    public boolean passTheObstacle(Participant participant) {
        return participant.jump(wallHeight);
    }

    @Override
    public int getInfo() {
        return wallHeight;
    }

    @Override
    public String toString() {
        return NAME;
    }
}
