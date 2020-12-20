package ru.ipbalashov.ru.lesson1;

public class Racecourse implements Hurdles {
    private int length;

    public Racecourse(int length) {
        this.length = length;
    }

    public String check(Participant participant) {
        participant.runStr();
        participant.setSuccess(participant.getMaxLength() >= length);
        if (participant.getSuccess()) {
            participant.getSuccess();
            return "Участник " + participant.getName() + " проходит дистанцию длиной: " + length + " км";
        } else {
            participant.getSuccess();
            return "Участник " + participant.getName() + " не проходит дистанцию длиной: " + length + " км";
        }
    }
}
