public class Employee {
    private String name, forename, birthdate, specialties, department = "A38";
    private char gender;
    private int age, workYears = 0;
    private double weight, salary = 1500;

    public Employee(String name, String forename, String birthdate, String specialties, String department, char gender, int age, int workYears, double weight, double salary) {
        this.name = name;
        this.forename = forename;
        this.birthdate = birthdate;
        this.specialties = specialties;
        this.department = department;
        this.gender = gender;
        this.age = age;
        this.workYears = workYears;
        this.weight = weight;
        this.salary = salary;
    }

    public void setWorkYears(int workYears) {
        this.workYears = workYears;
    }

    public String getName() {
        return name;
    }

    public String getForename() {
        return forename;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public String getSpecialties() {
        return specialties;
    }

    public String getDepartment() {
        return department;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public int getWorkYears() {
        return workYears;
    }

    public double getWeight() {
        return weight;
    }

    public double getSalary() {
        return salary;
    }
}
