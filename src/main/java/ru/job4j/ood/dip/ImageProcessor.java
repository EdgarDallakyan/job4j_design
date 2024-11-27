package ru.job4j.ood.dip;

public class ImageProcessor {
    void process() {
        System.out.println("Processing image");
    }
}

class PhotoEditor {
    ImageProcessor imageProcessor;

    public PhotoEditor(ImageProcessor imageProcessor) {
        this.imageProcessor = imageProcessor;
    }
}

/*Нарушение DIP заключается в том, что PhotoEditor зависит от конкретного класса ImageProcessor,
а не от абстракции(например, интерфейса). Поэтому если нужно будет заменить или
модифицировать логику обработки изображений, придётся менять сам класс PhotoEditor.*/
