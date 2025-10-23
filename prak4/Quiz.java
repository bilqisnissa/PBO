class Hewan {
    void suara() {
        System.out.println("Hewan bersuara umum.");
    }

    protected void munculSuara() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'munculSuara'");
    }
}

class Kucing extends Hewan {
    // ...
}


class Burung extends Hewan {
    // ...
}

public class Quiz {
    public static void main(String[] args) {
        Hewan h1 = new Kucing();
        Hewan h2 = new Burung();
        // Panggil method suara untuk masing-masing objek
    }
}
