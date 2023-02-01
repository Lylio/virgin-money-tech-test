package com.lylechristine.internetbanking.service.ServiceImpl;

import com.lylechristine.internetbanking.model.UserTransactions;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Map;

public interface UserTransactionsServiceImpl {

    List<UserTransactions> getAllUserTransactionsByCategory(String category) throws Exception;

    Map<String, Double> getAmountSpentByCategoryAndYear(@Param("category") String category,
                                                                      @Param("year") String year) throws Exception;

    double getTotalOutgoingPerCategory(String category) throws Exception;

    List<Map<String, Double>> getMonthlyAverageSpendPerCategory(String category) throws Exception;

}
