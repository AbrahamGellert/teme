CREATE TABLE Students (
  StudentID INT,
  Name VARCHAR(30),
  BirthDate DATE,
  Address VARCHAR(30),
  PRIMARY KEY(StudentID));
  
CREATE TABLE Courses (
  CourseID INT,
  Course VARCHAR(30),
  Teacher VARCHAR(30),
  StudyYear INT,
  PRIMARY KEY(CourseID));
  
CREATE TABLE EnrollCourses (
  CourseID INT,
  Course VARCHAR(30),
  Teacher VARCHAR(30),
  StudentID INT,
  StudentName VARCHAR(30));