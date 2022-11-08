

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

        if (this.age >= 40){
            this.salary = 3000;
        }
        if (this.age >= 50){
            int range = 5000 - 4000 + 1;
            this.salary = (int)(Math.random() * range)+ 4000;
        }
        if (this.age >= 60){
            this.salary += 500;
        }
        if (this.gender == 'w'){
            this.salary += 10000;
        }else{
            this.salary -= 5000;
        }
        if(this.gender == 'm' && this.age >= 50){
            this.age -= 50;
        }
        if (this.gender == 'w' && this.age >= 50 && this.age <= 65){
            this.weight -= 5;
        }else{
            this.weight += 2;
        }
    }
    public void loose1Kg(){
        this.weight -= 1;
    }
    public String printName(Boolean forename){
        if(forename){
            return this.forename;
        }else{
            return this.name;
        }
    }
    public void setDepartment(String department) {
        this.department = department;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setSalary(double salary) {
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
