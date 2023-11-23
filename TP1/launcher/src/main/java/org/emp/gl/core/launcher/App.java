package org.emp.gl.core.launcher;

import org.emp.gl.clients.CompteARebours;
import org.emp.gl.clients.Horloge ;
import org.emp.gl.time.service.impl.DummyTimeServiceImpl;
import org.emp.gl.timer.service.TimerService;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        TimerService timerService = new DummyTimeServiceImpl();
        testDuTimeService(timerService);
    }

    private static void testDuTimeService(TimerService timerService) {
//        Horloge horloge1 = new Horloge("Num 1",timerService) ;
//        Horloge horloge2 = new Horloge("Num 2",timerService) ;
//        Horloge horloge3 = new Horloge("Num 3",timerService) ;
//        Horloge horloge4= new Horloge("Num 4",timerService) ;
//        Horloge horloge5 = new Horloge("Num 5",timerService) ;

        CompteARebours compteur1 =new CompteARebours("compteur1",28,timerService);
        CompteARebours compteur2=new CompteARebours("compteur2",32,timerService);
        CompteARebours compteur3 =new CompteARebours("compteur3",30,timerService);
        CompteARebours compteur4 =new CompteARebours("compteur4",25,timerService);
        CompteARebours compteur5 =new CompteARebours("compteur5",20,timerService);
        CompteARebours compteur6 =new CompteARebours("compteur6",34,timerService);
        CompteARebours compteur7 =new CompteARebours("compteur7",37,timerService);
        CompteARebours compteur8 =new CompteARebours("compteur8",29,timerService);
        CompteARebours compteur9 =new CompteARebours("compteur9",40,timerService);
        CompteARebours compteur10 =new CompteARebours("compteur10",45,timerService);
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
