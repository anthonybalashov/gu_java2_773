
package ru.ipbalashov.ru.lesson1;

public interface Participant {
    String getName();
    int getMaxLength();
    int getMaxHeight();
    boolean getSuccess();

    void setSuccess(boolean success);

    String runStr();
    String jumpStr();

}
