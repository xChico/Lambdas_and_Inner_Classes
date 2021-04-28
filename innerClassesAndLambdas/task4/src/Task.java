public class Task {
    public static void main(String[] args){
        Person p = new Person("Kim Possible","2000-01-01");
        p.setPosition("Associate", 34000);
        Resume r = new Resume(p);

        Resume.Education education = r.new Education("NEIU", "Computer Science");
        r.addEducation(education);
        Resume.Experience experience = new Resume.Experience("Records Specialist",2005,2010);
        r.addExperience(experience);
        r.addExperience(new Resume.Experience("Cashier",2011,2013));
        r.addExperience(new Resume.Experience("Tutor",2013,2017));
        System.out.println(r);


    }
}