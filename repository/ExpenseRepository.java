package pro.sky.expenses.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pro.sky.expenses.entity.Expense;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {

}
