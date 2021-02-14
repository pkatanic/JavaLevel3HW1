package fruitBox;

public class FruitException extends RuntimeException {

    @Override
    public String getMessage() {
        return "коробка полностью заполнена";
    }
}
