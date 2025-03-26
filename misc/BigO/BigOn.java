public class BigOn {
    public void bigO_N(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
    }
    
    public void bigO_2N(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
        for (int j = 0; j < n; j++) {
            System.out.println(j);
        }
    }
}
