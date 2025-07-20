import java.util.Scanner;
interface Father{
    void getFatherDetails(Scanner sc);
    void showFatherDetails();
}
interface Mother{
    void getMotherDetails(Scanner sc);
    void showMotherDetails();
}
class Child implements Father,Mother{
    String fatherName,motherName,childName;
    int fatherAge,motherAge,childAge;
    String fatherJob,motherJob,childHobby;
    public void getFatherDetails(Scanner sc){
        System.out.println("Enter father name :");
        fatherName=sc.nextLine();
        System.out.println("Enter father Age :");
        fatherAge=Integer.parseInt(sc.nextLine());
        System.out.println("Enter father Job :");
        fatherJob=sc.nextLine();
    }
    public void showFatherDetails(){
        System.out.println("Father:"+fatherName+"| Age :"+fatherAge +"| Professior"+fatherJob);
    }
    public void getMotherDetails(Scanner sc){
        System.out.println("Enter mother name :");
        motherName=sc.nextLine();
        System.out.println("Enter motherr Age :");
        motherAge=Integer.parseInt(sc.nextLine());
        System.out.println("Enter mother Job :");
        motherJob=sc.nextLine();
    }
    public void showMotherDetails(){
        System.out.println("Mother:"+motherName+"| Age :"+motherAge +"| work at home"+motherJob);
    }
    public void getChildDetails(Scanner sc){
        System.out.println("Enter child name :");
        childName=sc.nextLine();
        System.out.println("Enter child Age :");
        childAge=Integer.parseInt(sc.nextLine());
        System.out.println("Enter child Hobby :");
        childHobby=sc.nextLine();
    }
    public void showChildDetails(){
        System.out.println("Child:"+childName+"| Age :"+childAge +"| Hobby"+childHobby);
    }

public class MultipleInheritance_FamilyDetails{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Child c=new Child();
        System.out.println("------Enter Father Detail------");
        c.getFatherDetails(sc);
        System.out.println("------Enter Mother Detail------");
        c.getMotherDetails(sc);
        System.out.println("------Enter Child Detail------");
        c.getChildDetails(sc);
        System.out.println("------Family Detail------");
        c.showFatherDetails();
        c.showMotherDetails();
        c.showChildDetails();
        sc.close();
    }
}
}
