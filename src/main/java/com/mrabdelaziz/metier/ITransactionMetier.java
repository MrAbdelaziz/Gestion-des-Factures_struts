package com.mrabdelaziz.metier;

import java.util.List;

import com.mrabdelaziz.model.Transaction;

public interface ITransactionMetier {
	public void addTransaction(Transaction transaction );
	public List<Transaction> listTransactions();
	public Transaction getTransaction(int id);
	public void deleteTransaction(int id);
	public void updateTransaction(Transaction transaction);
}
