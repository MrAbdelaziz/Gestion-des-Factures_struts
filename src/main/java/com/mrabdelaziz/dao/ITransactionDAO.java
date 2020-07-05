package com.mrabdelaziz.dao;

import java.util.List;

import com.mrabdelaziz.model.Transaction;

public interface ITransactionDAO {
	public void addTransaction(Transaction transaction );
	public List<Transaction> listTransactions();
	public Transaction getTransaction(int id);
	public void deleteTransaction(int id);
	public void updateTransaction(Transaction transaction);
}
