package ra.bt3;

public class Main {
    public static void main(String[] args) {
        int [] a = {2,3,5,6,7,8};
        int [] b = {2,34,4,56,67,7};
        int[] c = new int[a.length+ b.length];
        for (int i = 0 ; i < a.length; i++){
            c[i] = a[i];
        }
        for (int i = 0 ; i < b.length; i++){
            c[a.length + i] = b[i];
        }
        for (int i = 0 ; i < c.length; i++){
            System.out.print( c[i] + " ");
        }
    }
}
