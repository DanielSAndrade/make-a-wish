package com.ciandt.hackathon.dao;

import java.util.ArrayList;
import java.util.List;

import com.ciandt.hackathon.entity.Mesa;
import com.ciandt.hackathon.utils.MesasMocker;

public class MesaDAO {

	public List<Mesa> getMesas() {

		MesasMocker mocker = new MesasMocker();
		
		Mesa mesa1 = mocker.mockMesa1();
		Mesa mesa2 = mocker.mockMesa2();
		Mesa mesa3 = mocker.mockMesa3();
		Mesa mesa4 = mocker.mockMesa4();
		Mesa mesa5 = mocker.mockMesa5();
		
		List<Mesa> mesas = new ArrayList<Mesa>();
		mesas.add(mesa1);
		mesas.add(mesa2);
		mesas.add(mesa3);
		mesas.add(mesa4);
		mesas.add(mesa5);
		
		return mesas;
		
	}

    public void addPontos(String mesa, long pontos) {
        // TODO Auto-generated method stub
        
    }
	
}
