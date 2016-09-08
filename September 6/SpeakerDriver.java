//Zachary Mosley

public class SpeakerDriver
{
   public static void main(String [] args)
   {
      Speaker s = new Speaker("Mom");// first form for s
      System.out.println(s.speak());
      s = new Politician("Trump");//second form for s
      System.out.println(s.speak());
      s = new Philosopher("G. Edge");//third form for s
      System.out.println(s.speak());
      s = new SuperHero("Koolaid Man");//fourth form for s
      System.out.println(s.speak());
      s = new Plant("Groot");//fifth form for s
      System.out.println(s.speak());
   }
}