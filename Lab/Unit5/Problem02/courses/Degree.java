package courses;

class School{
    private String course_name;
    private String course_number;
    private int completion_year;

    School(String n, String no, int y){
        course_name = n;
        course_number = no;
        completion_year = y;
    }
    void show(){
        System.out.println(course_name);
        System.out.println(course_number);
        System.out.println(completion_year);

        System.out.println();
    }
}
class Degree {
    public static void main(String args[]){
        School classes [] = new School[4];
        classes[0] = new School("Java Programming", "CIS18A", 2020);
        classes[1] = new School("Assembly Programming", "CIS11", 2020);
        classes[2] = new School("JavaScript Programming", "CIS14A", 2019);
        classes[3] = new School("Data Sctructures", "CIS17C", 2019);

        for (int i = 0; i < classes.length; i++) classes[i].show();
    }
}
