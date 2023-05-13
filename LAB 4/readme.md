 Lab 4
## Question 
Write a JAVA Menu driven program that does the following:
 intilize as global variables
1)Account Number
2)Account Holder Name
3)Account Balance
You MUST have the below as functions
*)To initialize the customer
*)To deposit money
*)To withdraw money
*)To print the transactions
*)To print account summary
Your menu will have the following operations once the customer is created
//To deposit money
//To withdraw money
//To print the transactions
//To print account summary

## Solution
1. Declare global variables `accountNumber`, `accountHolderName`, and `accountBalance`.
2. Create a function `initializeCustomer()` to initialize the customer with the values of `accountNumber`, `accountHolderName`, and `accountBalance`.
3.Create a function `depositMoney()` to deposit money into the account. 
4. Create a function `withdrawMoney()` to withdraw money from the account. 5. Create a global variable `transactions` of type `ArrayList<String>` to keep track of all the transactions.
7. Create a function `printTransactions()` to print out the transaction history.
8. Create a function `printAccountSummary()` to print out the account summary.

## Flowchart
![image](https://github.com/nithin403/22122033-MDS273L-JAVA/assets/113897873/2e317d59-0381-4f03-993b-9f70dc7226c0)

## OUTPUT

Menu:
1. Initialize customer  
2. Deposit money        
3. Withdraw money       
4. Print transactions   
5. Print account summary
6. Exit
Enter your choice:
1
Enter account number: 
22122033
Enter account holder name: 
Nithin
Enter account balance: 
50000
Account initialized successfully!
Menu:
1. Initialize customer
2. Deposit money
3. Withdraw money
4. Print transactions
5. Print account summary
6. Exit
Enter your choice:
2
Enter amount to deposit: 
25000
Deposit successful!
Menu:
1. Initialize customer
2. Deposit money
3. Withdraw money
4. Print transactions
5. Print account summary
6. Exit
Enter your choice:
3
Enter amount to withdraw: 
5000
Withdrawal successful!
Menu:
1. Initialize customer
2. Deposit money
3. Withdraw money
4. Print transactions
5. Print account summary
6. Exit
Enter your choice:
4
Transaction history:
current account balance 50000.0
Deposit of 25000.0 New balance is 75000.0
Withdrawal of 5000.0 New balance is 70000.0
Menu:
1. Initialize customer
2. Deposit money
3. Withdraw money
4. Print transactions
5. Print account summary
6. Exit
Enter your choice:
5
Account summary:
Account number: 22122033
Account holder name: Nithin
Account balance: 70000.0
Menu:
1. Initialize customer
2. Deposit money
3. Withdraw money
4. Print transactions
5. Print account summary
6. Exit
Enter your choice:
6
Exiting program...
PS C:\Users\user\Desktop\nns> 




