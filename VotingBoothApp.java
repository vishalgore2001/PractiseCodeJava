/*Example: WAP to develop application for voting booth.
you have to create classes name as
1. Ward with field wardId,wardName,Voter  and Ward is POJO class so it contain 
void setWardId(int wardId)
int getWardId()
void setWardName(String name)
String getWardName()
void setVoter(Voter …voter)
Voter [] getVoter(); 

Here you have to create POJO class name as Voter with field 
id,name,age and you have to create one more class name as 
VotingMachine with following methods 

void steWards(Ward …w): this method can more than one wards
void showVotingCount(): this method can show the voting ward wide and consider voter whose age is greater than 18.
*/
//=========================================================================================
class VotingBoothApp{
public static void main(String x[]){
 Voter v=new Voter();
    v.setId(1);
    v.setName("Vishal");
   v.setAge(22);

Voter v2=new Voter();
    v2.setName(" Pramod");
    v2.setId(2);
   v2.setAge(15);

Voter v3=new Voter();
    v3.setId(3);
    v3.setName("Ram");
   v3.setAge(32);

Voter v4=new Voter();
    v4.setName(" Sham");
    v4.setId(4);
   v4.setAge(16);

Ward w =new Ward();
   w.setWardid(1);
   w.setwardName("ST Stand Area");
   w.setVoter(v,v2,v3);

Ward w1 =new Ward();
   w1.setWardid(2);
   w1.setwardName("Mali Gali Area");
   w1.setVoter(v4);

VotingMachine vm =new VotingMachine();
   vm.setWard(w,w1);
   vm.showVotingCount();
 

}

}

class Voter {
   private int id;
   private String name;
   private int age;
           void setId(int id)
           {   this.id=id;
          }
        public int getId()
          {   return id;
          }
          void setName(String name) 
         {
               this.name =name;
          }
         public String getName()
        {
           return name;
        }
        void setAge(int age)
        {
        this.age=age;
         }
       public int getAge()
       {  return age;
       }
      public String toString(){

                  return "\nID: "+id+"\nName: "+name+"\nAge: "+age;

                   }

}

      class Ward
{
      private int wardid;
      private String wardname;
      public Voter V[];
      void setWardid(int id)
      {   this . wardid=id;
      }
      public int getWardid()
      {  return wardid;
      }
       void setwardName(String n)
       {   this. wardname=n;
       }
       public String getwardName()
       {
            return wardname;
       }
        void setVoter(Voter...v)
        {    this.V =v;
        }
          public Voter [] getVoter()
         {   return V;
         }

}
class VotingMachine
{         private  Ward W[];
         

                     void setWard(Ward...w) 
                      {  this.W=w;
                          
                     } 
                   void showVotingCount()
                     {
                          int count =0;
                       for(int i=0;i<W.length;i++)
                          {
                               System.out.println("===========================================================");
                               System.out.print("WardId: "+W[i].getWardid()+"\tWardName:"+W[i].getwardName()+"\n");
                               System.out.println("===========================================================");
                               
		       System.out.println("VoterID\t VoterName\t VoterAge");
		       for(int j=0;j<W[i].V.length;j++){
                                        count++;
                            	System.out.println(W[i].V[j].getId()+"          " +  W[i].V[j].getName() + "           " + W[i].V[j].getAge());
		       }
                           } 
                          System.out.println("-------------------------------------------------------------------------------------------------------");
                         System.out.println("Total Voter Count is "+count);

                     }
}



