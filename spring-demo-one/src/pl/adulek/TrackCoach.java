package pl.adulek;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
		
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	public TrackCoach() {
		this.fortuneService = new HappyFortuneService();
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just Do it!" + fortuneService.getFortune();
	}

}
