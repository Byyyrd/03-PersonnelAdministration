
public class MainProgram {
    public static void main(String[] args) {

        Employee e1 = new Employee("Jannati","Kiyan","03.08.2006","No Sport","15A",'d',16,-1,200,1);

        Employee e2 = new Employee("Eulberg","Samuel","04.05.2007","Tennis Pro","X",'m',15,15,10,1000000000);

        Employee e3 = new Employee("Müller","Harald","1.1.2022","Baby","17Z",'m',60,10,30,100000);

        Employee e4 = new Employee("i","i","8.12.0","j","A36",'m',45,100,60,2147483647);

        Employee e5 = new Employee("Kolhoff","Julius","23.12.2006","r","BB5",'m',15,1000,10,100000000);

        Employee e6 = new Employee("a","g","1.1.2002","Baby","15G",'w',40,10,30,100000);



        System.out.println(e1.getName() + " " + e1.getGender() + " " + e1.getAge() + " " + e1.getWeight() + " " + e1.getSalary());

        System.out.println(e2.getName() + " " + e2.getGender() + " " + e2.getAge() + " " + e2.getWeight() + " " + e2.getSalary());

        System.out.println(e3.getName() + " " + e3.getGender() + " " + e3.getAge() + " " + e3.getWeight() + " " + e3.getSalary());

        System.out.println(e4.getName() + " " + e4.getGender() + " " + e4.getAge() + " " + e4.getWeight() + " " + e4.getSalary());

        System.out.println(e5.getName() + " " + e5.getGender() + " " + e5.getAge() + " " + e5.getWeight() + " " + e5.getSalary());

        System.out.println(e6.getName() + " " + e6.getGender() + " " + e6.getAge() + " " + e6.getWeight() + " " + e6.getSalary());
        
        

    }
}
