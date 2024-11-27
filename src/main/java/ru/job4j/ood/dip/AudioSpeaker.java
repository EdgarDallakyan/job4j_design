package ru.job4j.ood.dip;

public class AudioSpeaker {
    void playSound() {
        System.out.println("Playing sound");
    }
}

class Radio {
    AudioSpeaker speaker = new AudioSpeaker();
}

/*Нарушение DIP происходит потому, что класс Radio зависит от конкретной реализации AudioSpeaker,
а не от абстракции. Соответственно если потребуется заменить AudioSpeaker на другую реализацию,
придётся менять код внутри класса Radio.*/
