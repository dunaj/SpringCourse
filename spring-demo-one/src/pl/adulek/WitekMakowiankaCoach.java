package pl.adulek;

public class WitekMakowiankaCoach implements Coach {

	private FortuneService fortuneService;
	
	public WitekMakowiankaCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Graj w dziadka";
	}

	@Override
	public String getDailyFortune() {
		return "Jak tak mo¿na do kolegi mówiæ?";
	}

}
