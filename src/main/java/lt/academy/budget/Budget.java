package lt.academy.budget;

import java.util.ArrayList;
import java.util.List;

public class Budget {

    private List<IncomeRecord> income;
    private List<ExpenseRecord> expense;

    public Budget() {

        income = new ArrayList<>();
        expense = new ArrayList<>();
    }

    public void addIncomeRecord(IncomeRecord incomeRecord){
        income.add(incomeRecord);
    }
    public void addExpenseRecord(ExpenseRecord expenseRecord) {
        expense.add(expenseRecord);
    }
    public List<IncomeRecord> getIncome() {
        return income;
    }

    public List<ExpenseRecord> getExpense() {
        return expense;
    }

    public float getIncomes (){
       float amount = 0;
       for (IncomeRecord incomes : income)
       amount += incomes.getAmount();
       return amount;
    }
    public float getExpenses (){
        float amount = 0;
        for (ExpenseRecord expenses : expense)
            amount += expenses.getAmount();
        return amount;
    }


}
