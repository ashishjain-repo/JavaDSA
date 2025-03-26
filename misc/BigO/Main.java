class Main {
    public static void main(String[] args) {
        // Big O with time complexisty of O(n)
        BigOn big_O_of_n = new BigOn();
        big_O_of_n.bigO_N(10);
        big_O_of_n.bigO_2N(10); // This is O(2n) but we drop the contants and it is just O(n)

        // Big O with time complexity of O(n^2)
        BigOnEXP2 big_O_of_n_exp_2 = new BigOnEXP2();
        big_O_of_n_exp_2.BigOnExponential2(10); // This can also be explained as n * n which is similar to n^2

        // Big O with time complexity of O(1)
        BigOnTimes1 big_O_of_n_times_1 = new BigOnTimes1();
        int res = big_O_of_n_times_1.addItems(10); // What this it is, it only do one operation, in this case just
                                                   // returning n + n. As the n grows the number of operation grows.
                                                   // This is also called constant time, N grows from 1 to for example
                                                   // 100, but if simlified it will remain O(1). This is the most
                                                   // efficient Big O.
        System.out.println(res);

        // Big O with time complexity of O(log n)
        /*
         * In this when have an array we divide them from the middle and check both ends
         * and keep the end that have the value based on range and we do that until we
         * find that exact element. Again, we have to cut the array in half until we
         * find the exact value we are looking for.
         */
        /*
         * For example: [1,2,3,4,5,6,7,8] if we are about to find the element '1' it
         * will take us 3 times, or 3 chops to get to 1. Which is log_2 8 = 3 or 2^3 =
         * 8. This is also an efficient Big O
         */
    }

}