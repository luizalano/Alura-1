import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Datas {

	public static void main(String[] args) {
		LocalDateTime agora = LocalDateTime.now();
		LocalDate hoje = LocalDate.now();
		LocalDate olimpiadasJapao = LocalDate.of(2021, Month.JUNE, 8);
		
		System.out.println(hoje);
		System.out.println(olimpiadasJapao);
		Period periodo = Period.between(hoje, olimpiadasJapao);
		System.out.println(periodo.getDays() + "D, " + periodo.getMonths() + "M, " + periodo.getYears() + "A");

		DateTimeFormatter formatCompleto = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		DateTimeFormatter formatData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter formatHora = DateTimeFormatter.ofPattern("HH:mm:ss");
		
		System.out.println(agora.format(formatCompleto));
		System.out.println(agora.format(formatHora));
		System.out.println(hoje.format(formatData));
	}

}
