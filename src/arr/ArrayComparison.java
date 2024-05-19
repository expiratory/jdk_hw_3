package arr;

public class ArrayComparison {
    public static <T> boolean compareArrays(T[] a, T[] b) {
        if (a.length != b.length) {
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            if (!a[i].getClass().equals(b[i].getClass()) || !a[i].equals(b[i])) {
                return false;
            }
        }
        return true;
    }
}
