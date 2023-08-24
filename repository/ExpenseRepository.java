package pro.sky.expenses.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pro.sky.expenses.entity.Expense;
import pro.sky.expenses.entity.ExpenseByCategory;

import java.util.List;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {
    @Query(value = "SELECT category, SUM(amount) as amount FROM expenses GROUP BY category", nativeQuery = true)
    List<ExpenseByCategory> getExpenseByCategory();
}
