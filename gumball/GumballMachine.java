public class GumballMachine {

    private int numGumballs;
    private boolean hasQuarter;
    private int cost;
    private int total;
    private String type;
    
 public GumballMachine( int size, int cost, String type){
    	
        this.numGumballs = size;
        this.hasQuarter = false;
        this.cost = cost;
        this.type = type;
        this.total = 0;
        
        }
    
public void turnCrank(){
    	
    	if ( this.hasQuarter || (this.total >= this.cost) )
    	{
    		if ( this.numGumballs > 0 )
    		{
    			this.numGumballs-- ;
    			this.hasQuarter = false ;
    			System.out.println( "Thanks for your quarter.  Gumball Ejected!" ) ;
    		}
    		else
    		{
    			System.out.println( "No More Gumballs!  Sorry, can't return your quarter." ) ;
    		}
    	}
    	else 
    	{
    		System.out.println( "Please insert a quarter" ) ;
    	}        
    }

   

    public void insertQuarter(int coin){
    	
        if ( coin == 25 && this.cost == 25 && this.type.equals("Quarter") )
            this.hasQuarter = true ;
        else 
            if( coin == 25 && cost == 50 && type.equals("Quarter") )
            total += coin ;
        else 
            if( cost == 50 && !type.equals("Quarter") )
                total += coin ;
        else 
        	this.hasQuarter = false ;
        
    }
    
  
}
