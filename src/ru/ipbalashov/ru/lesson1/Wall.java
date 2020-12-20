
package ru.ipbalashov.ru.lesson1;

public class Wall implements Hurdles {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    public String check(Participant participant) {
        participant.jumpStr();
        participant.setSuccess(participant.getMaxHeight() >= height);
        if (participant.getSuccess()) {
            participant.getSuccess();
            return "Участник " + participant.getName() + " перепрыгнул стену высотой: " + height + " м";
        } else {
            participant.getSuccess();
            return "Участник " + participant.getName() + " не перепрыгнул стену высотой: " + height + " м";
        }
    }

}
