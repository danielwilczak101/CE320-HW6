import java.lang.Comparable;

public class Question3 {

    public static <E extends Comparable<E>> int linearSearch(E[] collection, E element) {
        
        // Pretty straight forward.
        int i = 0;
        for (var e : collection) {
            if (element.compare(e) == 0)
                return i;
            i++;
        }
        return -1;
    }

    public static void main(String[] args) {
        Integer[] list = {3, 4, 5, 1, -3, -5, -1};
        System.out.println(linearSearch(list, 2));
        System.out.println(linearSearch(list, 5));
    }
}