package app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import connection.ConnectionConfiguration;

public class Control {
	
	public void createStudentTable(){
		
		Connection connection = null;
        Statement statement = null;
        
        try{
        	connection = ConnectionConfiguration.getConnection();
        	if(connection != null){
        		System.out.println("Connection's fine");
        	statement = connection.createStatement();
        	statement.execute("CREATE TABLE IF NOT EXISTS student (id int primary key unique," +
                    "name varchar(35), birthdate varchar(15), address varchar(40))");
        		}
        }catch(Exception e){
        		e.printStackTrace();
        }finally{
        	if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
 
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        
	}
	
	public void createCoursesTable(){
		
		Connection connection = null;
		Statement statement = null;
		
		try{
			connection = ConnectionConfiguration.getConnection();
			if(connection != null){
				System.out.println("Connection's cool");
				statement = connection.createStatement();
				statement.execute("CREATE TABLE IF NOT EXISTS course (id int primary key unique," +
	                    "name varchar(35), teacher varchar(35), year int)");
				}
		}catch(Exception e){
				e.printStackTrace();
		}finally{
			if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }	
			}
			
			if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
		}
		
	}
	
  public void createEnrollTable(){
		
		Connection connection = null;
		Statement statement = null;
		
		try{
			connection = ConnectionConfiguration.getConnection();
			if(connection != null){
				System.out.println("Connection's thriving");
				statement = connection.createStatement();
				statement.execute("CREATE TABLE IF NOT EXISTS enroll (idEnroll int primary key unique," +
	                    "idEnroll int, idStudent int, idCourse int)");
				}
		}catch(Exception e){
				e.printStackTrace();
		}finally{
			if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }	
			}
			
			if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
		}
		
	}
	
	public void insertCourse(Course course){
		
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		
		try{
			connection = ConnectionConfiguration.getConnection();
			preparedStatement = connection.prepareStatement("INSERT INTO course (id, name, teacher, year)" +
                    "VALUES (?,?, ?, ?)");
			preparedStatement.setInt(1, course.getId());
			preparedStatement.setString(2, course.getName());
			preparedStatement.setString(3, course.getTeacher());
			preparedStatement.setInt(4, course.getYear());
			preparedStatement.executeUpdate();
			System.out.println("Insert into course");
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
 
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
		}
	}
	
	public void insertEnroll(int enrollId, int studentId, int courseId){
		
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		
		try{
			connection = ConnectionConfiguration.getConnection();
			preparedStatement = connection.prepareStatement("INSERT INTO enroll (idEnroll, idStudent, idCourse)" +
                    "VALUES (?, ?, ?)");
			preparedStatement.setInt(1, enrollId);
			preparedStatement.setInt(2, studentId);
			preparedStatement.setInt(3, courseId);
			preparedStatement.executeUpdate();
			System.out.println("Insert into enroll");
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
 
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
		}
	}
	
	public void insertStudent(Student student){
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		
		try{
			connection = ConnectionConfiguration.getConnection();
			preparedStatement = connection.prepareStatement("INSERT INTO student (id, name, birthdate, address)" +
                    "VALUES (?, ?, ?, ?)");
			preparedStatement.setInt(1, student.getId());
			preparedStatement.setString(2, student.getName());
			preparedStatement.setString(3, student.getDate());
			preparedStatement.setString(4, student.getAddress());
			preparedStatement.executeUpdate();
			System.out.println("Insert into student");
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
 
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
		}
	}
	
	public void deleteStudent(String name) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
 
        try {
            connection = ConnectionConfiguration.getConnection();
            preparedStatement = connection.prepareStatement("DELETE FROM student WHERE name = ?");
            preparedStatement.setString(1, name);
            preparedStatement.executeUpdate();
 
            System.out.println("delete from student");
 
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
	
	public void deleteCourse(String name) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
 
        try {
            connection = ConnectionConfiguration.getConnection();
            preparedStatement = connection.prepareStatement("DELETE FROM course WHERE name = ?");
            preparedStatement.setString(1, name);
            preparedStatement.executeUpdate();
 
            System.out.println("delete from course");
 
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
	
	public void updateStudent(int id, String name, String birthdate, String address) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
 
        try {
            connection = ConnectionConfiguration.getConnection();
            preparedStatement = connection.prepareStatement("UPDATE student SET " +
                    "name = ?, birthdate = ?, address = ?  WHERE name = ?");
 
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, birthdate);
            preparedStatement.setString(3, address);
            preparedStatement.setString(4, name);
            
            preparedStatement.executeUpdate();
 
            System.out.println("update student?");
 
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
	
	public static void updateCourse(int id, String name, String teacher, int year) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
 
        try {
            connection = ConnectionConfiguration.getConnection();
            preparedStatement = connection.prepareStatement("UPDATE course SET " +
                    "name = ?, teacher = ?, year = ?  WHERE name = ?");
 
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, teacher);
            preparedStatement.setInt(3, year);
            preparedStatement.setString(4, name);
            
            preparedStatement.executeUpdate();
 
            System.out.println("update course");
 
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
	
	public Student selectStudentById(int id) {
        Student student = new Student(0,"","","");
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
 
        try {
            connection = ConnectionConfiguration.getConnection();
            preparedStatement = connection.prepareStatement("SELECT * FROM student WHERE id = ?");
            preparedStatement.setInt(1, id);
            resultSet = preparedStatement.executeQuery();
 
            while (resultSet.next()) {
                student.setId(resultSet.getInt("id"));
                student.setName(resultSet.getString("name"));
                student.setAddress(resultSet.getString("address"));
                student.setDate(resultSet.getString("birthdate"));
            }
 
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
 
        return student;
    }
	
	public Course selectCourseById(int id) {
        Course course = new Course(0,"","",0);
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
 
        try {
            connection = ConnectionConfiguration.getConnection();
            preparedStatement = connection.prepareStatement("SELECT * FROM course WHERE id = ?");
            preparedStatement.setInt(1, id);
            resultSet = preparedStatement.executeQuery();
 
            while (resultSet.next()) {
                course.setId(resultSet.getInt("id"));
                course.setName(resultSet.getString("name"));
                course.setTeacher(resultSet.getString("teacher"));
                course.setYear(resultSet.getInt("year"));
            }
 
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
 
        return course;
    }
	
}
