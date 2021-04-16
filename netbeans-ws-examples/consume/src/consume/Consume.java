/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consume;
import java.rmi.RemoteException;
/**
 *
 * @author eduardo
 */
public class Consume {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws RemoteException{
        // TODO code application logic here
        String key = getKey();
        String result = mergeSort("12 23 45 34 11 5 6", key);
        System.out.println(result);
    }

    private static String getKey() {
        org.tempuri.Service service = new org.tempuri.Service();
        org.tempuri.IService port = service.getBasicHttpBindingIService();
        return port.getKey();
    }

    private static String mergeSort(java.lang.String input, java.lang.String userKey) {
        org.tempuri.Service service = new org.tempuri.Service();
        org.tempuri.IService port = service.getBasicHttpBindingIService();
        return port.mergeSort(input, userKey);
    }

    private static String selectionSort(java.lang.String input, java.lang.String userKey) {
        org.tempuri.Service service = new org.tempuri.Service();
        org.tempuri.IService port = service.getBasicHttpBindingIService();
        return port.selectionSort(input, userKey);
    }
    
}
