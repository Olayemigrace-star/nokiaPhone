import java.util.Scanner;

public class repoCase{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.println("""
     
      MY MENU APP
    1. Phone book
    2. Messages
    3. Chat
    4. Call register
    5. Tones
    6. Settings
    7. Call divert
    8. Games
    9. Calculators
    10. Reminders
    11. Clock
    12. Profiles
    13. SIM services""");


System.out.println("Enter an option from 1 - 13");
int user = input.nextInt();

switch(user){
case 1: System.out.print("Options:\n1. Search\n2. Service Nos.\n3. Addname\n4. Erase\n5. Edit\n6. Send b'card\n7. Options\n9. Speed dials\n10. Voice tags\n");
System.out.println("Enter another option");
if(user == 8){
System.out.print("1.Type of view\n2. Memory status\n");
}
break;

case 2: System.out.print("1.Write messages\n2. Inbox\n3. outbox\n4. Picture messages\n5. Templates\n6. Smileys\n7. Message settings\n8.Info service\n9.Voice mailbox number\n10.Service command editor\n");
System.out.println("Enter another option");
int msgSetting = input.nextInt();
    if(msgSetting == 7){
    System.out.print("1. Set 1\n2. Common\n");
System.out.print("Choose an option");
    int set = input.nextInt();
    if (set == 1){
        System.out.print("1.Message centre number\n2. Messages sent as\n3.Message validity\n");
}
        else if(set == 2){
System.out.print("1.Delivery reports\n2. Reply via same centre\n3. Character support\n");
}
}
break;

case 3: System.out.print("");
break;

case 4: System.out.print("1.Missed call\n2. Received calls\n3. Dailled numbers\n4. Erase recent call list\n5. Show call duration\n6. Show call cost\n7. Call cost settings\n8. Prepaid credit\n");
System.out.println("Enter another option");
if(user == 5){
System.out.print("1. Last call duration\n2. All call's duration\n3. Received calls duration\n4. Dailled call's duration\n5.Clear timers");
}
else if(user == 6){
System.out.print("1. Last call cost\n2. All call's cost\n3. Clear counters\n");
}
else if(user == 7){
System.out.print("1. Call cost limit\n2. Show cost in\n");
}
break;

case 5: System.out.print("1. Ringing tone\n2. Ringing volume\n3. Incoming call alert\n4. Composer\n5. Message alert tone\n6. Keypasdstones\n7. Warning and game tones\n8. Vibrating alert\n9. Screen saver\n");
break;

case 6: System.out.print("1. Call settings\n2. Phone settings\n3. Security settings\n4. Restore factory settings\n");
System.out.println("Enter another option");
if (user == 1) {
System.out.print("Call settings:\n1. Redial\n2. Speed dial\n3. Call waiting\n4. Own number\n5. Line use\n6. Auto answer\n");
} 
else if (user == 2) {
System.out.print("Phone settings:\n1. Language\n2. Cell info\n3. Welcome note\n4. Network selection\n5. Lights\n6. Confirm SIM actions\n");
                    }
 else if (user == 3) {
System.out.println("Security settings:\n1. PIN request\n2. Call barring\n3. Fixed dialing\n4. Closed user group\n5. Phone security\n6. Change access codes");
                    }
 else if (user == 4) {
 System.out.println("Restoring factory settings...");
                    }
break;
//case 7: System.out.print("Call divert");
//case 8: System.out.print("Games");
//case 9: System.out.print("Calculators");
//case 10: System.out.print("Reminders");
case 11: System.out.print("1. Alarm clock\n2. Clock settings\n3. Date settings\n4. Stop watch\n5. Countdown timer\n6. Auto update of time and date\n"); 

break;
case 12: System.out.print("Profiles");
break;
case 13: System.out.print("");
break;











 

}


}
}





 
