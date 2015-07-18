/**
 * 
 */
package ClassLab;

/**
 * @author Ishil Puri
 *7/13/15
 */
public class ClassLab {

	/**
	 * @param args
	 */
	//#1 three private variables initialized
	private String name;
	private int age;
	private String profession;
	//#2 set's the three private variables
	public void two(){
		name = "Joe Bob";
		age = 16;
		profession = "software engineer"; 
	}
	//#3
	public void three (String name, int age, String profession){

	}
	//#4 accessors for each field variable
	public String getName(){

		return name;
	}
	public int getAge(){
		return age;
	}
	public String getProfession(){
		return profession;
	}
	//#5 mutator to set the variable 
	public void setName(String name){
		this.name = "Bob";
	}
	//#6 
	public String toString(){
		String profile = name + " is " + age + "years old and is a" + profession;
		return profile;
	}
	//#7
	public int getAgeDifference(ClassLab classLab){
		int agediff = this.age - classLab.age;
		return agediff;
	}
	//#8
	public static String relation;
	public static String getRelation(){
		return relation;
	}
}
