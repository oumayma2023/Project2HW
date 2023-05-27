package Project2HW;

public class Marks {

    // Marks class with abstract method
    abstract class marks {
        abstract double getPercentage();
    }

    // Student A class
    class A extends marks {
        private double subject1;
        private double subject2;
        private double subject3;

        public A(double subject1, double subject2, double subject3) {
            this.subject1 = subject1;
            this.subject2 = subject2;
            this.subject3 = subject3;
        }

        @Override
        double getPercentage() {
            double totalMarks = subject1 + subject2 + subject3;
            return (totalMarks / 3);
        }
    }

    // Student B class
    class B extends marks {
        private double subject1;
        private double subject2;
        private double subject3;
        private double subject4;

        public B(double subject1, double subject2, double subject3, double subject4) {
            this.subject1 = subject1;
            this.subject2 = subject2;
            this.subject3 = subject3;
            this.subject4 = subject4;
        }

        @Override
        double getPercentage() {
            double totalMarks = subject1 + subject2 + subject3 + subject4;
            return (totalMarks / 4);
        }
    }

    // Testing the code
    public class MarksTest {
        public void main(String[] args) {
            A studentA = new A(80, 85, 90);
            System.out.println("Student A");
            System.out.println("Average Percentage: " + studentA.getPercentage());

            B studentB = new B(75, 85, 90, 95);
            System.out.println("Student B");
            System.out.println("Average Percentage: " + studentB.getPercentage());
        }
    }

}