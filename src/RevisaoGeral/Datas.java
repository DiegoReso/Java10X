package RevisaoGeral;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;


public class Datas {
    public static void main(String[] args) throws ParseException {
        //Calendar
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

        System.out.println(sdf.format(d));

        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        cal.add(Calendar.HOUR_OF_DAY, 4);
        d = cal.getTime();

        int minutes = cal.get(Calendar.MINUTE);
        System.out.println(minutes);
        System.out.println(sdf.format(d));

        //trabalhando com datas
        Date data = new Date();
        System.out.println(data);

        Date data1 = new Date(System.currentTimeMillis());
        System.out.println(data1);

        Date data2 = new Date(0L);
        System.out.println(data2);

        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date y1 = sdf1.parse("25/06/2018");
        System.out.println("Y1 -> " + y1);
        System.out.println(sdf2.format(y1));



        Date y2 =sdf2.parse("25/06/2018 10:22:40");
        System.out.println("Y2 -> " + y2);
        System.out.println(sdf2.format(y2));

        System.out.println("=================");
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();

        LocalDate d04 = LocalDate.parse("2025-04-25");
        LocalDateTime d05 = LocalDateTime.parse("2025-04-20T01:30:45");
        Instant d06 = Instant.parse("2025-04-20T01:30:45Z");
        Instant d07 = Instant.parse("2025-04-20T01:30:45-03:00");

        LocalDate d08 = LocalDate.parse("20/07/2025", fmt1);
        LocalDateTime d09 = LocalDateTime.parse("20/07/2025 01:30", fmt2);

        LocalDate d10 = LocalDate.of(2025,4,22);
        LocalDateTime d11 = LocalDateTime.of(2022, 7,20,1,30);

        System.out.println("Data agora! " + d01);
        System.out.println("Data agora com hora minutos segundo e fracao de segundos! " +d02);
        System.out.println("Data agora GMT ou Zulu UTC! " + d03);
        System.out.println("Texto iso 8601 e gerar  data " + d04);
        System.out.println("Texto iso 8601 e gerar  data hora  " + d05);
        System.out.println("Texto iso 8601 e gerar  data hora GMT  " + d06);
        System.out.println("Texto iso 8601 e gerar  data hora GMT  " + d07);
        System.out.println("Data agora com uma data texto diferente do padrao iso 8601  " + d08);
        System.out.println("Data agora com uma data texto diferente do padrao iso 8601  " + d09);
        System.out.println("Data agora com usando recurso proprio 'of' " + d10);
        System.out.println("Data e hora agora com usando recurso proprio 'of' " + d11);


        //transformando hora e data iso 8601 para texto
        System.out.println("==============");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt4 = DateTimeFormatter.ofPattern("dd/MM/yy | HH:mm");
        DateTimeFormatter fmt5 = DateTimeFormatter.ofPattern("dd/MM/yy | HH:mm").withZone(ZoneId.systemDefault());

        System.out.println("d04 = " + fmt3.format(d04));
        System.out.println("d05 = " + fmt4.format(d05));
        System.out.println("d06 = " + fmt5.format(d06));

        System.out.println("==============");
        LocalDate d12 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
        System.out.println(d12);

        LocalDate d13 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
        System.out.println(d13);

        LocalDateTime d14 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
        LocalDateTime d15 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
        System.out.println(d14 + " | " + d15);

        System.out.println("d04 dia = " + d04.getDayOfMonth());
        System.out.println("d04 mes = " + d04.getMonthValue());
        System.out.println("d04 ano = " + d04.getYear());

        System.out.println("d05 hora = " + d05.getHour());
        System.out.println("d05 hora = " + d05.getMinute());
        System.out.println("d05 hora = " + d05.getSecond());

        System.out.println("==============");

        LocalDate d16 = LocalDate.parse("2022-07-20");
        LocalDateTime d17 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d18 = Instant.parse("2022-07-20T01:30:26z");

        LocalDate pastWeek = d16.minusDays(7);
        LocalDate nextWeek = d16.plusDays(7);
        System.out.println(pastWeek + " | " + nextWeek);

        LocalDateTime pastWeekDateTime = d17.minusDays(7);
        LocalDateTime nextWeekDateTime = d17.plusDays(7);
        System.out.println(pastWeekDateTime + " | " + nextWeekDateTime);

        Instant pastWeekInstant = d18.minus(7, ChronoUnit.DAYS);
        Instant lastWeekInstant = d18.plus(7,ChronoUnit.DAYS);
        System.out.println(pastWeekInstant + " | " + lastWeekInstant);

        System.out.println("==============");
        Duration t1 = Duration.between(pastWeek.atStartOfDay(), d16.atStartOfDay());
        System.out.println("Dias de diferenca entre as datas-> LocalDate " + t1.toDays());

        Duration t2 = Duration.between(pastWeekDateTime, d17);
        System.out.println("Dias de diferenca entre as datas -> LocalDateTime " + t2.toDays());

        Duration t3 = Duration.between(pastWeekInstant, d18);
        System.out.println("Dias de diferenca entre as datas -> Instant " + t3.toDays());
    }
}
