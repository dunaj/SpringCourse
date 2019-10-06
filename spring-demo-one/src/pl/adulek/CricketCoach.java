package pl.adulek;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	private String email;
	private String team;
	
	public void setEmail(String email) {
		System.out.println("Cricket Coach: inside email setter");
		this.email = email;
	}

	public void setTeam(String team) {
		System.out.println("Cricket Coach: inside team setter");
		this.team = team;
	}
	
	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

	public CricketCoach() {
		System.out.println("Cricket Coach: inside noarg constructor");
	}
	
	public FortuneService getFortuneService() {
		return fortuneService;
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Cricket Coach: inside setter Fortune Service");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
