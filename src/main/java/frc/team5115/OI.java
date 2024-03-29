package frc.team5115;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.team5115.Commands.ElevateBunnies;
import frc.team5115.Commands.InhaleBalls;

public class OI {
    public static DualJoystick joy = new DualJoystick(0, 1);
    Button intake = new JoystickButton(joy.getOperatorJoystick(), 1);
    Button shooter = new JoystickButton(joy.getOperatorJoystick(), 2);

    public void OI(){
        intake.whenPressed(new InhaleBalls());
        shooter.whenPressed(new ElevateBunnies());
    }
}
