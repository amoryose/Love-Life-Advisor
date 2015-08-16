// Avraham Moryosef
// CS 420
// 6/3/15
package decisions;

import javax.swing.JOptionPane;

public class LoveLifeAdvisor
{
	public static void main(String[] args)
	{
		final int LEGAL_AGE = 18;      // minimum age requirement 
		final int MIN_SALARY = 200000; // minimum salary requirement
		
		String inputLove;
		
		int dateAge, 
			myAge = 0, 
			mySalary;
		
		inputLove = JOptionPane.showInputDialog ("Enter your date's age: ");
		dateAge = Integer.parseInt(inputLove);
		
		if(dateAge < LEGAL_AGE)
		{	
			JOptionPane.showMessageDialog(null, "Maybe you should find someone else", 
					"Results", JOptionPane.WARNING_MESSAGE);
		}
				
		else 
		{
			inputLove = JOptionPane.showInputDialog ("Enter your age: ");
			myAge = Integer.parseInt(inputLove);
			
			if(Math.abs(dateAge-myAge) <= 20)
			{
				JOptionPane.showMessageDialog(null, "Go for it", 
						"Results", JOptionPane.INFORMATION_MESSAGE);
			}
		}
		
		if(Math.abs(dateAge - myAge) > 20)
		{
			inputLove = JOptionPane.showInputDialog ("Enter your salary: ");
			mySalary = Integer.parseInt(inputLove);
			
			if (MIN_SALARY <= mySalary)
			{
				JOptionPane.showMessageDialog(null, "Go for it", 
						"Results", JOptionPane.INFORMATION_MESSAGE);
			}
			
			else
			{
				JOptionPane.showMessageDialog(null, "Out of your league", 
						"Results", JOptionPane.INFORMATION_MESSAGE);
			}
		}
				
		System.exit(0);

	}
}
