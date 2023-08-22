package pro.sky.expenses.service.impl;

import org.springframework.stereotype.Service;
import pro.sky.expenses.entity.Expense;
import pro.sky.expenses.repository.ExpenseRepository;
import pro.sky.expenses.service.ExpenseService;

import java.util.List;

@Service
public class ExpenseServiceImpl implements ExpenseService {

    private final ExpenseRepository expenseRepository;

    public ExpenseServiceImpl(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }

    @Override
    public List<Expense> getAllExpenses() {
        return expenseRepository.findAll();
    }

    @Override
    public void createExpense(Expense expense) {
        expenseRepository.save(expense);
    }

    @Override
    public void deleteExpense(long id) {
        expenseRepository.deleteById(id);
    }
}
