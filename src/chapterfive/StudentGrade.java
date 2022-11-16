package chapterfive;

public class StudentGrade {
        private String name;
        private double average;

        public StudentGrade(String name, double average) {
            this.name = name;
            if (average > 0.0 && average <= 100.0) {
                this.average = average;
            }

        }

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAverage(double studentAverage) {
            if (this.average > 0.0 && this.average <= 100.0) {
                this.average = this.average;
            }

        }

        public double getAverage() {
            return this.average;
        }

        public String getLetterGrade() {
            String letterGrade = "";
            if (this.average >= 90.0) {
                letterGrade = "A";
            } else if (this.average >= 80.0) {
                letterGrade = "B";
            } else if (this.average >= 70.0) {
                letterGrade = "C";
            } else if (this.average >= 60.0) {
                letterGrade = "D";
            } else {
                letterGrade = "F";
            }

            return letterGrade;
        }
    }


