public class Main {
    public static void main(String[] args) {
        class student {
            String name;
            int age;
            int id;
            int midterm;
            int finalmark;
        }
        System.out.println("this is the sample data for one student");
        student stud = new student(); // Create a new instanc
        stud.name = "abebe";
        stud.age = 15;
        stud.id = 1;
        stud.midterm = 30;
        stud.finalmark = 50;

        int total = stud.midterm + stud.finalmark;

        if (total >= 80)
          {System.out.println("name "+stud.name);
              System.out.println("age "+stud.age);
              System.out.println("id "+stud.id);
           System.out.println("Grade is 'A'");}
        else if (total >= 70) {
            System.out.println("name "+stud.name);
            System.out.println("age "+stud.age);
            System.out.println("id "+stud.id);
            System.out.println("Grade is 'B'");
        }
        else if (total >= 50)
        {System.out.println("name "+stud.name);
            System.out.println("age "+stud.age);
            System.out.println("id "+stud.id);
            System.out.println("Grade is 'C'");
        }
        else
        {
            System.out.println("name "+stud.name);
            System.out.println("age "+stud.age);
            System.out.println("id "+stud.id);
            System.out.println("Grade is 'D'");

        };
    };
};