package Q1;
import java.io.*;
import java.util.*;
import java.text.*;

class SalesRecord {
    public String[] fields;
    public SalesRecord(String[] data) {fields = data;}

    public double getProfit() { return Double.parseDouble(fields[13]); }
    public double getUnitsSold() { return Double.parseDouble(fields[8]); }

}
public class Prog1050a {
    public static List<SalesRecord> loadData(String filepath) {
        var records = new ArrayList<SalesRecord>();
        try {
            var file = new Scanner(new File(filepath));
            file.nextLine();
            while (file.hasNextLine()) {
                String line = file.nextLine();
                String[] data = line.split(",");
                records.add(new SalesRecord(data));
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

        return records;
    }
    public static void main(String[] args) {
        var records = loadData("Langdat/Lang1050.csv");
        if (records != null) {
            var moneyForm = new DecimalFormat("$#,###.00");
            System.out.println("Sales to Europe: " + computeCount(records, 0, "Europe"));
            System.out.println("Cereal bought by Cambodia: " + computeUnitsSold(records, 1, "Cambodia", 2, "Cereal"));
            System.out.println("Total profit on meat: " + moneyForm.format(computeSum(records, 2, "Meat", 13)));
            System.out.println("High priority sales percentage: " + computePercentage(records, 4, "H") + "%");
            System.out.println("Profits lost on fruit in 2012: " + moneyForm.format(computeProfitLost(records, "Fruits")));
        }
    }
    public static int computeCount(List<SalesRecord> records, int fInd, String val) {
        int c = 0;
        for (var record : records) {
            if (record.fields[fInd].equalsIgnoreCase(val)) c++;
        }
        return c;
    }
    public static int computeCount(List<SalesRecord> records, int fInd1, String val1, int fInd2, String val2) {
        int c = 0;
        for (var record : records) {
            if (record.fields[fInd1].equalsIgnoreCase(val1) && record.fields[fInd2].equalsIgnoreCase(val2)) c++;
        }
        return c;
    }
    public static double computePercentage(List<SalesRecord> records, int fInd, String val) {
        return ((double)computeCount(records, fInd, val) / records.size()) * 100;
    }
    public static int computeUnitsSold(List<SalesRecord> records, int fInd1, String val1, int fInd2, String val2) {
        int tot = 0;
        for (var record : records) {
            if (record.fields[fInd1].equalsIgnoreCase(val1) && record.fields[fInd2].equalsIgnoreCase(val2))
                tot += (int)record.getUnitsSold();
        }
        return tot;
    }
    public static double computeSum(List<SalesRecord> records, int fInd, String val, int sumfInd) {
        double sum = 0;
        for (var rec : records) {
            if (rec.fields[fInd].equalsIgnoreCase(val))
                sum += Double.parseDouble(rec.fields[sumfInd]);
        }
        return sum;
    }
    public static double computeProfitLost(List<SalesRecord> records, String type) {
        double lost = 0;
        for (var rec : records) {
            if (rec.fields[2].equalsIgnoreCase(type) && rec.fields[5].endsWith("2012")) {
                lost += Double.parseDouble(rec.fields[13]);
            }
        }
        return lost;
    }
}
