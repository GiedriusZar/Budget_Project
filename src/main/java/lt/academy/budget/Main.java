package lt.academy.budget;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Budget budget = new Budget();

        String input = "";

        while (!input.equals("5")) {

            System.out.println("[1] - Add income");
            System.out.println("[2] - Add expense");
            System.out.println("[3] - Total incomes");
            System.out.println("[4] - Total expenses");
            System.out.println("[5] - Exit");

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
                    //exit
                    break;
                default:
                    System.out.println("Unknown input");

            }
        }


    }
}
