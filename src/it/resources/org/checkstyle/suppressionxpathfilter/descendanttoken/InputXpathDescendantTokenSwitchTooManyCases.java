package org.checkstyle.suppressionxpathfilter.descendanttoken;

public class InputXpathDescendantTokenSwitchTooManyCases {

    void testMethod1() {
        int x = 1;
<<<<<<< HEAD
        switch (x) { // warn
            case 1:
                System.out.println("hi");
                break;
            case 2:
                System.out.println("hello");
                break;
        }
=======
        Runnable switchLogic = () -> {
            switch(x) { // warn
                case 1:
                    System.out.println("hi");
                    break;
                case 2:
                    System.out.println("hello");
                    break;
            }
        };
        switchLogic.run();
>>>>>>> f281de22db2df74cb56950b6081a342823569898
    }
}

