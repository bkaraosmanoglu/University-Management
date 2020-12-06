import java.util.ArrayList;
import java.util.Iterator;

public class Collection {
	private ArrayList<Student> students;
	private ArrayList<Instructor> instructors;
	private ArrayList<Course> courses;
        
    public Collection() {
		
		students = new ArrayList<>();
		instructors = new ArrayList<>();
		courses = new ArrayList<>();
                
	}
	
	
	public ArrayList<Instructor> listInstructors() {
		return instructors;
	}

	public ArrayList<Instructor> listInstructorsByName( String value ) {
		
		ArrayList<Instructor> tempL = new ArrayList<>();
		Iterator<Instructor> it = instructors.iterator();

		while( it.hasNext() ) {
			Instructor temp = it.next();
			
			if( temp.getName().equals( value ) )
				tempL.add(temp);
		}

		return tempL;
	}

	public Instructor getInstructor( String id ) {
		Iterator<Instructor> it = instructors.iterator();

		while( it.hasNext() ) {
			Instructor temp = it.next();
			if( temp.getId().equals(id) )
				return temp;
		}

		return null;
	}

	public boolean removeInstructor( String id ) {
		Iterator<Instructor> it = instructors.iterator();

		while( it.hasNext() ) {
			Instructor temp = it.next();
			
			if( temp.getId().equals(id) )
			{
				it.remove();
				return true;
			}
		}

		return false;
	}

	public boolean updateInstructor( String id, Instructor newInstructor ) {
		Instructor current = this.getInstructor( id );

		
		if( current != null && this.getInstructor( newInstructor.getId() ) == null ) {
			
			instructors.set(instructors.indexOf(current), newInstructor);
			return true;
		}

		return false;
	}

	public boolean addInstructor( Instructor newInstructor ) {
		
		if( this.getInstructor( newInstructor.getId() ) != null)
			return false;


		instructors.add(newInstructor);
		return true;
	}
        
        
        
        public ArrayList<Student> listStudents() {
		return students;
	}

	public ArrayList<Student> listStudentsByName( String value ) {
		
		ArrayList<Student> tempL = new ArrayList<>();
		Iterator<Student> it = students.iterator();

		while( it.hasNext() ) {
			Student temp = it.next();
			
			if( temp.getName().equals( value ) )
				tempL.add(temp);
		}

		return tempL;
	}

	public Student getStudent( String id ) {
		Iterator<Student> it = students.iterator();

		while( it.hasNext() ) {
			Student temp = it.next();
			if( temp.getId().equals(id) )
				return temp;
		}

		return null;
	}

	public boolean removeStudent( String id ) {
		Iterator<Student> it = students.iterator();

		while( it.hasNext() ) {
			Student temp = it.next();
			
			if( temp.getId().equals(id) )
			{
				it.remove();
				return true;
			}
		}

		return false;
	}

	public boolean updateStudent( String id, Student newStudent ) {
		Student current = this.getStudent( id );

		
		if( current != null && this.getStudent( newStudent.getId() ) == null ) {
			
			students.set(students.indexOf(current), newStudent);
			return true;
		}

		return false;
	}

	public boolean addStudent( Student newStudent ) {
		
		if( this.getStudent( newStudent.getId() ) != null)
			return false;


		students.add(newStudent);
		return true;
	}
        
        
        
        
        public ArrayList<Course> listCourses() {
		return courses;
	}

	public ArrayList<Course> listCoursesByName( String value ) {
		
		ArrayList<Course> tempL = new ArrayList<>();
		Iterator<Course> it = courses.iterator();

		while( it.hasNext() ) {
			Course temp = it.next();
			
			if( temp.getName().equals( value ) )
				tempL.add(temp);
		}

		return tempL;
	}

	public Course getCourse( String id ) {
		Iterator<Course> it = courses.iterator();

		while( it.hasNext() ) {
			Course temp = it.next();
			if( temp.getId().equals(id) )
				return temp;
		}

		return null;
	}

	public boolean removeCourse( String id ) {
		Iterator<Course> it = courses.iterator();

		while( it.hasNext() ) {
			Course temp = it.next();
			
			if( temp.getId().equals(id) )
			{
				it.remove();
				return true;
			}
		}

		return false;
	}

	public boolean updateCourse( String id, Course newCourse ) {
		Course current = this.getCourse( id );

		
		if( current != null && this.getCourse( newCourse.getId() ) == null ) {
			
			courses.set(courses.indexOf(current), newCourse);
			return true;
		}

		return false;
	}

	public boolean addCourse( Course newCourse ) {
		
		if( this.getCourse( newCourse.getId() ) != null)
			return false;


		courses.add(newCourse);
		return true;
	}
}