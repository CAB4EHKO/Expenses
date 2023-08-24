package pro.sky.expenses.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.expenses.entity.ExpenseByCategory;
import pro.sky.expenses.service.ExpenseService;

import java.util.List;

@RestController
public class ExpensesByCategoryController {

    private final ExpenseService expenseService;

    public ExpensesByCategoryController(ExpenseService expenseService) {
        this.expenseService = expenseService;
    }

    @GetMapping("/expenses-by-category")
    public List<ExpenseByCategory> getExpensesByCategory() {
        return expenseService.getExpensesByCategory();
    }
}
