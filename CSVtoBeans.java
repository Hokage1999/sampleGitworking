import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.opencsv.CSVReader;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.HeaderColumnNameTranslateMappingStrategy;
import com.webapps.Cred;

public class CSVtoBeans {
    public static void main(String[] args)
    {
  
        // Hashmap to map CSV data to 
        // Bean attributes.
        Map<String, String> mapping = new 
                      HashMap<String, String>();
        mapping.put("uname", "uame");
        mapping.put("pass", "pass");
        mapping.put("mobileNo", "mobileNo");
        mapping.put("courses", "courses");
  
        // HeaderColumnNameTranslateMappingStrategy
        // for Student class
        HeaderColumnNameTranslateMappingStrategy<Cred> strategy =
             new HeaderColumnNameTranslateMappingStrategy<Cred>();
        strategy.setType(Cred.class);
        strategy.setColumnMapping(mapping);
  
        // Create castobaen and csvreader object
        CSVReader csvReader = null;
        try {
            csvReader = new CSVReader(new FileReader
            ("/home/sysadmin/Documents/Demo.csv"));
        }
        catch (FileNotFoundException e) {
  
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        CsvToBean csvToBean = new CsvToBean();
  
        // call the parse method of CsvToBean
        // pass strategy, csvReader to parse method
        List<Cred> list = csvToBean.parse(strategy, csvReader);
  
        // print details of Bean object
        for (Cred e : list) {
            System.out.println(e);
        }
    }
}