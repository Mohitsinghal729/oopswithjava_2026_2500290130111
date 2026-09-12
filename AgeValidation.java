import java.util.Scanner;
public class AgeValidation{
    public static voiid main(String[],arg){
        Scannersc=new Scanner(system.in);
        int a=sc.nextInt();
        try{
        checkAge();
        catch(AgeInvalidExeption a){
            system.out.println(a);
        }
        finally{
            sc.close();
        }
    }
    void checkage(int age)
    {
        if(age<18) throw new AgeInvalidExeption ("Age is not valid to vote");
        system.out.println(x:"Eligible is vote");
    }
}
class AgeInvalidExeption extends RuntimeException{
    AgeInvalidExeption(string msg){
        super(msg);
    }
}
}