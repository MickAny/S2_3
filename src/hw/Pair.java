package hw;

public class  Pair <T, V>{
    T var1;
    V var2;
    public Pair(T var1, V var2) {
        this.var1 = var1;
        this.var2 = var2;
    }
    public T getVar1() {
        return var1;
    }
    public V getVar2() {
        return var2;
    }
    @Override
    public String toString() {
        return "Pair:\n" +
                "Var1: " + var1 + "\n" +
                "Var2: " + var2 + "\n";
    }
}
