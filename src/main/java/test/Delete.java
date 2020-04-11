package test;

public class Delete {
    public static void main(String[] args) {
        Double basic=30000.00+6000;
        Double hra=basic*0.5;
        Double lta=800.00;
        Double internet=1000.00;
        Double education =200.00;
        Double sa=36824.00+10000-1642.25;//6000+658;
        Double food=1100.00;
        Double epf=basic*.12;
        Double gratuity=basic*.0481;

        Double inhand=basic+hra+sa-(epf+gratuity);

        System.out.println("basic: "+basic);
        System.out.println("hra: "+hra);
        System.out.println("lta: "+lta);
        System.out.println("internet: "+internet);
        System.out.println("education: "+education);
        System.out.println("specail allowance: "+sa);
        System.out.println("food: "+food);
        System.out.println("epf: "+epf);
        System.out.println("gratuity: "+gratuity);


        Double fixed=(basic+hra+lta+internet+education+sa+food+epf+gratuity);
        System.out.println("Fixed Compensation:"+fixed);
        System.out.println("inhand:"+inhand);
        Double variable=100000.00;
        System.out.println("---------");
        System.out.println("CTC: "+(fixed*12+variable));

        System.out.println("---------Yearly------");
        System.out.println("basic: "+basic*12);
        System.out.println("hra: "+hra*12);
        System.out.println("lta: "+lta*12);
        System.out.println("internet: "+internet*12);
        System.out.println("education: "+education*12);
        System.out.println("specail allowance: "+sa*12);
        System.out.println("food: "+food*12);
        System.out.println("epf: "+epf*12);
        System.out.println("gratuity: "+gratuity*12);
        Double fixedpa=(basic*12+hra*12+lta*12+internet*12+education*12+sa*12+food*12+epf*12+gratuity*12);
        System.out.println("Fixed Compensation:"+fixedpa);



    }
}
