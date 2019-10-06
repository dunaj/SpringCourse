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
	
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: inside method doMyStartupStuff");
	}
	
	public void doMyCleanupStuffYoYo() {
		System.out.println("TrackCoach: inside method doMyCleanUpStuffYoYo");
	}

}
