import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class TestStatistic
{
	public static void main(String [] args) throws IOException
	{
		boolean quit = false;
		BufferedReader commandLineReader = new BufferedReader(new InputStreamReader(System.in));

		while (!quit)
		{
			double answer = 0, n = 0, p_null = 0, p_observed = 0;

			System.out.println("What is the sample size?   (n)");
			n = Double.parseDouble(commandLineReader.readLine());

			System.out.println("What is the observed proportion?   (P^)");
			p_observed = Double.parseDouble(commandLineReader.readLine());

			System.out.println("What is the null hypothesized value?   (Po)");
			p_null = Double.parseDouble(commandLineReader.readLine());

			// compute test statistic
			answer = (p_observed - p_null) / (Math.pow( (((p_null) * (1 - p_null)) / n), 0.5));

			System.out.println("This is the test statistic: " + answer);
		}
	}
}
