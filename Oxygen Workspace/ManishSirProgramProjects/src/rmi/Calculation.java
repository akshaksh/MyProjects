package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Calculation extends Remote{
public int add(int a,int b)throws RemoteException;
public int sub(int a,int b)throws RemoteException;
public int mul(int a,int b)throws RemoteException;
public int divide(int a,int b)throws RemoteException;
}
