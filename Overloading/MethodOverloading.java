package Overloading;

public class MethodOverloading {


    private int value;

    public MethodOverloading(int startValue) {
        this.value = startValue;
    }

    public MethodOverloading() {
        this.value = 0;
    }

    public int value() {
        return value;
    }

    public void increase() {
        value++;
    }

    public void decrease() {
        value--;
    }

    public void increase(int increaseBy) {
        if (increaseBy > 0) {
            value = value + increaseBy;
        }

    }

    public void decrease(int decreaseBy) {
        if (decreaseBy > 0) {
            value = value - decreaseBy;
        }
        return;
    }
}