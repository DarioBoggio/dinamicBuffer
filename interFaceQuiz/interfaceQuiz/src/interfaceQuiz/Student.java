package interfaceQuiz;

import java.util.Arrays;

public class Student implements Comparable {

	String name;
	int[] grades;
	
	
	public Student()
	{
		
		name = RandomGeneraor.getRandomName();
		grades= RandomGeneraor.getRandomGrades();
		
	}
	
	public Student( Student other)
	{
		this.name = other.getName();
		this.grades = other.getGrades(); 
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int[] getGrades() {
		
		int [] gradesCopy = new int [grades.length];
		for (int i=0;i<grades.length;i++)
			gradesCopy[i]=grades[i];
		return gradesCopy;
	}

	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(grades);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (!Arrays.equals(grades, other.grades))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int compareTo(Object obj) {
		
		Student other = (Student) obj;
		
		if (this.getAverage()==other.getAverage())
			return 0;
		else if ( this.getAverage()< other.getAverage())
		    return -1;
		
		else 
			return 1;
	}

	public  double getAverage() {
	
	    double total = 0.0;
	    for (int g : grades)
	    {
	    	total+=g;
	    }
	    return total/grades.length;
	}

}
