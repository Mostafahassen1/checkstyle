package org.checkstyle.suppressionxpathfilter.descendanttoken;

public class InputXpathDescendantTokenSwitchNoDefault {

    void testMethod1() {
        int x = 1;
        switch (x) { // warn
            case 1:
                System.out.println("hi");
                break;
        }
    }
<<<<<<< HEAD
}

=======
 }
>>>>>>> f281de22db2df74cb56950b6081a342823569898
