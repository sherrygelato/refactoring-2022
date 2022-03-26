package code.refactoring.dataarrange_6;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Person {
	
	private Set _courses = new HashSet();
	
	public Set getCourses() {
		return Collections.unmodifiableSet(_courses);
		//return _courses;
	}
	// 2. set �޼��� ����
//	public void initializeCourses(Set arg) {
//		if (arg.isEmpty()) {
//			Iterator iter = arg.iterator();
//			while (iter.hasNext()) {
//				addCourse((Course)iter.next());
//			}
//			// _courses.addAll(arg);
//		}
//	}

	//  1. add, remove �߰� -> Client ����
	public void addCourse(Course arg) {
		_courses.add(arg);
	}
	
	public void removeCourse (Course arg) {
		_courses.remove(arg);
	}
	
	//  3. ����� ������ �ű��
	int numberOfAdvancedCourses( ) { //cause it uses only person's data
		Iterator iter = getCourses().iterator();
		int count = 0;
		while (iter.hasNext()) {
			Course each = (Course) iter.next();
			if (each.isAdvanced()) count ++;
		}
		return count;
	} 

}

