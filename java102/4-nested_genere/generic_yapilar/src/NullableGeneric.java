public class NullableGeneric<T> {
    private final T value; // artık veri tipi önemsiz hepsinde geçerli.

    public NullableGeneric(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public boolean isNull() {
        return this.value == null;
    }

    public void run() {
        if (isNull()) {
            System.out.println("Bu değişkene bir değer atanmamıştır (Null)");
        } else {
            System.out.println(this.getValue());
        }
    }
}
