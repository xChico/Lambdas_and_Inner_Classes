
import java.time.LocalDate;
import java.time.Period;
public class Person {
    private String name;
    private LocalDate birthDate;
    private Position position;

    private class Position{
        String name;
        Double salary;
        Position(String name, double salary){
            this.name = name;
            this.salary = salary;
        }
        @Override
        public String toString(){
            return this.name+":"+this.salary;
        }
    }
    public Person(String name, String birthDate){
        this.name = name;
        this.birthDate = LocalDate.parse(birthDate);
    }

    public int getAge(){
        return Period.between(this.birthDate,  LocalDate.now()).getYears();
    }
    public void setPosition(String title, double salary){
        this.position = new Position(title, salary);
    }


    public Position getPosition(){
        return this.position;
    }
    @Override
    public String toString(){
        return this.name+" " + getAge() + " " + this.position;
    }

}










