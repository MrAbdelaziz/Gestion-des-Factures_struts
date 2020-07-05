package com.mrabdelaziz.metier;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mrabdelaziz.dao.ICcDAO;
import com.mrabdelaziz.model.Cartecredit;
@Transactional
@Service
public class CcMetierImpl implements ICcMetier {
	private ICcDAO ccdao;
	
	public void setDao(ICcDAO ccdao) {
		this.ccdao = ccdao;
	}

	@Override
	public void addCc(Cartecredit cartecredit) {
		ccdao.addCc(cartecredit);
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Cartecredit> listCc() {
		// TODO Auto-generated method stub
		return ccdao.listCc();
	}

	@Override
	public Cartecredit getCc(String id) {
		// TODO Auto-generated method stub
		return ccdao.getCc(id);
	}

	@Override
	public void deleteCc(String id) {
		// TODO Auto-generated method stub
		ccdao.deleteCc(id);
	}

	@Override
	public void updateCc(Cartecredit cartecredit) {
		// TODO Auto-generated method stub
		ccdao.updateCc(cartecredit);
	}


	
	
}
