package com.ciandt.hackathon.dao;

import java.util.ArrayList;
import java.util.List;

import com.ciandt.hackathon.entity.Compra;
import com.ciandt.hackathon.entity.Mesa;
import com.ciandt.hackathon.entity.Produto;
import com.ciandt.hackathon.utils.MesasMocker;

public class MesaDAO {

	private static List<Mesa> mesas;

    public List<Mesa> getMesas() {

        checkExistemMesas();
		
		return mesas;
		
	}

    private void checkExistemMesas() {
        if (mesas == null || mesas.isEmpty()) {
            mesas = iniciarMesas();
        }
    }

    private List<Mesa> iniciarMesas() {
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

    public void addCompra(String mesa, Produto produto) {
        
        checkExistemMesas();
        
        for (Mesa mesaAtual : mesas) {
            if(mesaAtual.equals(mesa)) {
                Compra compraEfetuada = new Compra();
                compraEfetuada.getProdutos().add(produto);
                mesaAtual.adicionarCompraEfetuada(compraEfetuada);;
            }
            
        }
        
    }
	
}
