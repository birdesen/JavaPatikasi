public class MyList<T> {
    private int capacity;
    private Object[] mylist;
    private int index = 0;

    //MyList() : Boş contructor kullanılırsa dizinin başlangıç boyutu 10 olmalıdır.
    public MyList() {
        this.capacity = 10;
        this.mylist = new Object[capacity];
    }

    //MyList(int capacity) : Dizinin başlangıç değeri capacity parametresinden alınmalıdır.
    public MyList(int capacity) {
        this.capacity = capacity;
        this.mylist = new Object[capacity];
    }

    //size() : dizideki eleman sayısını verir.
    public int size() {
        int size = 0;
        for (Object i : this.mylist) {
            if (i != null) {
                size++;
            }
        }
        return size;
    }

    //getCapacity() : dizinin kapasite değerini verir.
    public int getCapacity() {
        return this.mylist.length;
    }

    //add(T data) : sınıfa ait diziye eleman eklemek için kullanılmalıdır. Eğer dizide yeteri kadar yer yok ise, dizi boyutu 2 katına çıkartılmalıdır.
    public void add(T data) {
        if (this.index == this.mylist.length) {
            Object[] tempList = new Object[this.getCapacity() * 2];
            for (int i = 0; i < this.mylist.length; i++) {
                tempList[i] = this.mylist[i];
            }
            this.mylist = tempList;
        }
        this.mylist[this.index++] = data;
    }

    //get(int index): verilen indisteki değeri döndürür. Geçersiz indis girilerse null döndürür.
    public Object get(int index) {
        if (this.mylist[index] != null) {
            return this.mylist[index];

        } else {
            return null;
        }
    }

    //remove(int index): verilen indisteki veriyi silmeli ve silinen indis sonrasında ki verileri sol doğru kaydırmalı. Geçersiz indis girilerse null döndürür.
    public Object remove(int index) {
        if (index >= 0 && index < this.mylist.length) {
            for (int i = index; i < mylist.length - 1; i++) {
                this.mylist[i] = this.mylist[i + 1];
            }
            this.index--;
            return this.mylist[index];

        } else {
            return null;
        }
    }

    //set(int index, T data) : verilen indisteki veriyi yenisi ile değiştirme işlemini yapmalıdır. Geçersiz indis girilerse null döndürür.
    public Object set(int index, T data) {
        if (index >= 0 && index < this.mylist.length) {
            this.mylist[index] = data;
            return mylist[index];
        } else {
            return null;
        }
    }

    //String toString() : Sınıfa ait dizideki elemanları listeleyen bir metot.
    public String toString() {
        int count = 0;
        String print = "[";

        for (Object element : mylist) {
            if (element != null)
                count++;
            if (element == null)
                continue;
            print += count != this.size() ? element + "," : element;
        }
        print += "]";
        return print;
    }

    //int indexOf(T data) : Parametrede verilen nesnenin listedeki indeksini verir. Nesne listede yoksa -1 değerini verir.
    public int indexOf(T data) {
        for (int i = 0; i < mylist.length; i++) {
            if (mylist[i] == data) {
                return i;
            }
        }
        return -1;
    }

    // int lastIndexOf(T data) : Belirtilen öğenin listedeki son indeksini söyler. Nesne listede yoksa -1 değerini verir.
    public int lastIndexOf(T data) {
        for (int i = mylist.length - 1; i >= 0; i--) {
            if (mylist[i] == data) {
                return i;
            }
        }
        return -1;
    }

    //boolean isEmpty() : Listenin boş olup olmadığını söyler.
    public boolean isEmpty() {
        for (int i = 0; i < mylist.length; i++) {
            if (mylist[i] != null) {
                return false;
            }
        }
        return true;
    }

    //T[] toArray() : Listedeki öğeleri, aynı sırayla bir array haline getirir.
    public Object[] toArray() {
        Object[] newList = new Object[size()];
        for (int i = 0; i < newList.length; i++) {
            newList[i] = mylist[i];
        }
        return newList;
    }

    //clear() : Listedeki bütün öğeleri siler, boş liste haline getirir.
    public void clear() {
        for (Object i : this.mylist) {
            i = null;
        }
    }

    //MyList<T> sublist(int start,int finish) : Parametrede verilen indeks aralığına ait bir liste döner.
    public MyList<T> subList(int start, int finish) {

        MyList<T> subList = new MyList<>(finish - start);

        for (int i = start; i <= finish; i++) {
            subList.add((T) this.get(i));
        }
        return subList;
    }

    //boolean contains(T data) : Parametrede verilen değerin dizide olup olmadığını söyler.
    public boolean contains(T data) {
        for (Object i : this.mylist) {
            if (i == data) {
                return true;
            }
        }
        return false;
    }


}
