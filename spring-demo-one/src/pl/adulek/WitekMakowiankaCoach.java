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
		// TODO Auto-generated method stub
		return null;
	}

}
