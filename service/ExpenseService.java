package pro.sky.expenses.service;

import pro.sky.expenses.entity.Expense;

import java.util.List;

public interface ExpenseService {
    List<Expense> getAllExpenses();
    void createExpense(Expense expense);
    void deleteExpense(long id);
}
