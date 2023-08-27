package interviewTest.test;

public class PackCal {
    public static void main(String[] args) {
        Double basic=396000.00;

//        Double basic=396000.00+60000.00;

        Double hra=basic*.4;
//        Double convenience=19200.00+10000   ;
        Double convenience=19200.00   ;
        Double specialAllowance=309832.40;
//        Double specialAllowance=309832.40+50000;
        Double epf=basic*.12;
        Double gratuity=basic*.0481;
        Double total=basic+hra+convenience+specialAllowance+epf+gratuity;
        Double grossSalary=basic+hra+convenience+specialAllowance;

        Double ctc=total+100000;

        System.out.println("basic:\t"+basic);
        System.out.println("monthly basic:\t"+basic/12);
        System.out.println("hra:\t"+hra);
        System.out.println("monthly hra:\t"+hra/12);
        System.out.println("convenience:\t"+convenience);
        System.out.println("monthly convenience:\t"+convenience/12);
        System.out.println("specialAllowance:\t"+specialAllowance);
        System.out.println("monthly specialAllowance:\t"+specialAllowance/12);
        System.out.println("---------------------");
        System.out.println("gross salary:\t"+grossSalary);
        System.out.println("monthly gross salary:\t"+grossSalary/12);
        System.out.println("---------------------");
        System.out.println("epf:\t"+epf);
        System.out.println("monthly epf:\t"+epf/12);
        System.out.println("gratuity:\t"+gratuity);
        System.out.println("monthly gratuity:\t"+gratuity/12);
        System.out.println("---------------------");
        System.out.println("Contribution:\t"+(epf+gratuity));
        System.out.println("monthly Contribution:\t"+(epf+gratuity)/12);
        System.out.println("---------------------");

        System.out.println("total:\t"+total);
        System.out.println("CTC:\t"+ctc);

    }
}
