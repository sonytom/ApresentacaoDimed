package notapresetation.classultilitaria.date;

import java.time.LocalDate;
import java.time.Period;

public class PeriodTest01 {
    public static void main(String[] args) {

        LocalDate now = LocalDate.now();

        LocalDate nowAfterTwoYears = LocalDate.now().plusYears (2).plusDays (7);

        Period p1 = Period.between(now, nowAfterTwoYears);

        Period p2 = Period.ofDays (18);

        Period p3 = Period.ofWeeks (58);

        Period p4 = Period.ofMonths (3);

        System.out.println(p1);

        System.out.println(p2);

        System.out.println (p3);



    }


}
