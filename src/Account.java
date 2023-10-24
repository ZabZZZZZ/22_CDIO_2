class Account{
    int Balance;
    private Account(int balance){
        this.Balance = balance;
    }
    int GetBalance(){
        return this.Balance;
    }
}