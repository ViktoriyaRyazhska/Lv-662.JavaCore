package hw8.homework1;

public class Set {
    public static java.util.Set<String> union(java.util.Set<String> setOne, java.util.Set<String> setTwo) {
        setOne.addAll(setTwo);
        return setOne;
    }

    public static java.util.Set<String> intersect(java.util.Set<String> setOne, java.util.Set<String> setTwo) {
        setOne.retainAll(setTwo);
        return setOne;
    }
}
