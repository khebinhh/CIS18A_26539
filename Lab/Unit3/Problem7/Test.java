class Test {
    public static void main(String args[]){
        int nums[] = { 89, 91, 76, 83, 90, 79 };

        int avg[] = new int[6];    // average of test scores

        for (int i = 0; i < 6; i++) {
            avg[i] = nums[i] / 6;
        }
    }
}
