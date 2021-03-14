package lt.academy.budget;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Budget budget = new Budget();

        String input = "";

        while (!input.equals("8")) {

            menu();

            input = scan.nextLine();
            switch (input) {


                case "1":
                    System.out.println("Enter amount");
                    float amount = scan.nextFloat();
                    System.out.println("Enter category");
                    scan.nextLine();
                    String category = scan.nextLine();
                    System.out.println("Income type is cash or bank account?");
                    String type = scan.nextLine();
                    System.out.println("Additional information");
                    String info = scan.nextLine();
                    budget.addIncomeRecord(new IncomeRecord(amount, category, type, info));
                    break;
                case "2":
                    System.out.println("Enter amount");
                    float amount1 = scan.nextFloat();
                    System.out.println("Enter category");
                    scan.nextLine();
                    String category1 = scan.nextLine();
                    System.out.println("Income type is cash or bank account?");
                    String type1 = scan.nextLine();
                    System.out.println("Additional information");
                    String info1 = scan.nextLine();
                    budget.addExpenseRecord(new ExpenseRecord(amount1, category1, type1, info1));
                    break;
                case "3":
                    System.out.println("Total incomes: " + budget.getIncomes());
                    break;
                case "4":
                    System.out.println("Total expenses: " + budget.getExpenses());
                    break;
                case "5":
                    System.out.println("Balance is: " + budget.getBalance());
                    break;
                case "6":
                    budget.getAllIncomes();
                    budget.getAllExpenses();
                    break;
                case "7":

                    while (!input.equals("3")) {

                        System.out.println("[1] - See and delete income record");
                        System.out.println("[2] - See and delete expense record");
                        System.out.println("[3] - Exit");

                        input = scan.nextLine();
                        switch (input) {


                            case "1":
                                budget.getAllIncomes();
                                System.out.println("Enter the record index you want to delete");
                                int a = scan.nextInt();
                                scan.nextLine();
                                budget.deleteIncomeRecord(a);
                                System.out.println("Record with index: " + a + " successfully deleted");
                                break;
                            case "2":
                                budget.getAllExpenses();
                                System.out.println("Enter the record index you want to delete");
                                int b = scan.nextInt();
                                scan.nextLine();
                                budget.deleteExpenseRecord(b);
                                System.out.println("Record with index: " + b + " successfully deleted");
                                break;
                            case "3":
                                break;
                            default:
                                System.out.println("Unknown input");

                        }
                    }

                    break;
                case "8":
                    break;
                default:
                    System.out.println("Unknown input");

            }
        }


    }

    private static void menu() {
        System.out.println("[1] - Add income");
        System.out.println("[2] - Add expense");
        System.out.println("[3] - Total incomes");
        System.out.println("[4] - Total expenses");
        System.out.println("[5] - Check balance");
        System.out.println("[6] - All incomes and expenses");
        System.out.println("[7] - Delete record");
        System.out.println("[8] - Exit");
    }
}
