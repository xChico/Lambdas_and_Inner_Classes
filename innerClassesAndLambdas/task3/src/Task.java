public class Task {
    public static void main(String[] args){
        Person p = new Person("Kim Possible","2000-01-01");
        p.setPosition("Associate", 34000);
        Resume r = new Resume(p);

        Resume.Education education = r.new Education("NEIU", "Computer Science");
        r.addEducation(education);
        Resume.Experience experience = new Resume.Experience("Records Specialist",2014,2019);
        r.addExperience(experience);
        r.addExperience(new Resume.Experience("Cashier",2011,2013));
        r.addExperience(new Resume.Experience("Tutor",2013,2017));
        System.out.println(r);





/*
Copy the Task from task 2 here and add experiences where the end years are not in order. Watch it print the resume with the dates in order from most recent to least.

   */
    }
}