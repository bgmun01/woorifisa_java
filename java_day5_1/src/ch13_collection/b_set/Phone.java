package ch13_collection.b_set;

public class Phone {
    String number;
    Integer price;

    public Phone(String number, Integer price) {
        this.number = number;
        this.price = price;
    }

    // TODO: 가격과 번호가 같은 Phone은 set에서 하나만 관리되도록 처리하시오.

    // END

    @Override
    public String toString() {
        return "SamePhone [number=" + number + ", price=" + price + "]";
    }
}
