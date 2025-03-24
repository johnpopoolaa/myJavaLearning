class Student
{
    int rollNum;

    String name;
    int score;
}

public class studentArrays {
    public static void main(String a[])
    {
        Student first = new Student();
        first.rollNum = 1;
        first.name = "Mike";
        first.score = 88;

        Student second = new Student();
        second.rollNum = 2;
        second.name = "John";
        second.score = 99;

        Student third = new Student();
        third.rollNum = 3;
        third.name = "Winner";
        third.score = 92;

        Student students[] = new Student[3];
        students[0] = first;
        students[1] = second;
        students[2] = third;

        for(int i = 0; i < students.length; i++)
        {
            System.out.println(students[i].name + ": " + students[i].score);
        }
    }
}