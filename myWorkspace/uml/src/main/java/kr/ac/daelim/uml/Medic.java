package kr.ac.daelim.uml;

public class Medic {
	
	public void move()
	{
		System.out.println("유닛이 이동한다.");
	}
	public void underAttack(Charactor charactor) 
	{
		System.out.println("유닛이 공격받는다.");
	}
	public void Healing(Charactor Charactor) {
		System.out.println("유닛이 치료한다.");
	}
}
