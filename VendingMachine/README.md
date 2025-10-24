# Assignment 6 - Vending Machine

### Purpose
This program simulates a vending a machine by offering a customer snack options (Pop Tarts, Pretzels, and Funyuns). It
will then ask the customer how many snacks they would like (the max allowed per transaction is 3). The program will then
display a receipt for each snack selected before the program asks for another snack selection. The program also supports
shutdown mode for the machine. If the owner would like to shutdown the machine they will enter 999 instead of a snack 
selection amount and enter the correct shutdown password. Once shutdown mode it entered the program will print a report
on total sales, total count of snacks sold, and total count of each snack sold.

## Skills Demonstrated
- Looping and control (intermediate level)
- User input handeling and validation
- Data tracking and computation
- Sentinel and control variables
- Constatnts and maintainable code
- Output formatting and user experiance

##Example Output
```
*******************************************
              Snack Machine
*******************************************

Pop Tarts      Pop Tarts     Pop Tarts 
1A  $0.90      1B  $0.90     1C  $0.90
--------------------------------------------
Pretzels       Pretzels      Pretzels
2A  $0.70      2B  $0.70     2C  $0.70
--------------------------------------------
Funyuns   	Funyuns  	Funyuns
3A  $1.50      3B  $1.50     3C  $1.50
--------------------------------------------

How many snacks would you like? Limit is 3: 1
Enter snack selection: 1a
--------------------------------------
------------ Selection 1A ------------
--------------------------------------
       Snack Item:      Pop Tarts
       Snack Price: 	0.90
--------------------------------------
     Thank you for your business!
--------------------------------------

*******************************************
              Snack Machine
*******************************************

Pop Tarts      Pop Tarts     Pop Tarts 
1A  $0.90      1B  $0.90     1C  $0.90
--------------------------------------------
Pretzels       Pretzels      Pretzels
2A  $0.70      2B  $0.70     2C  $0.70
--------------------------------------------
Funyuns   	Funyuns  	Funyuns
3A  $1.50      3B  $1.50     3C  $1.50
--------------------------------------------

How many snacks would you like? Limit is 3: 999
Enter Password: cookies

Total Sales = $0.90
Total Number Snacks Sold = 1
1 Poptarts
0 Pretzels
0 Funyuns
```

### ⚙️ How to Run
```bash
javac AllenCorinneAssignment6.java
java AllenCorinneAssignment6
```

## 🧑‍💻 Author
**Corinne Allen**  
💼 [LinkedIn](https://www.linkedin.com/in/ceallen/)  
🐙 [GitHub](https://github.com/RinAllen18)
