package ru.geek.homeworks.lesson8.runningAndJumping;

public class RaceMain {

    public static void main(String[] args) {

        // Создаем массив с участниками
        Participant[] participant = new Participant[3];
        participant[0] = new Cat("Кот Бегемот");
        participant[1] = new Human("Человек-многоборец");
        participant[2] = new Robot("Робот Бегопрыг-2000");

        // Создаем массив с препятствиями
        Obstacle[] obstacles = new Obstacle[7];
        obstacles[0] = new Track(2000);
        obstacles[1] = new Wall(20);
        obstacles[2] = new Track(3000);
        obstacles[3] = new Wall(120);
        obstacles[4] = new Track(15000);
        obstacles[5] = new Wall(150);
        obstacles[6] = new Track(40000);

        // прогоняем через полосу препятствий каждого участника.
        for (int i = 0; i < participant.length; i++) {
            int score = 0;
            for (int j = 0; j < obstacles.length; j++) {
                if (obstacles[j].passTheObstacle(participant[i])) {
                    System.out.println (participant[i].toString() + " преодолел препятствие " +
                                        obstacles[j].toString() + " (" + obstacles[j].getInfo() + " метров).");
                    score++;
                } else {
                    System.out.println (participant[i].toString() + " не смог преодолеть препятствие " +
                                        obstacles[j].toString() + " (" + obstacles[j].getInfo() + " метров) и выбыл.");
                    break;
                }
            }
            System.out.println("Этот участник закончил выступление. Его результат - " + score + " балла(ов).");
            System.out.println();
        }
    }
}
