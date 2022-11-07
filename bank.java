

     import java.util.Scanner;
public class bank{
public static void main(String[]args){
 Scanner read= new Scanner(System.in);
    System.out.println("Welcome to JUC Bank");
    System.out.println("--------------------------------------------------");    
    System.out.print("Please enter the number of accounts you would like to manage: "); 
    int Accountmanage =read.nextInt();//read number of acount  user want  to manage
    System.out.println("--------------------------------------------------\n"); 
    
 
    
    int service,ID1,ID;
    int accountId=180000;//ID number 
    int accountNum=720000;//account number
    int Accounts=0,stop=0;//stop is to make the program stop after reaching the number of accounts the usre wanted to manage
    double deposit,withdraw; 
    String[] Aname=new String[Accountmanage];// 1D array to store Customer name
    int [][]Ainfo= new int [Accountmanage][2];//2D array to store Acount info which is Customer ID and Account number
    Double[] Abalance =new Double [Accountmanage];//1D array to store Customer balance
 
     for(int i=0;i<Accountmanage;i++) { //to make the program run again after each sevice
    for(int j=0;j<Accountmanage;j++){
    System.out.println("Select a service from the following list ");
    System.out.println("--------------------------------------------------\n");   
    System.out.println("1- Create new account\n2- Account Details\n3- Deposit\n4- Withdraw\n5- Display all details "); 
    System.out.println();  
    System.out.print("Your selection >>>");
    service=read.nextInt();//to read the number of service the user want to do 
     switch(service){
      
         case 1:
             
    System.out.println("********************Ctreate new account********************\n"); 
     if (Accounts<=Accountmanage){
    System.out.print("Customer name : "); 
    read.nextLine();
    Aname[Accounts]= read.nextLine() ;//to read and store the value in the array
    System.out.print("Balance : ");  
    Abalance [Accounts]= read.nextDouble();//to read and store the value in the array
  
   Ainfo [Accounts][0]=accountId;//to store the ID in the array
   Ainfo [Accounts][1]=accountNum;//to store the Acccount number in the array
    accountId++;//to increase the ID number after creating a new account
    accountNum++;
    Accounts++;
     stop++;//used to stop the program after reaching the number of services entered by the user
    }   
     else  { 
      System.out.println("Total account has reached maximum");    }        
    break;     
   
    
    case 2:      
    if (Accounts==0){//to check if the user have created an account before perform a service
    System.out.println("No account has been created yet"); }
    else  {
       System.out.print("please Enter the Account ID:  ");
   ID1= read.nextInt();// to read the customer ID
   boolean findAccount=true;
   for(int l=0;l<Accounts;l++){
   if(ID1==Ainfo[l][0]){//to check if the id number is correct
System.out.println("Name:  "+Aname[l]+"\t"+"Balance:  "+Abalance[l]+"\t" +"Account ID:  "+Ainfo[l][0]+"\t"+"Account Number:  "+Ainfo[l][1]); 
stop++;
break;}
   }
    if (!findAccount)
    System.out.println("ACCOUNT NOT FOUND!");}    
  stop++;
    break;

        case 3:      
   System.out.println("********************Money Deposit********************\n"); 
   if (Accounts==0){//to check if the user have created an account before perform a service
    System.out.println("No account has been created yet"); }
    else  {
   System.out.print("please Enter the Account ID:  ");
   ID= read.nextInt();// to read the customer ID
      for(int f=0;f<Accounts;f++){
      if(ID==Ainfo[f][0]){
    System.out.print("Enter the amount of money you would like to deposit:  ");
      deposit=read.nextDouble();
      if(deposit>0){
     Abalance [f]=Abalance [f]+ deposit ;}//to add the deposit amount to the customer balance
      else {
    System.out.println("Deposit can not be negative amount.");
      break;}}
      else 
      System.out.println("This is not correct ID!");}}
      stop++;
    break;
      
    
    
         case 4: 
   System.out.println("********************Money Withdraw********************\n"); 
    if (Accounts==0){//to check if the user have created an account before perform a service
    System.out.println("No account has been created yet"); }
    else  {       
   System.out.print("please Enter the Account ID:  ");
   ID= read.nextInt();// to read the customer ID
     for(int a=0;a<Accounts;a++){ 
      if(ID==Ainfo[a][0]){
    System.out.print("Enter the amount of money you would like to Withdraw:  ");
     withdraw=read.nextDouble();
      if(withdraw<=Abalance[a]){
     Abalance [a]=Abalance [a]- withdraw ;}//to subtract the withdraw amount from the customer balance
      else {
    System.out.println("Insufficient funds. Withdraw not made."); 
      break;}   }
      else
      System.out.println("This is not correct ID!");}}
      stop++;
    break;
    
    case 5:
    
    if (Accounts==0){//to check if the user have created an account before perform a service
    System.out.println("No account has been created yet"); }
    else  {
    for ( int k=0;k<Accounts;k++){//loop to print the arrays that have the customer information
         for (int h=0;h<Accounts;h++){     
         }
     System.out.println("Account holder: "+Aname[k]+"\t  " +"Account ID: "+Ainfo[k][0]+"\t"+"Account Number: "+Ainfo[k][1]+"\t"+"  Balance: "+Abalance[k]);   
  } }
   stop++;
    break;
   
        default:
    System.out.println("INCORRECT INPUT !!.please try again");        
     }

 while (stop<Accountmanage){ //to stop the program after reaching the number of accounts the user wanted to manage 
     
 System.out.println("\n--------------------------------------------------");  
 System.out.print("Do you want to do another service [y- yes | n- NO] : ");   
char YesNo=read.next().charAt(0);
System.out.println("\n--------------------------------------------------"); 


switch (YesNo){ //to keep asking the user if he want to perform another service
    
    case 'n':
     System.out.print("Exiting program"); 
      System.exit(0);
      break;
      
    case 'y' :
        break;
        
    default:
       
       System.out.print("INCORRECT INPUT !!"); 
  
        
}
   }
     }}
       System.out.println("****************************************************");
      System.out.print("you reached the end of the program");
      System.exit(0);
     
    }}

    
     

        
   

    
     
    

