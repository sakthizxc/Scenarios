public class Trainer{


static String dept="java";
static String Institute="Payilagam";
private int salary=10000;
int get_salary()
{
return salary;
}
void training()
{
System.out.println("Sum");
}
public static void main(String []args){
Trainer trainerkumar=new Trainer("java","Payilagam");
int credit=trainerkumar.get_salary();
trainerkumar.training();
System.out.println(credit);
}
public Trainer(String java,String Payilagam)
{
dept=java;
Institute=Payilagam;
}
}




