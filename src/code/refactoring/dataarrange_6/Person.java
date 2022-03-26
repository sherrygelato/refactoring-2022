package code.refactoring.dataarrange_6;

import java.util.HashSet;
import java.util.Set;

public class Person {
	
	private Set _courses = new HashSet();
	// Set s = new HashSet();
	
	public Set getCourses() {
		return _courses;
	}
	public void setCourses(Set arg) {
		_courses = arg;
	}

	public void addCourse(Course course) {
		_courses.add(course);
	}

	public void removeCourse(Course course) {
		_courses.remove(course);
	}
}

