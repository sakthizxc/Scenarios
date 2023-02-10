class SQL_Trainer extends Trainer
{
public static void main(String []args)
{
SQL_Trainer ram=new SQL_Trainer();
System.out.println(ram.get_salary());
}
SQL_Trainer()
{
super("dept","Institute");
System.out.println(super.dept);
System.out.println(super.Institute);
}

}


