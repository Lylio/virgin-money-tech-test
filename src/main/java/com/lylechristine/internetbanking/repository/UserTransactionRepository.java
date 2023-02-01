package com.lylechristine.internetbanking.repository;

import com.lylechristine.internetbanking.model.UserTransactions;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface UserTransactionRepository extends CrudRepository<UserTransactions, Integer> {

    @Query(value = "select u from UserTransactions u where u.category=:category Order by u.transactionDate desc")
    List<UserTransactions> getAllUserTransactionsByCategory(@Param("category") String category);

    @Query("SELECT MAX(u.amount) as highestAmount, MIN(u.amount) as lowestAmount FROM UserTransactions u " +
            "where u.category=:category and u.transactionDate like CONCAT('%',:year,'%')")
    Map<String,Double> getAmountSpentByCategoryAndYear(@Param("category") String category,
                                                       @Param("year") String year);

    @Query("SELECT SUM(u.amount) FROM UserTransactions u where u.category=:category")
    double getTotalOutgoingPerCategory(@Param("category") String category);

    @Query("SELECT MONTH(u.transactionDate) as Month, AVG(u.amount) as averageAmount FROM UserTransactions u " +
            "where u.category=:category" +
            " group by transaction_date")
    List<Map<String,Double>> getMonthlyAverageSpendPerCategory(@Param("category") String category);


}
