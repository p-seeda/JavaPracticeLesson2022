package EnumConcept;

public enum Environment {
	QA("qa"),
	STAGE("stage"),
	DEV("dev"),
	UAT("uat"),
	PROD("prod");
	
	private String envName;
	//Constructor for running the value
	Environment(String envName){
		this.envName = envName;
	}
	
	public String getEnvValue()
	{
		return this.envName;
	}

}
