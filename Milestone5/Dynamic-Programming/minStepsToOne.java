public class Solution {

	public static int countMinStepsToOne(int n) {
		if(n==1)
		return 0;

		int minSteps = countMinStepsToOne(n-1);
		if(n%3 == 0)
		{
			int o3=countMinStepsToOne(n/3);
            if(minSteps>o3)
                minSteps=o3;
		}
		if(n%2==0){
        int o2=countMinStepsToOne(n/2);
			if(minSteps>o2)
				minSteps=o2;
    }

    return 1+minSteps;
	}

}
