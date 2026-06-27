class LandOfNumbers {
    public static int summonSpecialNumbers(int n) {
        int sum = 0;
        int limit = n * 2;
        for (int i = 1; i <= limit; i += 2) {
            sum += i;
        }
        return sum;
    }
}
