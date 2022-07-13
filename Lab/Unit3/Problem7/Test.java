class Test {
    public static void main(String args[]){
        double nums[] = { 89.0, 91.0, 76.0, 83.0, 90.0, 79.0 };

        double avg[] = new double[6];    // average of test scores

        double average;

        for (int i = 0; i < 6; i++) {
            avg[i] = nums[i] / 6;
            average += avg[i];
        }
        /*double average = avg[0] + avg[1] + avg[2] + avg[3]
                        + avg[4] + avg[5];
        */
        System.out.println("This program will display the average of these test scores:");
        System.out.println("[89, 91, 76, 83, 90, 79]");
        System.out.println("Answer: " + average);
    }
}
