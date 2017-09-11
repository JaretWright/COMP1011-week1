package f17comp1011w1prep;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author jwright
 */
public class Interest {
    public static void main(String[] args)
    {
        //initial principal amount before interest
        BigDecimal principal = BigDecimal.valueOf(1200, 0);
        BigDecimal rate = BigDecimal.valueOf(0.1);
        
        //display header
        System.out.printf("Put away $100 per month the first year you work:%n");
        System.out.printf("%4s%20s%n","Year","Amount on deposit");
        
        //calculate interest for 10 years
        for (int year=0; year<=10; year++)
        {
            BigDecimal amount = principal.multiply(rate.add(BigDecimal.ONE).pow(year));
            
            System.out.printf("%4d%20s%n", year, NumberFormat.getCurrencyInstance(Locale.CANADA).format(amount));
        }
        
        
        System.out.printf("Put away $100 per month for 10 years:%n");
        System.out.printf("%4s%20s%n","Year","Amount on deposit");
        
        principal = BigDecimal.valueOf(1200, 0);
        
        //calculate interest for 10 years
        for (int year=0; year<=10; year++)
        {
            BigDecimal amount = principal.multiply(rate.add(BigDecimal.ONE).pow(year));
            
            System.out.printf("%4d%20s%n", year, NumberFormat.getCurrencyInstance(Locale.CANADA).format(amount));
        }
        System.out.printf("%n%nPut away $100 per month the first 10 years you work:%n");
        System.out.printf("%4s%20s%n","Year","Amount on deposit");
        
        BigDecimal yearlyIncrement = BigDecimal.valueOf(1200);
        
        //calculate interest for 10 years
        for (int year=0; year<=10; year++)
        {
            BigDecimal amount = principal.multiply(rate.add(BigDecimal.ONE).pow(year));
            
            System.out.printf("%4d%20s%n", year, NumberFormat.getCurrencyInstance(Locale.CANADA).format(amount));
            principal = principal.add(yearlyIncrement);
        }

    }
    
}
