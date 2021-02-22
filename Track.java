package ru.geek.homeworks.lesson8.runningAndJumping;

public class Track implements Obstacle {

    public final String NAME = "беговая дорожка";
    public int trackLength;

    public Track (int trackLength) {
        this.trackLength = trackLength;
    }

    //принимает участника, проверяет его способность пробежать дистанцию, возвращает результат
    @Override
    public boolean passTheObstacle(Participant participant) {
        return participant.run(trackLength);
    }

    @Override
    public int getInfo() {
        return trackLength;
    }

    @Override
    public String toString() {
        return NAME;
    }

}