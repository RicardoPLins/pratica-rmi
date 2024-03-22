package com.gugawag.rpc.banco;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;
import java.util.Map;

public class BancoServiceServer extends UnicastRemoteObject implements BancoServiceIF {

    private Map<String, Double> saldoContas;

    public BancoServiceServer() throws RemoteException {
        saldoContas = new HashMap<>();
        saldoContas.put("1", 100.0);
        saldoContas.put("2", 156.0);
        saldoContas.put("3", 950.0);
    }

    @Override
    public double saldo(String conta) throws RemoteException {
        return saldoContas.get(conta);
    }

    @Override
    public int quantidadeContas() throws RemoteException {
        return saldoContas.size();
    }
    // @Override
    // public void cadastrarConta(String conta, double saldoInicial) throws RemoteException {
    //     if (!saldoContas.containsKey(conta)) {
    //         saldoContas.put(conta, saldoInicial);
    //     } else {
    //         throw new RemoteException("Conta já cadastrada!");
    //     }
    // }

    // @Override
    // public boolean pesquisarConta(String conta) throws RemoteException {
    //     return saldoContas.containsKey(conta);
    // }

    // @Override
    // public void removerConta(String conta) throws RemoteException {
    //     if (saldoContas.containsKey(conta)) {
    //         saldoContas.remove(conta);
    //     } else {
    //         throw new RemoteException("Conta não encontrada para remoção!");
    //     }
    // }
}
