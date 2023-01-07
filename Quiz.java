public class Student extends Quiz { 
         public int totalScore = 100; 
         public int maxScore = 50; 
          
         public void divide (int totalScore, int maxScore) { 
                 grade = totalScore / maxScore; 
         } 
  
         public Student(String name, double grade) { 
                 super(name, grade); 
         } 
  
         @Override 
         public double calculateGrade() { 
                 return (totalScore / maxScore); 
         } 
 }
