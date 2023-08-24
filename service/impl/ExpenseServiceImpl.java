package pro.sky.expenses.service.impl;

import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import pro.sky.expenses.entity.Expense;
import pro.sky.expenses.entity.ExpenseByCategory;
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
    public List<Expense> getAllExpenses(Integer pageNumber, Integer pageSize) {

        PageRequest pageRequest = PageRequest.of(pageNumber - 1, pageSize);
        return expenseRepository.findAll(pageRequest).getContent();
    }

    @Override
    public void createExpense(Expense expense) {
        expenseRepository.save(expense);
    }

    @Override
    public void deleteExpense(long id) {
        expenseRepository.deleteById(id);
    }

    @Override
    public List<ExpenseByCategory> getExpensesByCategory() {
        return expenseRepository.getExpenseByCategory();
    }
}
