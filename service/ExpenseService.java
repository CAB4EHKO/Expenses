package pro.sky.expenses.service;

import pro.sky.expenses.entity.Expense;
import pro.sky.expenses.entity.ExpenseByCategory;

import java.util.List;

public interface ExpenseService {

    List<Expense> getAllExpenses(Integer pageNumber, Integer pageSize);

    void createExpense(Expense expense);
    void deleteExpense(long id);

    List<ExpenseByCategory> getExpensesByCategory();
}
