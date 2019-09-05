package kr.ac.daelim.uml;

public class Marine extends Unit {
	
	public String name;
	public int health;
	public int AttackPower;
	
	public void move()
	{
		System.out.println("마린이 이동한다.");
	}
	
	public void Attack(){
		System.out.println("마린이 공격한다.");
	}
	
	public void underAttack(Charactor charactor) 
	{
		System.out.println("마린이 공격받는다.");
	}
}
