package kr.ac.daelim.uml;

public class Medic extends Unit {
	
	public void move()
	{
		System.out.println("메딕이 이동한다.");
	}
	
	public void underAttack(Charactor charactor) 
	{
		System.out.println("메딕이 공격받는다.");
	}
	
	public void Healing(Charactor Charactor) {
		System.out.println("메딕이 치료한다.");
	}
}
