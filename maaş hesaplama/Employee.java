public class Employee {

    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, double salary, int workHours, int hireYear){

        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;

    }



    double tax(){
        double vergi;
        if (salary > 1000){
            vergi = salary *= 0.3;
        } else {
            vergi = 0;
        }
        return vergi;
    }
    double bonus(){
        double bonus;
        if (workHours > 40){
            bonus = (workHours - 40)*30;
        } else{
            bonus = 0;
        }
        return bonus;
    }
    double raiseSalary(){
        double artısMiktari = 0;
        double kacYil = 2022 - hireYear;
        if (kacYil < 10){
            artısMiktari = salary*= 0.05;
        }
        if (kacYil >=10 && kacYil<20){
            artısMiktari = salary*=0.10;
        }
        if (kacYil >=20){
            artısMiktari = salary *= 0.15;
        }
        return artısMiktari;
    }

    void info (){
        double toplam = salary -tax()+bonus()+raiseSalary();
        System.out.println("------------------------------------");
        System.out.println("Maaşı: " + this.salary);
        System.out.println("Çalışma saati: " + this.workHours);
        System.out.println("Başlangıç Yılı: " + this.hireYear);
        System.out.println("Vergi: " + tax());
        System.out.println("Bonus: " + bonus());
        System.out.println("Maaş Artışı: " + raiseSalary());
        System.out.println("Vergi ve Bonuslar ile maaşı: " + toplam);








    }

}
