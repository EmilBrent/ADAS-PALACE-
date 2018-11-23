package info.rayrojas.bichito.frutapp.models;

import java.util.ArrayList;

public class PurchaseOrder {
    public static ArrayList<PurchaseOrder> orders =new ArrayList<>();
    public static PurchaseOrder getNewInstance(){
    if (orders.size()>0){
        return orders.get(0);
    }
    PurchaseOrder o=new  PurchaseOrder();
    orders.add(o);
    return o;
    }
}
