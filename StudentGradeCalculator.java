import javax.swing.JOptionPane;
class StudentGradeCalculator 
{
    public static void main(String[] args) 
    {
        int totalSubjects = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of subjects:"));
        int totalMarks = 0;
        for (int i = 1; i <= totalSubjects; i++) 
        {
            int marks = Integer.parseInt(JOptionPane.showInputDialog("Enter marks for subject " + i + ":"));
            totalMarks += marks;
        }
        double averagePercentage = (double) totalMarks / totalSubjects;
        String grade;
        if (averagePercentage >= 90) 
            grade = "A";
        else if (averagePercentage >= 80) 
            grade = "B";
        else if (averagePercentage >= 70) 
            grade = "C";
        else if (averagePercentage >= 60) 
            grade = "D";
        else 
            grade = "F";
        JOptionPane.showMessageDialog(null, "Total Marks: " + totalMarks + "\nAverage Percentage: " + averagePercentage + "%\nGrade: " + grade);
    }
}
