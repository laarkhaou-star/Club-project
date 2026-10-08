/**
 * Store details of club memberships.
 * 
 * @author (your name) 
 * @version 7.0
 */
public class Club
{
    // question 1
    private ArrayList<Membership> members;
 
    public Club()
    {   //question1
        members = new ArrayList<>();
        
    }

  
    public void join(Membership member)
    {   //question3
        members.add(member);
    }

    /**
     * @return The number of members (Membership objects) in
     *         the club.
     */
    public int numberOfMembers()
    { //question2
        return members.size();
        
    } 
    //question4
    public int joinedInMOnth(int month){
        if(month<=0 || month>12){
            System.out.println("INvalid month: " + month);
            return 0;
        }else{
            int count = 0
                for (Membership m : members){
                if (m.getMonth()==month){
                    count++;
                }
            }
            return count;
        }
    }
    
    //question5
    public Arraylist<Membership> purge(int month, int year){
        if(month<=0 || month>12){
            System.out.println("invalid month: " + month);
            return null;
        }else if (year<=1900 || year>2026){
            System.out.println("invalid year: "+ year);
            return nul;
        }else{ 
            ArrayList<Membership> removals = new ArrayList();
            Iterator<Membership> it = members.iterator();

            while (it.hasNext()){
                Membership m = it.next();
                if(m.getMonth())==month && m.getYear()==year){
                    System.out.println("Membership found in " + month +"/" + year);
                    removals.add(m);
                    it.remove();
                }
            }
            return removals;
        }
    }
}
