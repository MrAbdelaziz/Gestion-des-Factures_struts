package com.mrabdelaziz.metier;

import java.util.List;

import com.mrabdelaziz.model.Cartecredit;

public interface ICcMetier {
	public void addCc(Cartecredit cartecredit);
	public List<Cartecredit> listCc();
	public Cartecredit getCc(String id);
	public void deleteCc(String id);
	public void updateCc(Cartecredit cartecredit);
}
