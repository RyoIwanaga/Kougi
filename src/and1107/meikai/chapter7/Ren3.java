package and1107.meikai.chapter7;

public class Ren3
{
	
	public static void main(String[] args)
	{
		String[][] greetingses = { { "おはよう", "こんにちわ", "こんばんわ" }, { "おはよう", "こんにちわ", "こんばんわ" },
				{ "おはよう", "こんにちわ", "こんばんわ" } };
		
		for (String[] greetings : greetingses) {
			for (String greeting : greetings) {
				System.out.println(greeting);
			}
		}
	}
	
}
