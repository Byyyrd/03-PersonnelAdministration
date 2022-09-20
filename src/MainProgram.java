public class MainProgram {
    public static void main(String[] args) {
        Employee e1 = new Employee("Jannati","Kiyan","03.08.2006","No Sport","15A",'d',16,-1,200,1);

        Employee e2 = new Employee("Eulberg","Samuel","04.05.2007","Tennis Pro","X",'m',15,15,10,1000000000);

        e2.setDepartment("19D");
        System.out.println(e1.getForename() + e1.getName() + e1.getBirthdate() + e1.getSpecialties() + e1.getDepartment() + e1.getGender() + e1.getAge() + e1.getWorkYears()+ e1.getWeight() + e1.getSalary());
        e1.setWorkYears(2);
        System.out.println("\n"+ e1.getForename() + "\n"+e1.getName() + "\n"+e1.getBirthdate() + e1.getSpecialties() + e1.getDepartment() + e1.getGender() + e1.getAge() + e1.getWorkYears()+ e1.getWeight() + e1.getSalary());
    }
}
