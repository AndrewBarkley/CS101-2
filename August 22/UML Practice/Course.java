//Zacahry Mosley

public class Course
{
   private String courseName;
   private int courseNumber;
   private int numberOfStudents;
   public static final int MAX_STUDENTS = 40;
   private String building;
   private int roomNumber;
   
   public Course(String name, int number, String building, int room)
   {
      this.courseName = name;
      this.courseNumber = number;
      numberOfStudents = 0;
      this.building = building;
      roomNumber = room;
   }
   
   public void addStudents(int students)
   {
      numberOfStudents += students;
   }
   public void dropStudents(int students)
   {
      numberOfStudents -= students;
   }
   public int getCourseNumber()
   {
      return courseNumber;
   }
   public int getNumberOfStudents()
   {
      return numberOfStudents;
   }
   public String getCourseName()
   {
      return courseName;
   }
   public String getBuilding()
   {
      return building;
   }
   public int getRoomNumber()
   {
      return roomNumber;
   }
   public String toString()
   {
      return courseName + " Course Number " + courseNumber + " Number of Students " +
               numberOfStudents + " Building " + building + " Room Number " + roomNumber;
   }
}