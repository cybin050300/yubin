package com.cyb;

import java.util.ArrayList;
import java.util.Comparator;

import com.cyb.db.DataBaseClass;

public class MethodClass {

    private ArrayList<String> items = new ArrayList<String>();
    private static ArrayList<String> no = new ArrayList<String>();
    private static ArrayList<ItemCountClass> item_count_list = new ArrayList<ItemCountClass>();

    public MethodClass() {
        // 기본 생성자
    }

    public void item() {
    	 DataBaseClass.connMySQL();
        for (int n = 0; n < DataBaseClass.cafe.size(); n++) {
            items.add(DataBaseClass.cafe.get(n).getItem());
        } 
    }

    public void duplicate() {
        String tempString = ""; 

        items.sort(Comparator.naturalOrder());	

        for (int n = 0; n < items.size(); n++) {
            if (!tempString.equals(items.get(n))) {
                tempString = items.get(n);
                no.add(tempString);
            }
        }
    }

    public static void item_count_list() {
        for (String item : no) {
            item_count_list.add(new ItemCountClass(item));
        }
    }

    public void counting() {
        for(ItemCountClass itemObj : item_count_list){
            for(int idx = 0; idx<DataBaseClass.cafe.size();idx++) {
                if(itemObj.item.equals(DataBaseClass.cafe.get(idx).getItem())) {
                    itemObj.count ++; 
                }
            }
        }
    }

    public ItemCountClass maxItem() {
        item();
        duplicate();
        item_count_list();
        counting();
        
        ItemCountClass tempObj = new ItemCountClass(); 
        
        for(ItemCountClass item : item_count_list) {
            if(tempObj.count < item.count) {
                tempObj.count = item.count;
                tempObj.item = item.item;
            }
        }
        
        return tempObj;
    }

    public static String[] getNo() {
        return no.toArray(new String[0]);
    }
}
