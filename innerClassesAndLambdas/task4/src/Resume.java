import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Resume {


    //import jdk.jfr.Percentage;The imports will self populate. You don't have to do anything.
    public class Education {
        String school;
        String major;

        public String getSchool() {
            return school;
        }

        public String getMajor() {
            return major;
        }

        public Education(String school, String major) {
            this.school = school;
            this.major = major;
        }

        @Override
        public String toString() {
            return this.major + " at " + this.school;
        }
    }


    public static class Experience {
        String title;
        int fromYear;
        int toYear;

        public Experience(String title, int fromYear, int toYear) {
            this.title = title;
            this.fromYear = fromYear;
            this.toYear = toYear;
        }

        @Override
        public String toString() {
            return this.fromYear + " - " + this.toYear + ":" + this.title;
        }
    }

    private Person person;
    private List<Education> education;
    private PriorityQueue<Experience> experience;

    public Resume(Person person) {
        this.person = person;
        this.education = new ArrayList<>();
        this.experience = new PriorityQueue<>((exp1, exp2) ->
                exp2.fromYear - exp1.fromYear);
    }

    public PriorityQueue getExperience() {
        return this.experience;
    }

    public void addEducation(Education info) {
        this.education.add(info);
    }

    public void addExperience(Experience info) {
        this.experience.add(info);
    }

    @Override
    public String toString() {
        String result = "";
        result = this.person.toString();

        String rTwo = "";

        for (Experience exper : this.experience) {
            rTwo += "\n" + exper;
        }

        String rThree = "";

        for (Education edu : this.education) {
            rThree += "\n" + edu;
        }
        return result + "\nExperience" + rTwo + "\nEducation" + rThree;

    }

}


/*

Copy the two inner classes of Resume exactly as they were in Task 2. Copy->paste.

Create a member variable of type Person (exactly as in task 2)

Create a List to hold values of type Education (exactly as in task 2)

Create a Priority Queue that holds values of type Experience.
    public Resume(Person p){

Assign a value to the Person variable.

Initialize the List with Education objects.

Initialize the priority queue with a comparator defined in an anonymous inner class. Check the specs for the comparator.
    }


Add a standard getter for the experiences. getExperience. it should return a priority queue.


Implement the addEducation, addExperience and override the toString() methods exactly as you did in task 2 (Copy->Paste)

*/







/*



Same two inner classes and member variables as in task 3.
    public Resume(Person p){

Same initialization of Person and the List of Education objects

Initialize the priority queue in one line, without importing the Comparator interface.


The getter for experience and the methods to add education and experience objects stay the same, as well as the toString()


*/

