    package javaapplication1;
    import java.util.*; 

    public class DotcomBust {

    
        private GameHelper helper = new GameHelper();  
        private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();  
        private int numOfGuesses;  
          
          
        void setUpGame(){  
        System.out.println ("Bem - vindo ao Sink a DotCom");  
        System.out.println ("Seu objetivo é derrubar as três DotComs");  
        System.out.println ("Use o menor número de palpites possível");  
          
        DotCom one = new DotCom();  
        DotCom two = new DotCom();  
        DotCom three = new DotCom();  
          
        one.setName   ("Microsoft.com");  
        two.setName   ("Facebook.com");  
        three.setName ("Google.com");  
          
        dotComsList.add (one);  
        dotComsList.add (two);  
        dotComsList.add (three);  
          
        for(DotCom DotToSet : dotComsList){  
           ArrayList<String> newLocation =  helper.placeDotCom(3);  
           DotToSet.setLocationCells(newLocation);  
        }  
              
        }  
          
        void startPlaying(){  
            while(!dotComsList.isEmpty() ){  
                String guess = helper.getUserInput("Insira um palpite:");  
                checkUserGuess(guess);  
                  
            }  
            finishGame();  
        }  
          
      void checkUserGuess(String UserGuess){    
        numOfGuesses ++;    
        String result = "Errado";    
        for(DotCom DotToTest : dotComsList){    
             result = DotToTest.checkYourself(UserGuess);     
            if(result.equals("Correto")){    
                    
                break;    
            }    
            if(result.equals("Eliminar")){    
                dotComsList.remove(DotToTest);    
                    
            }    
                
        }    
       System.out.println (result);    
    }   
          
        void finishGame(){  
            System.out.println ("Fim de jogo.");  
            if(numOfGuesses <= 10){  
                System.out.println ("Parabéns");  
            }  
            else if (numOfGuesses <= 20){  
                System.out.println("Muito bem.");  
            }  
            else{  
                System.out.println ("Ok,você pode melhorar");  
            }  
        }  
          
        public static void main (String args []){  
            DotcomBust game = new DotcomBust();  
            game.setUpGame();  
            game.startPlaying();  
              
        }  
          
    }  