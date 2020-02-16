public class hesh {
    String str = "значение числа";
    int n = 245478;

    public hesh(String srt) {
        this.str = str;
    }


    public hesh(String str, int n) {
        this.str = str;
        this.n = n;
    }

    @Override
    public String toString() {
        return "hesh{" +
                "str='" + str + '\'' +
                ", n=" + n +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        hesh comparableObject = (hesh) obj;
        if (!comparableObject.str.equals(this.str)) {
            return false;
        }
        if (comparableObject.str.equals(this.str)) {
            return true;
        }

        return true;
    }
    int a = 10;
    int b = 20;



    public hesh(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "hesh{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}




