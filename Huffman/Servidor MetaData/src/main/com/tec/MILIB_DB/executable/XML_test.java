package main.com.tec.MILIB_DB.executable;

import main.com.tec.MILIB_DB.domain.Metadata;

import java.util.ArrayList;

public class XML_test {

    public static void main(String[] args) {

        Metadata metadata = new Metadata();
        metadata.Start();

        ArrayList<String> slotList = new ArrayList<>();
        slotList.add("name");
        slotList.add("author");
        slotList.add("date");
        slotList.add("size");
        slotList.add("description");

        ArrayList<String> valuesList = new ArrayList<>();
        valuesList.add("imagenChuza");
        valuesList.add("Joshua");
        valuesList.add("2019");
        valuesList.add("1000");
        valuesList.add("game");

        metadata.Insert(slotList,valuesList);

        metadata.Close();


    }



}
