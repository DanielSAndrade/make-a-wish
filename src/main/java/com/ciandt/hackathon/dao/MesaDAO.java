package com.ciandt.hackathon.dao;

import java.util.ArrayList;
import java.util.List;

import com.ciandt.hackathon.entity.Compra;
import com.ciandt.hackathon.entity.Mesa;
import com.ciandt.hackathon.entity.Pessoa;
import com.ciandt.hackathon.entity.Produto;
import com.ciandt.hackathon.utils.Mocker;

public class MesaDAO {

	public List<Mesa> getMesas() {

		Mocker mocker = new Mocker();
		
		Mesa mesa1 = mocker.mockMesa1();
		Mesa mesa2 = mocker.mockMesa2();
		Mesa mesa3 = mocker.mockMesa3();
		Mesa mesa4 = mocker.mockMesa4();
		Mesa mesa5 = mocker.mockMesa5();
		Mesa mesa6 = mocker.mockMesa6();
		Mesa mesa7 = mocker.mockMesa7();
		Mesa mesa8 = mocker.mockMesa8();
		Mesa mesa9 = mocker.mockMesa9();
		Mesa mesa10 = mocker.mockMesa10();
		
		List<Mesa> mesas = new ArrayList<Mesa>();
		mesas.add(mesa1);
		mesas.add(mesa2);
		mesas.add(mesa3);
		mesas.add(mesa4);
		mesas.add(mesa5);
		mesas.add(mesa6);
		mesas.add(mesa7);
		mesas.add(mesa8);
		mesas.add(mesa9);
		mesas.add(mesa10);
		
		return mesas;
		
	}
	
}
