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
            System.out.println("High priority sales shipped late: " + computePriorityLate(records));
            System.out.println("Highest profit on personal care: " + computeHighestProfit(records, 2, "Personal Care"));
            System.out.println("Top region for snacks: " + computeMaxbyField(records, 2, "Snacks", 0));

            int aSales = 0;
            for (var rec : records) {
                if (rec.fields[0].equalsIgnoreCase("Sub-Saharan Africa")) aSales++;
            }
            System.out.println("Total number of records of sales to Africa: " + aSales);


            // calc profit lost from trade war
            double prof1 = 0.0;
            for (var rec : records) {
                prof1 += Double.parseDouble(rec.fields[13]);
            }
            // delete sales to kuwait
            for (int i = 0; i < records.size(); i++) {
                if (records.get(i).fields[1].equalsIgnoreCase("Kuwait")) {
                    records.remove(i);
                    i--;
                }
            }

            // limit cosmetic sales to uganda to 100
            int uc = 0;
            for (int i = 0; i < records.size(); i++) {
                var rec = records.get(i);
                if (rec.fields[1].equalsIgnoreCase("Uganda") && rec.fields[2].equalsIgnoreCase("Cosmetics")) {
                    if (uc > 100) {
                        records.remove(i);
                        i--;
                    } else {
                        uc++;
                    }
                }
            }

            // delete low priority office supplies from african countries
            for (int i = 0; i < records.size(); i++) {
                var rec = records.get(i);
                if (rec.fields[0].equalsIgnoreCase("Sub-Saharan Africa") &&
                        rec.fields[2].equalsIgnoreCase("Office Supplies") &&
                        rec.fields[5].equalsIgnoreCase("L")) {
                    records.remove(i);
                    i--;
                }
            }
            double prof2 = 0.0;
            for (var rec : records) {
                prof2 += Double.parseDouble(rec.fields[13]);
            }
            System.out.printf("Profits lost by trade war: $%.2f", (prof1-prof2));
            System.out.println();
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
    public static int computePriorityLate(List<SalesRecord> records) {
        int c = 0;
        var dateForm = new SimpleDateFormat("M/d/yyyy");
        for (var rec : records) {
            if (rec.fields[4].equalsIgnoreCase("H")) {
                try {
                    Date order = dateForm.parse(rec.fields[5]);
                    Date ship = dateForm.parse(rec.fields[7]);

                    long diffMs = Math.abs(ship.getTime() - order.getTime());
                    long diffDays = diffMs / (100 * 60 * 60 * 24);
                    if (diffDays > 3) c++;
                } catch (ParseException e) { e.printStackTrace(); }
            }
        }
        return c;
    }
    public static String computeHighestProfit(List<SalesRecord> records, int fInd, String val) {
        String country = "N/A";
        double highest = 0;

        for (var rec : records) {
            if (rec.fields[fInd].equalsIgnoreCase(val)) {
                double prof = Double.parseDouble(rec.fields[13]);
                if (prof > highest) { highest = prof; }
                country = rec.fields[1];
            }
        }

        return country;
    }
    public static String computeMaxbyField(List<SalesRecord> records, int fInd, String val, int resInd) {
        String topReg = "N/A";
        int max = 0;
        var regions = new ArrayList<String>();

        for (var rec : records) {
            if (rec.fields[fInd].equalsIgnoreCase(val)) {
                String reg = rec.fields[resInd];
                if (!regions.contains(reg)) regions.add(reg);
            }
        }
        for (var reg : regions) {
            int c = 0;
            for (var rec : records) {
                if (rec.fields[fInd].equalsIgnoreCase(val) && rec.fields[resInd].equalsIgnoreCase(reg)) c++;
            }
            if (c > max) {
                max = c;
                topReg = reg;
            }
        }
        return topReg;
    }

}
