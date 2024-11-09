public class Main {
    public static void main(String[] args) {

       BankAccount account=new BankAccount("98856625795",2500);

        System.out.println("Initial Account Balance: "+ (" Account Number: "+ account.getAccountNumber()+" Balance: " +account.getBalance()));

       Thread t1=new DepositThread(account,850);
       Thread t2= new WithdrawThread(account,200);
       Thread t3= new DepositThread(account,6000);
       Thread t4= new WithdrawThread(account,800);
       Thread t5= new WithdrawThread(account,1000);


        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

       try {
           t1.join();
           t2.join();
           t3.join();
           t4.join();
           t5.join();
       } catch (InterruptedException e) {
           e.printStackTrace();
       }


        System.out.println("Final Account Balance: "+(" Account Number: "+ account.getAccountNumber()+" Balance: " +account.getBalance()));


    }


}
