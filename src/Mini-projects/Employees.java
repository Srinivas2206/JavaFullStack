public class Employees {
    public static void main(String[] args) {
        String[][] emp = {
                { "Emp No", "Emp Name", "Join Date", "Designation Code", "Department", "Basic", "HRA", "IT", "DA" },
                { "1001", "Ashish", "01/04/2009", "e", "R&D", "20000", "8000", "3000", "20000" },
                { "1002", "Sushma", "23/08/2012", "c", "PM", "30000", "12000", "9000", "32000" },
                { "1003", "Rahul", "12/11/2008", "k", "Acct", "10000", "8000", "1000", "12000" },
                { "1004", "Chahat", "29/01/2013", "r", "Front Desk", "12000", "6000", "2000", "15000" },
                { "1005", "Ranjan", "16/07/2005", "m", "Engg", "50000", "20000", "20000", "40000" },
                { "1006", "Suman", "1/1/2000", "e", "Manufacturing", "23000", "9000", "4400", "20000" },
                { "1007", "Tanmay", "12/06/2006", "c", "PM", "29000", "12000", "10000", "32000" }
        };

        String[][] res = new String[2][5];
        res[0] = new String[] { "Emp No.", "Emp Name", "Department", "Designation", "Salary" };

        if (args.length == 0) {
            System.out.println("Please provide an employee ID as a command line argument.");
            return;
        }
        String empid = args[0];
        if (empid == null || empid.isEmpty()) {
            System.out.println("Please provide a valid employee ID.");
            return;
        }

        for (int i = 0; i < emp.length; i++) {
            if (emp[i][0].equals(empid)) {
                res[1][0] = empid;
                res[1][1] = emp[i][1];
                res[1][2] = emp[i][4];
                switch (emp[i][3]) {
                    case "e":
                        res[1][3] = "Engineer";
                        break;
                    case "c":
                        res[1][3] = "Consultant";
                        break;
                    case "k":
                        res[1][3] = "Clerk";
                        break;
                    case "r":
                        res[1][3] = "Receptionist";
                        break;
                    case "m":
                        res[1][3] = "Manager";
                        break;
                    default:
                        res[1][3] = "Unknown";
                }
                int basic = Integer.parseInt(emp[i][5]);
                int hra = Integer.parseInt(emp[i][6]);
                int da = Integer.parseInt(emp[i][8]);
                int it = Integer.parseInt(emp[i][7]);
                res[1][4] = String.valueOf(basic + hra + da - it);
                break;
            }
        }

        if (res[1][0] == null) {
            System.out.println("Employee not found");
            return;
        }

        for (String[] row : res) {
            for (String col : row) {
                System.out.print(col + "\t");
            }
            System.out.println();
        }

    }
}
