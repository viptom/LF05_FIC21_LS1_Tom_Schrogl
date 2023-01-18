public class Tabelle {
    public static void main(String[] args) {
        String s = "------------------------";
        String f = "Fahrenheit";
        String c = "Celsius";
        int f0 = -20;
        int f1 = -10;
        int f2 = 0;
        int f3 = 20;
        int f4 = 30;
        double c0 = -28.8889;
        double c1 = -23.3333;
        double c2 = -17.7778;
        double c3 = -6.6667;
        double c4 = -1.1111;
        
        System.out.printf("" +
                "\n%-12s|%10s" +
                "\n%s" +
                "\n%-12d|%10.2f" +
                "\n%-12d|%10.2f" +
                "\n+%-11d|%10.2f" +
                "\n+%-11d|%10.2f" +
                "\n+%-11d|%10.2f" +
                "\n",f,c,s,f0,c0,f1,c1,f2,c2,f3,c3,f4,c4);
    }
}
