/*12).WAP to create the class name as Player with a setter and getter method with a Player
details.
Create the one more class name as Team and pass Player objects in Team class using a var-args
concept and show the Player details in Team class.
Then we need to create the class with a main method and write the code with a following logics */
//=============================================================================================

class TeamApplication{
	public static  void main(String x[]){
		Player p=new Player();
			p.setId(7);
			p.setName("MSD");
			p.setRun(10001);
		Player p2=new Player();
			p2.setId(8);
			p2.setName("JADEJA");
			p2.setRun(9501);
		Team t=new Team();
			t.addPlayer(p,p2);
			t.showTeamPlayer();
	}
}
class Player{
private int id;
private String name;
private int run;
	
	public void setId(int id){
		this.id=id;
	}
	public int getId(){
		return id;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setRun(int run){
		this.run=run;
	}
	public int getRun(){
		return run;
	}
}
class Team{
private Player p[];
	public void addPlayer(Player...p){
		this.p=p;
	}
	public void showTeamPlayer(){
		System.out.println("Your Team Player As Below : ");
		System.out.println("============================================================");
		System.out.println("ID\tName\tRun");
		for(int i=0;i<p.length;i++){
			System.out.println(p[i].getId()+"\t"+p[i].getName()+"\t"+p[i].getRun());
		}

	}
}