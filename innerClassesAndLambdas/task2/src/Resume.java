import java.util.ArrayList;
import java.util.List;

public class Resume {
    public class Education{
        String school;
        String major;

        public String getSchool(){
            return this.school;
        }
        public String getMajor(){
            return this.major;
        }

        public Education(String school, String major){
            this.school = school;
            this.major = major;
        }
        @Override
        public String toString(){
            return this.major + " at " + this.school;
        }

    }

    public static class Experience{
        String title;
        int toYear;
        int fromYear;

        public Experience(String title, int fromYear, int toYear){
            this.title = title;
            this.toYear = toYear;
            this.fromYear = fromYear;
        }
        @Override
        public String toString(){
            return this.fromYear + " - " + this.toYear + ":" + this.title;
        }

    }



    private Person person;
    private List<Education> education;
    private List<Experience> experience;

    public Resume(Person person){
        this.person = person;
        this.education = new ArrayList<>();
        this.experience = new ArrayList<>();

    }

    public void addExperience(Experience info){
        this.experience.add(info);
    }
    public void addEducation(Education info){
        this.education.add(info);
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

Create a public member inner class Education according to the specifications.


Create a public static inner class called Experience, according to the specifications.


Create the Person and List of Education and List of experience objects. They should be private.
    public Resume(Person p){

This constructor should initialize the person and do all necessary initializations for the other methods to work.



Create the addEducation, addExperience and override the toString methods as specified.


*/

