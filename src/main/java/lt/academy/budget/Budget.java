package lt.academy.budget;

import java.util.ArrayList;
import java.util.List;

public class Budget {
    public static int recordCounter = 1;

    private List<IncomeRecord> income;
    private List<ExpenseRecord> expense;

    public Budget() {

        income = new ArrayList<>();
        expense = new ArrayList<>();
    }

    public void addIncomeRecord(IncomeRecord incomeRecord) {
        income.add(incomeRecord);
        recordCounter++;
    }

    public void addExpenseRecord(ExpenseRecord expenseRecord) {
        expense.add(expenseRecord);
        recordCounter++;

    }

    public List<IncomeRecord> getIncome() {
        return income;
    }

    public List<ExpenseRecord> getExpense() {
        return expense;
    }

    public float getIncomes() {
        float amount = 0;
        for (IncomeRecord incomes : income)
            amount += incomes.getAmount();
        return amount;
    }

    public float getExpenses() {
        float amount = 0;
        for (ExpenseRecord expenses : expense)
            amount += expenses.getAmount();
        return amount;
    }

    public float getBalance() {
        float expensesAmount = 0;
        for (ExpenseRecord expenses : expense) {
            expensesAmount += expenses.getAmount();
        }
        float incomesAmount = 0;
        for (IncomeRecord incomes : income) {
            incomesAmount += incomes.getAmount();
        }
        return incomesAmount - expensesAmount;
    }

    public void getAllIncomes() {
        for (IncomeRecord incomes : income) {
            System.out.println(incomes);
        }
    }

    public void getAllExpenses() {
        for (ExpenseRecord expenses : expense) {
            System.out.println(expenses);
        }


    }
}