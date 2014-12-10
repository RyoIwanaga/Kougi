
public class Lot {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		And1107 a = new And1107();
		a.selectDisp();
	}


}
class And1107{
	Person[] gr=new Person[20];

	public And1107(){
		this.gr[0]=new Person(1,"岩永　亮");
		this.gr[1]=new Person(2,"内田　翔太");
		this.gr[2]=new Person(3,"大石　碧");
		this.gr[3]=new Person(4,"太田　祥平");
		this.gr[4]=new Person(5,"川崎　弘貴");
		this.gr[5]=new Person(6,"川島　拓也");
		this.gr[6]=new Person(7,"栗原　和久");
		this.gr[7]=new Person(8,"高井　哲也");
		this.gr[8]=new Person(9,"高橋　良太");
		this.gr[9]=new Person(10,"塚原　慎也");
		this.gr[10]=new Person(11,"仲　　　祐太郎");
		this.gr[11]=new Person(12,"中村　招稔");
		this.gr[12]=new Person(13,"長谷川　啓");
		this.gr[13]=new Person(14,"堀井　健一");
		this.gr[14]=new Person(15,"村野　宏哉");
		this.gr[15]=new Person(16,"山本　和典");
	}
	public void selectDisp(){
		int selNo=(int)(Math.random()*320) %16;
		this.gr[selNo].disp();
	}
}

class Person{
	int	no;
	String name;
	public Person(int no, String name) {
		super();
		this.no = no;
		this.name = name;
	}
	public void disp(){
		System.out.println("考え中");
		try {
			Thread.sleep(1000);
			System.out.println("考え中");
			Thread.sleep(1000);
			System.out.println("考え中");
			Thread.sleep(1000);
			System.out.println("考え中");
			Thread.sleep(1000);
			System.out.println("★★★★★★決定しました★★★★\n");
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("発表者は"+this.no+"の　"+ this.name +"さんです。");
	}
}

