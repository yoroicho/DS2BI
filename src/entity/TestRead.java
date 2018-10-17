/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import com.opencsv.CSVReader;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

/**
 *
 * @author kyokuto
 */
public class TestRead {

    public static void test(File file) throws IOException {
        /*   
        
        CsvToBean<ItemEntity> csvToBean = new CsvToBeanBuilder<ItemEntity>(Files.newBufferedReader(Paths.get(file.getPath()))).withType(ItemEntity.class).build();
 
        List<ItemEntity> items = csvToBean.parse();
System.out.println(items.get(5).toString());
         */

        FileReader fileReader = null;
        CSVReader csvReader = null;
        fileReader = new FileReader((file.getPath()));
        System.out.println(file.getPath());
        csvReader = new CSVReader(fileReader);
        csvReader.skip(3);
        String[] nextLine;
        List<ItemEntity> list = new ArrayList<>();
        csvReader.forEach(s -> list.add(ItemDAO.createitem(s)));
        System.out.println(list.size());

        Stream<ItemEntity> s = list.stream().filter(o -> o.getSlipNumber().trim().equals("31801300022"));
        //System.out.println(s.count());
        //System.out.println(s.max(Comparator.comparingInt(ItemEntity::getItemSeq)));
        //System.out.println(s.filter(x->x.getBorrowingClassification()==1).count());
       Iterator <ItemEntity>iterator = s.iterator();
       while(iterator.hasNext()){
           ItemEntity itemEntity = iterator.next();
           System.out.println(itemEntity.getItemSeq()+"-"+itemEntity.getBorrowingClassification());
       }
        //s.forEachOrdered(x -> System.out.println(x.getItemSeq()+" "+x.getBorrowingClassification()));
        /*
        for (int i = 1; i < 1+s.count(); i++) {
            Stream<ItemEntity> filter = s.filter(u -> u.getItemSeq()==1);
        }
        */
        //s.max(Comparator.)
        //while (s.anyMatch(p -> p.))
        /*
        while ((ItemDAO.createitem(csvReader.readNext()) != null)) {
            for (int i = 0; i < nextLine.length; i++) {
                System.out.print(nextLine[i] + "|");
            }
            System.out.println();
        }
         */ {
            
        }
    }
    // Iterator<String[]> recordIterator = csvReader.iterator(); 
    // while (recordIterator.hasNext()) { String[] record = recordIterator.next(); 
    // System.out.println(record[0] + "," + record[1]);} 

}
