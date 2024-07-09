import java.util.Scanner;
class root {

    Scanner sc = new Scanner(System.in);

    double AccountCharges(double n) {
        double x = n;

        x = (0.10) * x;

        if (x < 50) {
            return x;
        } else {
            x = 50;
		
		
            return x;
        }
    }
    double Interest(double n) {

        double x = n * (0.07);
        
	    
	    
	    return x;
    }

}

class Regular_Account extends root {

    @Override
    double Interest(double n) {
        return 0;
    }

    double Penalty(double n) {

        if (n < 500) {
            return 100;
        } else {
            return 0;
        }

    }

}

class Interest_Account extends root {

    double Penalty(double n) {
        return 0;
    }
}

class Checking_Account extends root {

    double Penalty(double n) {

        if (n < 1000) {
            return 50;
        } else {
            return 0;
        }
    }

    void Charge_Transaction() {
        double x;

        System.out.println("Enter amount of money: ");
        x = sc.nextInt();

        x = x * (0.10);

        System.out.print("Amount for Sucessful Transaction : ");
        System.out.print(x);
    }

}

class CD_Account extends root {

    @Override
    double Interest(double n) {
        double x = n * (0.15);
        return x;
    }

    double Penalty(double n) {
        System.out.println("Penalty due to withdrawal before 12 months.");
        double x = n * (0.2);
        return x;
    }

}

public class bank_management {

    static Scanner sc = new Scanner(System.in);
    static float pin, balance;
    static int id = 0;
    static float cur[][] = new float[100][3];

    public static void Create_Account(int x) {

        System.out.println("Your PIN is : " + Integer.toString(id));
        System.out.println("Entre your Balance : ");

        balance = sc.nextFloat();

        cur[id][0] = id;
        cur[id][1] = balance;
        cur[id][2] = x;
        id++;
    }

    public static boolean Check_Account(int pin, int x) {

        for (int i = 0; i < id; i++) {
            if (cur[i][0] == pin && cur[i][2] == x) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
			System.out.println();

			while (true) {

			    System.out.println("1.open new Account.");
			    System.out.println("2. Existing Account.");
			    System.out.println("3. Exit");

			    int choice = sc.nextInt();
			    if (choice == 3) {
			        break;
			    }

			    System.out.println("Enter type of Account : ");

			    System.out.println("[1].Regular account");
			    System.out.println("[2].Interest account");
			    System.out.println("[3].Checking Accont");
			    System.out.println("[4].CD account");

			    int x = sc.nextInt();

			    if (choice == 1) {

			        Create_Account(x);

			    } else {

			        int pin;
			        System.out.println("Entre your PIN : ");
			        pin = sc.nextInt();

			        if (Check_Account(pin, x)) {
			            System.out.println("*|***************************************|*");
			            System.out.println("*|*Welcome to Our Bank Management System*|*");
			            System.out.println("*|***************************************|*");

			            while (true) {

			                double ans;
			                double BALANCE = cur[pin][1];

			                if (x == 1) {
			                    Regular_Account current = new Regular_Account();

			                    while (true) {
			                        System.out.println("1. Account Charges");
			                        System.out.println("2. Interest Charges");
			                        System.out.println("3. Penalty");
			                        System.out.println("4. Exit");

			                        int y = sc.nextInt();

			                        if (y == 4) {
			                            break;
			                        } else if (y == 3) {
			                            ans = current.Penalty(BALANCE);
			                            System.out.println(ans);
			                        } else if (y == 2) {
			                            ans = current.Interest(BALANCE);
			                            System.out.println(ans);
			                        } else {
			                            ans = current.AccountCharges(BALANCE);
			                        }

			                    }
			                } else if (x == 2) {

			                    Interest_Account current = new Interest_Account();
			                    while (true) {
			                        System.out.println("1. Account Charges");
			                        System.out.println("2. Interest Charges");
			                        System.out.println("3. Penalty");
			                        System.out.println("4. Exit");

			                        int y = sc.nextInt();

			                        if (y == 4) {
			                            break;
			                        } else if (y == 3) {
			                            ans = current.Penalty(BALANCE);
			                            System.out.println(ans);
			                        } else if (y == 2) {
			                            ans = current.Interest(BALANCE);
			                            System.out.println(ans);
			                        } else {
			                            ans = current.AccountCharges(BALANCE);
			                        }

			                    }
			                } else if (x == 3) {
			                    Checking_Account current = new Checking_Account();
			                    while (true) {
			                        System.out.println("1. Account Charges");
			                        System.out.println("2. Interest Charges");
			                        System.out.println("3. Penalty");
			                        System.out.println("4. Exit");

			                        int y = sc.nextInt();

			                        if (y == 4) {
			                            break;
			                        } else if (y == 3) {
			                            ans = current.Penalty(BALANCE);
			                            System.out.println(ans);
			                        } else if (y == 2) {
			                            ans = current.Interest(BALANCE);
			                            System.out.println(ans);
			                        } else {
			                            ans = current.AccountCharges(BALANCE);
			                        }

			                    }
			                } else {
			                    CD_Account current = new CD_Account();

			                    while (true) {
			                        System.out.println("1. Account Charges");
			                        System.out.println("2. Interest Charges");
			                        System.out.println("3. Penalty");
			                        System.out.println("4. Exit");

			                        int choice1 = sc.nextInt();

			                        if (choice1 == 4) {
			                            break;
			                        } else if (choice1 == 3) {
			                            ans = current.Penalty(BALANCE);
			                            System.out.println(ans);
			                        } else if (choice1 == 2) {
			                            ans = current.Interest(BALANCE);
			                            System.out.println(ans);
			                        } else {
			                            ans = current.AccountCharges(BALANCE);
			                        }

			                    }
			                }
			            }
			        }
			        else {
			            System.out.println("Check your PIN and TYPE of Account and Enter again");
			        }

			    }

			}
    }
}