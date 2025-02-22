package org.checkstyle.suppressionxpathfilter.descendanttoken;

public class InputXpathDescendantTokenNestedSwitch {

<<<<<<< HEAD
    void testMethod1() {
        int x = 1;
        int y = 2;
        switch (x) { // warn
            case 1:
                System.out.println("xyz");
                break;
            case 2:
                switch (y) {
                    case 1:
                        System.out.println("nested");
                        break;
                }
                break;
        }
    }
}

=======
void testMethod1() {
        int x = 1;
        int y = 2;
        switch (x) {
            case 1:
                System.out.println("xyz");
                break;
            case 2: // warn
                switch (y) {
                     case 1:
                         System.out.println("nested");
                          break;
                        }
                        break;
                }
    }
 }
>>>>>>> f281de22db2df74cb56950b6081a342823569898
