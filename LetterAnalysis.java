import java.util.Arrays;

class LetterAnalysis
{
	public static void letterAnalysis(String s)
	{
		int [] letters = new int[26];
		boolean moreThanZero = false, isFirst = true;

		Arrays.fill(letters, 0);
		Arrays.fill(letters, 0);
		s = s.toLowerCase();

		for (int i = 0; i < s.length(); i++)
		{
			char current = s.charAt(i);

			letters[current - 'a']++;
		}

		for (int i = 0; i < 26; i++)
		{
			System.out.println((char)(i + 'a') + " = " + letters[i]);
		}

		for (int i = 0; i < 26; i++)
		{
			if (letters[i] > 1)
			{
				if (isFirst)
				{
					moreThanZero = true;
					System.out.print(letters[i]);
					isFirst = false;
				}
				else
				{
					System.out.print("! * " + letters[i]);
				}
			}
		}

		if (moreThanZero)
		{
			System.out.println("!");
		}
	}

	public static void main(String [] args)
	{
		String input = "ANTIDISESTABLISHMENTARIANISM";

		letterAnalysis(input);
		System.out.println("The length of the string is: " + input.length());
		/* KT: test commit */
	}
}
