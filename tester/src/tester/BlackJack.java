package tester;
import java.util.Scanner;
import java.util.Random;

public class BlackJack {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to BlackJack 21");
        System.out.println("Blackjack Returns 3/2 of the Bet Amount\n-----------------------------");
        int money = 10000; // Starting amount of money
        int bet = 0;
        boolean play = false;
        while(!play) {
        	System.out.println("Type 'PLAY' to Start: ");
            String START = sc.next();
            if(START.equalsIgnoreCase("play")) {
            	play = true;
            }
        }
        int round  = 0; 
         
        while (play) {
        	round++;
        	
        	System.out.println("\nRound "+round+"\n----------");
            boolean doneBet = false;
            while (!doneBet) {
                System.out.println("Money: $" + money);
                System.out.print("Enter your bet: ");
                bet = sc.nextInt();

                if (bet > 0 && bet <= money) {
                    money -= bet;
                    doneBet = true;
                } else {
                    System.out.println("Invalid bet. Please enter a valid amount.");
                }
            }
            StringBuilder sbp = new StringBuilder();
            Random r = new Random();
            int PcardTotal = 0;
            boolean containAce = false;

            for (int i = 0; i < 2; i++) {
                int rn = r.nextInt(13) + 1;
                if (rn == 1) {
                    sbp.append("A ");
                    containAce = true;
                } else if (rn == 11) {
                    sbp.append("J ");
                } else if (rn == 12) {
                    sbp.append("Q ");
                } else if (rn == 13) {
                    sbp.append("K ");
                } else {
                    sbp.append(Integer.toString(rn) + " ");
                }
                if(rn>10) {
                	PcardTotal += 10;
                }else{
                	PcardTotal += rn;
                }
            }
            System.out.println("Your Cards: ");
            System.out.println("Cards: " + sbp);
            if(containAce) {
            	if(PcardTotal+10<21) {
            		System.out.println("Total: "+PcardTotal+"/"+(PcardTotal+10));
            		
            	}else {
            		PcardTotal+=10;
            		System.out.println("Total: "+PcardTotal);
            	}
            }else {
            	System.out.println("Total: "+PcardTotal);
            }
            if(PcardTotal == 21) {
            	System.out.println("BLACKJACK!");
            	money+= bet + (3*bet/2);
            }else {
            	StringBuilder sbd = new StringBuilder();
                int DcardTotal = 0;
                System.out.print("\nDealer's Card: ");
                int rn = r.nextInt(13) + 1;
                if (rn == 1) {
                    sbd.append("A ");
                    containAce = true;
                } else if (rn == 11) {
                    sbd.append("J ");
                } else if (rn == 12) {
                    sbd.append("Q ");
                } else if (rn == 13) {
                    sbd.append("K ");
                } else {
                    sbd.append(Integer.toString(rn) + " ");
                }
                if(rn>10) {
                	DcardTotal += 10;
                }else{
                	DcardTotal += rn;
                }
                System.out.println(sbd);
                System.out.println("Total: "+DcardTotal);
                
                boolean pTurn = true;
                int Pmc = 0; //player move count
                while(pTurn) {
                	Pmc++;
                	System.out.println("\nMoney: "+money);
                	if(money>=bet&&Pmc == 1) {
                		System.out.println("Available Move: \n-Hit(H) \n-Stand(S) \n-Double Down(DD)");
                	}else {
                		System.out.println("Available Move: \n-Hit(H) \n-Stand(S)");
                	}
                	System.out.print("\nInput Moves: ");
                	String PM = sc.next();
                	if(PM.equalsIgnoreCase("H")) {
                		rn = r.nextInt(13) + 1;
                        if (rn == 1) {
                            sbp.append("A ");
                            containAce = true;
                        } else if (rn == 11) {
                            sbp.append("J ");
                        } else if (rn == 12) {
                            sbp.append("Q ");
                        } else if (rn == 13) {
                            sbp.append("K ");
                        } else {
                            sbp.append(Integer.toString(rn) + " ");
                        }
                        if(rn>10) {
                        	PcardTotal += 10;
                        }else{
                        	PcardTotal += rn;
                        }
                        System.out.println("\nYour Cards: ");
                        System.out.println("Cards: "+sbp);
                        if(PcardTotal+10<21) {
                        	boolean vav = false; //valid ace value
                        	while(!vav) {
                        		System.out.println("Choose The Ace to(1/11): ");
                            	int zoo = sc.nextInt();
                            	if(zoo == 11) {
                            		PcardTotal+= 10;
                            		vav=true;
                            	}else if(zoo == 1) {
                            		vav=true;
                            	}else {
                            		System.out.println("Invalid Input!");
                            	}
                        	}
                        }
                        if(containAce) {
                        	if(PcardTotal+10<=21) {
                        		System.out.println("Total: "+PcardTotal+"/"+(PcardTotal+10));
                        	}else {
                        		System.out.println("Total: "+PcardTotal);
                        	}
                        }else {
                        	System.out.println("Total: "+PcardTotal);
                        }
                        if(PcardTotal>21) {
                        	System.out.println("You Bust!");
                        	pTurn = false;
                        }else if(PcardTotal == 21) {
                        	System.out.println("BLACKJACK!");
                        	money+= bet +(3*bet/2);
                        }
                	}else if(PM.equalsIgnoreCase("S")) {
                		pTurn = false;
                	}else if(PM.equalsIgnoreCase("DD")) {
                		if(Pmc == 1) {
                			money -= bet;
                    		bet = bet*2;
                    		System.out.println("Money: "+money);
                    		rn = r.nextInt(13) + 1;
                            if (rn == 1) {
                                sbp.append("A ");
                                containAce = true;
                            } else if (rn == 11) {
                                sbp.append("J ");
                            } else if (rn == 12) {
                                sbp.append("Q ");
                            } else if (rn == 13) {
                                sbp.append("K ");
                            } else {
                                sbp.append(Integer.toString(rn) + " ");
                            }
                            if(rn>10) {
                            	PcardTotal += 10;
                            }else{
                            	PcardTotal += rn;
                            }
                            System.out.println("Your Cards: ");
                            System.out.println("Cards: "+sbp);
                            System.out.println("Total: "+PcardTotal);
                            if(PcardTotal>21) {
                            	System.out.println("You Bust!");
                            	pTurn = false;
                            }else if(PcardTotal == 21) {
                            	System.out.println("BLACKJACK!");
                            	money+= bet +(3*bet/2);
                            }
                            pTurn = false;
                		}else {
                			System.out.println("Invalid Move! Please Try Again.");
                		}
                	}else {
            			System.out.println("Invalid Move! Please Try Again.");
            		}
                }
                if(PcardTotal<21) {
                	System.out.println("\nDealer's Turn: ");
                    while(DcardTotal<17) {
            			
                        rn = r.nextInt(13) + 1;
                        if (rn == 1) {
                            sbd.append("A ");
                            containAce = true;
                        } else if (rn == 11) {
                            sbd.append("J ");
                        } else if (rn == 12) {
                            sbd.append("Q ");
                        } else if (rn == 13) {
                            sbd.append("K ");
                        } else {
                            sbd.append(Integer.toString(rn) + " ");
                        }
                        System.out.println("D's Card: "+ sbd);
                        
                        if(rn>10) {
                        	DcardTotal += 10;
                        }else{
                        	DcardTotal += rn;
                        }
                        System.out.println("Total: "+DcardTotal);
                        if(DcardTotal>21) {
                        	money += bet*2;
                        	System.out.println("\nDealer Busts!");
                        }
            		}
            		if(DcardTotal<PcardTotal||DcardTotal>21) {
            			money+= bet*2;
            			System.out.println("You Win!");
            		}else if(DcardTotal==PcardTotal) {
            			money+=bet;
            			System.out.println("You Draw!");
            		}else if(DcardTotal>PcardTotal&&DcardTotal<=21){
            			System.out.println("You Lose!");
            		}
                }
            }
            
        }    
    }
}

